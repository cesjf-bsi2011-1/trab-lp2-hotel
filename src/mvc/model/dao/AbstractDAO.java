package mvc.model.dao;

/**
 *
 * @author Tássio Auad
 */
public abstract class AbstractDAO implements InterfaceDAO {
    private static Historico historico = new Historico();

    public AbstractDAO() {

    }

    public Historico getHistorico() {
        return historico;
    }
}
