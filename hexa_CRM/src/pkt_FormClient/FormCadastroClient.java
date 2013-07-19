/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_FormClient;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import pkt_EntidadeClient_DAO.Cliente;
import pkt_EntidadeClient_DAO.ClienteDAO;
import pkt_FormEmpresa.FormCadastrarEmpresa;
import pkt_FormEmpresa.FormGerarRelatorio;
import pkt_Util.EmpresaListagem;
import pkt_Util.Estado;
import pkt_Util.TableDAO;

/**
 *
 * @author Jenny
 */
public class FormCadastroClient extends javax.swing.JFrame {

    private int largura = 1040;
    private int altura = 710;

    public FormCadastroClient() {
        initComponents();
        txtid.setVisible(false);
        // txtPesquisa.setText("Insira o parâmetro da pesqusia.");
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        this.setSize(largura, altura);
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        // Move the window
        this.setLocation(x, y);
        this.setBounds(x, y, w, h);
        //  setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem3 = new javax.swing.JMenuItem();
        jToolBar2 = new javax.swing.JToolBar();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        javax.swing.text.MaskFormatter maskTel01 = null;
        try {
            maskTel01 = new javax.swing.text.MaskFormatter("(##)####-####");
            maskTel01.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtTel01 = new javax.swing.JFormattedTextField(maskTel01);
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContato = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnCadastro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSite = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        cbxUf = new javax.swing.JComboBox();
        rdoCliente = new javax.swing.JRadioButton();
        rdoListarTodos = new javax.swing.JRadioButton();
        javax.swing.text.MaskFormatter maskTel02 = null;
        try {
            maskTel02 = new javax.swing.text.MaskFormatter("(##)####-####");
            maskTel02.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtTel02 = new javax.swing.JFormattedTextField(maskTel02);
        javax.swing.text.MaskFormatter maskCep = null;
        try {
            maskCep = new javax.swing.text.MaskFormatter("##.###-###");
            maskCep.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtCep = new javax.swing.JFormattedTextField(maskCep);
        jLabel14 = new javax.swing.JLabel();
        cbxEmpresaGerencia = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuEncerrar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuRelatorio = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenuItem3.setText("jMenuItem3");

        jToolBar2.setRollover(true);

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Pesquisa por:");

        btnPesquisa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/procurar2.png"))); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        tblCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "Cliente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tblCliente.getTableHeader().setReorderingAllowed(false);
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);
        tblCliente.getColumnModel().getColumn(0).setMinWidth(0);
        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblCliente.getColumnModel().getColumn(0).setMaxWidth(0);
        tblCliente.getColumnModel().getColumn(1).setResizable(false);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/novo2.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Cliente Nome:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Tel. Comercial:");

        txtTel01.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Tel. Celular:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Contato:");

        txtContato.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Endereço:");

        txtEndereco.setFocusable(false);
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Bairro:");

        txtBairro.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Nº:");

        txtNumero.setFocusable(false);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("CEP:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Cidade:");

        txtCidade.setFocusable(false);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("UF:");

        btnCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/concluir.png"))); // NOI18N
        btnCadastro.setText("Concluir");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Site:");

        txtSite.setFocusable(false);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("E-mail:");

        txtEmail.setFocusable(false);

        btnAtualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/arrow_refresh.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        txtid.setFocusable(false);

        txtEmpresa.setFocusable(false);

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/delete1.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        cbxUf.setFocusable(false);

        buttonGroup1.add(rdoCliente);
        rdoCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rdoCliente.setText("Nome do Cliente");

        buttonGroup1.add(rdoListarTodos);
        rdoListarTodos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rdoListarTodos.setText("Listar Todos");

        txtTel02.setFocusable(false);

        txtCep.setFocusable(false);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Cliente de:");

        mnuEncerrar.setText("Encerrar Sessão");
        mnuEncerrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuEncerrar.add(jMenuItem1);

        jMenuBar1.add(mnuEncerrar);

        mnuRelatorio.setText("Administrativo");
        mnuRelatorio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItem4.setText("Cadastro de Empresas de Gerencia");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnuRelatorio.add(jMenuItem4);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/habite.png"))); // NOI18N
        jMenuItem2.setText("Lista de Empresas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnuRelatorio.add(jMenuItem2);

        jMenuBar1.add(mnuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(rdoCliente)
                        .addGap(0, 0, 0)
                        .addComponent(rdoListarTodos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPesquisa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCadastro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAtualizar)
                                .addGap(6, 6, 6)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(28, 28, 28)
                                        .addComponent(cbxEmpresaGerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(8, 8, 8)
                                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(41, 41, 41)
                                        .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(63, 63, 63)
                                        .addComponent(txtSite, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(48, 48, 48)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(21, 21, 21)
                                                .addComponent(txtTel02))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(4, 4, 4)
                                                .addComponent(txtTel01, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(cbxUf, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCep, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtBairro)
                                                        .addGap(171, 171, 171))
                                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(rdoCliente)
                    .addComponent(rdoListarTodos))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisa))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14))
                    .addComponent(cbxEmpresaGerencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addComponent(txtTel02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel6))
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(txtSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel13))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAtualizar)
                        .addComponent(btnCadastro))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir)
                        .addComponent(btnLimpar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        try {
            preenche_jtable();
            desbloquearCampos();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        try {

            Cliente emp = new Cliente();
            Estado est = new Estado();
            EmpresaListagem empList = new EmpresaListagem();
            ClienteDAO dao = new ClienteDAO();

            //Verifica a Empresa de Gerencia Selecionada
            empList.setNome_empresa(cbxEmpresaGerencia.getSelectedItem().toString());
            int id_empresa_gerencia = empList.selecionarIdEmpresaGerencia();
            emp.setEmpresa_gerencia_id(id_empresa_gerencia);
            ///      
            emp.setNome(txtEmpresa.getText().toUpperCase());
            emp.setTelComercial01(txtTel01.getText());
            emp.setTelComercial02(txtTel02.getText());
            emp.setContato(txtContato.getText().toUpperCase());
            emp.setEndereco(txtEndereco.getText().toUpperCase());
            emp.setNumero(txtNumero.getText());
            emp.setBairro(txtBairro.getText().toUpperCase());
            emp.setCep(txtCep.getText());
            emp.setCidade(txtCidade.getText().toUpperCase());
            //Verifica o Estado selecionado
            est.setEstado(cbxUf.getSelectedItem().toString());
            int id_estado = est.selecionarIdEstado();
            emp.setEstadoId(id_estado);
            /////
            emp.setSite(txtSite.getText());
            emp.setEmail(txtEmail.getText());

            dao.inserirCliente(emp);
            limparCampos();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked

        Cliente emp = new Cliente();
        Estado est = new Estado();
        EmpresaListagem empList = new EmpresaListagem();
        ClienteDAO dao = new ClienteDAO();

        try {

            emp.setId(Integer.valueOf(tblCliente.getValueAt(tblCliente.getSelectedRow(), 0).toString()));
            java.util.List<Cliente> lista = dao.getListaDadosCliente(emp);

            for (Cliente cursor : lista) {

                txtid.setText(String.valueOf(cursor.getId()));
                //Carrega combo com a Empresa de gerencia correta
                int id_empresa_gerencia = cursor.getEmpresa_gerencia_id();
                empList.setEmpresa_gerencia_id(id_empresa_gerencia);
                String empresa_gerencia = empList.selecionarNomeEmpresaGerencia();
                cbxEmpresaGerencia.setSelectedItem(empresa_gerencia);
                ///
                txtEmpresa.setText(cursor.getNome());
                txtTel01.setText(cursor.getTelComercial01());
                txtTel02.setText(cursor.getTelComercial02());
                txtContato.setText(cursor.getContato());
                txtEndereco.setText(cursor.getEndereco());
                txtNumero.setText(cursor.getNumero());
                txtBairro.setText(cursor.getBairro());
                txtCep.setText(cursor.getCep());
                txtCidade.setText(cursor.getCidade());
                //Carregar Combo com o UF correto
                int estado_id = cursor.getEstadoId();
                est.setId(estado_id);
                String estado = est.selecionarNomeEstado();
                cbxUf.setSelectedItem(estado);
                ///
                txtSite.setText(cursor.getSite());
                txtEmail.setText(cursor.getEmail());

            }
            desbloquearCampos();
            btnAtualizar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnCadastro.setEnabled(false);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Cliente emp = new Cliente();
        Estado est = new Estado();
        EmpresaListagem empList = new EmpresaListagem();
        ClienteDAO dao = new ClienteDAO();

        try {

            emp.setId(Integer.valueOf(txtid.getText()));
            //Verifica a Empresa de Gerencia Selecionada
            empList.setNome_empresa(cbxEmpresaGerencia.getSelectedItem().toString());
            int id_empresa_gerencia = empList.selecionarIdEmpresaGerencia();
            emp.setEmpresa_gerencia_id(id_empresa_gerencia);
            ///  
            emp.setNome(txtEmpresa.getText().toUpperCase());
            emp.setTelComercial01(txtTel01.getText());
            emp.setTelComercial02(txtTel02.getText());
            emp.setContato(txtContato.getText().toUpperCase());
            emp.setEndereco(txtEndereco.getText().toUpperCase());
            emp.setNumero(txtNumero.getText());
            emp.setBairro(txtBairro.getText().toUpperCase());
            emp.setCep(txtCep.getText());
            emp.setCidade(txtCidade.getText().toUpperCase());
            est.setEstado(cbxUf.getSelectedItem().toString());
            int id_estado = est.selecionarIdEstado();
            emp.setEstadoId(id_estado);
            emp.setSite(txtSite.getText());
            emp.setEmail(txtEmail.getText());


            Object[] options = {"Sim", "Não"};
            Object opc = JOptionPane.showOptionDialog(null, "Deseja salvar a Atualização do registro?", "Hexa",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);

            if (opc.toString().equals("0")) {
                dao.editarEmpresa(emp);
                JOptionPane.showMessageDialog(null, "Atualização efetuada com sucesso!");
                preenche_jtable();
            }

            limparCampos();
            btnAtualizar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnCadastro.setEnabled(true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        try {
            limparCampos();
            DefaultTableModel tableModel = (DefaultTableModel) tblCliente.getModel();
            tableModel.setNumRows(0);

            btnExcluir.setEnabled(false);
            btnAtualizar.setEnabled(false);
            btnCadastro.setEnabled(true);

            txtPesquisa.requestFocus();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Cliente emp = new Cliente();
        ClienteDAO dao = new ClienteDAO();

        try {

            emp.setId(Integer.valueOf(txtid.getText()));

            Object[] options = {"Sim", "Não"};
            Object opc = JOptionPane.showOptionDialog(null, "Deseja excluir esse registro?", "Hexa",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);

            if (opc.toString().equals("0")) {
                dao.excluirEmpresa(emp);
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
                preenche_jtable();
            }

            limparCampos();
            btnExcluir.setEnabled(false);
            btnAtualizar.setEnabled(false);
            btnCadastro.setEnabled(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            Object[] options = {"Sim", "Não"};
            Object opc = JOptionPane.showOptionDialog(null, "Deseja sair do sistema?", "Hexa",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[0]);

            if (opc.toString().equals("0")) {
                System.exit(0);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            //CARREGA COMBOBOX ESTADO
            Estado est = new Estado();
            Vector listaEstado = est.carregarComboEstado();
            cbxUf.removeAllItems();
            cbxUf.addItem("");
            for (int i = 0; i < listaEstado.size(); i++) {
                cbxUf.addItem(listaEstado.elementAt(i));
            }

            // CARREGA COMBOBOX Empresa de Gerencia
            EmpresaListagem emp = new EmpresaListagem();
            Vector listaEmpresa = emp.carregarComboEmpresaGerencia();
            cbxEmpresaGerencia.removeAllItems();
            cbxEmpresaGerencia.addItem("");
            for (int i = 0; i < listaEmpresa.size(); i++) {
                cbxEmpresaGerencia.addItem(listaEmpresa.elementAt(i));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {


            // FormGerarRelarorio F = new FormGerarRelarorio();
            //  F.setVisible(true);

            FormGerarRelatorio t = new FormGerarRelatorio(this, true);
            t.setVisible(true);



        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar relatório: " + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {

            FormCadastrarEmpresa t = new FormCadastrarEmpresa(this, true);
            t.setVisible(true);



        } catch (Exception e) {
            throw new RuntimeException("Erro ao chamar tela: " + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroClient().setVisible(true);
            }
        });
    }

    void limparCampos() {
        txtPesquisa.setText("");
        txtEmpresa.setText("");
        txtTel01.setText("");
        txtTel02.setText("");
        txtContato.setText("");
        txtSite.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCep.setText("");
        txtCidade.setText("");
        cbxUf.addItem("");

    }

    void desbloquearCampos() {
        txtEmpresa.setFocusable(true);
        txtTel01.setFocusable(true);
        txtTel02.setFocusable(true);
        txtContato.setFocusable(true);
        txtSite.setFocusable(true);
        txtEmail.setFocusable(true);
        txtEndereco.setFocusable(true);
        txtBairro.setFocusable(true);
        txtNumero.setFocusable(true);
        txtCep.setFocusable(true);
        txtCidade.setFocusable(true);
        cbxUf.setFocusable(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxEmpresaGerencia;
    private javax.swing.JComboBox cbxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenu mnuEncerrar;
    private javax.swing.JMenu mnuRelatorio;
    private javax.swing.JRadioButton rdoCliente;
    private javax.swing.JRadioButton rdoListarTodos;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtSite;
    private javax.swing.JTextField txtTel01;
    private javax.swing.JTextField txtTel02;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {
        TableDAO dao = new TableDAO();
        ClienteDAO dao2 = new ClienteDAO();
        Cliente emp = new Cliente();

        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        modelo.setNumRows(0);

        String pes = txtPesquisa.getText().toUpperCase();


        if (rdoListarTodos.isSelected()) {
            try {
                ResultSet resultado = dao.consultaTable("SELECT * FROM cliente ORDER BY nome ASC");
                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                {
                    modelo.addRow(new Object[]{resultado.getInt("id"),
                                resultado.getString("nome")});
                }
                resultado.first();
            } catch (SQLException erro) {
                throw new RuntimeException(erro);
            }

        } else if (rdoCliente.isSelected()) {
            String pesquisa = pes;
            if ("".equals(pesquisa)) {
                JOptionPane.showMessageDialog(null, "O campo de pesquisa não pode ser NULO!");
            } else {
                emp.setNome(pesquisa);

                boolean validar = dao2.validarEmpresa(emp);
                if (validar == true) {
                    JOptionPane.showMessageDialog(null, "Esse Cliente já consta no sistema!");

                    try {
                        ResultSet resultado = dao.consultaTable("SELECT * FROM cliente WHERE nome LIKE '%" + pes + "%' "
                                + "ORDER BY nome ASC");
                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                        {
                            modelo.addRow(new Object[]{resultado.getInt("id"),
                                        resultado.getString("nome")});
                        }
                        resultado.first();
                    } catch (SQLException erro) {
                        throw new RuntimeException(erro);
                    }
                } else {
                    try {
                        ResultSet resultado = dao.consultaTable("SELECT * FROM cliente WHERE nome LIKE '%" + pes + "%' "
                                + "ORDER BY nome ASC");
                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                        {
                            modelo.addRow(new Object[]{resultado.getInt("id"),
                                        resultado.getString("nome")});
                        }
                        resultado.first();
                    } catch (SQLException erro) {
                        throw new RuntimeException(erro);
                    }
                    Object[] options = {"Sim", "Não"};
                    Object opc = JOptionPane.showOptionDialog(null, "O Cliente: " + pes
                            + "\n, não consta no sistema, deseja salvar ? ", "HexaDC",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                            options, options[0]);

                    if (opc.toString().equals("0")) {
                        txtEmpresa.setText(pes);
                        desbloquearCampos();

                    }

                }
            }
        }
    }
}
