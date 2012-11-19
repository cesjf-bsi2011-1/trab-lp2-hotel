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
        nomeArquivoDados = "usuario.data";
        atualizarListaComArquivo();
        index = getMaiorIndexDaLista()+ 1; 
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
            salvarListaEmArquivo();
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if (objetoEUmUsuario(o)) {
            Usuario usuarioParaRemover = (Usuario) o;
            listUsuarios.remove((Usuario) o);
            getHistorico().inserir("Remoção do Usuário " + usuarioParaRemover.getNomeCompleto());
            salvarListaEmArquivo();
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Usuario usuarioEncontrado = buscar(codigo);
        if (null != usuarioEncontrado) {
            listUsuarios.remove(usuarioEncontrado);
            getHistorico().inserir("Remoção do Usuário " + usuarioEncontrado.getNomeCompleto());
            salvarListaEmArquivo();
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
                salvarListaEmArquivo();
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
    public int getMaiorIndexDaLista() {
        int maiorIndex = 0;
        for (Usuario usuarioDaLista  : listUsuarios) {
            int codigoDoUsuarioDaLista = usuarioDaLista.getCodigo();
            if (codigoDoUsuarioDaLista > maiorIndex) {
                maiorIndex = codigoDoUsuarioDaLista;
            }
        }
        
        return maiorIndex;
    }
    
    @Override
    public void atualizarListaComArquivo()
    {
        try {
            abrirLeituraDoArquivo();
            listUsuarios = (ArrayList) objectIn.readObject();
            fecharLeituraDoArquivo();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TipoQuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível atualizar a lista com"
                        + " os dados do arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    @Override
    public void salvarListaEmArquivo()
    {
        try {
            abrirArmazenamentoEmArquivo();
            objectOut.writeObject(listUsuarios); 
            fecharArmazenamentoEmArquivo();
        } catch (IOException ex) {
            try {
                throw new Exception("Não foi possível salvar os dados no"
                                    + " arquivo " + nomeArquivoDados);
            } catch (Exception ex1) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
   
}
