package mvc.model.dao;

import java.util.List;

/**
 *
 * @author Tássio Auad
 */
public interface InterfaceDAO 
{    
    public void inserir(Object o);
    public void atualizar(String id, Object newO);
    public void remover(Object o);
    public void remover(String id);
    public Object buscar(String id);
    public List buscarTodos();
    public int getIndex();
    public void acrescerIndex();
    
}
