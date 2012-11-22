package entity;

import java.io.Serializable;
import java.util.Date;

public class Cliente implements InterfaceEntity, Serializable 
{
    private int codigo;
    private String nome;
    private String rua;
    private String numeroEnd;
    private String cidade;
    private String estado;
    private String complemento;
    private String cep;
    private boolean juridico;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private String clienteNivel;
    private String foneResidencial;
    private String foneComercial;
    private String foneCelular;
    private String email;
    private String observação;    

    public String getRua() 
    {
        return rua;
    }

    public void setRua(String rua) 
    {
        this.rua = rua;
    }

    public String getComplemento() 
    {
        return complemento;
    }

    public void setComplemento(String complemento) 
    {
        this.complemento = complemento;
    }

    public String getCep() 
    {
        return cep;
    }

    public void setCep(String cep) 
    {
        this.cep = cep;
    }

    public String getEstado() 
    {
        return estado;
    }

    public void setEstado(String estado) 
    {
        this.estado = estado;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
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
    
    public String getNumeroEnd() 
    {
        return numeroEnd;
    }

    public void setNumeroEnd(String numeroEnd) 
    {
        this.numeroEnd = numeroEnd;
    }

    public String getCidade() 
    {
        return cidade;
    }

    public void setCidade(String cidade) 
    {
        this.cidade = cidade;
    }

    public boolean isJuridico() 
    {
        return juridico;
    }

    public void setJuridico(boolean juridico) 
    {
        this.juridico = juridico;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public String getRg() 
    {
        return rg;
    }

    public void setRg(String rg) 
    {
        this.rg = rg;
    }

    public Date getDataNascimento() 
    {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) 
    {
        this.dataNascimento = dataNascimento;
    }

    public String getClienteNivel() 
    {
        return clienteNivel;
    }

    public void setClienteNivel(String clienteNivel) 
    {
        this.clienteNivel = clienteNivel;
    }

    public String getFoneResidencial() 
    {
        return foneResidencial;
    }

    public void setFoneResidencial(String foneResidencial) 
    {
        this.foneResidencial = foneResidencial;
    }

    public String getFoneComercial() 
    {
        return foneComercial;
    }

    public void setFoneComercial(String foneComercial) 
    {
        this.foneComercial = foneComercial;
    }

    public String getFoneCelular() 
    {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) 
    {
        this.foneCelular = foneCelular;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getObservação() 
    {
        return observação;
    }

    public void setObservação(String observação) 
    {
        this.observação = observação;
    }

    @Override
    public Object[] getDadosEmVetor()
    {
        Object[] dados = new Object[] {
            codigo,
            nome,
            cpf,
            rg,
            cidade
        };
        
        return dados;
    }
}
