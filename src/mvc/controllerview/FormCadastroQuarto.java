package mvc.controllerview;

import entity.Quarto;
import entity.TipoQuarto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.model.dao.QuartoDAO;
import mvc.model.dao.TipoQuartoDAO;
import myutils.Notificacao;

public class FormCadastroQuarto extends javax.swing.JFrame {

    public static TipoQuartoDAO tipoQuartoDAO;    
    public static ArrayList<String> tipoQuartoNomes = new ArrayList<String>(); 
    public static Quarto quarto = null;
    private Notificacao notificacao = new Notificacao();
    
    public FormCadastroQuarto() {
        initComponents();   
        
        try {
            tipoQuartoDAO = new TipoQuartoDAO();
            
            QuartoDAO quartoDAO = new QuartoDAO();
            tfCodigo.setText(String.valueOf(quartoDAO.getIndex()));
            
            tipoQuartoNomes = (ArrayList) tipoQuartoDAO.listarNomesTipoQuarto();
            for(String nomeDoTipoQuarto : tipoQuartoNomes) {
                jComboBoxTipoQuarto.addItem(nomeDoTipoQuarto);
            }
            jComboBoxTipoQuarto.requestFocus();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
        
        /*Caso o Form esteja sendo aberto com intuito de 
        * realizar uma atualização, o objeto global
        * quarto foi preenchido diretamente por outro
        * Form.
        */
        if (quarto != null) {
            preencherFormCom(quarto);
            btAtualizar.setEnabled(true);
            btCadastrar.setEnabled(false);
        }
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
        lbTipoQuarto = new javax.swing.JLabel();
        jComboBoxTipoQuarto = new javax.swing.JComboBox();
        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        lbValor = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        lbObs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Rooms | Cadastro de Quartos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbCodigo.setText("Código: *");

        tfCodigo.setEditable(false);

        lbTipoQuarto.setText("Tipo Quarto: *");

        jComboBoxTipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoQuartoActionPerformed(evt);
            }
        });

        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Add.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
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

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Refresh.png"))); // NOI18N
        btAtualizar.setText("Atualizar");
        btAtualizar.setEnabled(false);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        lbValor.setText("Valor: *");

        lbObs.setText("Observação:");

        taObs.setColumns(20);
        taObs.setRows(5);
        jScrollPane1.setViewportView(taObs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbObs)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 75, Short.MAX_VALUE)
                        .addComponent(lbTipoQuarto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btCadastrar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btAtualizar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btCancelar)
                                    .addGap(35, 35, 35)
                                    .addComponent(btSair))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbValor)
                                .addGap(18, 18, 18)
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigo)
                    .addComponent(lbTipoQuarto)
                    .addComponent(jComboBoxTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbValor))
                        .addGap(46, 46, 46)
                        .addComponent(lbObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-514)/2, (screenSize.height-406)/2, 514, 406);
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        if(camposObrigatoriosPreenchidos()) {
            quarto = new Quarto();
            quarto.setCodigo(tfCodigo.getText());
            quarto.setObservacao(taObs.getText());
            quarto.setValor(Float.parseFloat(tfValor.getText()));
            quarto.setStatus(false);
            try {
                List<TipoQuarto> tipoQuartoList = tipoQuartoDAO.buscarTodos();

                for(TipoQuarto tipoQuarto : tipoQuartoList) {                
                    if(tipoQuarto.getNome().equals((String)jComboBoxTipoQuarto.getSelectedItem())) {
                        quarto.setTipoQuarto(tipoQuarto);
                    }               
                }
            
                QuartoDAO quartoDAO = new QuartoDAO();
                quartoDAO.inserir(quarto);
                notificacao.exibir("Quarto " + quarto.getObservacao() 
                             + " Cadastrado com sucesso!", Notificacao.SUCESSO);
                limparForm();
                tfCodigo.setText(String.valueOf(quartoDAO.getIndex()));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
            }
        } else {
            notificacao.exibir("Os Campos com * são obrigatorios!",
                                                           Notificacao.ERRO);
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        limparForm();
    }//GEN-LAST:event_btCancelarActionPerformed

     private boolean camposObrigatoriosPreenchidos()
    {
        boolean retorno = true;
        if(tfCodigo.getText().equals("")) {
            tfCodigo.setBackground(Color.orange);
            retorno = false;
        } else {
            tfCodigo.setBackground(Color.WHITE);
        }
        
        if(tfValor.getText().equals("")) {
            tfValor.setBackground(Color.orange);
            retorno = false;
        } else {
            tfValor.setBackground(Color.WHITE);
        }
        
        return retorno;
    }
     
    private void preencherFormCom(Quarto quarto)
    {
        tfValor.setText(String.valueOf(quarto.getValor()));
        tfCodigo.setText(quarto.getCodigo());
        taObs.setText(quarto.getObservacao());
        jComboBoxTipoQuarto.setSelectedItem(quarto.getTipoQuarto()); 
    }
    
    private void limparForm()
    {
        tfValor.setText("");
        tfCodigo.setText("");
        taObs.setText("");
        jComboBoxTipoQuarto.setSelectedItem(""); 
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxTipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoQuartoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoQuartoActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        String codigo = tfCodigo.getText();
        try {
            QuartoDAO quartoDAO = new QuartoDAO();
            Quarto quartoParaAtualizar = quartoDAO.buscar(codigo);
            quartoParaAtualizar.setObservacao(taObs.getText());
            TipoQuartoDAO tipoQuartoDAO = new TipoQuartoDAO();
            quartoParaAtualizar.setTipoQuarto(
                    tipoQuartoDAO.buscarPorNome(
                        (String)jComboBoxTipoQuarto.getSelectedItem()
                        )
                    );
            quartoParaAtualizar.setValor(Float.parseFloat(tfValor.getText()));
            quartoDAO.atualizar(codigo, quartoParaAtualizar);
            notificacao.exibir("Quarto " + quartoParaAtualizar.getObservacao() +
                    " atualizado com sucesso!", Notificacao.SUCESSO);
        } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "ERROR", ""+ex, ERROR);
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        quarto = null;
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox jComboBoxTipoQuarto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbObs;
    private javax.swing.JLabel lbTipoQuarto;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
