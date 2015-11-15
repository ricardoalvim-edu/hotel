/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GILIARD
 */
@Entity
@Table(name = "funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByIdfuncionario", query = "SELECT f FROM Funcionario f WHERE f.idfuncionario = :idfuncionario"),
    @NamedQuery(name = "Funcionario.findByNomefuncionario", query = "SELECT f FROM Funcionario f WHERE f.nomefuncionario = :nomefuncionario"),
    @NamedQuery(name = "Funcionario.findByDatanascimento", query = "SELECT f FROM Funcionario f WHERE f.datanascimento = :datanascimento"),
    @NamedQuery(name = "Funcionario.findByDocumentoidentificacao", query = "SELECT f FROM Funcionario f WHERE f.documentoidentificacao = :documentoidentificacao"),
    @NamedQuery(name = "Funcionario.findByIdendereco", query = "SELECT f FROM Funcionario f WHERE f.idendereco = :idendereco")})
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfuncionario")
    private Integer idfuncionario;
    @Column(name = "nomefuncionario")
    private String nomefuncionario;
    @Column(name = "datanascimento")
    @Temporal(TemporalType.DATE)
    private Date datanascimento;
    @Column(name = "documentoidentificacao")
    private String documentoidentificacao;
    @Column(name = "idendereco")
    private Integer idendereco;
    @JoinTable(name = "funcionario_tem_telefone", joinColumns = {
        @JoinColumn(name = "idfuncionario", referencedColumnName = "idfuncionario")}, inverseJoinColumns = {
        @JoinColumn(name = "idtelefone", referencedColumnName = "idtelefone")})
    @ManyToMany
    private Collection<Telefone> telefoneCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfuncionario")
    private Collection<CadastroEntrada> cadastroEntradaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfuncionario")
    private Collection<ConsumoHospede> consumoHospedeCollection;

    public Funcionario() {
    }

    public Funcionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public Integer getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(String nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getDocumentoidentificacao() {
        return documentoidentificacao;
    }

    public void setDocumentoidentificacao(String documentoidentificacao) {
        this.documentoidentificacao = documentoidentificacao;
    }

    public Integer getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Integer idendereco) {
        this.idendereco = idendereco;
    }

    @XmlTransient
    public Collection<Telefone> getTelefoneCollection() {
        return telefoneCollection;
    }

    public void setTelefoneCollection(Collection<Telefone> telefoneCollection) {
        this.telefoneCollection = telefoneCollection;
    }

    @XmlTransient
    public Collection<CadastroEntrada> getCadastroEntradaCollection() {
        return cadastroEntradaCollection;
    }

    public void setCadastroEntradaCollection(Collection<CadastroEntrada> cadastroEntradaCollection) {
        this.cadastroEntradaCollection = cadastroEntradaCollection;
    }

    @XmlTransient
    public Collection<ConsumoHospede> getConsumoHospedeCollection() {
        return consumoHospedeCollection;
    }

    public void setConsumoHospedeCollection(Collection<ConsumoHospede> consumoHospedeCollection) {
        this.consumoHospedeCollection = consumoHospedeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfuncionario != null ? idfuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.idfuncionario == null && other.idfuncionario != null) || (this.idfuncionario != null && !this.idfuncionario.equals(other.idfuncionario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.Funcionario[ idfuncionario=" + idfuncionario + " ]";
    }
    
}
