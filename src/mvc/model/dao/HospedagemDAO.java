package mvc.model.dao;

import entity.Hospedagem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HospedagemDAO extends AbstractDAO{

    private static List<Hospedagem> listHospedagens = new ArrayList<>();

    public HospedagemDAO() throws IOException 
    {
        super();
        nomeArquivoDados = "hospedagem.data";
        atualizarListaComArquivo();
        index = getMaiorIndexDaLista()+ 1;
    }
    
    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmaHospedagem(o)) {
            Hospedagem hospedagemParaInserir = (Hospedagem) o;
            /*Garantindo que o código equivale ao index*/
            hospedagemParaInserir.setCodigo(String.valueOf(getIndex()));
            listHospedagens.add(hospedagemParaInserir);
            salvarListaEmArquivo();
            getHistorico().inserir(
                        "Cliente " + hospedagemParaInserir.getHospede()
                        + " alugou o quarto "  
                        + hospedagemParaInserir.getQuartoAlugado().getObservacao()
                    );
            acrescerIndex();
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if (objetoEUmaHospedagem(o)) {
            Hospedagem hospedagemParaRemover = (Hospedagem) o;
            listHospedagens.remove(hospedagemParaRemover);
            salvarListaEmArquivo();
            getHistorico().inserir(
                        "Remoção da Hospedagem do Cliente " 
                        + hospedagemParaRemover.getHospede()
                        + " no quarto "  
                        + hospedagemParaRemover.getQuartoAlugado().getObservacao()
                    );
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Hospedagem hospedagemEncontrada = buscar(codigo);
        if (null != hospedagemEncontrada) {
            listHospedagens.remove(hospedagemEncontrada);
            salvarListaEmArquivo();
            getHistorico().inserir(
                        "Remoção da Hospedagem do Cliente " 
                        + hospedagemEncontrada.getHospede()
                        + " no quarto "  
                        + hospedagemEncontrada.getQuartoAlugado().getObservacao()
                    );
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if (objetoEUmaHospedagem(o)) {
            Hospedagem hospedagemParaInserir = (Hospedagem) o;
            Hospedagem hospedagemParaRemover = buscar(codigo);
            
            if (null != hospedagemParaRemover) {
                listHospedagens.remove(hospedagemParaRemover);
                listHospedagens.add(hospedagemParaInserir);
                salvarListaEmArquivo();
                getHistorico().inserir("Atualização da Hospedagem "
                            + "do Cliente " 
                            + hospedagemParaInserir.getHospede()
                            + " no quarto "  
                            + hospedagemParaInserir.getQuartoAlugado().getObservacao()
                        );
            }
        } 
    }

    @Override
    public List buscarTodos() 
    {
        return listHospedagens;   
    }

    @Override
    public Hospedagem buscar(String codigo) 
    {
        for (Hospedagem hospedagemDaLista : listHospedagens) {
                if (hospedagemDaLista.getCodigo().equals(codigo)) {
                    return hospedagemDaLista;           
                }
        }
        return null; 
    }
    
    public boolean objetoEUmaHospedagem(Object o) 
    {
        if (o instanceof Hospedagem) {
            return true;
            
        } else {
            try {
                throw new Exception("objetoEUmaHospedagem(Object o)"
                        + " recebendo um objeto que não é uma instância"
                        + " de Hospedagem");
            } catch (Exception ex) {
                Logger.getLogger(HospedagemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return false;
            }
        }
    }
    
    @Override
    public int getMaiorIndexDaLista() {
        int maiorIndex = 0;
        for (Hospedagem hospedagemDaLista : listHospedagens) {
            int codigoDaHospedagemDaLista = Integer.parseInt(hospedagemDaLista.getCodigo());
            if (codigoDaHospedagemDaLista > maiorIndex) {
                maiorIndex = codigoDaHospedagemDaLista;
            }
        }
        
        return maiorIndex;
    }
    
    @Override
    public void atualizarListaComArquivo()
    {
        try {
            abrirLeituraDoArquivo();
            listHospedagens = (ArrayList) objectIn.readObject();
            fecharLeituraDoArquivo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HospedagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível atualizar a lista com"
                        + " os dados do arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(HospedagemDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    @Override
    public void salvarListaEmArquivo()
    {
        try {
            abrirArmazenamentoEmArquivo();
            objectOut.writeObject(listHospedagens); 
            fecharArmazenamentoEmArquivo();
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível salvar os dados no"
                                    + " arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(HospedagemDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
}
