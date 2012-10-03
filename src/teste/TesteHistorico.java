package teste;

import entity.Log;
import java.util.ArrayList;
import java.util.List;
import mvc.model.dao.AbstractDao;

/**
 *
 * @author Tássio Auad
 * Classe para teste da funcionalidade de grava logs no histórico
 * Essa classe vai fazer papel de uma classe Dao atuando e registrando logs
 */
public class TesteHistorico extends AbstractDao{

    private List<Teste> lista;
    
    public TesteHistorico() {
        super();
        lista = new ArrayList<Teste>();
    }

    @Override
    public void inserir(Object o) {
        Teste teste = new Teste("teste");
        if(o instanceof Teste) {
            teste = (Teste) o;
            
        }
        try {
           lista.add(teste);
           getHistorico().inserir("Inserido um objeto em TesteHistorico :" + teste.getDescricao());
           
        }catch(Exception e) {
            getHistorico().inserir("Falha ao inserir um objeto em TesteHistorico : "+e.getMessage());
            
        }
    }

    @Override
    public void atualizar(Object o) {
        Teste teste = new Teste("teste");
        if(o instanceof Teste) {
            teste = (Teste) o;
            
        }
        
        try {
           for(int i = 0; i < lista.size(); i++) {
                if(lista.get(i) == teste ) {
                    lista.remove(i);
                    lista.add(teste);
                    
                }
            }
            getHistorico().inserir("Atualizando um objeto em TesteHistorico");
           
        }catch(Exception e) {
            getHistorico().inserir("Falha ao atualizar um objeto em TesteHistorico : "+e.getMessage());
            
        }
    }

    @Override
    public void deletar(Object o) {
        Teste teste = new Teste("teste");
        if(o instanceof Teste) {
            teste = (Teste) o;
            
        }
        
        try {
           lista.remove(teste);
            getHistorico().inserir("Removendo um objeto em TesteHistorico");
           
        }catch(Exception e) {
            getHistorico().inserir("Falha ao remover um objeto em TesteHistorico : "+e.getMessage());
            
        }
    }
    
    public void exibirHistorico() {
        List<Log> logs = getHistorico().buscarTodos();
        for(int i = 0; i< logs.size(); i++) {
            System.out.println(logs.get(i));
            
        }    
    }

    @Override
    public Object buscar(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
