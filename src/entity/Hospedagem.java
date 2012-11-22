package entity;

import java.io.Serializable;
import java.util.Date;
import myutils.DateCustomizer;

public class Hospedagem implements InterfaceEntity, Serializable
{
    private String codigo;
    private Cliente hospede;
    private Quarto quartoAlugado;
    private Date dataLocacao;
    private float desconto;
    
    public Hospedagem()
    {
    }

    public Hospedagem(String codigo, Cliente hospede, Quarto quartoAlugado, 
            Date dataLocacao)
    {
        this.codigo = codigo;
        this.hospede = hospede;
        this.quartoAlugado = quartoAlugado;
        this.dataLocacao = dataLocacao;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    public Cliente getHospede()
    {
        return hospede;
    }

    public void setHospede(Cliente hospede)
    {
        this.hospede = hospede;
    }

    public Quarto getQuartoAlugado() {
        return quartoAlugado;
    }

    public void setQuartoAlugado(Quarto quartoAlugado)
    {
        this.quartoAlugado = quartoAlugado;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao)
    {
        this.dataLocacao = dataLocacao;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
    
    public int getQuantidadeDeDiarias()
    {
        int mesAtual = Integer.parseInt(
                    DateCustomizer.getMonthFromDateObject(new Date())
                );
        int diaAtual = Integer.parseInt(
                    DateCustomizer.getDayFromDateObject(new Date())
                );
        int mesLocacao = Integer.parseInt(
                    DateCustomizer.getMonthFromDateObject(dataLocacao)
                );
        int diaLocacao = Integer.parseInt(
                    DateCustomizer.getDayFromDateObject(dataLocacao)
                );
                
        int quantidadeDias;
        if (mesAtual != mesLocacao) {
            quantidadeDias = ( (mesAtual-mesLocacao) + 1 ) * 30;
        }
        quantidadeDias = (diaAtual - diaLocacao) + 1;
        
        return quantidadeDias;
    }
    
    public float calcularValor()
    {
        int quantidadeDias = getQuantidadeDeDiarias();
        float valorSemDesconto = quantidadeDias * quartoAlugado.getValor();
        float descontoReais = valorSemDesconto * (this.desconto)/100;
        return valorSemDesconto - descontoReais;
    }

    @Override
    public Object[] getDadosEmVetor() {
        String statusLocado = "DISPONÍVEL";
        if (quartoAlugado.isStatus()) {
            statusLocado = "LOCADO";
        }
        
        Object dados[] = {
            codigo,
            hospede.getNome(),
            quartoAlugado.getObservacao(),
            quartoAlugado.getTipoQuarto().getNome(),
            DateCustomizer.DateToStr(dataLocacao),
            statusLocado,
            String.valueOf(calcularValor())
        };
        
        return dados;
    }
}
