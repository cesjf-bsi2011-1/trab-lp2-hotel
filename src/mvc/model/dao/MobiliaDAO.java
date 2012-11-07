/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model.dao;

import entity.Mobilia;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MobiliaDAO extends AbstractDAO
{

    private static List<Mobilia> mobilias = new ArrayList<>();
    
    @Override
    public void inserir(Object o) 
    {
        if(objetoEUmaMobilia(o)) {
            Mobilia novaMobilia = (Mobilia) o;
            mobilias.add(novaMobilia);
            getHistorico().inserir("Inserção da Mobília "
                    + novaMobilia.getNome());
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if(objetoEUmaMobilia(o)) {
            Mobilia novaMobilia = (Mobilia) o;
            mobilias.remove((Mobilia) o);
            getHistorico().inserir("Remoção da Mobília " + novaMobilia.getNome());
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Mobilia mobiliaEncontrada = buscar(codigo);
        if(null != mobiliaEncontrada) {
            mobilias.remove(Integer.parseInt(codigo));
            getHistorico().inserir("Remoção da Mobília " + 
                                               mobiliaEncontrada.getNome());
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if(objetoEUmaMobilia(o)) {
            Mobilia mobiliaViaParametro = (Mobilia) o;
            
            if(null != buscar(codigo)) {
                mobilias.remove(Integer.parseInt(codigo));
                mobilias.add(mobiliaViaParametro);
                getHistorico().inserir("Atualização do mobilia " + mobiliaViaParametro.getNome());
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
        
        try {
            throw new Exception("MobiliasDAO.buscar(String codigo) não "
                    + "encontrou uma mobília que possua o codigo " + codigo +
                    ".");
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
