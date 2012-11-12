package mvc.model.dao;

/**
 *
 * @author Tássio Auad
 */
public abstract class AbstractDAO implements InterfaceDAO {
    private static LogDAO historico = new LogDAO();

    public LogDAO getHistorico() 
    {
        return historico;
    }
}