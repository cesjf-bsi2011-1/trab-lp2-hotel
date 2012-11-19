package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TipoQuarto implements InterfaceEntity, Serializable
{
    private String codigo;
    private String nome;
    private String descricao;
    private List<Mobilia> mobilias;

    public TipoQuarto(String codigo, String nome, String descricao) 
    {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        mobilias = new ArrayList<>();
    }

    public TipoQuarto() 
    {
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(String codigo) 
    {
        this.codigo = codigo;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public List<Mobilia> getMobilias()
    {
        return mobilias;
    }

    public void setMobilias(List<Mobilia> listMobilia)
    {
        this.mobilias = listMobilia;
    }
    
    @Override
    public Object[] getDadosEmVetor()
    {
        throw new UnsupportedOperationException("TipoQuarto.getDadosEmVetor não "
                + "desenvolvido.");
    }
}
