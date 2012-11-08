package mvc.controllerview;

import myutils.DateCustomizer;
import myutils.FormCustomizer;
import entity.Cliente;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mvc.model.dao.ClienteDAO;

public class FormCadastroCliente extends javax.swing.JFrame {

    public static Cliente cliente = null;
    /**
     * Creates new form FormCadastroCliente
     */
    public FormCadastroCliente() {
        initComponents();
        if(!tfNome.getText().equals(""))
        {
            lbConfirma.setVisible(false);
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

        painelDadosPessoais = new javax.swing.JPanel();
        tfCodigo = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lbCpf = new javax.swing.JLabel();
        tformatadoCpf = new javax.swing.JFormattedTextField();
        lbRg = new javax.swing.JLabel();
        tfRg = new javax.swing.JTextField();
        lbDataNasc = new javax.swing.JLabel();
        tformatadoDataNasc = new javax.swing.JFormattedTextField();
        btBuscarCpf = new javax.swing.JButton();
        lbModeloData = new javax.swing.JLabel();
        painelContato = new javax.swing.JPanel();
        tfTelResidencial = new javax.swing.JLabel();
        tformatadoTelCelular = new javax.swing.JFormattedTextField();
        lbCelular = new javax.swing.JLabel();
        lbTelComercial = new javax.swing.JLabel();
        tformatadoTelComercial = new javax.swing.JFormattedTextField();
        tformatadoTelResidencial = new javax.swing.JFormattedTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        painelEndereco = new javax.swing.JPanel();
        lbRua = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        tfNumeroEnd = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        comboEstado = new javax.swing.JComboBox();
        lbEstado = new javax.swing.JLabel();
        lbcomplemento = new javax.swing.JLabel();
        lbCep = new javax.swing.JLabel();
        tformatadoCep = new javax.swing.JFormattedTextField();
        tfComplemento = new javax.swing.JTextField();
        lbObservacao = new javax.swing.JLabel();
        jScrollPaneObs = new javax.swing.JScrollPane();
        taObs = new javax.swing.JTextArea();
        btCadastrar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        lbConfirma = new javax.swing.JLabel();
        lbErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Rooms | Cadastro de Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        painelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        tfCodigo.setEnabled(false);

        lbCodigo.setText("Código:");

        lbNome.setText("Nome: *");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        lbCpf.setText("CPF: *");

        try {
            tformatadoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbRg.setText("RG: *");

        lbDataNasc.setText("Data Nascimento: *");

        try {
            tformatadoDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btBuscarCpf.setText("Buscar");
        btBuscarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCpfActionPerformed(evt);
            }
        });

        lbModeloData.setText("dd/MM/aaaa");

        javax.swing.GroupLayout painelDadosPessoaisLayout = new javax.swing.GroupLayout(painelDadosPessoais);
        painelDadosPessoais.setLayout(painelDadosPessoaisLayout);
        painelDadosPessoaisLayout.setHorizontalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNome))
                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCpf)
                                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(tformatadoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btBuscarCpf)))
                                .addGap(47, 47, 47)
                                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbRg))
                                .addGap(32, 32, 32)
                                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDataNasc)
                                    .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(tformatadoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbModeloData))))
                            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(lbCodigo)
                                .addGap(28, 28, 28)
                                .addComponent(lbNome)))
                        .addGap(0, 189, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelDadosPessoaisLayout.setVerticalGroup(
            painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosPessoaisLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(lbNome))
                .addGap(12, 12, 12)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDataNasc)
                    .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCpf)
                        .addComponent(lbRg)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tformatadoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tformatadoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCpf)
                    .addComponent(lbModeloData))
                .addContainerGap())
        );

        painelContato.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        tfTelResidencial.setText("Tel Residencial:");

        try {
            tformatadoTelCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tformatadoTelCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tformatadoTelCelularActionPerformed(evt);
            }
        });

        lbCelular.setText("Celular:");

        lbTelComercial.setText("Tel Comercial:");

        try {
            tformatadoTelComercial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tformatadoTelResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbEmail.setText("E-mail:");

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelContatoLayout = new javax.swing.GroupLayout(painelContato);
        painelContato.setLayout(painelContatoLayout);
        painelContatoLayout.setHorizontalGroup(
            painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTelResidencial)
                    .addComponent(tformatadoTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tformatadoTelComercial, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelComercial))
                .addGap(18, 18, 18)
                .addGroup(painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tformatadoTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCelular))
                .addGap(18, 18, 18)
                .addGroup(painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelContatoLayout.createSequentialGroup()
                        .addComponent(lbEmail)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfEmail))
                .addContainerGap())
        );
        painelContatoLayout.setVerticalGroup(
            painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelResidencial)
                    .addComponent(lbTelComercial)
                    .addComponent(lbCelular)
                    .addComponent(lbEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tformatadoTelResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tformatadoTelComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tformatadoTelCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        lbRua.setText("Rua: *");

        lbNumero.setText("Numero: *");

        lbCidade.setText("Cidade: *");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC Acre", "AL Alagoas ", "AP Amapá ", "AM Amazonas ", "BA Bahia ", "CE Ceará ", "DF Distrito Federal ", "GO Goiás ", "ES Espírito Santo ", "MA Maranhão ", "MT Mato Grosso ", "MS Mato Grosso do Sul ", "MG Minas Gerais ", "PA Pará ", "PB Paraiba ", "PR Paraná ", "PE Pernambuco ", "PI Piauí ", "RJ Rio de Janeiro ", "RN Rio Grande do Norte ", "RS Rio Grande do Sul ", "RO Rondônia ", "RR Rorâima ", "SP São Paulo ", "SC Santa Catarina ", "SE Sergipe ", "TO Tocantins" }));

        lbEstado.setText("Estado: *");

        lbcomplemento.setText("Complemento:");

        lbCep.setText("CEP:");

        try {
            tformatadoCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painelEnderecoLayout = new javax.swing.GroupLayout(painelEndereco);
        painelEndereco.setLayout(painelEnderecoLayout);
        painelEnderecoLayout.setHorizontalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEnderecoLayout.createSequentialGroup()
                                .addComponent(lbRua)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfRua))
                        .addGap(18, 18, 18)
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNumero)
                            .addComponent(tfNumeroEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbcomplemento)))
                    .addGroup(painelEnderecoLayout.createSequentialGroup()
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEnderecoLayout.createSequentialGroup()
                                .addComponent(lbCidade)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfCidade))
                        .addGap(18, 18, 18)
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado))
                        .addGap(55, 55, 55)
                        .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCep)
                            .addComponent(tformatadoCep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        painelEnderecoLayout.setVerticalGroup(
            painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRua)
                    .addComponent(lbNumero)
                    .addComponent(lbcomplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNumeroEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidade)
                    .addComponent(lbEstado)
                    .addComponent(lbCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tformatadoCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbObservacao.setText("Observação:");

        taObs.setColumns(20);
        taObs.setRows(5);
        jScrollPaneObs.setViewportView(taObs);

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

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Close.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Exit.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/24x24/Remove.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.setEnabled(false);

        lbConfirma.setForeground(new java.awt.Color(0, 102, 255));

        lbErro.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneObs, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbConfirma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbErro)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btRemover)
                                .addGap(18, 18, 18)
                                .addComponent(btCancelar)
                                .addGap(198, 198, 198)
                                .addComponent(btSair))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(painelContato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(painelEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbObservacao, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(painelDadosPessoais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbConfirma, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(lbErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(painelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(painelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbObservacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneObs, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btAtualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(793, 727));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tformatadoTelCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tformatadoTelCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tformatadoTelCelularActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        Cliente cli = new Cliente();
        
        if(tfNome.getText().equals("") || tformatadoCpf.getText().equals("   .   .   -  ") || tfRg.getText().equals("") || tformatadoDataNasc.getText().equals("  /  /    ") || tfRua.getText().equals(""))
        {
            lbErro.setText("Os Campos com * são obrigatorios!");
        }
        else
        {
            cli.setNome(tfNome.getText());
            cli.setCodigo(Integer.parseInt(tfCodigo.getText()));
            cli.setCpf(tformatadoCpf.getText());
            cli.setRg(tfRg.getText());
            try {
                cli.setDataNascimento(DateCustomizer.StrToDate(tformatadoDataNasc.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(FormCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            cli.setComplemento(tfComplemento.getText());
            cli.setRua(tfRua.getText());
            cli.setNumeroEnd(tfNumeroEnd.getText());
            cli.setCidade(tfCidade.getText());
            cli.setEstado((String)comboEstado.getSelectedItem());
            cli.setCep(tformatadoCep.getText());
            cli.setFoneCelular(tformatadoTelCelular.getText());
            cli.setFoneResidencial(tformatadoTelResidencial.getText());
            cli.setFoneComercial(tformatadoTelComercial.getText());
            cli.setObservação(taObs.getText());
            
            ClienteDAO clienteDAO = new ClienteDAO();
            clienteDAO.inserir(cli);
            
            FormCustomizer.limparTodosCampos(painelDadosPessoais);
            FormCustomizer.limparTodosCampos(painelEndereco);
            FormCustomizer.limparTodosCampos(painelContato);
            taObs.setText("");
            lbErro.setVisible(false);
            lbConfirma.setText("Cliente Cadastrado com Sucesso!");
            tfNome.requestFocus();
            

        }
        

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        FormCustomizer.limparTodosCampos(painelContato);
        FormCustomizer.limparTodosCampos(painelDadosPessoais);
        FormCustomizer.limparTodosCampos(painelEndereco);
        taObs.setText("");
    }//GEN-LAST:event_btCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btAtualizar.setEnabled(false);
        btRemover.setEnabled(false);
        tfCodigo.setText("022");
    }//GEN-LAST:event_formWindowOpened

    private void btBuscarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCpfActionPerformed
        // TODO add your handling code here:
        
        String cpfBusca = tformatadoCpf.getText();
        JOptionPane.showMessageDialog(null, "Erro!1");
        ClienteDAO clienteBusca = new ClienteDAO(); 
        JOptionPane.showMessageDialog(null, "Erro!2");
        cliente = clienteBusca.buscarPorCpf(cpfBusca);
        JOptionPane.showMessageDialog(null, "Erro!3");
        if(cliente != null)
        {
            //Dados Pessoais
            JOptionPane.showMessageDialog(null, "Erro!4");
            tfCodigo.setText(Integer.toString(cliente.getCodigo()));
            tfNome.setText(cliente.getNome());
            JOptionPane.showMessageDialog(null, "Erro!5");
            tfRg.setText(cliente.getRg());
            tformatadoDataNasc.setText(DateCustomizer.DateToStr(cliente.getDataNascimento()));
            
            //Endereço
            tfRua.setText(cliente.getRua());
            tfComplemento.setText(cliente.getComplemento());
            tfNumeroEnd.setText(cliente.getNumeroEnd());
            tfCidade.setText(cliente.getCidade());
            comboEstado.setSelectedItem((String)cliente.getEstado());
            tformatadoCep.setText(cliente.getCep());
            
            //contato
            tfTelResidencial.setText(cliente.getFoneResidencial());
            tformatadoTelCelular.setText(cliente.getFoneCelular());
            tformatadoTelComercial.setText(cliente.getFoneComercial());
            
            taObs.setText(cliente.getObservação());
        }
    }//GEN-LAST:event_btBuscarCpfActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroCliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btBuscarCpf;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btRemover;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JScrollPane jScrollPaneObs;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbConfirma;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbDataNasc;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbErro;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbModeloData;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbObservacao;
    private javax.swing.JLabel lbRg;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbTelComercial;
    private javax.swing.JLabel lbcomplemento;
    private javax.swing.JPanel painelContato;
    private javax.swing.JPanel painelDadosPessoais;
    private javax.swing.JPanel painelEndereco;
    private javax.swing.JTextArea taObs;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumeroEnd;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfRua;
    private javax.swing.JLabel tfTelResidencial;
    private javax.swing.JFormattedTextField tformatadoCep;
    private javax.swing.JFormattedTextField tformatadoCpf;
    private javax.swing.JFormattedTextField tformatadoDataNasc;
    private javax.swing.JFormattedTextField tformatadoTelCelular;
    private javax.swing.JFormattedTextField tformatadoTelComercial;
    private javax.swing.JFormattedTextField tformatadoTelResidencial;
    // End of variables declaration//GEN-END:variables
}