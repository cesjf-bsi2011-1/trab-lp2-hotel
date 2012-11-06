/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Developer
 */
public abstract class FormCustomizer {
    
    public static void limparTodosCampos(Container container) 
    {  
        Component components[] = container.getComponents();  
        for (Component component : components) 
        {  
            if (component instanceof JFormattedTextField) 
            {  
                JFormattedTextField field = (JFormattedTextField) component;  
                field.setValue(null);  
            } 
            else if (component instanceof JTextField) 
            {  
                JTextField field = (JTextField) component;  
                field.setText("");  
            } 
            else if (component instanceof Container) {  
                limparTodosCampos((Container) component);  
            }
            
            else if (component instanceof JPanel)
            {
                JPanel painel = (JPanel)component;
                for(int j=0;j<painel.getComponentCount();j++)
                {
                    Component cp = painel.getComponent(j);
                    if (component instanceof JFormattedTextField) 
                    {  
                        JFormattedTextField field = (JFormattedTextField) component;  
                        field.setValue(null);  
                    } 
                    else if (component instanceof JTextField) 
                    {  
                        JTextField field = (JTextField) component;  
                        field.setText("");  
                    } 
                    else if (component instanceof Container) {  
                        limparTodosCampos((Container) component);  
                    }
                }
            }
            
        }
    }
}
