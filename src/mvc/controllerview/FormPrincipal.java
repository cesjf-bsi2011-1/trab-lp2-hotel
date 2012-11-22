package mvc.controllerview;

import entity.Hospedagem;
import entity.Quarto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mvc.model.dao.HospedagemDAO;
import mvc.model.dao.QuartoDAO;
import mvc.model.dao.UsuarioDAO;
import myutils.Notificacao;

public class FormPrincipal extends AbstractForm {

    private Notificacao notificacao = new Notificacao();
    
    public FormPrincipal() {
        initComponents();
        setExtendedState(FormPrincipal.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBarPrincipal = new javax.swing.JToolBar();
        btClientes = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btHospedagem = new javax.swing.JButton();
        btQuartos = new javax.swing.JButton();
        btTipoQuarto = new javax.swing.JButton();
        btMobilia = new javax.swing.JButton();
        btLog = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btSair = new javax.swing.JButton();
        lbLogo = new javax.swing.JLabel();
        jPanelHospedagem = new javax.swing.JPanel();
        btHospedar = new javax.swing.JButton();
        btFecharHospedagem = new javax.swing.JButton();
        lbBuscarHospedagem = new javax.swing.JLabel();
        tfBuscarQuartoCodigo = new javax.swing.JTextField();
        btListarPorCodigo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQuartos = new javax.swing.JTable();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemQuarto = new javax.swing.JMenuItem();
        jMenuItemTipoQuarto = new javax.swing.JMenuItem();
        jMenuItemMobilia = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemConsultaClientes = new javax.swing.JMenuItem();
        jMenuItemConsultaQuarto = new javax.swing.JMenuItem();
        jMenuSuporte = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Rooms | Principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBarPrincipal.setRollover(true);

        btClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/User group.png"))); // NOI18N
        btClientes.setText("Clientes");
        btClientes.setFocusable(false);
        btClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(btClientes);
        jToolBarPrincipal.add(jSeparator3);

        btHospedagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Home.png"))); // NOI18N
        btHospedagem.setText("Hospedagem");
        btHospedagem.setFocusable(false);
        btHospedagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btHospedagem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btHospedagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHospedagemActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(btHospedagem);

        btQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Green tag.png"))); // NOI18N
        btQuartos.setText("Quartos");
        btQuartos.setFocusable(false);
        btQuartos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btQuartos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuartosActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(btQuartos);

        btTipoQuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Red tag.png"))); // NOI18N
        btTipoQuarto.setText("Tipo de Quarto");
        btTipoQuarto.setFocusable(false);
        btTipoQuarto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTipoQuarto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btTipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTipoQuartoActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(btTipoQuarto);

        btMobilia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Target.png"))); // NOI18N
        btMobilia.setText("Mobilia");
        btMobilia.setFocusable(false);
        btMobilia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btMobilia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btMobilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMobiliaActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(btMobilia);

        btLog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Lock.png"))); // NOI18N
        btLog.setText("Logs");
        btLog.setFocusable(false);
        btLog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLog.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(btLog);
        jToolBarPrincipal.add(jSeparator2);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Exit.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jToolBarPrincipal.add(btSair);

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/logoHotelRooms.png"))); // NOI18N

        jPanelHospedagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Quartos"));
        jPanelHospedagem.setPreferredSize(new java.awt.Dimension(830, 490));

        btHospedar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/New.png"))); // NOI18N
        btHospedar.setText("Hospedar");
        btHospedar.setEnabled(false);
        btHospedar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHospedarActionPerformed(evt);
            }
        });

        btFecharHospedagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Dollar.png"))); // NOI18N
        btFecharHospedagem.setText("Fechar Hospedagem");
        btFecharHospedagem.setEnabled(false);
        btFecharHospedagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharHospedagemActionPerformed(evt);
            }
        });

        lbBuscarHospedagem.setText("Código:");

        btListarPorCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Search_1.png"))); // NOI18N
        btListarPorCodigo.setText("Buscar Quarto");
        btListarPorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarPorCodigoActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Blue tag.png"))); // NOI18N
        jButton1.setText("Listar Quartos Vagos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTableQuartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cliente", "Quarto", "Tipo Quarto", "Data Entrada", "Status", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        jTableQuartos.getColumnModel().getColumn(5).setResizable(false);
        jTableQuartos.getColumnModel().getColumn(6).setResizable(false);

        javax.swing.GroupLayout jPanelHospedagemLayout = new javax.swing.GroupLayout(jPanelHospedagem);
        jPanelHospedagem.setLayout(jPanelHospedagemLayout);
        jPanelHospedagemLayout.setHorizontalGroup(
            jPanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHospedagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHospedagemLayout.createSequentialGroup()
                        .addGroup(jPanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHospedagemLayout.createSequentialGroup()
                                .addComponent(btHospedar)
                                .addGap(18, 18, 18)
                                .addComponent(btFecharHospedagem))
                            .addGroup(jPanelHospedagemLayout.createSequentialGroup()
                                .addComponent(lbBuscarHospedagem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBuscarQuartoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btListarPorCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 290, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelHospedagemLayout.setVerticalGroup(
            jPanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHospedagemLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuscarHospedagem)
                    .addComponent(tfBuscarQuartoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListarPorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanelHospedagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btHospedar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btFecharHospedagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        jMenuCadastro.setText("Cadastro");

        jMenuItemCliente.setText("Clientes");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemQuarto.setText("Quartos");
        jMenuItemQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuartoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemQuarto);

        jMenuItemTipoQuarto.setText("Tipo Quarto");
        jMenuItemTipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTipoQuartoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemTipoQuarto);

        jMenuItemMobilia.setText("Mobilia");
        jMenuItemMobilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMobiliaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemMobilia);
        jMenuCadastro.add(jSeparator1);

        jMenuItemSair.setText("Sair");
        jMenuCadastro.add(jMenuItemSair);

        jMenuBarPrincipal.add(jMenuCadastro);

        jMenuConsultas.setText("Consultas");

        jMenuItemConsultaClientes.setText("Clientes");
        jMenuConsultas.add(jMenuItemConsultaClientes);

        jMenuItemConsultaQuarto.setText("Quartos");
        jMenuConsultas.add(jMenuItemConsultaQuarto);

        jMenuBarPrincipal.add(jMenuConsultas);

        jMenuSuporte.setText("Suporte");

        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuSuporte.add(jMenuItemSobre);

        jMenuBarPrincipal.add(jMenuSuporte);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBarPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHospedagem, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(lbLogo))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 408, Short.MAX_VALUE)
                        .addComponent(lbLogo)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelHospedagem, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        FormCadastroCliente cadCli = new FormCadastroCliente();
        cadCli.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuartoActionPerformed
        FormCadastroQuarto cadQuarto = new FormCadastroQuarto();
        cadQuarto.setVisible(true);
    }//GEN-LAST:event_jMenuItemQuartoActionPerformed

    private void jMenuItemTipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTipoQuartoActionPerformed
        FormCadastroTipoQuarto cadTipoQuarto = new FormCadastroTipoQuarto();
        cadTipoQuarto.setVisible(true);
    }//GEN-LAST:event_jMenuItemTipoQuartoActionPerformed

    private void jMenuItemMobiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMobiliaActionPerformed
        FormCadastroMobilia cadMobilia = new FormCadastroMobilia();
        cadMobilia.setVisible(true);
    }//GEN-LAST:event_jMenuItemMobiliaActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        FormSobre fSobre = new FormSobre();
        fSobre.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
        FormBuscarCliente fBuscarCliente = new FormBuscarCliente();
        fBuscarCliente.setVisible(true);
    }//GEN-LAST:event_btClientesActionPerformed

    private void btHospedagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHospedagemActionPerformed
        FormCadastroHospedagem formCadastroReserva = new FormCadastroHospedagem();
        formCadastroReserva.setVisible(true);
    }//GEN-LAST:event_btHospedagemActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btTipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTipoQuartoActionPerformed
        FormBuscarTipoDeQuarto formBuscarTipoQuarto = new FormBuscarTipoDeQuarto();
        formBuscarTipoQuarto.setVisible(true);
    }//GEN-LAST:event_btTipoQuartoActionPerformed

    private void btQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuartosActionPerformed
        FormBuscarQuartos formBuscarQuartos = new FormBuscarQuartos();
        formBuscarQuartos.setVisible(true);
    }//GEN-LAST:event_btQuartosActionPerformed

    private void btMobiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMobiliaActionPerformed
        FormBuscarMobilia formBuscarMobilia = new FormBuscarMobilia();
        formBuscarMobilia.setVisible(true);
    }//GEN-LAST:event_btMobiliaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btHospedarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHospedarActionPerformed
        int linha = jTableQuartos.getSelectedRow();
        String codigoQuarto = (String) jTableQuartos.getModel().getValueAt(linha, 0);
        
        try {
            Quarto quartoBuscado = new QuartoDAO().buscar(codigoQuarto);
            FormCadastroHospedagem.quartoSelecionado = quartoBuscado;
            FormCadastroHospedagem formCadastroHospedagem = new FormCadastroHospedagem();
            formCadastroHospedagem.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        btHospedar.setVisible(false);
    }//GEN-LAST:event_btHospedarActionPerformed

    private void btFecharHospedagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharHospedagemActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(null, "Confirma o fechamento da "
                                              + "hospedagem ?");
        if(confirmacao == 0) {  
            try {
                Quarto quartoBuscado = new QuartoDAO().buscar(tfBuscarQuartoCodigo.getText());

                if (quartoBuscado != null && quartoBuscado.isStatus()) {
                    Hospedagem hospedagem = new HospedagemDAO().buscarPorQuartoCodigo(quartoBuscado.getCodigo());
                    if(hospedagem != null) {
                        FormFechamentoHospedagem.hospedagem = hospedagem;
                        FormFechamentoHospedagem formFechamentoHospedagem = new FormFechamentoHospedagem();
                        formFechamentoHospedagem.setVisible(true);
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
        btFecharHospedagem.setVisible(false);
    }//GEN-LAST:event_btFecharHospedagemActionPerformed

    private void btLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogActionPerformed
        FormBuscarLog formBuscarLog = new FormBuscarLog();
        formBuscarLog.setVisible(true);
    }//GEN-LAST:event_btLogActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            usuarioDAO.getHistorico().inserir("Usuário " + logado.getNomeCompleto() +
                    " saiu do sistema.");
        } catch (Exception ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparTabelaQuarto();
        DefaultTableModel modelo = (DefaultTableModel)jTableQuartos.getModel();
        
        try {
            ArrayList<Quarto> listQuartoDisponiveis = new QuartoDAO().buscarDadosQuartosVagos();
            if (listQuartoDisponiveis.size() > 0) {
                for (Quarto quarto: listQuartoDisponiveis) {
                        modelo.addRow(quarto.getDadosEmVetorParaGridHospedagem());
                }
            } else {
                notificacao.exibir("Nenhum quarto encontrado", Notificacao.ERRO);
            }
        } catch (Exception ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btListarPorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarPorCodigoActionPerformed
        limparTabelaQuarto();
        DefaultTableModel modelo = (DefaultTableModel)jTableQuartos.getModel();
        try {
            Quarto quartoBuscado = new QuartoDAO().buscar(tfBuscarQuartoCodigo.getText());
            
            if (quartoBuscado != null) {
                if (quartoBuscado.isStatus()) {
                    Hospedagem hospedagem = 
                            new HospedagemDAO().buscarPorQuartoCodigo(quartoBuscado.getCodigo());
                    modelo.addRow(hospedagem.getDadosEmVetor());
                } else {
                    modelo.addRow(quartoBuscado.getDadosEmVetorParaGridHospedagem());
                }
            } else {
                notificacao.exibir("Nenhum quarto encontrado", Notificacao.ERRO);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btListarPorCodigoActionPerformed

    private void jTableQuartosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableQuartosMouseClicked
        int linha = jTableQuartos.getSelectedRow();
        String codigoQuarto = (String) jTableQuartos.getModel().getValueAt(linha, 0);
        
        Quarto quarto;
        try {
            quarto = new QuartoDAO().buscar(codigoQuarto);
            if (quarto != null) {
                if(quarto.isStatus()) {
                    btHospedar.setEnabled(false);
                    btFecharHospedagem.setEnabled(true);
                } else {
                    btHospedar.setEnabled(true);
                    btFecharHospedagem.setEnabled(false);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(FormPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jTableQuartosMouseClicked
  
    private void limparTabelaQuarto()
    {
        DefaultTableModel modelo = (DefaultTableModel)jTableQuartos.getModel();
        for (int i = jTableQuartos.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btFecharHospedagem;
    private javax.swing.JButton btHospedagem;
    private javax.swing.JButton btHospedar;
    private javax.swing.JButton btListarPorCodigo;
    private javax.swing.JButton btLog;
    private javax.swing.JButton btMobilia;
    private javax.swing.JButton btQuartos;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btTipoQuarto;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemConsultaClientes;
    private javax.swing.JMenuItem jMenuItemConsultaQuarto;
    private javax.swing.JMenuItem jMenuItemMobilia;
    private javax.swing.JMenuItem jMenuItemQuarto;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemTipoQuarto;
    private javax.swing.JMenu jMenuSuporte;
    private javax.swing.JPanel jPanelHospedagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTable jTableQuartos;
    private javax.swing.JToolBar jToolBarPrincipal;
    private javax.swing.JLabel lbBuscarHospedagem;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JTextField tfBuscarQuartoCodigo;
    // End of variables declaration//GEN-END:variables
}
