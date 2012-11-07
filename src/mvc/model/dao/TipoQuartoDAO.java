package mvc.model.dao;

import entity.TipoQuarto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Tássio Auad
 */
public class TipoQuartoDAO extends AbstractDAO
{
    private static List<TipoQuarto> tiposQuarto = new ArrayList<>();
    private static int index = 0;
    
    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmTipoQuarto(o)) {
            TipoQuarto tipoQuartoParaInserir = (TipoQuarto) o;
            /*Garantindo que o código equivale ao index*/
            tipoQuartoParaInserir.setCodigo(String.valueOf(getIndex()));
            tiposQuarto.add(tipoQuartoParaInserir);
            getHistorico().inserir("Remoção do Tipo de Quarto " + tipoQuartoParaInserir.getNome());
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if (objetoEUmTipoQuarto(o)) {
            TipoQuarto novoTipoQuarto = (TipoQuarto) o;
            tiposQuarto.remove((TipoQuarto) o);
            getHistorico().inserir("Remoção do Tipo de Quarto " + novoTipoQuarto.getNome());
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        TipoQuarto tipoQuartoEncontrado = buscar(codigo);
        if (null != tipoQuartoEncontrado) {
            tiposQuarto.remove(tipoQuartoEncontrado);
            getHistorico().inserir("Remoção do Tipo de Quarto " + tipoQuartoEncontrado.getNome());
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if (objetoEUmTipoQuarto(o)) {
            TipoQuarto tipoQuartoParaInserir = (TipoQuarto) o;
            TipoQuarto tipoQuartoParaRemover = buscar(codigo);
            
            if (null != tipoQuartoParaRemover) {
                tiposQuarto.remove(tipoQuartoParaRemover);
                /*Garantindo que o código equivale ao index*/
                tipoQuartoParaInserir.setCodigo(String.valueOf(getIndex()));
                tiposQuarto.add(tipoQuartoParaInserir);
                getHistorico().inserir("Atualização do tipo de quarto " + tipoQuartoParaInserir.getNome());
            }
        }
    }

    @Override
    public List buscarTodos() 
    {
        return tiposQuarto;
        
    }

    @Override
    public TipoQuarto buscar(String codigo) 
    {
        for (TipoQuarto tipoQuartoDaLista : tiposQuarto) {
                if (tipoQuartoDaLista.getCodigo().equals(codigo)) {
                    return tipoQuartoDaLista;
                    
                }
        }
        /*Se não houve retorno, não encontrou 
         * e, sendo assim, se torna uma Exception
         * por regra.
         */
        try {
            throw new Exception("TipoQuartoDAO.buscar(String codigo) não "
                    + "encontrou um tipo de quarto que possua o codigo " + codigo 
                    + ".");
        } catch (Exception ex) {
            Logger.getLogger(TipoQuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            return null;
        }
        
    }
    public boolean objetoEUmTipoQuarto(Object o) 
    {
        if (o instanceof TipoQuarto) {
            return true;
            
        } else {
            try {
                throw new Exception("TipoQuartoDAO.atualizar(String codigo, "
                        + "Object o) recebendo um objeto que não é uma instância"
                        + " de TipoQuarto");
            } catch (Exception ex) {
                Logger.getLogger(TipoQuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return false;
            }
        }
    }
  
    public int getIndex()
    {
        return index;
    }
    
    public void acrescerIndex()
    {
        index += 1;
    }
}
