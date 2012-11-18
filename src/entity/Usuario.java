package entity;

public class Usuario 
{
    private int codigo;
    private String login;
    private String senha;
    private String nomeCompleto;
    
    public Usuario() 
    {

    }

    public Usuario(String login, String senha, String nomeCompleto) {
        this.login = login;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
