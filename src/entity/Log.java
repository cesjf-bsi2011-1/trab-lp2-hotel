package entity;

import java.util.Date;

/**
 *
 * @author Tássio Auad
 */
public class Log {
    
    private Usuario usuario;
    private String acao;
    private Date data;

    public Log() {
    }
    
    public Log(Usuario usuario, String acao, Date data) {
        this.usuario = usuario;
        this.acao = acao;
        this.data = data;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
