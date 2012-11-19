package mvc.model.dao;

import entity.Mobilia;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MobiliaDAO extends AbstractDAO
{
    private static List<Mobilia> listMobilias = new ArrayList<>();

    public MobiliaDAO() throws IOException 
    {
        super();
        nomeArquivoDados = "mobilia.data";
        atualizarListaComArquivo();
        index = getMaiorIndexDaLista()+ 1;
    }
    
    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmaMobilia(o)) {
            Mobilia mobiliaParaInserir = (Mobilia) o;
            /*Garantindo que o código equivale ao index*/
            mobiliaParaInserir.setCodigo(String.valueOf(getIndex()));
            listMobilias.add(mobiliaParaInserir);
            salvarListaEmArquivo();
            getHistorico().inserir("Inserção da Mobília " + mobiliaParaInserir.getNome());
            acrescerIndex();
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if (objetoEUmaMobilia(o)) {
            Mobilia mobiliaParaRemover = (Mobilia) o;
            listMobilias.remove(mobiliaParaRemover);
            salvarListaEmArquivo();
            getHistorico().inserir("Remoção da Mobília " + mobiliaParaRemover.getNome());
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Mobilia mobiliaEncontrada = buscar(codigo);
        if (null != mobiliaEncontrada) {
            listMobilias.remove(mobiliaEncontrada);
            salvarListaEmArquivo();
            getHistorico().inserir("Remoção da Mobília " + mobiliaEncontrada.getNome());
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if (objetoEUmaMobilia(o)) {
            Mobilia mobiliaParaInserir = (Mobilia) o;
            Mobilia mobiliaParaRemover = buscar(codigo);
            
            if (null != mobiliaParaRemover) {
                listMobilias.remove(mobiliaParaRemover);
                listMobilias.add(mobiliaParaInserir);
                salvarListaEmArquivo();
                getHistorico().inserir("Atualização do mobilia " + mobiliaParaInserir.getNome());
            }
        } 
    }

    @Override
    public List buscarTodos() 
    {
        return listMobilias;   
    }

    @Override
    public Mobilia buscar(String codigo) 
    {
        for (Mobilia mobiliaDaLista : listMobilias) {
                if (mobiliaDaLista.getCodigo().equals(codigo)) {
                    return mobiliaDaLista;           
                }
        }
        return null; 
    }
    
    public boolean objetoEUmaMobilia(Object o) 
    {
        if (o instanceof Mobilia) {
            return true;
            
        } else {
            try {
                throw new Exception("objetoEUmaMobilia(Object o)"
                        + " recebendo um objeto que não é uma instância"
                        + " de Mobília");
            } catch (Exception ex) {
                Logger.getLogger(MobiliaDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return false;
            }
        }
    }
    
    @Override
    public int getMaiorIndexDaLista() {
        int maiorIndex = 0;
        for (Mobilia mobiliaDaLista : listMobilias) {
            int codigoDaMobiliaDaLista = Integer.parseInt(mobiliaDaLista.getCodigo());
            if (codigoDaMobiliaDaLista > maiorIndex) {
                maiorIndex = codigoDaMobiliaDaLista;
            }
        }
        
        return maiorIndex;
    }
    
    @Override
    public void atualizarListaComArquivo()
    {
        try {
            abrirLeituraDoArquivo();
            listMobilias = (ArrayList) objectIn.readObject();
            fecharLeituraDoArquivo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MobiliaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível atualizar a lista com"
                        + " os dados do arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(MobiliaDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    @Override
    public void salvarListaEmArquivo()
    {
        try {
            abrirArmazenamentoEmArquivo();
            objectOut.writeObject(listMobilias); 
            fecharArmazenamentoEmArquivo();
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível salvar os dados no"
                                    + " arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(MobiliaDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
}
