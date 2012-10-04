package mvc.model.dao;

import entity.Log;
import entity.TipoQuarto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tássio Auad
 */
public class TipoQuartoDAO extends AbstractDAO{
    
    public static List<TipoQuarto> tiposQuarto = new ArrayList<>();

    @Override
    public void inserir(Object o) {
        if(o instanceof TipoQuarto) {
            TipoQuarto tipoQuarto = (TipoQuarto) o;
            tiposQuarto.add(tipoQuarto);
            
        }
    }

    @Override
    public void atualizar(String codigo, Object o) {
        if(o instanceof TipoQuarto) {
            TipoQuarto tipoQuarto = (TipoQuarto) o;
            for(int i = 0; i < tiposQuarto.size(); i++) {
                if(tiposQuarto.get(i).getCodigo().equals(codigo) ) {
                    tiposQuarto.remove(i);
                    tiposQuarto.add(tipoQuarto);
                    
                }
            }
        }
    }

    @Override
    public void remover(Object o) {
        if(o instanceof TipoQuarto) {
            TipoQuarto tipoQuarto = (TipoQuarto) o;
            tiposQuarto.remove(tipoQuarto);
            
        }
    }

    @Override
    public void remover(String codigo) {
        for(int i = 0; i < tiposQuarto.size(); i++) {
            if(tiposQuarto.get(i).getCodigo().equals(codigo) ) {
                tiposQuarto.remove(i);

            }
        }
    }
    
    @Override
    public List buscarTodos() {
        return tiposQuarto;
        
    }

    @Override
    public TipoQuarto buscar(String codigo) {
        for(int i = 0; i < tiposQuarto.size(); i++) {
            if(tiposQuarto.get(i).getCodigo().equals(codigo) ) {
                return tiposQuarto.get(i);

            }
        }
        
        return null;
    }
    
}
