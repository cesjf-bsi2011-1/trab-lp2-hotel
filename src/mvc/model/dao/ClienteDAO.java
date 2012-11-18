package mvc.model.dao;

import entity.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Tássio Auad
 */
public class ClienteDAO extends AbstractDAO
{
    private static List<Cliente> listClientes = new ArrayList<>();
    private static int index = 0000;
    
    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmCliente(o)) {
            Cliente clienteParaInserir = (Cliente) o;
            /*Garantindo que o código equivale ao index*/
            clienteParaInserir.setCodigo(getIndex());
            listClientes.add(clienteParaInserir);
            getHistorico().inserir("Inserção do Cliente " + clienteParaInserir.getNome());
            acrescerIndex();
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if (objetoEUmCliente(o)) {
            Cliente clienteParaInserir = (Cliente) o;
            listClientes.remove((Cliente) o);
            getHistorico().inserir("Remoção do Cliente " + clienteParaInserir.getNome());
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Cliente clienteEncontrado = buscar(codigo);
        if (null != clienteEncontrado) {
            listClientes.remove(clienteEncontrado);
            getHistorico().inserir("Remoção do Cliente " + clienteEncontrado.getNome());
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if (objetoEUmCliente(o)) {
            Cliente clienteParaInserir = (Cliente) o;
            Cliente clienteParaRemover = buscar(codigo);
            
            if (null != clienteParaRemover) {
                listClientes.remove(clienteParaRemover);
                listClientes.add(clienteParaInserir);
                getHistorico().inserir("Atualização do Cliente " + clienteParaInserir.getNome());
            }
        }
    }

    @Override
    public List buscarTodos() 
    {
        return listClientes;
        
    }

    @Override
    public Cliente buscar(String codigo) 
    {
        for (Cliente clienteDaLista : listClientes) {
                if (clienteDaLista.getCodigo() == Integer.parseInt(codigo)) {
                    return clienteDaLista;
                    
                }
        }
        return null;
        
    }
    

    public Cliente buscarPorCpf(String cpf) 
    {
        for (Cliente clienteDaLista : listClientes) {
                if (clienteDaLista.getCpf().equals(cpf)) {
                    return clienteDaLista;
                    
                }
        }
        return null;       
    }
    
    public boolean objetoEUmCliente(Object o) 
    {
        if (o instanceof Cliente) {
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