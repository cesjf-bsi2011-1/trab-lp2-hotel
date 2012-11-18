package mvc.controllerview;

public class FormBuscarHospedagem extends javax.swing.JFrame {

    public FormBuscarHospedagem() {
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

        jPanelHospedagem = new javax.swing.JPanel();
        btHospedar = new javax.swing.JButton();
        btFecharHospedagem = new javax.swing.JButton();
        btCancelarHosp = new javax.swing.JButton();
        btEditarHops = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Rooms | Hospedagens");

        jPanelHospedagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Hospedagem"));
        jPanelHospedagem.setPreferredSize(new java.awt.Dimension(830, 490));

        btHospedar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/New.png"))); // NOI18N
        btHospedar.setText("Hospedar");
        btHospedar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHospedarActionPerformed(evt);
            }
        });

        btFecharHospedagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Dollar.png"))); // NOI18N
        btFecharHospedagem.setText("Fechar Hospedagem");

        btCancelarHosp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/No-entry.png"))); // NOI18N
        btCancelarHosp.setText("Cancelar");

        btEditarHops.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Modify.png"))); // NOI18N
        btEditarHops.setText("Editar");

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Close.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelHospedagemLayout = new javax.swing.GroupLayout(jPanelHospedagem);
        jPanelHospedagem.setLayout(jPanelHospedagemLayout);
        jPanelHospedagemLayout.setHorizontalGroup(
            jPanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHospedagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btHospedar)
                .addGap(18, 18, 18)
                .addComponent(btFecharHospedagem)
                .addGap(18, 18, 18)
                .addComponent(btEditarHops)
                .addGap(18, 18, 18)
                .addComponent(btCancelarHosp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(btSair)
                .addContainerGap())
        );
        jPanelHospedagemLayout.setVerticalGroup(
            jPanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHospedagemLayout.createSequentialGroup()
                .addContainerGap(423, Short.MAX_VALUE)
                .addGroup(jPanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btHospedar)
                    .addComponent(btFecharHospedagem)
                    .addComponent(btCancelarHosp)
                    .addComponent(btEditarHops)
                    .addComponent(btSair))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jPanelHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-866)/2, (screenSize.height-550)/2, 866, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void btHospedarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHospedarActionPerformed
        FormReserva fReserva = new FormReserva();
        fReserva.setVisible(true);
    }//GEN-LAST:event_btHospedarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

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
            java.util.logging.Logger.getLogger(FormBuscarHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscarHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscarHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscarHospedagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuscarHospedagem().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarHosp;
    private javax.swing.JButton btEditarHops;
    private javax.swing.JButton btFecharHospedagem;
    private javax.swing.JButton btHospedar;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanelHospedagem;
    // End of variables declaration//GEN-END:variables
}
