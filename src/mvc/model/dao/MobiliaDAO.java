package mvc.model.dao;

import entity.Mobilia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tássio Auad
 */
public class MobiliaDAO extends AbstractDAO
{
    private static List<Mobilia> mobilias = new ArrayList<>();
    
    @Override
    public void inserir(Object o) 
    {
        if(o instanceof Mobilia) {
            mobilias.add((Mobilia) o);
            
        }
    }

    @Override
    public void remover(Object o) 
    {
        if(o instanceof Mobilia) {
            mobilias.remove((Mobilia) o);
            
        }
    }
    
    @Override
    public void remover(String codigo) 
    {
        for(int i = 0; i < mobilias.size(); i++) 
        {
            if(mobilias.get(i).getCodigo().equals(codigo) ) {
                mobilias.remove(i);
            }
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if(o instanceof Mobilia) {
            Mobilia mobilia = (Mobilia) o;
            for(int i = 0; i < mobilias.size(); i++) 
            {
                if(mobilias.get(i).getCodigo().equals(codigo) ) {
                    mobilias.remove(i);
                    mobilias.add(mobilia);
                    
                }
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
        for(int i = 0; i < mobilias.size(); i++) 
        {
                if(mobilias.get(i).getCodigo().equals(codigo) ) {
                    return mobilias.get(i);
                    
                }
        }
        return null;
    }
}
