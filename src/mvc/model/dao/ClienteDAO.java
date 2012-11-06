/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model.dao;

import entity.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Willian
 */
public class ClienteDAO extends AbstractDAO
{

    private static List<Cliente> clientes = new ArrayList<>();
    
    @Override
    public void inserir(Object o) 
    {
        if(o instanceof Cliente) {
            clientes.add((Cliente) o);
            
        }
    }

    @Override
    public void remover(Object o) 
    {
        if(o instanceof Cliente) {
            clientes.remove((Cliente) o);
            
        }
    }
    
    @Override
    public void remover(String codigo) 
    {
        for(int i = 0; i < clientes.size(); i++) 
        {
            if(clientes.get(i).getCodigo() == Integer.parseInt(codigo)) {
                clientes.remove(i);
            }
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if(o instanceof Cliente) {
            Cliente cliente = (Cliente) o;
            for(int i = 0; i < clientes.size(); i++) 
            {
                if(clientes.get(i).getCodigo() == Integer.parseInt(codigo)) {
                    clientes.remove(i);
                    clientes.add(cliente);
                    
                }
            }
        }
    }

    @Override
    public List buscarTodos() 
    {
        return clientes;
        
    }

    @Override
    public Cliente buscar(String codigo) 
    {
        for(int i = 0; i < clientes.size(); i++) 
        {
                if(clientes.get(i).getCodigo() == Integer.parseInt(codigo)) {
                    return clientes.get(i);
                    
                }
        }
        return null;
    }
    
    
}
