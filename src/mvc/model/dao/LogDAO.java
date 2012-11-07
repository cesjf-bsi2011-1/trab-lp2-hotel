package mvc.model.dao;

import entity.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.controllerview.AbstractForm;
import java.util.Date;

/*
 * @author Tássio Auad
 */
public class LogDAO extends AbstractDAO
{
    private static List<Log> historico = new ArrayList<>();
    private static int index = 0;
    
    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmLog(o)) {
            Log logParaInserir = (Log) o;
            /*Garantindo que o código equivale ao index*/
            logParaInserir.setCodigo(String.valueOf(getIndex()));
            historico.remove(logParaInserir);
            getHistorico().inserir("Remoção do Log :" + logParaInserir.getAcao());
        }       
    }

    public void inserir(String mensagem) {
        Date data = new Date();
        Log log = new Log(String.valueOf(getIndex()), AbstractForm.logado, mensagem, data);
        inserir(log);
    }
    
    @Override
    public void remover(Object o) 
    {
        if (objetoEUmLog(o)) {
            Log logParaRemover = (Log) o;
            historico.remove((Log) o);
            getHistorico().inserir("Remoção do Log :" + logParaRemover.getAcao());
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Log logEncontrado = buscar(codigo);
        if (null != logEncontrado) {
            historico.remove(logEncontrado);
            getHistorico().inserir("Remoção do Log :" + logEncontrado.getAcao());
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) 
    {
        if (objetoEUmLog(o)) {
            Log logParaRemover = (Log) o;
            Log logParaInserir = buscar(codigo);
            
            if (null != logParaRemover) {
                historico.remove(logParaRemover);
                /*Garantindo que o código equivale ao index*/
                logParaInserir.setCodigo(String.valueOf(getIndex()));
                historico.add(logParaInserir);
                getHistorico().inserir("Atualização do Log :" + logParaInserir.getAcao());
            }
        }
    }

    @Override
    public List buscarTodos() 
    {
        return historico;
        
    }

    @Override
    public Log buscar(String codigo) 
    {
        for (Log logDaLista : historico) {
                if (logDaLista.getCodigo().equals(codigo)) {
                    return logDaLista;
                    
                }
        }
        /*Se não houve retorno, não encontrou 
         * e, sendo assim, se torna uma Exception
         * por regra.
         */
        try {
            throw new Exception("LogDAO.buscar(String codigo) não "
                    + "encontrou um log que possua o codigo " + codigo 
                    + ".");
        } catch (Exception ex) {
            Logger.getLogger(LogDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            return null;
        }
        
    }
    public boolean objetoEUmLog(Object o) 
    {
        if (o instanceof Log) {
            return true;
            
        } else {
            try {
                throw new Exception("LogDAO.atualizar(String codigo, "
                        + "Object o) recebendo um objeto que não é uma instância"
                        + " de Log");
            } catch (Exception ex) {
                Logger.getLogger(LogDAO.class.getName()).log(Level.SEVERE, null, ex);
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
