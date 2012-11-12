/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controllerview;

import entity.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mvc.model.dao.ClienteDAO;

/**
 *
 * @author Willian
 */
public class FormBuscarCliente extends javax.swing.JFrame {

    Cliente cliente = null;
    /**
     * Creates new form FormBuscarCliente
     */
    public FormBuscarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelClientes = new javax.swing.JPanel();
        lbLocalizaClienteCodigo = new javax.swing.JLabel();
        tfLocalizaClienteCodigo = new javax.swing.JTextField();
        btLocalizaClienteCpf = new javax.swing.JButton();
        lbLocCliCPF1 = new javax.swing.JLabel();
        tfLocalizaClienteCpf = new javax.swing.JTextField();
        btLocaizaClienteCodigo = new javax.swing.JButton();
        btBuscarTodosClientes1 = new javax.swing.JButton();
        btCliNovo1 = new javax.swing.JButton();
        btCliEditar1 = new javax.swing.JButton();
        btCliExcluir1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        lbErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));
        jPanelClientes.setPreferredSize(new java.awt.Dimension(830, 490));

        lbLocalizaClienteCodigo.setText("Localizar cliente por código: ");

        btLocalizaClienteCpf.setText("...");
        btLocalizaClienteCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocalizaClienteCpfActionPerformed(evt);
            }
        });

        lbLocCliCPF1.setText("Localizar cliente por CPF: ");

        btLocaizaClienteCodigo.setText("...");
        btLocaizaClienteCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocaizaClienteCodigoActionPerformed(evt);
            }
        });

        btBuscarTodosClientes1.setText("BuscarTodos");
        btBuscarTodosClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarTodosClientes1ActionPerformed(evt);
            }
        });

        btCliNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/New document.png"))); // NOI18N
        btCliNovo1.setText("Novo");
        btCliNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliNovo1ActionPerformed(evt);
            }
        });

        btCliEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Modify.png"))); // NOI18N
        btCliEditar1.setText("Editar");
        btCliEditar1.setEnabled(false);
        btCliEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliEditar1ActionPerformed(evt);
            }
        });

        btCliExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Remove.png"))); // NOI18N
        btCliExcluir1.setText("Excluir");
        btCliExcluir1.setEnabled(false);
        btCliExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCliExcluir1ActionPerformed(evt);
            }
        });

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "RG", "Cidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableClientes);
        jTableClientes.getColumnModel().getColumn(0).setResizable(false);
        jTableClientes.getColumnModel().getColumn(1).setResizable(false);
        jTableClientes.getColumnModel().getColumn(2).setResizable(false);
        jTableClientes.getColumnModel().getColumn(4).setResizable(false);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Close.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addComponent(lbLocalizaClienteCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLocalizaClienteCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btLocaizaClienteCodigo)
                        .addGap(28, 28, 28)
                        .addComponent(lbLocCliCPF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfLocalizaClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btLocalizaClienteCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btBuscarTodosClientes1)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientesLayout.createSequentialGroup()
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCliEditar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCliExcluir1)
                            .addComponent(btCliNovo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );
        jPanelClientesLayout.setVerticalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLocalizaClienteCodigo)
                    .addComponent(tfLocalizaClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLocCliCPF1)
                    .addComponent(tfLocalizaClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLocaizaClienteCodigo)
                    .addComponent(btLocalizaClienteCpf)
                    .addComponent(btBuscarTodosClientes1))
                .addGap(18, 18, 18)
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addComponent(btCliNovo1)
                        .addGap(18, 18, 18)
                        .addComponent(btCliEditar1)
                        .addGap(18, 18, 18)
                        .addComponent(btCliExcluir1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );

        lbErro.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbErro))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbErro, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-866)/2, (screenSize.height-550)/2, 866, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void btLocalizaClienteCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocalizaClienteCpfActionPerformed
        btCliEditar1.setEnabled(false);
        btCliExcluir1.setEnabled(false);
        limparTabela();
        
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            String cpf = tfLocalizaClienteCodigo.getText();
            cliente = clienteDAO.buscarPorCpf(cpf);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
        
        if(cliente != null)
        {
            DefaultTableModel modelo = (DefaultTableModel)jTableClientes.getModel();            
            modelo.addRow(cliente.getDadosEmVetor());
        }
        else
        {
            lbErro.setText("Nenhum cliente encontrado!");
        }
    }//GEN-LAST:event_btLocalizaClienteCpfActionPerformed

    private void btLocaizaClienteCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocaizaClienteCodigoActionPerformed
        // TODO add your handling code here:
        btCliEditar1.setEnabled(false);
        btCliExcluir1.setEnabled(false);
        limparTabela();
        
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            String codigo = tfLocalizaClienteCodigo.getText();
            cliente = clienteDAO.buscarPorCpf(codigo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
             
        if(cliente != null)
        {
            DefaultTableModel modelo = (DefaultTableModel)jTableClientes.getModel();            
            modelo.addRow(cliente.getDadosEmVetor());
        }
        else
        {
            lbErro.setText("Nenhum cliente encontrado!");
        }
    }//GEN-LAST:event_btLocaizaClienteCodigoActionPerformed

    private void btCliNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliNovo1ActionPerformed
        FormCadastroCliente fCadCli = new FormCadastroCliente();
        fCadCli.setVisible(true);
    }//GEN-LAST:event_btCliNovo1ActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
       this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btBuscarTodosClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarTodosClientes1ActionPerformed
        btCliEditar1.setEnabled(false);
        btCliExcluir1.setEnabled(false);
        limparTabela();
        tfLocalizaClienteCodigo.setText("");
        tfLocalizaClienteCpf.setText("");

        DefaultTableModel modelo = (DefaultTableModel)jTableClientes.getModel();
        ClienteDAO clienteDAO = new ClienteDAO();
        try {
            ArrayList<Cliente> listaCliente = (ArrayList<Cliente>) clienteDAO.buscarTodos();

            if(!listaCliente.isEmpty())
            {
                for(int i = 0; i < listaCliente.size(); i++)
                {
                    modelo.addRow(listaCliente.get(i).getDadosEmVetor());
                }
                lbErro.setVisible(false);
            }
            else
            {
                lbErro.setVisible(true);
                lbErro.setText("Nenhum Cliente Encontrado!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btBuscarTodosClientes1ActionPerformed

    private void btCliEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliEditar1ActionPerformed
        int linha = jTableClientes.getSelectedRow();

        Cliente newCliente = new Cliente();
        newCliente.setCodigo((Integer)jTableClientes.getModel().getValueAt(linha, 0));
        newCliente.setNome((String)jTableClientes.getModel().getValueAt(linha, 1));
        newCliente.setCpf((String)jTableClientes.getModel().getValueAt(linha, 2));
        newCliente.setRg((String)jTableClientes.getModel().getValueAt(linha, 3));
        newCliente.setCidade((String)jTableClientes.getModel().getValueAt(linha, 4));
        //terminar aqui

        FormCadastroCliente.cliente = newCliente;
        FormBuscarCliente fCliente = new FormBuscarCliente();
        fCliente.setVisible(true);
        limparTabela();
    }//GEN-LAST:event_btCliEditar1ActionPerformed

    private void btCliExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliExcluir1ActionPerformed
        int linha = jTableClientes.getSelectedRow();
        String codigo = (String)jTableClientes.getModel().getValueAt(linha, 0);
        
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.remover(codigo);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
        
        tfLocalizaClienteCodigo.requestFocus();
        btCliEditar1.setEnabled(false);
        btCliExcluir1.setEnabled(false);
        limparTabela();
    }//GEN-LAST:event_btCliExcluir1ActionPerformed

        
    private void limparTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel)jTableClientes.getModel();
        for(int i = jTableClientes.getRowCount() - 1; i >= 0; i--)
        {
            modelo.removeRow(i);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuscarCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarTodosClientes1;
    private javax.swing.JButton btCliEditar1;
    private javax.swing.JButton btCliExcluir1;
    private javax.swing.JButton btCliNovo1;
    private javax.swing.JButton btLocaizaClienteCodigo;
    private javax.swing.JButton btLocalizaClienteCpf;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanelClientes;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbLocCliCPF1;
    private javax.swing.JLabel lbLocalizaClienteCodigo;
    private javax.swing.JTextField tfLocalizaClienteCodigo;
    private javax.swing.JTextField tfLocalizaClienteCpf;
    // End of variables declaration//GEN-END:variables
}
