package mvc.controllerview;

import entity.TipoQuarto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mvc.model.dao.TipoQuartoDAO;
import myutils.Notificacao;

public class FormBuscarTipoDeQuarto extends javax.swing.JFrame {

    Notificacao notificacao = new Notificacao();

    public FormBuscarTipoDeQuarto() {
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

        jPanelTipoQuartos = new javax.swing.JPanel();
        btEditarTipoQuarto = new javax.swing.JButton();
        btExcluirTipoQuarto = new javax.swing.JButton();
        btLocTipoQuartoNumero = new javax.swing.JButton();
        tfLocTipoQuartoNumero = new javax.swing.JTextField();
        btBuscarTodosTiposQuartos = new javax.swing.JButton();
        lbLocTipoQuartoNumero = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoQuartos = new javax.swing.JTable();
        btNovoTipoQuarto = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelTipoQuartos.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipos de Quartos"));
        jPanelTipoQuartos.setPreferredSize(new java.awt.Dimension(830, 490));

        btEditarTipoQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Modify.png"))); // NOI18N
        btEditarTipoQuarto.setText("Editar");
        btEditarTipoQuarto.setEnabled(false);
        btEditarTipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarTipoQuartoActionPerformed(evt);
            }
        });

        btExcluirTipoQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Remove.png"))); // NOI18N
        btExcluirTipoQuarto.setText("Excluir");
        btExcluirTipoQuarto.setEnabled(false);
        btExcluirTipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirTipoQuartoActionPerformed(evt);
            }
        });

        btLocTipoQuartoNumero.setText("...");
        btLocTipoQuartoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocTipoQuartoNumeroActionPerformed(evt);
            }
        });

        btBuscarTodosTiposQuartos.setText("BuscarTodos");
        btBuscarTodosTiposQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarTodosTiposQuartosActionPerformed(evt);
            }
        });

        lbLocTipoQuartoNumero.setText("Localizar Tipo Quarto por número:");

        jTableTipoQuartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nome", "Mobilias"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTipoQuartos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTipoQuartosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTipoQuartos);

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

        javax.swing.GroupLayout jPanelTipoQuartosLayout = new javax.swing.GroupLayout(jPanelTipoQuartos);
        jPanelTipoQuartos.setLayout(jPanelTipoQuartosLayout);
        jPanelTipoQuartosLayout.setHorizontalGroup(
            jPanelTipoQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTipoQuartosLayout.createSequentialGroup()
                        .addGroup(jPanelTipoQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btEditarTipoQuarto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btNovoTipoQuarto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(btExcluirTipoQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanelTipoQuartosLayout.createSequentialGroup()
                        .addComponent(lbLocTipoQuartoNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfLocTipoQuartoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLocTipoQuartoNumero)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscarTodosTiposQuartos)
                        .addGap(0, 318, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTipoQuartosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );
        jPanelTipoQuartosLayout.setVerticalGroup(
            jPanelTipoQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLocTipoQuartoNumero)
                    .addComponent(tfLocTipoQuartoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLocTipoQuartoNumero)
                    .addComponent(btBuscarTodosTiposQuartos))
                .addGap(29, 29, 29)
                .addGroup(jPanelTipoQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTipoQuartosLayout.createSequentialGroup()
                        .addComponent(btNovoTipoQuarto)
                        .addGap(18, 18, 18)
                        .addComponent(btEditarTipoQuarto)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluirTipoQuarto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btSair))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelTipoQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jPanelTipoQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(38, Short.MAX_VALUE)))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-866)/2, (screenSize.height-550)/2, 866, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarTipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarTipoQuartoActionPerformed
        int linha = jTableTipoQuartos.getSelectedRow();

        try {
            TipoQuartoDAO tipoQuartoDAO = new TipoQuartoDAO();
            TipoQuarto tipoQuartoSelecionado = tipoQuartoDAO.buscar(
                (String)jTableTipoQuartos.getModel().getValueAt(linha, 0)
            );
            FormCadastroTipoQuarto.tipoQuarto = tipoQuartoSelecionado;
            FormCadastroTipoQuarto formCadastroTipoQuarto = new FormCadastroTipoQuarto();
            formCadastroTipoQuarto.setVisible(true);
            limparTabela();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
    }//GEN-LAST:event_btEditarTipoQuartoActionPerformed

    private void btExcluirTipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirTipoQuartoActionPerformed
        int linha = jTableTipoQuartos.getSelectedRow();
        String nome = (String)jTableTipoQuartos.getModel().getValueAt(linha, 1);

        int confirmacao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do "
            + "quarto: " + nome);
        if(confirmacao == 0) {
            try {
                TipoQuartoDAO tipoQuartoDAO = new TipoQuartoDAO();
                tipoQuartoDAO.remover((String)jTableTipoQuartos.getModel().getValueAt(linha, 0));
                ((DefaultTableModel)jTableTipoQuartos.getModel()).removeRow(linha);
                notificacao.exibir("Tipo Quarto " + nome + " foi removido com "
                    + "sucesso!", Notificacao.SUCESSO);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
            }
        } else {

        }
    }//GEN-LAST:event_btExcluirTipoQuartoActionPerformed

    private void btLocTipoQuartoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocTipoQuartoNumeroActionPerformed
        btEditarTipoQuarto.setEnabled(false);
        btExcluirTipoQuarto.setEnabled(false);
        limparTabela();
        String numero = tfLocTipoQuartoNumero.getText();

        try {
            TipoQuartoDAO tipoQuartoDAO = new TipoQuartoDAO();
            TipoQuarto tipoQuarto = tipoQuartoDAO.buscar(numero);
            DefaultTableModel modelo = (DefaultTableModel)jTableTipoQuartos.getModel();
            if(tipoQuarto != null) {
                modelo.addRow(tipoQuarto.getDadosEmVetor());
            } else {
                notificacao.exibir("Nenhum Tipo Quarto Encontrado.", Notificacao.ERRO);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
    }//GEN-LAST:event_btLocTipoQuartoNumeroActionPerformed

    private void btBuscarTodosTiposQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarTodosTiposQuartosActionPerformed
        btEditarTipoQuarto.setEnabled(false);
        btExcluirTipoQuarto.setEnabled(false);
        limparTabela();
        tfLocTipoQuartoNumero.setText("");

        DefaultTableModel modelo = (DefaultTableModel)jTableTipoQuartos.getModel();

        try {
            TipoQuartoDAO tipoQuartoDAO = new TipoQuartoDAO();
            ArrayList<TipoQuarto> listaTipoQuarto = (ArrayList<TipoQuarto>) tipoQuartoDAO.buscarTodos();

            if (!listaTipoQuarto.isEmpty()) {
                for (TipoQuarto tipoQuartoDaLista : listaTipoQuarto) {
                    modelo.addRow(tipoQuartoDaLista.getDadosEmVetor());
                }
            } else {
                notificacao.exibir("Nenhum Tipo Quarto Encontrado.", Notificacao.ERRO);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
    }//GEN-LAST:event_btBuscarTodosTiposQuartosActionPerformed

    private void jTableTipoQuartosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTipoQuartosMouseClicked
        btEditarTipoQuarto.setEnabled(true);
        btExcluirTipoQuarto.setEnabled(true);
    }//GEN-LAST:event_jTableTipoQuartosMouseClicked

    private void btNovoTipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoTipoQuartoActionPerformed
        FormCadastroTipoQuarto formTipoQuarto = new FormCadastroTipoQuarto();
        formTipoQuarto.setVisible(true);
    }//GEN-LAST:event_btNovoTipoQuartoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void limparTabela()
    {
        DefaultTableModel modelo = (DefaultTableModel)jTableTipoQuartos.getModel();
        for (int i = jTableTipoQuartos.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarTodosTiposQuartos;
    private javax.swing.JButton btEditarTipoQuarto;
    private javax.swing.JButton btExcluirTipoQuarto;
    private javax.swing.JButton btLocTipoQuartoNumero;
    private javax.swing.JButton btNovoTipoQuarto;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanelTipoQuartos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTipoQuartos;
    private javax.swing.JLabel lbLocTipoQuartoNumero;
    private javax.swing.JTextField tfLocTipoQuartoNumero;
    // End of variables declaration//GEN-END:variables
}
