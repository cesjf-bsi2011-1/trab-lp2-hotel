package entity;

import java.io.Serializable;

public class Quarto implements InterfaceEntity, Serializable
{
    private String codigo;
    private TipoQuarto tipoQuarto;
    private boolean status;
    private float valor;
    private String Observacao;

    public float getValor() 
    {
        return valor;
    }

    public void setValor(float valor) 
    {
        this.valor = valor;
    }

    public String getObservacao() 
    {
        return Observacao;
    }

    public void setObservacao(String Observacao) 
    {
        this.Observacao = Observacao;
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(String codigo) 
    {
        this.codigo = codigo;
    }

    public TipoQuarto getTipoQuarto() 
    {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuarto tipoQuarto) 
    {
        this.tipoQuarto = tipoQuarto;
    }

    public boolean isStatus() 
    {
        return status;
    }

    public void setStatus(boolean status) 
    {
        this.status = status;
    }
    
    @Override
    public Object[] getDadosEmVetor()
    {
        Object dados[] = {
            codigo,
            tipoQuarto.getNome(),
            status,
            valor,
            Observacao
        };
        
        return dados;
    }
    
    public Object[] getDadosEmVetorParaGridHospedagem()
    {
        String statusLocado = "DISPONÍVEL";
        if (status) {
            statusLocado = "LOCADO";
        }
        Object dados[] = {
            codigo,
            "",
            Observacao,
            tipoQuarto.getNome(),
            "",
            statusLocado,
            valor,
            
        };
        
        return dados;
    }
    
    
}
