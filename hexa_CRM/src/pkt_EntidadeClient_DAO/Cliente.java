/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_EntidadeClient_DAO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jenny
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findById", query = "SELECT c FROM Cliente c WHERE c.id = :id"),
    @NamedQuery(name = "Cliente.findBySite", query = "SELECT c FROM Cliente c WHERE c.site = :site"),
    @NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email"),
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByTelComercial01", query = "SELECT c FROM Cliente c WHERE c.telComercial01 = :telComercial01"),
    @NamedQuery(name = "Cliente.findByTelComercial", query = "SELECT c FROM Cliente c WHERE c.telComercial = :telComercial"),
    @NamedQuery(name = "Cliente.findByContato", query = "SELECT c FROM Cliente c WHERE c.contato = :contato"),
    @NamedQuery(name = "Cliente.findByEndereco", query = "SELECT c FROM Cliente c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Cliente.findByNumero", query = "SELECT c FROM Cliente c WHERE c.numero = :numero"),
    @NamedQuery(name = "Cliente.findByBairro", query = "SELECT c FROM Cliente c WHERE c.bairro = :bairro"),
    @NamedQuery(name = "Cliente.findByCidade", query = "SELECT c FROM Cliente c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Cliente.findByCep", query = "SELECT c FROM Cliente c WHERE c.cep = :cep"),
    @NamedQuery(name = "Cliente.findByEstadoId", query = "SELECT c FROM Cliente c WHERE c.estadoId = :estadoId"),
    @NamedQuery(name = "Cliente.findByCliente", query = "SELECT c FROM Cliente c WHERE c.cliente = :cliente")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "site")
    private String site;
    @Column(name = "email")
    private String email;
    @Column(name = "nome")
    private String nome;
    @Column(name = "tel_comercial_01")
    private String telComercial01;
    @Column(name = "tel_comercial")
    private String telComercial;
    @Column(name = "contato")
    private String contato;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "numero")
    private String numero;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "cep")
    private String cep;
    @Column(name = "estado_id")
    private Integer estadoId;
    @Column(name = "cliente")
    private String cliente;
    private int empresa_gerencia_id;

    public Cliente() {
    }

    public Cliente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelComercial01() {
        return telComercial01;
    }

    public void setTelComercial01(String telComercial01) {
        this.telComercial01 = telComercial01;
    }

    public String getTelComercial02() {
        return telComercial;
    }

    public void setTelComercial02(String telComercial) {
        this.telComercial = telComercial;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Integer estadoId) {
        this.estadoId = estadoId;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkt_Entidade_DAO.Cliente[ id=" + id + " ]";
    }

    public int getEmpresa_gerencia_id() {
        return empresa_gerencia_id;
    }

    public void setEmpresa_gerencia_id(int empresa_gerencia_id) {
        this.empresa_gerencia_id = empresa_gerencia_id;
    }
    
}
