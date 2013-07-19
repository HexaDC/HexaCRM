/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_Login;

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
public class Usuario {

    private Integer id;
    private String nome;
    private String usuario;
    private String telefone;
    private String senha;
    private String acesso;
    private int tipo;
    private int empresa_gerencia_id;
    private String nome_empresa;
    private Connection connection;
    //////////
    private static String INSERIR_USER = "insert into usuario (nome, usuario, telefone, senha, acesso, tipo, empresa_gerencia_id)"
            + "values (?, ?, ?, ?, ?, ?, ?)";
    private static String CARREGAR_COMBO = "select nome from empresa_gerencia";
    private static String SELECIONAR_ID_EMPRESA = "select id from empresa_gerencia where nome =  '";
    private static String SELECIONAR_EMPRESA = "select nome from empresa_gerencia where id = '";
    private static String VERIFICAR_USUARIO = "select usuario from usuario where usuario = '";
    private static String SELECIONAR_USUARIO = "select * from usuario where id = '";

    public Usuario() {
        try {
            this.connection = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public void adicionarUsuario() throws SQLException {
        PreparedStatement sql = (PreparedStatement) ((java.sql.Connection) this.connection).prepareStatement(INSERIR_USER);

        sql.setString(1, addSlashes(this.getNome()));
        sql.setString(2, addSlashes(this.getUsuario()));
        sql.setString(3, addSlashes(this.getTelefone()));
        sql.setString(4, "VKyerThrB56546546HP4Mhhz");
        sql.setString(5, addSlashes(this.getAcesso().toString()));
        sql.setInt(6, this.getTipo());
        sql.setInt(7, this.getEmpresa_gerencia_id());

        sql.execute();
        sql.close();
    }

    public Usuario pesquisaUsuarioPorId() throws SQLException {
        PreparedStatement sql = this.connection.prepareStatement(SELECIONAR_USUARIO + this.getId() + "';");
        ResultSet rs = sql.executeQuery();
        rs.next();
        Usuario user = new Usuario();
        user.setId(rs.getInt("id"));
        user.setNome(rs.getString("nome"));
        user.setUsuario(rs.getString("usuario"));
        user.setTelefone(rs.getString("telefone"));
        user.setSenha(rs.getString("senha"));
        user.setAcesso(rs.getString("acesso"));
        user.setTipo(rs.getInt("tipo"));
        user.setEmpresa_gerencia_id(rs.getInt("empresa_gerencia_id"));
        rs.close();
        sql.close();
        return user;
    }

    public boolean verificaUser() throws Exception {
        PreparedStatement sql = (PreparedStatement) ((java.sql.Connection) this.connection).prepareStatement(VERIFICAR_USUARIO + this.getUsuario() + "';");
        ResultSet rs = sql.executeQuery();
        boolean res = false;
        if (rs.next()) {
            if (rs.getString("usuario").equals(this.getUsuario())) {
                res = true;
            }
        }
        rs.close();
        sql.close();
        return res;
    }

    private String addSlashes(String text) {
        text = text.replaceAll("\"", "\\\"");
        text = text.replaceAll("\'", "\\\'");
        return text;
    }

   
}
