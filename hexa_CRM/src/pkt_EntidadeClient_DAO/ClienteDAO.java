/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_EntidadeClient_DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import pkt_Util.ConnectionFactory;

/**
 *
 * @author Jenny
 */
public class ClienteDAO {

    private Connection connection;

    public ClienteDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            System.err.println("Erro: " + e.getLocalizedMessage());
        }
    }
    private static String INSERIR = "insert into cliente (nome, tel_comercial_01, tel_comercial_02, contato, "
            + "endereco, numero, bairro, cep, cidade, estado_id, site, email, empresa_gerencia_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static String SELECIONAR = "select * from cliente where id = '";
    private static String VALIDAR = "select nome from cliente where nome  = '";
    private static String EDITAR = "update cliente set nome = ?, tel_comercial_01 = ?, tel_comercial_02 = ?,"
            + "contato = ?, endereco = ?, numero = ?, bairro = ?, cep = ?, cidade = ?, estado_id = ?, site = ?, email = ?"
            + "where id ='";
    private static String EXCLUIR = "delete from cliente where id = '";
   

    public void inserirCliente(Cliente emp) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(INSERIR);

            stmt.setString(1, emp.getNome());
            stmt.setString(2, emp.getTelComercial01());
            stmt.setString(3, emp.getTelComercial02());
            stmt.setString(4, emp.getContato());
            stmt.setString(5, emp.getEndereco());
            stmt.setString(6, emp.getNumero());
            stmt.setString(7, emp.getBairro());
            stmt.setString(8, emp.getCep());
            stmt.setString(9, emp.getCidade());
            stmt.setInt(10, emp.getEstadoId());
            stmt.setString(11, emp.getSite());
            stmt.setString(12, emp.getEmail());
            stmt.setInt(13, emp.getEmpresa_gerencia_id());

            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O cadastro não pode ser efetuado!" + e.getLocalizedMessage());
        }
    }

    public List<Cliente> getListaDadosCliente(Cliente emp) throws SQLException {

        PreparedStatement sql = this.connection.prepareStatement(SELECIONAR + emp.getId() + "';");
        ResultSet rs = sql.executeQuery();

        List<Cliente> lista = new ArrayList<Cliente>();
        try {

            while (rs.next()) {

                emp.setId(rs.getInt("id"));
                emp.setNome(rs.getString("nome"));
                emp.setTelComercial01(rs.getString("tel_comercial_01"));
                emp.setTelComercial02(rs.getString("tel_comercial_02"));
                emp.setContato(rs.getString("contato"));
                emp.setEndereco(rs.getString("endereco"));
                emp.setNumero(rs.getString("numero"));
                emp.setBairro(rs.getString("bairro"));
                emp.setCep(rs.getString("cep"));
                emp.setCidade(rs.getString("cidade"));
                emp.setEstadoId(rs.getInt("estado_id"));
                emp.setSite(rs.getString("site"));
                emp.setEmail(rs.getString("email"));
                emp.setEmpresa_gerencia_id(rs.getInt("empresa_gerencia_id"));

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

    public void editarEmpresa(Cliente emp) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(EDITAR + emp.getId() + "';");

            stmt.setString(1, emp.getNome());
            stmt.setString(2, emp.getTelComercial01());
            stmt.setString(3, emp.getTelComercial02());
            stmt.setString(4, emp.getContato());
            stmt.setString(5, emp.getEndereco());
            stmt.setString(6, emp.getNumero());
            stmt.setString(7, emp.getBairro());
            stmt.setString(8, emp.getCep());
            stmt.setString(9, emp.getCidade());
            stmt.setInt(10, emp.getEstadoId());
            stmt.setString(11, emp.getSite());
            stmt.setString(12, emp.getEmail());

            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "A edição não pode ser efetuada!" + e.getLocalizedMessage());
        }
    }

    public void excluirEmpresa(Cliente emp) {
        try {

            //PreparedStatement para a inserção
            PreparedStatement stmt = connection.prepareStatement(EXCLUIR + emp.getId() + "';");

            //Executa
            stmt.execute();
            stmt.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o registro selecionado!" + e.getLocalizedMessage());
        }
    }
    
    

    public boolean validarEmpresa(Cliente emp) {
        boolean verifica = false;

        try {

            PreparedStatement sql = this.connection.prepareStatement(VALIDAR + emp.getNome() + "';");
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
