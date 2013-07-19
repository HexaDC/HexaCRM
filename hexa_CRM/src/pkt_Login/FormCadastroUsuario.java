/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_Login;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import pkt_Util.TableDAO;

/**
 *
 * @author Jenny
 */
public class FormCadastroUsuario extends javax.swing.JFrame {

    private int largura = 760;
    private int altura = 500;

    public FormCadastroUsuario() {
        initComponents();
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
        ////////////////////////////////////////////////////////////////////////////
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnPesquisar = new javax.swing.JButton();
        txtPesquisa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rdoNome = new javax.swing.JRadioButton();
        rdoListarTodos = new javax.swing.JRadioButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        cbxEmpresa = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cbxAtualizarExcluirCliente = new javax.swing.JCheckBox();
        cbxCadastroCliente = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        cbxAtualizarExcluirEmpresa = new javax.swing.JCheckBox();
        cbxCadastroEmpresa = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        cbxRelatorio = new javax.swing.JCheckBox();
        cbxSelecionarTodos = new javax.swing.JCheckBox();
        jSeparator6 = new javax.swing.JSeparator();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnConcluir = new javax.swing.JButton();
        rdoLogin = new javax.swing.JRadioButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Login", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuario.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblUsuario);
        tblUsuario.getColumnModel().getColumn(0).setMinWidth(0);
        tblUsuario.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblUsuario.getColumnModel().getColumn(0).setMaxWidth(0);
        tblUsuario.getColumnModel().getColumn(1).setResizable(false);
        tblUsuario.getColumnModel().getColumn(1).setPreferredWidth(80);
        tblUsuario.getColumnModel().getColumn(2).setPreferredWidth(450);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/procurar2.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel5.setText("Pesquisar por:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cadastro e Controle de Usuário");

        buttonGroup1.add(rdoNome);
        rdoNome.setText("Nome");

        buttonGroup1.add(rdoListarTodos);
        rdoListarTodos.setText("Listar Todos");

        jLabel2.setText("Nome:");

        jLabel4.setText("Login:");

        jLabel6.setText("Telefone:");

        jLabel9.setText("Vínculo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 350, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados do Usuário", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbxAtualizarExcluirCliente.setText("Atualizar e Excluir Registro");
        cbxAtualizarExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAtualizarExcluirClienteActionPerformed(evt);
            }
        });

        cbxCadastroCliente.setText("Cadastro");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cadastro de Clientes ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxCadastroCliente)
                            .addComponent(cbxAtualizarExcluirCliente)
                            .addComponent(jLabel7))
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxCadastroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxAtualizarExcluirCliente))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbxAtualizarExcluirEmpresa.setText("Atualizar e Excluir Registro");
        cbxAtualizarExcluirEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAtualizarExcluirEmpresaActionPerformed(evt);
            }
        });

        cbxCadastroEmpresa.setText("Cadastro de Empresas de Gerencia");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Administrativo");

        cbxRelatorio.setText("Emissão de Relatório");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cbxRelatorio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxCadastroEmpresa)
                                    .addComponent(cbxAtualizarExcluirEmpresa)
                                    .addComponent(jLabel8))
                                .addGap(0, 61, Short.MAX_VALUE)))
                        .addGap(14, 14, 14))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxCadastroEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxAtualizarExcluirEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxRelatorio)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        cbxSelecionarTodos.setText("Selecionar Todos");
        cbxSelecionarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSelecionarTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxSelecionarTodos)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cbxSelecionarTodos))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Controle de Acesso", jPanel2);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/novo2.png"))); // NOI18N
        btnLimpar.setText("Limpar");

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/delete1.png"))); // NOI18N
        btnExcluir.setText("Excluir");

        btnAtualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/arrow_refresh.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");

        btnConcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/concluir.png"))); // NOI18N
        btnConcluir.setText("Concluir");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoLogin);
        rdoLogin.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoListarTodos)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar))))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdoNome)
                    .addComponent(rdoListarTodos)
                    .addComponent(rdoLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxAtualizarExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAtualizarExcluirClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAtualizarExcluirClienteActionPerformed

    private void cbxAtualizarExcluirEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAtualizarExcluirEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAtualizarExcluirEmpresaActionPerformed

    private void cbxSelecionarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSelecionarTodosActionPerformed
        if (cbxSelecionarTodos.isSelected()) {
            selecionarTodosCheck();
        } else {
            desselecionarTodosCheck();
        }
    }//GEN-LAST:event_cbxSelecionarTodosActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        Usuario user = new Usuario();
        try {

            String nome = txtNome.getText().toUpperCase();
            String login = txtLogin.getText().toUpperCase();

            if (!nome.equals("") || !login.equals("")) {
                if (cbxEmpresa.getSelectedIndex() != 0) {
                    user.setUsuario(login);
                    if (!user.verificaUser()) {

                        user.setNome(nome);
                        user.setUsuario(login);
                        user.setTelefone(txtTelefone.getText());
                        user.setAcesso(setPermissoes());
                        user.setTipo(1);

                        user.setNome_empresa(cbxEmpresa.getSelectedItem().toString());
                     //   user.setEmpresa_gerencia_id(user.selecionarIdEmpresaGerencia());

                        user.adicionarUsuario();
                        JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");

                    } else {
                        JOptionPane.showMessageDialog(null, "Usuário não disponivel!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma empresa para  poder prosseguir!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Preecha os campos para poder  prosseguir!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            /*CARREGA COMBOBOX Empresa de Gerencia
            Usuario est = new Usuario();
          Vector listaEmpresa = est.carregarComboEmpresaGerencia();
            cbxEmpresa.removeAllItems();
            cbxEmpresa.addItem("");
            for (int i = 0; i < listaEmpresa.size(); i++) {
                cbxEmpresa.addItem(listaEmpresa.elementAt(i));
            }*/
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            preenche_jtable();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroUsuario().setVisible(true);
            }
        });
    }

    private void getPermissoes(String access) {
        String[] data = access.split(",");
        cbxCadastroCliente.setSelected(Boolean.parseBoolean(data[0]));
        cbxAtualizarExcluirCliente.setSelected(Boolean.parseBoolean(data[1]));
        cbxCadastroEmpresa.setSelected(Boolean.parseBoolean(data[2]));
        cbxAtualizarExcluirEmpresa.setSelected(Boolean.parseBoolean(data[3]));
        cbxRelatorio.setSelected(Boolean.parseBoolean(data[4]));
        cbxSelecionarTodos.setSelected(Boolean.parseBoolean(data[5]));
    }

    private String setPermissoes() {
        List<Boolean> acesso = new ArrayList<>();
        acesso.add(0, cbxCadastroCliente.isSelected());
        acesso.add(1, cbxAtualizarExcluirCliente.isSelected());
        acesso.add(2, cbxCadastroEmpresa.isSelected());
        acesso.add(3, cbxAtualizarExcluirEmpresa.isSelected());
        acesso.add(4, cbxRelatorio.isSelected());
        acesso.add(5, cbxSelecionarTodos.isSelected());

        String acesso2 = new String();
        for (short i = 0; i < acesso.size(); i++) {
            if (i == 0) {
                acesso2 = String.valueOf(acesso.get(i));
            } else {
                acesso2 = acesso2 + "," + String.valueOf(acesso.get(i));
            }
        }
        return acesso2;
    }

    ////////////////
    private void selecionarTodosCheck() {
        cbxCadastroCliente.setSelected(true);
        cbxAtualizarExcluirCliente.setSelected(true);
        cbxCadastroEmpresa.setSelected(true);
        cbxAtualizarExcluirEmpresa.setSelected(true);
        cbxRelatorio.setSelected(true);
    }

    private void desselecionarTodosCheck() {
        cbxCadastroCliente.setSelected(false);
        cbxAtualizarExcluirCliente.setSelected(false);
        cbxCadastroEmpresa.setSelected(false);
        cbxAtualizarExcluirEmpresa.setSelected(false);
        cbxRelatorio.setSelected(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbxAtualizarExcluirCliente;
    private javax.swing.JCheckBox cbxAtualizarExcluirEmpresa;
    private javax.swing.JCheckBox cbxCadastroCliente;
    private javax.swing.JCheckBox cbxCadastroEmpresa;
    private javax.swing.JComboBox cbxEmpresa;
    private javax.swing.JCheckBox cbxRelatorio;
    private javax.swing.JCheckBox cbxSelecionarTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdoListarTodos;
    private javax.swing.JRadioButton rdoLogin;
    private javax.swing.JRadioButton rdoNome;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException, Exception {
        TableDAO dao = new TableDAO();
        Usuario user = new Usuario();

        DefaultTableModel modelo = (DefaultTableModel) tblUsuario.getModel();
        modelo.setNumRows(0);

        String pes = txtPesquisa.getText().toUpperCase();


        if (rdoListarTodos.isSelected() && pes.equals("")) {
            try {
                ResultSet resultado = dao.consultaTable("SELECT * FROM usuario ORDER BY nome ASC");
                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                {
                    modelo.addRow(new Object[]{resultado.getInt("id"),
                                resultado.getString("nome"),
                                resultado.getString("usuario")});
                }
                resultado.first();
            } catch (SQLException erro) {
                throw new RuntimeException(erro);
            }

        } else if (rdoLogin.isSelected() && pes.equals(pes)) {
            user.setUsuario(pes);

            boolean validar = user.verificaUser();

            if (validar == true) {
                JOptionPane.showMessageDialog(null, "Login não disponível.");
                try {
                    ResultSet resultado = dao.consultaTable("SELECT * FROM usuario WHERE usuario ='" + pes + "'"
                            + "ORDER BY nome ASC");
                    while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                    {
                        modelo.addRow(new Object[]{resultado.getInt("id"),
                                    resultado.getString("nome"),
                                    resultado.getString("usuario")});
                    }
                    resultado.first();
                } catch (SQLException erro) {
                    throw new RuntimeException(erro);
                }
            } else {
                Object[] options = {"Sim", "Não"};
                Object opc = JOptionPane.showOptionDialog(null, "Login disponível, deseja salvar ? ", "Hexa",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                        options, options[0]);

                if (opc.toString().equals("0")) {
                    txtLogin.setText(pes);
                    // desbloquearCampos();

                }
            }
        }
        if (rdoNome.isSelected() && pes.equals(pes)) {
            try {
                ResultSet resultado = dao.consultaTable("SELECT * FROM usuario where nome LiKE '%" + pes + "%'"
                        + "ORDER BY nome ASC");
                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                {
                    modelo.addRow(new Object[]{resultado.getInt("id"),
                                resultado.getString("nome"),
                                resultado.getString("usuario")});
                }
                resultado.first();
            } catch (SQLException erro) {
                throw new RuntimeException(erro);
            }
        }

    }
}
