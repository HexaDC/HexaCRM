/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Jenny
 */
public class TableDAO {

    Statement stmt;
    private Connection connection;

    public TableDAO() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            System.err.println("Erro: " + e.getLocalizedMessage());
        }
    }
    
    public ResultSet consultaTable(String ConsultaSQL) throws SQLException {
        ResultSet resultado = null;
        try {
            if (connection != null) {
                if (stmt != null) {
                    stmt.close();
                }
                stmt = (Statement) connection.createStatement();
                resultado = stmt.executeQuery(ConsultaSQL);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Não foi possível atender a solicitação");
        }
        return resultado;
    }
}
