package mvc.model.dao;

import entity.TipoQuarto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TipoQuartoDAO extends AbstractDAO
{
    private static List<TipoQuarto> listTiposQuarto = new ArrayList<>();

    public TipoQuartoDAO() throws IOException 
    {
        super();
        nomeArquivoDados = "tipoquarto.data";
        atualizarListaComArquivo();
        index = getMaiorIndexDaLista()+ 1;
    }
    
    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmTipoQuarto(o)) {
            TipoQuarto tipoQuartoParaInserir = (TipoQuarto) o;
            /*Garantindo que o código equivale ao index*/
            tipoQuartoParaInserir.setCodigo(String.valueOf(getIndex()));
            listTiposQuarto.add(tipoQuartoParaInserir);
            getHistorico().inserir("Inserção do Tipo de Quarto " + tipoQuartoParaInserir.getNome());
            acrescerIndex();
            salvarListaEmArquivo();
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if (objetoEUmTipoQuarto(o)) {
            TipoQuarto novoTipoQuarto = (TipoQuarto) o;
            listTiposQuarto.remove((TipoQuarto) o);
            getHistorico().inserir("Remoção do Tipo de Quarto " + novoTipoQuarto.getNome());
            salvarListaEmArquivo();
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        TipoQuarto tipoQuartoEncontrado = buscar(codigo);
        if (null != tipoQuartoEncontrado) {
            listTiposQuarto.remove(tipoQuartoEncontrado);
            getHistorico().inserir("Remoção do Tipo de Quarto " + tipoQuartoEncontrado.getNome());
            salvarListaEmArquivo();
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if (objetoEUmTipoQuarto(o)) {
            TipoQuarto tipoQuartoParaInserir = (TipoQuarto) o;
            TipoQuarto tipoQuartoParaRemover = buscar(codigo);
            
            if (null != tipoQuartoParaRemover) {
                listTiposQuarto.remove(tipoQuartoParaRemover);
                listTiposQuarto.add(tipoQuartoParaInserir);
                getHistorico().inserir("Atualização do tipo de quarto " + tipoQuartoParaInserir.getNome());
                salvarListaEmArquivo();
            }
        }
    }

    @Override
    public List buscarTodos() 
    {
        return listTiposQuarto;
        
    }

    @Override
    public TipoQuarto buscar(String codigo) 
    {
        for (TipoQuarto tipoQuartoDaLista : listTiposQuarto) {
                if (tipoQuartoDaLista.getCodigo().equals(codigo)) {
                    return tipoQuartoDaLista;
                    
                }
        }
        return null;
    }
    
    public TipoQuarto buscarPorNome(String nome) 
    {
        for (TipoQuarto tipoQuartoDaLista : listTiposQuarto) {
                if (tipoQuartoDaLista.getNome().equals(nome)) {
                    return tipoQuartoDaLista;
                    
                }
        }
        return null;
    }
    
    public boolean objetoEUmTipoQuarto(Object o) 
    {
        if (o instanceof TipoQuarto) {
            return true;
            
        } else {
            try {
                throw new Exception("objetoEUmTipoQuarto(Object o)"
                        + " recebendo um objeto que não é uma instância"
                        + " de TipoQuarto");
            } catch (Exception ex) {
                Logger.getLogger(TipoQuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return false;
            }
        }
    }
    
    public List<String> listarNomesTipoQuarto()
    {
        List<String> listaDeNomes = new ArrayList<String>();
        
        for (TipoQuarto tipoQuartoDaLista : listTiposQuarto) {
            listaDeNomes.add(tipoQuartoDaLista.getNome());
        }
   
        return listaDeNomes;
    }

    @Override
    public int getMaiorIndexDaLista() {
        int maiorIndex = 0;
        for (TipoQuarto tipoQuartoDaLista : listTiposQuarto) {
            int codigoDoTipoQuartoDaLista = Integer.parseInt(tipoQuartoDaLista.getCodigo());
            if (codigoDoTipoQuartoDaLista > maiorIndex) {
                maiorIndex = codigoDoTipoQuartoDaLista;
            }
        }
        
        return maiorIndex;
    }
    
    @Override
    public void atualizarListaComArquivo()
    {
        try {
            abrirLeituraDoArquivo();
            listTiposQuarto = (ArrayList) objectIn.readObject();
            fecharLeituraDoArquivo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TipoQuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível atualizar a lista com"
                        + " os dados do arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(TipoQuartoDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    @Override
    public void salvarListaEmArquivo()
    {
        try {
            abrirArmazenamentoEmArquivo();
            objectOut.writeObject(listTiposQuarto); 
            fecharArmazenamentoEmArquivo();
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível salvar os dados no"
                                    + " arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(TipoQuartoDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
}
