/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controllerview;

import entity.Mobilia;
import java.awt.Color;
import javax.swing.JOptionPane;
import mvc.model.dao.MobiliaDAO;
import myutils.Notificacao;

public class FormCadastroMobilia extends AbstractForm {

    public static Mobilia mobilia = null;
    private Notificacao notificacao = new Notificacao();
    
    /**
     * Creates new form FormCadastroMobilia
     */
    public FormCadastroMobilia() {
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

        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbDescricao = new javax.swing.JLabel();
        jScrollPaneDescricao = new javax.swing.JScrollPane();
        taDescricao = new javax.swing.JTextArea();
        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        lbErro = new javax.swing.JLabel();
        lbConfirma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Rooms | Cadastro Mobilia");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbCodigo.setText("Código:");

        lbNome.setText("Nome: *");

        lbDescricao.setText("Descrição:");

        taDescricao.setColumns(20);
        taDescricao.setRows(5);
        jScrollPaneDescricao.setViewportView(taDescricao);

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
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Abort.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Close.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbErro.setForeground(new java.awt.Color(255, 102, 0));

        lbConfirma.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneDescricao)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btAtualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfNome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbConfirma)
                                .addGap(28, 28, 28)
                                .addComponent(lbErro))
                            .addComponent(lbDescricao)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(lbNome)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbErro, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(lbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lbDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-587)/2, (screenSize.height-359)/2, 587, 359);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        if(camposObrigatoriosPreenchidos()){
            Mobilia newMobilia = new Mobilia();
            newMobilia.setCodigo(tfCodigo.getText());
            newMobilia.setNome(tfNome.getText());           
            newMobilia.setDescricao(taDescricao.getText());
            
            try {
                MobiliaDAO mobiliaDAO = new MobiliaDAO();
                mobiliaDAO.inserir(newMobilia);
                notificacao.exibir("Mobília " + newMobilia.getNome() + " "
                        + "foi cadastrada com sucesso", Notificacao.SUCESSO);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
            }  
            
            lbErro.setVisible(false);
            tfCodigo.setText("");
            tfNome.setText("");
            taDescricao.setText("");  
        } else {
            lbConfirma.setVisible(false);
            lbErro.setVisible(true);
            lbErro.setText("Os Campos com * são Obrigatorios!");
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        tfCodigo.setText("");
        tfNome.setText("");
        taDescricao.setText("");
        lbConfirma.setText("");
        lbErro.setText("");
        
    }//GEN-LAST:event_btCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(mobilia != null) {
            tfCodigo.setText(mobilia.getCodigo());
            tfNome.setText(mobilia.getNome());
            taDescricao.setText(mobilia.getDescricao());
            btAtualizar.setEnabled(true);
            btCadastrar.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        mobilia.setCodigo(tfCodigo.getText());
        mobilia.setNome(tfNome.getText());
        mobilia.setDescricao(taDescricao.getText());
          
        try {
            MobiliaDAO mobiliaDAO = new MobiliaDAO();
            mobiliaDAO.atualizar(mobilia.getCodigo(), mobilia);
            notificacao.exibir("Mobília " + mobilia.getNome() + " "
                           + "foi atualizada com sucesso", Notificacao.SUCESSO);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        } 
        
        mobilia = null;
        tfCodigo.setText("");
        tfNome.setText("");
        taDescricao.setText("");
    }//GEN-LAST:event_btAtualizarActionPerformed

    private boolean camposObrigatoriosPreenchidos()
    {
        boolean retorno = true;
        
        if(tfCodigo.getText().equals("")) {
            tfCodigo.setBackground(Color.orange);
            retorno = false;
        } else {
            tfCodigo.setBackground(Color.WHITE);
        }
        
        if(tfNome.getText().equals("")) {
            tfNome.setBackground(Color.orange);
            retorno = false;
        } else {
            tfNome.setBackground(Color.WHITE);
        }
        
        return retorno;
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
            java.util.logging.Logger.getLogger(FormCadastroMobilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroMobilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroMobilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroMobilia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormCadastroMobilia().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPaneDescricao;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbConfirma;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbNome;
    private javax.swing.JTextArea taDescricao;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
