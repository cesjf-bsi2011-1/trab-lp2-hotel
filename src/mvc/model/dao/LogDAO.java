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
    private static List<Log> listLogs = new ArrayList<>();
    private static int index = 0000;
    
    @Override
    public void inserir(Object o) 
    {
        if (objetoEUmLog(o)) {
            Log logParaInserir = (Log) o;
            /*Garantindo que o código equivale ao index*/
            logParaInserir.setCodigo(String.valueOf(getIndex()));
            listLogs.add(logParaInserir);
            acrescerIndex();
        }       
    }

    public void inserir(String mensagem) {
        Date data = new Date();
        Log log = new Log(String.valueOf(getIndex()), AbstractForm.logado, mensagem, data);
        inserir(log);
        acrescerIndex();
    }
    
    @Override
    public void remover(Object o) 
    {
        if (objetoEUmLog(o)) {
            Log logParaRemover = (Log) o;
            listLogs.remove((Log) o);
            getHistorico().inserir("Remoção do Log :" + logParaRemover.getAcao());
        }
    }
    
    @Override
    public void remover(String codigo) 
    {        
        Log logEncontrado = buscar(codigo);
        if (null != logEncontrado) {
            listLogs.remove(logEncontrado);
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
                listLogs.remove(logParaRemover);
                /*Garantindo que o código equivale ao index*/
                logParaInserir.setCodigo(String.valueOf(getIndex()));
                listLogs.add(logParaInserir);
                getHistorico().inserir("Atualização do Log :" + logParaInserir.getAcao());
            }
        }
    }

    @Override
    public List buscarTodos() 
    {
        return listLogs;
        
    }

    @Override
    public Log buscar(String codigo) 
    {
        for (Log logDaLista : listLogs) {
                if (logDaLista.getCodigo().equals(codigo)) {
                    return logDaLista;
                    
                }
        }
        /*Se não houve retorno, não encontrou 
         * e, sendo assim, se torna uma Exception
         * por regra.
         */
        try {
            throw new Exception("Não foi possível encontrar um log "
                                + "que possua o codigo " + codigo + "."
                      );
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
