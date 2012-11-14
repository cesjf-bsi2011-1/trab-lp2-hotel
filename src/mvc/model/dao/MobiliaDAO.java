package mvc.model.dao;

import entity.Mobilia;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Tássio Auad
 */
public class MobiliaDAO extends AbstractDAO
{
    private static List<Mobilia> listMobilias = new ArrayList<>();
    private static int index = 0000;
    
    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmaMobilia(o)) {
            Mobilia mobiliaParaInserir = (Mobilia) o;
            /*Garantindo que o código equivale ao index*/
            mobiliaParaInserir.setCodigo(String.valueOf(getIndex()));
            listMobilias.add(mobiliaParaInserir);
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
            getHistorico().inserir("Remoção da Mobília " + mobiliaParaRemover.getNome());
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Mobilia mobiliaEncontrada = buscar(codigo);
        if (null != mobiliaEncontrada) {
            listMobilias.remove(mobiliaEncontrada);
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
                /*Garantindo que o código equivale ao index*/
                mobiliaParaRemover.setCodigo(String.valueOf(getIndex()));
                listMobilias.add(mobiliaParaInserir);
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
                throw new Exception("MobiliaDAO.atualizar(String codigo, "
                        + "Object o) recebendo um objeto que não é uma instância"
                        + " de Mobília");
            } catch (Exception ex) {
                Logger.getLogger(MobiliaDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return false;
            }
        }
    }
    
    @Override
    public int getIndex()
    {
        return index;
    }
    
    @Override
    public void acrescerIndex()
    {
        index += 1;
    }
}
