package mvc.controllerview;

import entity.Mobilia;
import entity.TipoQuarto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mvc.model.dao.MobiliaDAO;

public class FormCadastroTipoQuarto extends javax.swing.JFrame {

    public static Mobilia mobilia = null;
    public static ArrayList<Mobilia> listMobilias = null;

    public FormCadastroTipoQuarto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbnome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        tfBuscarMobilia = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableBuscaMobilia = new javax.swing.JTable();
        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMobiliasAdd = new javax.swing.JTable();
        lbLocalizaMob = new javax.swing.JLabel();
        lbMobiliasAdd = new javax.swing.JLabel();
        btIncluirMobilia = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btBuscarTodasMobilias = new javax.swing.JButton();
        btRemoverItem = new javax.swing.JButton();
        lbErro = new javax.swing.JLabel();
        lbConfirma = new javax.swing.JLabel();
        lbResultMobilia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Rooms | Cadastro Tipo de Quarto");

        lbCodigo.setText("Código: *");

        lbnome.setText("Nome: *");

        jLabel1.setText("Descricao:");

        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        jScrollPane1.setViewportView(taDescricao);

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jTableBuscaMobilia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jTableBuscaMobilia.setAutoscrolls(false);
        jTableBuscaMobilia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBuscaMobiliaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableBuscaMobilia);

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Add.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Refresh.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Abort.png"))); // NOI18N
        btCancelar.setText("Cancelar");

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Close.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        jTableMobiliasAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Descrição"
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
        jTableMobiliasAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMobiliasAddMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableMobiliasAdd);
        jTableMobiliasAdd.getColumnModel().getColumn(0).setResizable(false);
        jTableMobiliasAdd.getColumnModel().getColumn(1).setResizable(false);
        jTableMobiliasAdd.getColumnModel().getColumn(2).setResizable(false);

        lbLocalizaMob.setText("Localizar Mobilias:");

        lbMobiliasAdd.setText("Mobilias Adicionadas: ");

        btIncluirMobilia.setText("Incluir");
        btIncluirMobilia.setEnabled(false);
        btIncluirMobilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirMobiliaActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.setEnabled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btBuscarTodasMobilias.setText("Buscar Todas");
        btBuscarTodasMobilias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarTodasMobiliasActionPerformed(evt);
            }
        });

        btRemoverItem.setText("Cancelar Item");
        btRemoverItem.setEnabled(false);
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });

        lbErro.setForeground(new java.awt.Color(255, 0, 51));

        lbConfirma.setForeground(new java.awt.Color(0, 153, 204));

        lbResultMobilia.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAtualizar)
                                .addGap(31, 31, 31)
                                .addComponent(btCancelar)
                                .addGap(160, 160, 160)
                                .addComponent(btSair))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbMobiliasAdd)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btRemoverItem))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbErro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbConfirma))))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCodigo)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbnome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfNome)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btIncluirMobilia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbLocalizaMob)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBuscarMobilia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btBuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btBuscarTodasMobilias, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbResultMobilia)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1)))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbErro, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(lbConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCodigo)
                        .addComponent(lbnome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(111, 111, 111)
                        .addComponent(lbResultMobilia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btBuscar)
                            .addComponent(tfBuscarMobilia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLocalizaMob)
                            .addComponent(btBuscarTodasMobilias))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btIncluirMobilia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar)
                                .addGap(14, 14, 14)))
                        .addGap(33, 33, 33)
                        .addComponent(lbMobiliasAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btRemoverItem)
                                .addGap(63, 63, 63)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-657)/2, (screenSize.height-702)/2, 657, 702);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        btIncluirMobilia.setEnabled(false);
        btLimpar.setEnabled(false);        
        if(tfCodigo.getText().equals("") || tfNome.getText().equals(""))
        {
            lbConfirma.setVisible(false);
            lbErro.setVisible(true);
            lbErro.setText("Os campos com * são obrigatorios!");
        }
        else
        {
            TipoQuarto tp = new TipoQuarto();
            tp.setCodigo(tfCodigo.getText());
            tp.setNome(tfNome.getText());
            tp.setDescricao(taDescricao.getText());
            JOptionPane.showMessageDialog(null, "erro2");
            tp.setMobilias(mobilia);
            JOptionPane.showMessageDialog(null, "erro3");
            lbErro.setVisible(false);
            lbConfirma.setVisible(true);
            lbConfirma.setText("Tipo de Quarto cadastrado com sucesso!");
            tfCodigo.setText("");
            tfBuscarMobilia.setText("");
            tfNome.setText("");
            limparTabelaAdicionarMobilia();
            limparTabelaBuscaMobilia();
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        btIncluirMobilia.setEnabled(false);
        btLimpar.setEnabled(false);
        limparTabelaBuscaMobilia();
        
        String cod = tfBuscarMobilia.getText();
        MobiliaDAO mDao = new MobiliaDAO();
        mobilia = mDao.buscar(cod);
        
        DefaultTableModel modelo = (DefaultTableModel)jTableBuscaMobilia.getModel();
        
        if(mobilia != null)
        {
            modelo.addRow(mobilia.getDadosMobilia());
            lbResultMobilia.setVisible(false);
        }           
        else
        {
            lbResultMobilia.setText("Nenhuma Mobilia encontrada!");
            tfBuscarMobilia.requestFocus();
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btBuscarTodasMobiliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarTodasMobiliasActionPerformed

        btIncluirMobilia.setEnabled(false);
        btLimpar.setEnabled(false);
        tfBuscarMobilia.setText("");
        limparTabelaBuscaMobilia();
        MobiliaDAO mobiliaDAO = new MobiliaDAO();
        
        DefaultTableModel modelo = (DefaultTableModel)jTableBuscaMobilia.getModel();
        
        ArrayList<Mobilia> listaMobilia = (ArrayList<Mobilia>) mobiliaDAO.buscarTodos();
        
        if(!listaMobilia.isEmpty()) {
            for(int i = 0; i < listaMobilia.size(); i++)
            {
                modelo.addRow(listaMobilia.get(i).getDadosMobilia());
                lbResultMobilia.setVisible(false);
            }
        }           
        else {
            lbResultMobilia.setText("Nenhuma Mobilia encontrada!");
            tfBuscarMobilia.requestFocus();
        }
    }//GEN-LAST:event_btBuscarTodasMobiliasActionPerformed

    private void btIncluirMobiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirMobiliaActionPerformed
        
        tfBuscarMobilia.requestFocus();
        int linha = jTableBuscaMobilia.getSelectedRow();
        mobilia = new Mobilia();
        mobilia.setCodigo((String)jTableBuscaMobilia.getModel().getValueAt(linha, 0));
        mobilia.setNome((String)jTableBuscaMobilia.getModel().getValueAt(linha, 1));
        mobilia.setDescricao((String)jTableBuscaMobilia.getModel().getValueAt(linha, 2));
        listMobilias.add(mobilia);        
    }//GEN-LAST:event_btIncluirMobiliaActionPerformed

    private void jTableBuscaMobiliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBuscaMobiliaMouseClicked
        btIncluirMobilia.setEnabled(true);
        btLimpar.setEnabled(true);
    }//GEN-LAST:event_jTableBuscaMobiliaMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparTabelaBuscaMobilia();
        tfBuscarMobilia.requestFocus();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        mobilia = null;
        limparTabelaAdicionarMobilia();
        
    }//GEN-LAST:event_btRemoverItemActionPerformed

    private void jTableMobiliasAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMobiliasAddMouseClicked
        btRemoverItem.setEnabled(true);
    }//GEN-LAST:event_jTableMobiliasAddMouseClicked
  
    private void limparTabelaBuscaMobilia()
    {
        DefaultTableModel modelo = (DefaultTableModel)jTableBuscaMobilia.getModel();
        for(int i = jTableBuscaMobilia.getRowCount() - 1; i >= 0; i--)
        {
            modelo.removeRow(i);
        }
    }
    
    private void limparTabelaAdicionarMobilia()
    {
        DefaultTableModel modelo = (DefaultTableModel)jTableMobiliasAdd.getModel();
        for(int i = jTableMobiliasAdd.getRowCount() - 1; i >= 0; i--)
        {
            modelo.removeRow(i);
        }
    }
    
    public void updateTabela()
    {
        limparTabelaAdicionarMobilia();
        DefaultTableModel modelo = (DefaultTableModel)jTableMobiliasAdd.getModel();
        for(int i = 0; i < listMobilias.size(); i++)
        {
             modelo.addRow(listMobilias.get(i).getDadosMobilia());
        }
       
    }

    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(FormCadastroTipoQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroTipoQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroTipoQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroTipoQuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroTipoQuarto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btBuscarTodasMobilias;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btIncluirMobilia;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableBuscaMobilia;
    private javax.swing.JTable jTableMobiliasAdd;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbConfirma;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbLocalizaMob;
    private javax.swing.JLabel lbMobiliasAdd;
    private javax.swing.JLabel lbResultMobilia;
    private javax.swing.JLabel lbnome;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTextField tfBuscarMobilia;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
