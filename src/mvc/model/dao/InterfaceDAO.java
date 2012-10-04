package mvc.model.dao;

import java.util.List;

/**
 *
 * @author Tássio Auad
 */
public interface InterfaceDAO {
    
    public void inserir(Object o);
    public void atualizar(String id, Object o);
    public void remover(Object o);
    public Object buscar(String id);
    public List buscarTodos();
    
}
