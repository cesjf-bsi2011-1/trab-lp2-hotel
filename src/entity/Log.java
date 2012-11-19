package entity;

import java.io.Serializable;
import java.util.Date;

public class Log implements InterfaceEntity, Serializable
{    
    private String codigo;
    private Usuario usuario;
    private String acao;
    private Date data;

    public Log() 
    {
    }
    
    public Log(String codigo, Usuario usuario, String acao, Date data) 
    {
        this.codigo = codigo;
        this.usuario = usuario;
        this.acao = acao;
        this.data = data;
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(String codigo) 
    {
        this.codigo = codigo;
    }
    
    public Usuario getUsuario() 
    {
        return usuario;
    }

    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }

    public String getAcao() 
    {
        return acao;
    }

    public void setAcao(String acao) 
    {
        this.acao = acao;
    }

    public Date getData() 
    {
        return data;
    }

    public void setData(Date data) 
    {
        this.data = data;
    }

    @Override
    public Object[] getDadosEmVetor() 
    {
        throw new UnsupportedOperationException("Log.getDadosEmVetor não "
                + "desenvolvido.");
    }    
}
