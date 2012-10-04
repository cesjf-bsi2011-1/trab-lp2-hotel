package mvc.model.dao;

import entity.Log;
import entity.Mobilia;
import entity.Quarto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tássio Auad
 */
public class QuartoDAO extends AbstractDAO{

    private static List<Quarto> quartos = new ArrayList<>();
    
    @Override
    public void inserir(Object o) {
        if(o instanceof Quarto) {
            quartos.add((Quarto) o);
            
        }
    }

    @Override
    public void remover(Object o) {
        if(o instanceof Mobilia) {
            quartos.remove((Quarto) o);
            
        }
    }
    
    @Override
    public void remover(String codigo) {
        for(int i = 0; i < quartos.size(); i++) {
                if(quartos.get(i).getCodigo().equals(codigo) ) {
                    quartos.remove(i);
                }
            }
    }
    
    @Override
    public void atualizar(String codigo, Object o) {
        if(o instanceof Log) {
            Quarto quarto = (Quarto) o;
            for(int i = 0; i < quartos.size(); i++) {
                if(quartos.get(i).getCodigo().equals(codigo) ) {
                    quartos.remove(i);
                    quartos.add(quarto);
                    
                }
            }
        }
    }

    @Override
    public List buscarTodos() {
        return quartos;
        
    }

    @Override
    public Quarto buscar(String codigo) {
        for(int i = 0; i < quartos.size(); i++) {
                if(quartos.get(i).getCodigo().equals(codigo) ) {
                    return quartos.get(i);
                    
                }
        }
        
        return null;
    }
}
