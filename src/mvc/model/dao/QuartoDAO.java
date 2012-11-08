package mvc.model.dao;

import entity.Quarto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Tássio Auad
 */
public class QuartoDAO extends AbstractDAO
{
    private static List<Quarto> quartos = new ArrayList<>();
    private static int index = 0;
    
    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmQuarto(o)) {
            Quarto quartoParaInserir = (Quarto) o;
            /*Garantindo que o código equivale ao index*/
            quartoParaInserir.setCodigo(String.valueOf(getIndex()));
            quartos.remove(quartoParaInserir);
            getHistorico().inserir("Remoção do Quarto " + quartoParaInserir.getCodigo());
        }       
    }

    @Override
    public void remover(Object o) 
    {
        if (objetoEUmQuarto(o)) {
            Quarto novoQuarto = (Quarto) o;
            quartos.remove((Quarto) o);
            getHistorico().inserir("Remoção do Quarto " + novoQuarto.getCodigo());
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Quarto quartoEncontrado = buscar(codigo);
        if (null != quartoEncontrado) {
            quartos.remove(quartoEncontrado);
            getHistorico().inserir("Remoção do Quarto " + quartoEncontrado.getCodigo());
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if (objetoEUmQuarto(o)) {
            Quarto quartoParaInserir = (Quarto) o;
            Quarto quartoParaRemover = buscar(codigo);
            
            if (null != quartoParaRemover) {
                quartos.remove(quartoParaRemover);
                /*Garantindo que o código equivale ao index*/
                quartoParaInserir.setCodigo(String.valueOf(getIndex()));
                quartos.add(quartoParaInserir);
                getHistorico().inserir("Atualização do tipo de quarto " + quartoParaInserir.getCodigo());
            }
        }
    }

    @Override
    public List buscarTodos() 
    {
        return quartos;
        
    }

    @Override
    public Quarto buscar(String codigo) 
    {
        for (Quarto quartoDaLista : quartos) {
                if (quartoDaLista.getCodigo().equals(codigo)) {
                    return quartoDaLista;
                    
                }
        }
        /*Se não houve retorno, não encontrou 
         * e, sendo assim, se torna uma Exception
         * por regra.
         */
        try {
            throw new Exception("QuartoDAO.buscar(String codigo) não "
                    + "encontrou um tipo de quarto que possua o codigo " + codigo 
                    + ".");
        } catch (Exception ex) {
            Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            return null;
        }
        
    }
    public boolean objetoEUmQuarto(Object o) 
    {
        if (o instanceof Quarto) {
            return true;
            
        } else {
            try {
                throw new Exception("QuartoDAO.atualizar(String codigo, "
                        + "Object o) recebendo um objeto que não é uma instância"
                        + " de Quarto");
            } catch (Exception ex) {
                Logger.getLogger(QuartoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                return false;
            }
        }
    }
    
    @Override
    public int getIndex()
    {
        return index;
    }
    
    @Override
    public void acrescerIndex()
    {
        index += 1;
    }
    
}
