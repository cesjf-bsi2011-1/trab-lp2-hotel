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
public class Historico implements InterfaceDao {

    private List<Log> logs;
    
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
        Log log = new Log(AbstractForm.logado, mensagem, data);
        inserir(log);
    }

    @Override
    public void atualizar(Object o) {
        if(o instanceof Log) {
            Log log = (Log) o;
            for(int i = 0; i < logs.size(); i++) {
                if(logs.get(i) == log ) {
                    logs.remove(i);
                    logs.add(log);
                    
                }
            }
        }
    }

    @Override
    public void deletar(Object o) {
        if(o instanceof Log) {
            logs.remove((Log) o);
            
        }
    }

    @Override
    public List buscarTodos() {
        return logs;
        
    }

    @Override
    public Log buscar(int index) {
        return logs.get(index);
        
    }

    
}
