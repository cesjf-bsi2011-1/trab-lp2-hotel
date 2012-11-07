/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model.dao;

import entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO extends AbstractDAO
{

    private static List<Cliente> clientes = new ArrayList<>();
    
    @Override
    public void inserir(Object o) 
    {
        if(objetoEUmCliente(o)) {
            Cliente novoCliente = (Cliente) o;
            clientes.add(novoCliente);
            getHistorico().inserir("Inserção do Cliente "
                    + novoCliente.getNome());
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if(objetoEUmCliente(o)) {
            Cliente novoCliente = (Cliente) o;
            clientes.remove((Cliente) o);
            getHistorico().inserir("Remoção do Cliente " + novoCliente.getNome());
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Cliente clienteEncontrado = buscar(codigo);
        if(null != clienteEncontrado) {
            clientes.remove(Integer.parseInt(codigo));
            getHistorico().inserir("Remoção do Cliente " + 
                                               clienteEncontrado.getNome());
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if(objetoEUmCliente(o)) {
            Cliente clienteViaParametro = (Cliente) o;
            
            if(null != buscar(codigo)) {
                clientes.remove(Integer.parseInt(codigo));
                clientes.add(clienteViaParametro);
                getHistorico().inserir("Atualização do cliente " + clienteViaParametro.getNome());
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
        for(Cliente clienteDaLista : clientes) 
        {
                if(clienteDaLista.getCodigo() == Integer.parseInt(codigo)) {
                    return clienteDaLista;
                    
                }
        }
        
        try {
            throw new Exception("ClienteDAO.buscar(String codigo) não "
                    + "encontrou um cliente que possua o codigo " + codigo +
                    ".");
        } catch (Exception ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            return null;
        }
        
    }
    public boolean objetoEUmCliente(Object o) 
    {
        if(o instanceof Cliente) {
            return true;
            
        } else {
            try {
                throw new Exception("ClienteDAO.atualizar(String codigo, "
                        + "Object o) recebendo um objeto que não é uma instância"
                        + " de Cliente");
            } catch (Exception ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return false;
            }
        }
    }
    
}
