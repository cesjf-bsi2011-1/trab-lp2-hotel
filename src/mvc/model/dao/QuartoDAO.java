package mvc.model.dao;

import entity.Quarto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuartoDAO extends AbstractDAO
{
    private static List<Quarto> listQuartos = new ArrayList<>();

    public QuartoDAO() throws IOException 
    {
        super();
        nomeArquivoDados = "quarto.data";
        atualizarListaComArquivo();
        index = getMaiorIndexDaLista()+ 1;
    }

    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmQuarto(o)) {
            Quarto quartoParaInserir = (Quarto) o;
            /*Garantindo que o código equivale ao index*/
            quartoParaInserir.setCodigo(String.valueOf(getIndex()));
            listQuartos.add(quartoParaInserir);
            getHistorico().inserir("Inserção do Quarto " + quartoParaInserir.getObservacao());
            acrescerIndex();
            salvarListaEmArquivo();
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if (objetoEUmQuarto(o)) {
            Quarto novoQuarto = (Quarto) o;
            listQuartos.remove((Quarto) o);
            getHistorico().inserir("Remoção do Quarto " + novoQuarto.getObservacao());
            salvarListaEmArquivo();
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Quarto quartoEncontrado = buscar(codigo);
        if (null != quartoEncontrado) {
            listQuartos.remove(quartoEncontrado);
            getHistorico().inserir("Remoção do Quarto " + quartoEncontrado.getCodigo());
            salvarListaEmArquivo();
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if (objetoEUmQuarto(o)) {
            Quarto quartoParaInserir = (Quarto) o;
            Quarto quartoParaRemover = buscar(codigo);
            
            if (null != quartoParaRemover) {
                listQuartos.remove(quartoParaRemover);
                listQuartos.add(quartoParaInserir);
                getHistorico().inserir("Atualização do tipo de quarto " + 
                        quartoParaInserir.getObservacao());
                salvarListaEmArquivo();
            }
        }
    }

    @Override
    public List buscarTodos() 
    {
        return listQuartos;
        
    }

    @Override
    public Quarto buscar(String codigo) 
    {
        for (Quarto quartoDaLista : listQuartos) {
                if (quartoDaLista.getCodigo().equals(codigo)) {
                    return quartoDaLista;
                    
                }
        }
        return null;
    }
    public boolean objetoEUmQuarto(Object o) 
    {
        if (o instanceof Quarto) {
            return true;
            
        } else {
            try {
                throw new Exception("objetoEUmQuarto(Object o)"
                        + " recebendo um objeto que não é uma instância"
                        + " de Quarto");
            } catch (Exception ex) {
                Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return false;
            }
        }
    }

    @Override
    public int getMaiorIndexDaLista() {
        int maiorIndex = 0;
        for (Quarto quartoDaLista : listQuartos) {
            int codigoDoQuartoDaLista = Integer.parseInt(quartoDaLista.getCodigo());
            if (codigoDoQuartoDaLista > maiorIndex) {
                maiorIndex = codigoDoQuartoDaLista;
            }
        }
        
        return maiorIndex;
    }
    
    @Override
    public void atualizarListaComArquivo()
    {
        try {
            abrirLeituraDoArquivo();
            listQuartos = (ArrayList) objectIn.readObject();
            fecharLeituraDoArquivo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível atualizar a lista com"
                        + " os dados do arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    @Override
    public void salvarListaEmArquivo()
    {
        try {
            abrirArmazenamentoEmArquivo();
            objectOut.writeObject(listQuartos); 
            fecharArmazenamentoEmArquivo();
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível salvar os dados no"
                                    + " arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
}
