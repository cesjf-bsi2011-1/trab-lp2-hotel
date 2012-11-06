package mvc.model.dao;

import entity.Log;

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