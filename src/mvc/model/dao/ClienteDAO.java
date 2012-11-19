package mvc.model.dao;

import entity.Cliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO extends AbstractDAO
{
    private static List<Cliente> listClientes = new ArrayList<>();

    public ClienteDAO() throws IOException 
    {
        nomeArquivoDados = "cliente.data";
        atualizarListaComArquivo();
        index = getMaiorIndexDaLista()+ 1;
    }
 
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
            salvarListaEmArquivo();
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if (objetoEUmCliente(o)) {
            Cliente clienteParaInserir = (Cliente) o;
            listClientes.remove((Cliente) o);
            getHistorico().inserir("Remoção do Cliente " + clienteParaInserir.getNome());
            salvarListaEmArquivo();
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Cliente clienteEncontrado = buscar(codigo);
        if (null != clienteEncontrado) {
            listClientes.remove(clienteEncontrado);
            getHistorico().inserir("Remoção do Cliente " + clienteEncontrado.getNome());
            salvarListaEmArquivo();
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
                salvarListaEmArquivo();
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
                throw new Exception("objetoEUmCliente(Object o)"
                        + " recebendo um objeto que não é uma instância"
                        + " de Cliente");
            } catch (Exception ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return false;
            }
        }
    }

    @Override
    public int getMaiorIndexDaLista() {
        int maiorIndex = 0;
        for (Cliente clienteDaLista : listClientes) {
            int codigoDoClienteDaLista = clienteDaLista.getCodigo();
            if (codigoDoClienteDaLista > maiorIndex) {
                maiorIndex = codigoDoClienteDaLista;
            }
        }
        
        return maiorIndex;
    }
    
    @Override
    public void atualizarListaComArquivo()
    {
        try {
            abrirLeituraDoArquivo();
            listClientes = (ArrayList) objectIn.readObject();
            fecharLeituraDoArquivo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível atualizar a lista com"
                        + " os dados do arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    @Override
    public void salvarListaEmArquivo()
    {
        try {
            abrirArmazenamentoEmArquivo();
            objectOut.writeObject(listClientes); 
            fecharArmazenamentoEmArquivo();
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível salvar os dados no"
                                    + " arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
}