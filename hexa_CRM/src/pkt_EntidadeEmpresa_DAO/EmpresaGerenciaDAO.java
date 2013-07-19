/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_EntidadeEmpresa_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import pkt_EntidadeClient_DAO.Cliente;
import pkt_Util.ConnectionFactory;

/**
 *
 * @author Jenny
 */
public class EmpresaGerenciaDAO {

    private Connection conn;

    public EmpresaGerenciaDAO() {
        try {
            this.conn = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static String INSERIR_EMPRESA = "insert into empresa_gerencia (nome_emp, contato, razao_social, cnpj)"
            + "values (?, ?, ?, ?)";
    private static String SELECIONAR_EMPRESA = "select * from empresa_gerencia where id = '";
    private static String EDITAR_EMPRESA = "update empresa_gerencia set nome_emp = ?, contato = ?, razao_social = ?, cnpj = ?"
            + "where id = '";
    private static String EXCLUIR_EMPRESA = "delete from empresa_gerencia where id = '";
    private static String VALIDAR = "select nome_emp from empresa_gerencia where nome  = '";
    
    
    
    
     public void inserirEmpresa(EmpresaGerencia emp) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = conn.prepareStatement(INSERIR_EMPRESA);

            stmt.setString(1, emp.getNome());
            stmt.setString(2, emp.getContato());
            stmt.setString(3, emp.getRazaoSocial());
            stmt.setString(4, emp.getCnpj());
            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }
    }
     
      public List<EmpresaGerencia> getListaDadosEmpresa(EmpresaGerencia emp) throws SQLException {

        PreparedStatement sql = this.conn.prepareStatement(SELECIONAR_EMPRESA + emp.getId() + "';");
        ResultSet rs = sql.executeQuery();

        List<EmpresaGerencia> lista = new ArrayList<EmpresaGerencia>();
        try {

            while (rs.next()) {

                emp.setId(rs.getInt("id"));
                emp.setNome(rs.getString("nome_emp"));
                emp.setContato(rs.getString("contato"));
                emp.setRazaoSocial(rs.getString("razao_social"));
                emp.setCnpj(rs.getString("cnpj"));
                
                lista.add(emp);
            }

            rs.close();
            sql.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar conteúdo: " + e.getStackTrace());
        } catch (Exception e) {
            throw new RuntimeException("Erro: " + e.getLocalizedMessage());
        }
        return lista;
    }
      
       public void editarEmpresa(EmpresaGerencia emp) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = conn.prepareStatement(EDITAR_EMPRESA + emp.getId() + "';");

            stmt.setString(1, emp.getNome());
            stmt.setString(2, emp.getContato());
            stmt.setString(3, emp.getRazaoSocial());
            stmt.setString(4, emp.getCnpj());

            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A edição não pode ser efetuada!" + e.getLocalizedMessage());
        }
    }

    public void excluirEmpresa(EmpresaGerencia emp) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = conn.prepareStatement(EXCLUIR_EMPRESA + emp.getId() + "';");

            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o registro selecionado!" + e.getLocalizedMessage());
        }
    }

    public boolean validarEmpresa(EmpresaGerencia emp) {
        boolean verifica = false;
        try {

            PreparedStatement sql = this.conn.prepareStatement(VALIDAR + emp.getNome() + " or cnpj = '" + emp.getCnpj() + "';");
            ResultSet rs = sql.executeQuery();

            if (rs != null && rs.next()) {
                verifica = true;
            } else {
                verifica = false;
            }
        } catch (java.sql.SQLException e) {
            System.err.println("Erro de SQL: " + e.getMessage());
        }
        return verifica;
    }
}
