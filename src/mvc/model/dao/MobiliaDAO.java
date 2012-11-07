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

    private static List<Mobilia> mobilias = new ArrayList<>();
    
    @Override
    public void inserir(Object o) 
    {
        if(objetoEUmaMobilia(o)) {
            Mobilia novaMobilia = (Mobilia) o;
            mobilias.add(novaMobilia);
            getHistorico().inserir("Inserção da Mobília " + novaMobilia.getNome());
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if(objetoEUmaMobilia(o)) {
            Mobilia mobiliaParaRemover = (Mobilia) o;
            mobilias.remove(mobiliaParaRemover);
            getHistorico().inserir("Remoção da Mobília " + mobiliaParaRemover.getNome());
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Mobilia mobiliaEncontrada = buscar(codigo);
        if(null != mobiliaEncontrada) {
            mobilias.remove(mobiliaEncontrada);
            getHistorico().inserir("Remoção da Mobília " + mobiliaEncontrada.getNome());
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if(objetoEUmaMobilia(o)) {
            Mobilia mobiliaParaInserir = (Mobilia) o;
            Mobilia mobiliaParaRemover = buscar(codigo);
            
            if(null != mobiliaParaRemover) {
                mobilias.remove(mobiliaParaRemover);
                mobilias.add(mobiliaParaInserir);
                getHistorico().inserir("Atualização do mobilia " + mobiliaParaInserir.getNome());
            }
        } 
    }

    @Override
    public List buscarTodos() 
    {
        return mobilias;   
    }

    @Override
    public Mobilia buscar(String codigo) 
    {
        for(Mobilia mobiliaDaLista : mobilias) 
        {
                if(mobiliaDaLista.getCodigo().equals(codigo)) {
                    return mobiliaDaLista;           
                }
        }
        /*Se não houve retorno, não encontrou 
         * e, sendo assim, se torna uma Exception
         * por regra.
         */
        try {
            throw new Exception("MobiliasDAO.buscar(String codigo) não "
                    + "encontrou uma mobília que possua o codigo " + codigo 
                    + ".");
        } catch (Exception ex) {
            Logger.getLogger(MobiliaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            return null;
        }
        
    }
    
    public boolean objetoEUmaMobilia(Object o) 
    {
        if(o instanceof Mobilia) {
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
    
    
}
