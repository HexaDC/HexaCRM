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

/**
 *
 * @author Jenny
 */
public class EmpresaListagem {

    private Connection connection;
    private Integer id;
    private int empresa_gerencia_id;
    private String nome_empresa;
    //Query's
    private static String CARREGAR_COMBO = "select nome_emp from empresa_gerencia";
    private static String SELECIONAR_ID_EMPRESA = "select id from empresa_gerencia where nome_emp =  '";
    private static String SELECIONAR_EMPRESA = "select nome_emp from empresa_gerencia where id = '";

    public EmpresaListagem() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //PREENCHE COMBOBOX Empresa Gerencia
    public Vector carregarComboEmpresaGerencia() throws SQLException {
        Vector s = new Vector();
        try {
            PreparedStatement sql = this.connection.prepareStatement(CARREGAR_COMBO);
            ResultSet res = sql.executeQuery();
            if (res != null && res.next()) {
                do {
                    s.addElement(res.getString("nome_emp"));
                } while (res.next());
            }
            //fecha statement
            sql.close();
        } catch (SQLException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        return s;
    }

    //PESQUISA ID Da Empresa
    public int selecionarIdEmpresaGerencia() throws SQLException {
        int id;
        PreparedStatement sql = this.connection.prepareStatement(SELECIONAR_ID_EMPRESA + this.getNome_empresa() + "';");
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

    //PESQUISA A EMPRESA DE GERENCIA ATRAVES DO ID
    public String selecionarNomeEmpresaGerencia() throws SQLException {
        String empresa = "";
        PreparedStatement sql = this.connection.prepareStatement(SELECIONAR_EMPRESA + this.getEmpresa_gerencia_id() + "';");
        ResultSet rs = sql.executeQuery();
        if (rs.next()) {
            empresa = rs.getString("nome_emp");
        } else {
            id = 0;
        }
        //fecha recordset
        rs.close();
        //fecha statement
        sql.close();
        return empresa;
    }

    public int getEmpresa_gerencia_id() {
        return empresa_gerencia_id;
    }

    public void setEmpresa_gerencia_id(int empresa_gerencia_id) {
        this.empresa_gerencia_id = empresa_gerencia_id;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
