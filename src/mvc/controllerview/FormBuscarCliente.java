package mvc.controllerview;

import entity.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mvc.model.dao.ClienteDAO;
import myutils.Notificacao;

public class FormBuscarCliente extends AbstractForm {

    private Cliente cliente = null;
    private Notificacao notificacao = new Notificacao();
    
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
        btLocaizaClienteCodigo = new javax.swing.JButton();
        btBuscarTodosClientes1 = new javax.swing.JButton();
        btCliNovo1 = new javax.swing.JButton();
        btCliEditar1 = new javax.swing.JButton();
        btCliExcluir1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        tformatadoCpf = new javax.swing.JFormattedTextField();
        lbErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));
        jPanelClientes.setPreferredSize(new java.awt.Dimension(830, 490));

        lbLocalizaClienteCodigo.setText("Código");

        btLocalizaClienteCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Search_1.png"))); // NOI18N
        btLocalizaClienteCpf.setText("...");
        btLocalizaClienteCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocalizaClienteCpfActionPerformed(evt);
            }
        });

        lbLocCliCPF1.setText("CPF:");

        btLocaizaClienteCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Search_1.png"))); // NOI18N
        btLocaizaClienteCodigo.setText("...");
        btLocaizaClienteCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocaizaClienteCodigoActionPerformed(evt);
            }
        });

        btBuscarTodosClientes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Search.png"))); // NOI18N
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
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
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

        try {
            tformatadoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelClientesLayout = new javax.swing.GroupLayout(jPanelClientes);
        jPanelClientes.setLayout(jPanelClientesLayout);
        jPanelClientesLayout.setHorizontalGroup(
            jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSair))
                    .addGroup(jPanelClientesLayout.createSequentialGroup()
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelClientesLayout.createSequentialGroup()
                                .addComponent(lbLocalizaClienteCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfLocalizaClienteCodigo))
                            .addComponent(btCliEditar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCliExcluir1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCliNovo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelClientesLayout.createSequentialGroup()
                                .addComponent(btLocaizaClienteCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(lbLocCliCPF1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tformatadoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btLocalizaClienteCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btBuscarTodosClientes1))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE))))
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
                    .addComponent(btLocaizaClienteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLocalizaClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarTodosClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tformatadoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        setSize(new java.awt.Dimension(866, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLocalizaClienteCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocalizaClienteCpfActionPerformed
        btCliEditar1.setEnabled(false);
        btCliExcluir1.setEnabled(false);
        limparTabela();
        
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            String cpf = tformatadoCpf.getText();
            cliente = clienteDAO.buscarPorCpf(cpf);
            if (cliente != null) {
                DefaultTableModel modelo = (DefaultTableModel)jTableClientes.getModel();            
                modelo.addRow(cliente.getDadosEmVetor());
            } else {
                notificacao.exibir("Nenhum cliente encontrado.", Notificacao.ERRO);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
    }//GEN-LAST:event_btLocalizaClienteCpfActionPerformed

    private void btLocaizaClienteCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocaizaClienteCodigoActionPerformed
        btCliEditar1.setEnabled(false);
        btCliExcluir1.setEnabled(false);
        limparTabela();
        
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            String codigo = tfLocalizaClienteCodigo.getText();
            cliente = clienteDAO.buscar(codigo);
            if (cliente != null) {
                DefaultTableModel modelo = (DefaultTableModel)jTableClientes.getModel();            
                modelo.addRow(cliente.getDadosEmVetor());
            } else {
                notificacao.exibir("Nenhum cliente encontrado.", Notificacao.ERRO);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
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
        tformatadoCpf.setText("");
        DefaultTableModel modelo = (DefaultTableModel)jTableClientes.getModel();
        
        ArrayList<Cliente> listaCliente = null;
        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            listaCliente = (ArrayList<Cliente>) clienteDAO.buscarTodos();
            if(!listaCliente.isEmpty()) {
                for(Cliente clienteDaLista : listaCliente) {
                    modelo.addRow(clienteDaLista.getDadosEmVetor());
                }
            } else {
                notificacao.exibir("Nenhum cliente encontrado.", Notificacao.ERRO);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
    }//GEN-LAST:event_btBuscarTodosClientes1ActionPerformed

    private void btCliEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliEditar1ActionPerformed
        int linha = jTableClientes.getSelectedRow();
        int codigo = (int) jTableClientes.getModel().getValueAt(linha, 0);

        try {
            ClienteDAO clienteDAO = new ClienteDAO();
            Cliente clienteBuscado = clienteDAO.buscar(Integer.toString(codigo));
            FormCadastroCliente.cliente = clienteBuscado;
            FormCadastroCliente fCliente = new FormCadastroCliente();
            fCliente.setVisible(true);

            limparTabela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }     
    }//GEN-LAST:event_btCliEditar1ActionPerformed

    private void btCliExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCliExcluir1ActionPerformed
        int linha = jTableClientes.getSelectedRow();
        int codigo = (int)jTableClientes.getModel().getValueAt(linha, 0);
        String clienteNome = (String)jTableClientes.getModel().getValueAt(linha, 1);
        
        int confirmacao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do "
                                              + "cliente: " + clienteNome);
        if(confirmacao == 0) {
            try {
                ClienteDAO clienteDAO = new ClienteDAO();
                clienteDAO.remover(Integer.toString(codigo));
                notificacao.exibir("Cliente " + clienteNome + " "
                        + "foi excluído com sucesso", Notificacao.SUCESSO);
                tfLocalizaClienteCodigo.requestFocus();
                btCliEditar1.setEnabled(false);
                btCliExcluir1.setEnabled(false);

                limparTabela();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
            }
        } else {
            tfLocalizaClienteCodigo.requestFocus();
        }
        
    }//GEN-LAST:event_btCliExcluir1ActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        btCliEditar1.setEnabled(true);
        btCliExcluir1.setEnabled(true);
    }//GEN-LAST:event_jTableClientesMouseClicked

        
    private void limparTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel)jTableClientes.getModel();
        for(int i = jTableClientes.getRowCount() - 1; i >= 0; i--)
        {
            modelo.removeRow(i);
        }
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
    private javax.swing.JFormattedTextField tformatadoCpf;
    // End of variables declaration//GEN-END:variables
}
