/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_FormEmpresa;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import pkt_EntidadeClient_DAO.Cliente;
import pkt_EntidadeClient_DAO.ClienteDAO;
import pkt_EntidadeEmpresa_DAO.EmpresaGerencia;
import pkt_EntidadeEmpresa_DAO.EmpresaGerenciaDAO;
import pkt_Util.TableDAO;

/**
 *
 * @author Jenny
 */
public class FormCadastrarEmpresa extends javax.swing.JDialog {

    private int largura = 1040;
    private int altura = 500;

    public FormCadastrarEmpresa(java.awt.Frame FormCadastrarClient, boolean modal) {
        super(FormCadastrarClient, true);
        initComponents();
        txtId.setVisible(false);

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        rdoNomeEmpresa = new javax.swing.JRadioButton();
        rdoCnpj = new javax.swing.JRadioButton();
        rdoListarTodos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpresa = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtContato = new javax.swing.JTextField();
        javax.swing.text.MaskFormatter maskCnpj = null;
        try {
            maskCnpj = new javax.swing.text.MaskFormatter("##.###.###/####-##");
            maskCnpj.setPlaceholderCharacter('_');}
        catch (java.text.ParseException exc) {}
        txtCnpj = new javax.swing.JFormattedTextField(maskCnpj);
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Empresa");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Pesquisar por:");

        buttonGroup1.add(rdoNomeEmpresa);
        rdoNomeEmpresa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rdoNomeEmpresa.setText("Nome da Empresa");

        buttonGroup1.add(rdoCnpj);
        rdoCnpj.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rdoCnpj.setText("CNPJ");

        buttonGroup1.add(rdoListarTodos);
        rdoListarTodos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rdoListarTodos.setText("Listar Todos");

        tblEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Empresa", "CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmpresa.getTableHeader().setReorderingAllowed(false);
        tblEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpresaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpresa);
        tblEmpresa.getColumnModel().getColumn(0).setMinWidth(0);
        tblEmpresa.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblEmpresa.getColumnModel().getColumn(0).setMaxWidth(0);
        tblEmpresa.getColumnModel().getColumn(1).setResizable(false);
        tblEmpresa.getColumnModel().getColumn(1).setPreferredWidth(500);
        tblEmpresa.getColumnModel().getColumn(2).setPreferredWidth(60);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/procurar2.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Nome Fantasia:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Razão Social:");

        txtId.setEnabled(false);
        txtId.setFocusable(false);

        txtCnpj.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("CNPJ:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Contato:");

        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/concluir.png"))); // NOI18N
        btnCadastrar.setText("Concluir");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/arrow_refresh.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setEnabled(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/delete1.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/novo2.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdoNomeEmpresa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoCnpj)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdoListarTodos)))
                                .addGap(0, 642, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(txtPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtRazaoSocial)
                                                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 410, Short.MAX_VALUE))
                                    .addComponent(txtNome))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 612, Short.MAX_VALUE)
                                .addComponent(btnAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNomeEmpresa)
                    .addComponent(jLabel2)
                    .addComponent(rdoCnpj)
                    .addComponent(rdoListarTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpresaMouseClicked
        EmpresaGerencia emp = new EmpresaGerencia();
        EmpresaGerenciaDAO dao = new EmpresaGerenciaDAO();

        try {

            emp.setId(Integer.valueOf(tblEmpresa.getValueAt(tblEmpresa.getSelectedRow(), 0).toString()));
            java.util.List<EmpresaGerencia> lista = dao.getListaDadosEmpresa(emp);

            for (EmpresaGerencia cursor : lista) {

                txtId.setText(String.valueOf(cursor.getId()));
                txtNome.setText(cursor.getNome());
                txtContato.setText(cursor.getContato());
                txtRazaoSocial.setText(cursor.getRazaoSocial());
                txtCnpj.setText(cursor.getCnpj());

            }
            btnAtualizar.setEnabled(true);
            btnExcluir.setEnabled(true);
            btnCadastrar.setEnabled(false);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_tblEmpresaMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            preenche_jtable();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        EmpresaGerencia emp = new EmpresaGerencia();
        EmpresaGerenciaDAO dao = new EmpresaGerenciaDAO();

        try {

            emp.setNome(txtNome.getText().toUpperCase());
            emp.setContato(txtContato.getText().toUpperCase());
            emp.setRazaoSocial(txtRazaoSocial.getText().toUpperCase());
            emp.setCnpj(txtCnpj.getText().toUpperCase());

            dao.inserirEmpresa(emp);
            limparCampos();
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        EmpresaGerencia emp = new EmpresaGerencia();
        EmpresaGerenciaDAO dao = new EmpresaGerenciaDAO();

        try {

            emp.setId(Integer.valueOf(txtId.getText()));
            emp.setNome(txtNome.getText().toUpperCase());
            emp.setContato(txtContato.getText());
            emp.setRazaoSocial(txtRazaoSocial.getText());
            emp.setCnpj(txtCnpj.getText().toUpperCase());

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
            btnCadastrar.setEnabled(true);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        EmpresaGerencia emp = new EmpresaGerencia();
        EmpresaGerenciaDAO dao = new EmpresaGerenciaDAO();

        try {

            emp.setId(Integer.valueOf(txtId.getText()));

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
            btnCadastrar.setEnabled(true);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
        bloquearCampos();
        txtPesquisa.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCadastrarEmpresa dialog = new FormCadastrarEmpresa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    void limparCampos() {
        txtPesquisa.setText("");
        txtNome.setText("");
        txtContato.setText("");
        txtCnpj.setText("");
        txtRazaoSocial.setText("");
        txtId.setText("");
        DefaultTableModel tableModel = (DefaultTableModel) tblEmpresa.getModel();
        tableModel.setNumRows(0);

    }

    void desbloquearCampos() {
        txtNome.setFocusable(true);
        txtContato.setFocusable(true);
        txtRazaoSocial.setFocusable(true);
        txtCnpj.setFocusable(true);
    }

    void bloquearCampos() {
        txtNome.setFocusable(false);
        txtContato.setFocusable(false);
        txtRazaoSocial.setFocusable(false);
        txtCnpj.setFocusable(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton rdoCnpj;
    private javax.swing.JRadioButton rdoListarTodos;
    private javax.swing.JRadioButton rdoNomeEmpresa;
    private javax.swing.JTable tblEmpresa;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtRazaoSocial;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {
        TableDAO dao = new TableDAO();
        ClienteDAO dao2 = new ClienteDAO();
        Cliente emp = new Cliente();

        DefaultTableModel modelo = (DefaultTableModel) tblEmpresa.getModel();
        modelo.setNumRows(0);

        String pes = txtPesquisa.getText().toUpperCase();


        if (rdoListarTodos.isSelected()) {
            try {
                ResultSet resultado = dao.consultaTable("SELECT * FROM empresa_gerencia ORDER BY nome_emp ASC");
                while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                {
                    modelo.addRow(new Object[]{resultado.getInt("id"),
                                resultado.getString("nome_emp"),
                                resultado.getString("cnpj")});
                }
                resultado.first();
            } catch (SQLException erro) {
                throw new RuntimeException(erro);
            }

        } else if (rdoNomeEmpresa.isSelected()) {
            String pesquisa = pes;
            if ("".equals(pesquisa)) {
                JOptionPane.showMessageDialog(null, "O campo de pesquisa não pode ser NULO!");
            } else {
                emp.setNome(pesquisa.toUpperCase());

                boolean validar = dao2.validarEmpresa(emp);
                if (validar == true) {
                    JOptionPane.showMessageDialog(null, "Essa Empresa já consta no sistema!");

                    try {
                        ResultSet resultado = dao.consultaTable("SELECT * FROM empresa_gerencia WHERE nome_emp LIKE '%" + emp.getNome() + "%'"
                                + "ORDER BY nome_emp ASC");
                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                        {
                            modelo.addRow(new Object[]{resultado.getInt("id"),
                                        resultado.getString("nome_emp"),
                                        resultado.getString("cnpj")});
                        }
                        resultado.first();
                    } catch (SQLException erro) {
                        throw new RuntimeException(erro);
                    }
                } else {
                    Object[] options = {"Sim", "Não"};
                    Object opc = JOptionPane.showOptionDialog(null, "Empresa não consta no sistema, deseja salvar o contato ? ", "Hexa",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                            options, options[0]);

                    if (opc.toString().equals("0")) {
                        txtNome.setText(pes);
                        desbloquearCampos();

                    }
                }
            }
        } else if (rdoCnpj.isSelected()) {
            String pesquisa = pes;
            if ("".equals(pesquisa)) {
                JOptionPane.showMessageDialog(null, "O campo de pesquisa não pode ser NULO!");
            } else {
                emp.setNome(pesquisa);

                boolean validar = dao2.validarEmpresa(emp);
                if (validar == true) {
                    JOptionPane.showMessageDialog(null, "Essa Empresa já consta no sistema!");

                    try {
                        ResultSet resultado = dao.consultaTable("SELECT * FROM empresa_gerencia WHERE cnpj LIKE '%" + pes + "%'"
                                + "ORDER BY nome_emp ASC");
                        while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
                        {
                            modelo.addRow(new Object[]{resultado.getInt("id"),
                                        resultado.getString("nome_emp"),
                                        resultado.getString("cnpj")});
                        }
                        resultado.first();
                    } catch (SQLException erro) {
                        throw new RuntimeException(erro);
                    }
                } else {
                    Object[] options = {"Sim", "Não"};
                    Object opc = JOptionPane.showOptionDialog(null, "Empresa não consta no sistema, deseja salvar o contato ? ", "Hexa",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                            options, options[0]);

                    if (opc.toString().equals("0")) {
                        txtNome.setText(pes);
                        desbloquearCampos();

                    }
                }
            }
        }

    }
}
