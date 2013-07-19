/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import pkt_Util.ConnectionFactory;

/**
 *
 * @author Jenny
 */
public class Estado {

    private Integer id;
    private String estado;
    private Connection connection;
    private static String CARREGAR_COMBO = "select estado from estado";
    private static String SELECIONAR_ID = "select id from estado where estado = '";
    private static String SELECIONAR_ESTADO = "select estado from estado where id = '";

    public Estado() {
        try {
            connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public Estado(Integer id) {
        this.id = id;
    }

    public Estado(Integer id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //PREENCHE COMBOBOX EStado
    public Vector carregarComboEstado() throws SQLException {
        Vector s = new Vector();
        try {
            PreparedStatement sql = this.connection.prepareStatement(CARREGAR_COMBO);
            ResultSet res = sql.executeQuery();
            if (res != null && res.next()) {
                do {
                    s.addElement(res.getString("estado"));
                } while (res.next());
            }
            //fecha statement
            sql.close();
        } catch (SQLException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        return s;
    }

    //PESQUISA ID DO ESTADO
    public int selecionarIdEstado() throws SQLException {
        int id;
        PreparedStatement sql = this.connection.prepareStatement(SELECIONAR_ID + this.getEstado() + "';");
        ResultSet rs = sql.executeQuery();
        if (rs.next()) {
            id = rs.getInt("id");
        } else {
            id = 0;
        }
        //fecha recordset
        rs.close();
        //fecha statement
        sql.close();
        return id;
    }

    //PESQUISA ESTADO ATRAVES DO ID
    public String selecionarNomeEstado() throws SQLException {
        String estado = "";
        PreparedStatement sql = this.connection.prepareStatement(SELECIONAR_ESTADO + this.getId() + "';");
        ResultSet rs = sql.executeQuery();
        if (rs.next()) {
            estado = rs.getString("estado");
        } else {
            id = 0;
        }
        //fecha recordset
        rs.close();
        //fecha statement
        sql.close();
        return estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkt_EntidadeClient_DAO.Estado[ id=" + id + " ]";
    }
}
