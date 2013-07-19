/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_EntidadeEmpresa_DAO;

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
@Table(name = "empresa_gerencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpresaGerencia.findAll", query = "SELECT e FROM EmpresaGerencia e"),
    @NamedQuery(name = "EmpresaGerencia.findById", query = "SELECT e FROM EmpresaGerencia e WHERE e.id = :id"),
    @NamedQuery(name = "EmpresaGerencia.findByNome", query = "SELECT e FROM EmpresaGerencia e WHERE e.nome_emp = :nome_emp"),
    @NamedQuery(name = "EmpresaGerencia.findByContato", query = "SELECT e FROM EmpresaGerencia e WHERE e.contato = :contato"),
    @NamedQuery(name = "EmpresaGerencia.findByRazaoSocial", query = "SELECT e FROM EmpresaGerencia e WHERE e.razaoSocial = :razaoSocial"),
    @NamedQuery(name = "EmpresaGerencia.findByCnpj", query = "SELECT e FROM EmpresaGerencia e WHERE e.cnpj = :cnpj")})
public class EmpresaGerencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome_emp")
    private String nome;
    @Basic(optional = false)
    @Column(name = "contato")
    private String contato;
    @Basic(optional = false)
    @Column(name = "razao_social")
    private String razaoSocial;
    @Basic(optional = false)
    @Column(name = "cnpj")
    private String cnpj;

    public EmpresaGerencia() {
    }

    public EmpresaGerencia(Integer id) {
        this.id = id;
    }

    public EmpresaGerencia(Integer id, String nome, String contato, String razaoSocial, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        if (!(object instanceof EmpresaGerencia)) {
            return false;
        }
        EmpresaGerencia other = (EmpresaGerencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkt_EntidadeEmpresa_DAO.EmpresaGerencia[ id=" + id + " ]";
    }
    
}
