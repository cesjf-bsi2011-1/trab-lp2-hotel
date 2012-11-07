package mvc.model.dao;

public abstract class AbstractDAO implements InterfaceDAO {
    private LogDAO historico = new LogDAO();

    public AbstractDAO() 
    {

    }

    public LogDAO getHistorico() 
    {
        return historico;
    }
}