/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Willian
 */
public class ItemMobilia {
    
    private Mobilia mobilia;

    
    
    public Mobilia getMobilia() {
        return mobilia;
    }

    public void setMobilia(Mobilia mobilia) {
        this.mobilia = mobilia;
    }

    public ItemMobilia(Mobilia mobilia) {
        this.mobilia = mobilia;
    }
    
    public ItemMobilia() 
    {
        
    }
    
    public Object[] getDadosItemMobilia()
    {
        Object v[] = {mobilia.getCodigo(), mobilia.getNome(), mobilia.getDescricao()};
        return v;
    }
    
}
