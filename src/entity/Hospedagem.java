package entity;

import java.util.Date;
import myutils.DateCustomizer;

public class Hospedagem {
    private String codigo;
    private Cliente hospede;
    private Quarto quartoAlugado;
    private Date dataLocacao;

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
    
    public float calcularValor()
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
  
        return quantidadeDias * quartoAlugado.getValor();
    }
}
