package mvc.model.dao;

import java.util.List;

/**
 *
 * @author Tássio Auad
 */
public abstract class AbstractDao implements InterfaceDao {
    private static Historico historico = new Historico();

    public AbstractDao() {

    }

    public Historico getHistorico() {
        return historico;
    }

    @Override
    public abstract void inserir(Object o);

    @Override
    public abstract void atualizar(Object o);

    @Override
    public abstract void deletar(Object o);
    
    @Override
    public abstract Object buscar(int index);
    
    @Override
    public abstract List buscarTodos();

}
