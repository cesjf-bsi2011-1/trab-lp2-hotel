package mvc.model.dao;

import entity.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mvc.controllerview.AbstractForm;

/**
 *
 * @author Tássio Auad
 */
public class Historico implements InterfaceDAO {

    private List<Log> logs;
    private static int codigo = 0;
    
    public Historico()
    {
        logs = new ArrayList<Log>();
    }
    
    @Override
    public void inserir(Object o) {
        if(o instanceof Log) {
            logs.add((Log) o);
            
        }
    }
    
    public void inserir(String mensagem) {
        Date data = new Date();
        Log log = new Log(String.valueOf(codigo), AbstractForm.logado, mensagem, data);
        inserir(log);
        codigo++;
    }

    

    @Override
    public void remover(Object o) {
        if(o instanceof Log) {
            logs.remove((Log) o);
            
        }
    }
    
    @Override
    public void remover(String codigo) {
        for(int i = 0; i < logs.size(); i++) {
            if(logs.get(i).getCodigo().equals(codigo) ) {
                logs.remove(i);

            }
        }
    }
    
    @Override
    public void atualizar(String codigo, Object o) {
        if(o instanceof Log) {
            Log log = (Log) o;
            for(int i = 0; i < logs.size(); i++) {
                if(logs.get(i).getCodigo().equals(codigo) ) {
                    logs.remove(i);
                    logs.add(log);
                    
                }
            }
        }
    }

    @Override
    public List buscarTodos() {
        return logs;
        
    }

    @Override
    public Log buscar(String codigo) {
        for(int i = 0; i < logs.size(); i++) {
            if(logs.get(i).getCodigo().equals(codigo) ) {
                return logs.get(i);

            }
        }
        
        return null;
    }
}
