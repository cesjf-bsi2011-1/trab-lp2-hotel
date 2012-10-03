package mvc.model.dao;

import java.util.List;

/**
 *
 * @author Tássio Auad
 */
public interface InterfaceDao {
    
    public void inserir(Object o);
    public void atualizar(Object o);
    public void deletar(Object o);
    public Object buscar(int index);
    public List buscarTodos();
    
}
