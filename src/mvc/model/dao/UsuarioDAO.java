package mvc.model.dao;

import entity.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO extends AbstractDAO
{
    private List<Usuario> listUsuarios = new ArrayList<>();
    
    public UsuarioDAO() throws IOException 
    {
        super();   
    }
    
    public boolean validarLogin(String lg)
    {
        boolean result = false;
        if(lg.trim().length() >= 4 && lg.trim().length() <= 10) {
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    public boolean validarSenha(String s)
    {
        boolean result = false;
        if(s.trim().length() >= 5 && s.trim().length() <=10) {
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    public boolean checkUsuario(Usuario usuario)
    {
        String login = usuario.getLogin();
        String senha = usuario.getSenha();
        
        boolean result = false;
        if(
                validarLogin(login) 
                && validarSenha(senha) 
                && (null != buscarPorLoginESenha(login, senha))
        ) {
            result = true;
        } else {
            result = false;
        }
        
        return result;        
    }

    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmUsuario(o)) {
            Usuario usuarioParaInserir = (Usuario) o;
            /*Garantindo que o código equivale ao index*/
            usuarioParaInserir.setCodigo(getIndex());
            listUsuarios.add(usuarioParaInserir);
            getHistorico().inserir("Inserção do Usuário " + usuarioParaInserir.getNomeCompleto());
            acrescerIndex();
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if (objetoEUmUsuario(o)) {
            Usuario usuarioParaRemover = (Usuario) o;
            listUsuarios.remove((Usuario) o);
            getHistorico().inserir("Remoção do Usuário " + usuarioParaRemover.getNomeCompleto());
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Usuario usuarioEncontrado = buscar(codigo);
        if (null != usuarioEncontrado) {
            listUsuarios.remove(usuarioEncontrado);
            getHistorico().inserir("Remoção do Usuário " + usuarioEncontrado.getNomeCompleto());
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if (objetoEUmUsuario(o)) {
            Usuario clienteParaInserir = (Usuario) o;
            Usuario clienteParaRemover = buscar(codigo);
            
            if (null != clienteParaRemover) {
                listUsuarios.remove(clienteParaRemover);
                listUsuarios.add(clienteParaInserir);
                getHistorico().inserir("Atualização do Usuário " + clienteParaInserir.getNomeCompleto());
            }
        }
    }

    @Override
    public List buscarTodos() 
    {
        return listUsuarios;
        
    }

    @Override
    public Usuario buscar(String codigo) 
    {
        for (Usuario clienteDaLista : listUsuarios) {
                if (clienteDaLista.getCodigo() == Integer.parseInt(codigo)) {
                    return clienteDaLista;
                    
                }
        }
        return null;
        
    }
    
    public Usuario buscarPorLoginESenha(String login, String senha) 
    {
        for (Usuario clienteDaLista : listUsuarios) {
                if (
                        clienteDaLista.getLogin().equals(login)
                        && clienteDaLista.getSenha().equals(senha)
                ) {
                    return clienteDaLista;   
                }
        }
        return null;
        
    }
  
    public boolean objetoEUmUsuario(Object o) 
    {
        if (o instanceof Usuario) {
            return true;
            
        } else {
            try {
                throw new Exception("objetoEUmUsuario(Object o)"
                        + " recebendo um objeto que não é uma instância"
                        + " de Usuario");
            } catch (Exception ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return false;
            }
        }
    }
    
    @Override
    public void atualizarListaComArquivo() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarListaEmArquivo() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaiorIndexDaLista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
