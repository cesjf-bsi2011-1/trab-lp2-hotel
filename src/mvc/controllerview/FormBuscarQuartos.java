package mvc.controllerview;

import entity.Quarto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mvc.model.dao.QuartoDAO;
import myutils.Notificacao;

public class FormBuscarQuartos extends javax.swing.JFrame {

    private Notificacao notificacao = new Notificacao();
 
    public FormBuscarQuartos() {
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

        jPanelQuartos = new javax.swing.JPanel();
        btQuartoNovo = new javax.swing.JButton();
        btQuartoEditar = new javax.swing.JButton();
        btQuartoExcluir = new javax.swing.JButton();
        btLocQuartoNumero = new javax.swing.JButton();
        tfLocQuartoNumero = new javax.swing.JTextField();
        btBuscarTodosQuartos = new javax.swing.JButton();
        lbLocQuartoNumero = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQuartos = new javax.swing.JTable();
        btNovoTipoQuarto = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lbErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Rooms | Buscar Quartos");

        jPanelQuartos.setBorder(javax.swing.BorderFactory.createTitledBorder("Quartos"));
        jPanelQuartos.setPreferredSize(new java.awt.Dimension(830, 490));

        btQuartoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/New document.png"))); // NOI18N
        btQuartoNovo.setText("Novo");
        btQuartoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuartoNovoActionPerformed(evt);
            }
        });

        btQuartoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Modify.png"))); // NOI18N
        btQuartoEditar.setText("Editar");
        btQuartoEditar.setEnabled(false);
        btQuartoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuartoEditarActionPerformed(evt);
            }
        });

        btQuartoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Remove.png"))); // NOI18N
        btQuartoExcluir.setText("Excluir");
        btQuartoExcluir.setEnabled(false);
        btQuartoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuartoExcluirActionPerformed(evt);
            }
        });

        btLocQuartoNumero.setText("...");
        btLocQuartoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocQuartoNumeroActionPerformed(evt);
            }
        });

        btBuscarTodosQuartos.setText("BuscarTodos");
        btBuscarTodosQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarTodosQuartosActionPerformed(evt);
            }
        });

        lbLocQuartoNumero.setText("Localizar Quarto por número:");

        jTableQuartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Tipo do Quarto", "Status", "Valor", "Observação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Float.class, java.lang.String.class
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
        jTableQuartos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableQuartosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableQuartos);
        jTableQuartos.getColumnModel().getColumn(0).setResizable(false);
        jTableQuartos.getColumnModel().getColumn(1).setResizable(false);
        jTableQuartos.getColumnModel().getColumn(2).setResizable(false);
        jTableQuartos.getColumnModel().getColumn(3).setResizable(false);
        jTableQuartos.getColumnModel().getColumn(4).setResizable(false);

        btNovoTipoQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/List.png"))); // NOI18N
        btNovoTipoQuarto.setText("Novo Tipo");
        btNovoTipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoTipoQuartoActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Close.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelQuartosLayout = new javax.swing.GroupLayout(jPanelQuartos);
        jPanelQuartos.setLayout(jPanelQuartosLayout);
        jPanelQuartosLayout.setHorizontalGroup(
            jPanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuartosLayout.createSequentialGroup()
                        .addGroup(jPanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btQuartoEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btQuartoNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btNovoTipoQuarto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(btQuartoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanelQuartosLayout.createSequentialGroup()
                        .addComponent(lbLocQuartoNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfLocQuartoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLocQuartoNumero)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscarTodosQuartos)
                        .addGap(0, 341, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQuartosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );
        jPanelQuartosLayout.setVerticalGroup(
            jPanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLocQuartoNumero)
                    .addComponent(tfLocQuartoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLocQuartoNumero)
                    .addComponent(btBuscarTodosQuartos))
                .addGap(29, 29, 29)
                .addGroup(jPanelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQuartosLayout.createSequentialGroup()
                        .addComponent(btQuartoNovo)
                        .addGap(16, 16, 16)
                        .addComponent(btNovoTipoQuarto)
                        .addGap(18, 18, 18)
                        .addComponent(btQuartoEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btQuartoExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btSair))
        );

        lbErro.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbErro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbErro, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        setSize(new java.awt.Dimension(866, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btQuartoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuartoNovoActionPerformed
        FormCadastroQuarto formCadastratQuarto = new FormCadastroQuarto();
        formCadastratQuarto.setVisible(true);
    }//GEN-LAST:event_btQuartoNovoActionPerformed

    private void btLocQuartoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocQuartoNumeroActionPerformed
        btQuartoEditar.setEnabled(false);
        btQuartoExcluir.setEnabled(false);
        limparTabela();
        String numero = tfLocQuartoNumero.getText();
        
        try {
            QuartoDAO quartoDAO = new QuartoDAO();
            Quarto quarto = quartoDAO.buscar(numero);
            DefaultTableModel modelo = (DefaultTableModel)jTableQuartos.getModel();
            if(quarto != null) {
                modelo.addRow(quarto.getDadosEmVetor());
            } else {
                notificacao.exibir("Nenhum Quarto Encontrado.", Notificacao.ERRO);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
    }//GEN-LAST:event_btLocQuartoNumeroActionPerformed

    private void jTableQuartosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableQuartosMouseClicked
        btQuartoEditar.setEnabled(true);
        btQuartoExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableQuartosMouseClicked

    private void btNovoTipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoTipoQuartoActionPerformed
        FormCadastroTipoQuarto formTipoQuarto = new FormCadastroTipoQuarto();
        formTipoQuarto.setVisible(true);
    }//GEN-LAST:event_btNovoTipoQuartoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btBuscarTodosQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarTodosQuartosActionPerformed
        btQuartoEditar.setEnabled(false);
        btQuartoExcluir.setEnabled(false);
        limparTabela();
        tfLocQuartoNumero.setText("");

        DefaultTableModel modelo = (DefaultTableModel)jTableQuartos.getModel();
        
        try {
            QuartoDAO quartoDAO = new QuartoDAO();
            ArrayList<Quarto> listaQuarto = (ArrayList<Quarto>) quartoDAO.buscarTodos();

            if (!listaQuarto.isEmpty()) {
                for (int i = 0; i < listaQuarto.size(); i++) {
                    modelo.addRow(listaQuarto.get(i).getDadosEmVetor());
                }
            } else {
                notificacao.exibir("Nenhum Quarto Encontrado.", Notificacao.ERRO);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
    }//GEN-LAST:event_btBuscarTodosQuartosActionPerformed

    private void btQuartoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuartoEditarActionPerformed
        int linha = jTableQuartos.getSelectedRow();
        
        try {
            QuartoDAO quartoDAO = new QuartoDAO();
            Quarto quartoSelecionado = quartoDAO.buscar(
                    (String)jTableQuartos.getModel().getValueAt(linha, 0)
                    );
            FormCadastroQuarto.quarto = quartoSelecionado;
            FormCadastroQuarto formCadastroQuarto = new FormCadastroQuarto();
            formCadastroQuarto.setVisible(true);
            limparTabela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
    }//GEN-LAST:event_btQuartoEditarActionPerformed

    private void btQuartoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuartoExcluirActionPerformed
        int linha = jTableQuartos.getSelectedRow();
        String observacao = (String)jTableQuartos.getModel().getValueAt(linha, 4);
        
        
        int confirmacao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do "
                                              + "quarto: " + observacao);
        if(confirmacao == 0) {
            try {
                QuartoDAO quartoDAO = new QuartoDAO();
                quartoDAO.remover((String)jTableQuartos.getModel().getValueAt(linha, 0));
                ((DefaultTableModel)jTableQuartos.getModel()).removeRow(linha);
                notificacao.exibir("Quarto " + observacao + " foi removido com "
                        + "sucesso!", Notificacao.SUCESSO);
             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
             }
        } else {
            
        }
    }//GEN-LAST:event_btQuartoExcluirActionPerformed

    private void limparTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel)jTableQuartos.getModel();
        for (int i = jTableQuartos.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

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
            java.util.logging.Logger.getLogger(FormBuscarQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuscarQuartos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarTodosQuartos;
    private javax.swing.JButton btLocQuartoNumero;
    private javax.swing.JButton btNovoTipoQuarto;
    private javax.swing.JButton btQuartoEditar;
    private javax.swing.JButton btQuartoExcluir;
    private javax.swing.JButton btQuartoNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanelQuartos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableQuartos;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbLocQuartoNumero;
    private javax.swing.JTextField tfLocQuartoNumero;
    // End of variables declaration//GEN-END:variables
}
