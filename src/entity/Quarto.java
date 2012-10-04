/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Tássio
 */
public class Quarto {
    private String codigo;
    private TipoQuarto tipoQuarto;
    private boolean status;

    public Quarto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoQuarto getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(TipoQuarto tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
