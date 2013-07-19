/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_FormEmpresa;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import pkt_Util.EmpresaListagem;
import pkt_Util.ReportDAO;
import pkt_Util.TableDAO;

/**
 *
 * @author Jenny
 */
public class FormGerarRelatorio extends javax.swing.JDialog {

    private int largura = 755;
    private int altura = 390;

    public FormGerarRelatorio(java.awt.Frame FormCadastrarClient, boolean modal) {
        super(FormCadastrarClient, true);
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
    }

    public FormGerarRelatorio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnGerar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        cbxEmpresa = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("Selecione a Empresa de Gerancia:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Gerar Relatório");

        btnGerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkt_Icon/doc_pdf.png"))); // NOI18N
        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

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
        tblCliente.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCliente);
        tblCliente.getColumnModel().getColumn(0).setMinWidth(0);
        tblCliente.getColumnModel().getColumn(0).setPreferredWidth(0);
        tblCliente.getColumnModel().getColumn(0).setMaxWidth(0);
        tblCliente.getColumnModel().getColumn(1).setResizable(false);

        cbxEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGerar)))
                .addContainerGap())
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
                    .addComponent(jLabel2)
                    .addComponent(cbxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        try {

            EmpresaListagem emp = new EmpresaListagem();
            ReportDAO dao = new ReportDAO();

            emp.setNome_empresa(cbxEmpresa.getSelectedItem().toString());
            int id_empresa_gerencia = emp.selecionarIdEmpresaGerencia();

            String parametro = String.valueOf(id_empresa_gerencia);
            System.out.println(parametro);

            dao.setParametro(parametro);

            dao.relatorioListaEmpresa();


        } catch (IOException ex) {
            Logger.getLogger(FormGerarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormGerarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGerarActionPerformed

    private void cbxEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEmpresaActionPerformed
        try {
            preenche_jtable();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_cbxEmpresaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // CARREGA COMBOBOX Empresa de Gerencia
            EmpresaListagem emp = new EmpresaListagem();
            Vector listaEmpresa = emp.carregarComboEmpresaGerencia();
            cbxEmpresa.removeAllItems();
            cbxEmpresa.addItem("");
            for (int i = 0; i < listaEmpresa.size(); i++) {
                cbxEmpresa.addItem(listaEmpresa.elementAt(i));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormGerarRelatorio dialog = new FormGerarRelatorio(new javax.swing.JFrame(), true);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerar;
    private javax.swing.JComboBox cbxEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables

    public void preenche_jtable() throws SQLException {
        TableDAO dao = new TableDAO();
        EmpresaListagem emp = new EmpresaListagem();

        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        modelo.setNumRows(0);

        emp.setNome_empresa(cbxEmpresa.getSelectedItem().toString());
        int id_empresa_gerencia = emp.selecionarIdEmpresaGerencia();

        try {
            ResultSet resultado = dao.consultaTable("SELECT id, nome FROM cliente WHERE empresa_gerencia_id ='"
                    + id_empresa_gerencia + "';");
            while (resultado.next()) //Aqui você adiciona os campos do banco de dados no jTable.
            {
                modelo.addRow(new Object[]{resultado.getInt("id"),
                            resultado.getString("nome")});
            }
            resultado.first();
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
