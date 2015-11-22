/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;
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
import javax.persistence.Transient;
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
    @NamedQuery(name = "Funcionario.findByUsuario", query = "SELECT f FROM Funcionario f WHERE f.usuario = :usuario"),
    @NamedQuery(name = "Funcionario.findByDocumentoidentificacao", query = "SELECT f FROM Funcionario f WHERE f.documentoidentificacao = :documentoidentificacao"),
    @NamedQuery(name = "Funcionario.findByIdendereco", query = "SELECT f FROM Funcionario f WHERE f.idendereco = :idendereco")})
public class Funcionario implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfuncionario")
    private Integer idfuncionario;
    @Column(name = "nomefuncionario")
    private String nomefuncionario;
    @Column(name = "usuariofuncionario")
    private String usuario;    
    @Column(name = "senhafuncionario")
    private String senhafuncionario;
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
    private List<Telefone> telefoneList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfuncionario")
    private List<CadastroEntrada> cadastroEntradaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfuncionario")
    private List<ConsumoHospede> consumoHospedeList;

    public Funcionario() {
    }

    public Funcionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public Integer getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Integer idfuncionario) {
        Integer oldIdfuncionario = this.idfuncionario;
        this.idfuncionario = idfuncionario;
        changeSupport.firePropertyChange("idfuncionario", oldIdfuncionario, idfuncionario);
    }

    public String getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(String nomefuncionario) {
        String oldNomefuncionario = this.nomefuncionario;
        this.nomefuncionario = nomefuncionario;
        changeSupport.firePropertyChange("nomefuncionario", oldNomefuncionario, nomefuncionario);
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        Date oldDatanascimento = this.datanascimento;
        this.datanascimento = datanascimento;
        changeSupport.firePropertyChange("datanascimento", oldDatanascimento, datanascimento);
    }

    public String getDocumentoidentificacao() {
        return documentoidentificacao;
    }

    public void setDocumentoidentificacao(String documentoidentificacao) {
        String oldDocumentoidentificacao = this.documentoidentificacao;
        this.documentoidentificacao = documentoidentificacao;
        changeSupport.firePropertyChange("documentoidentificacao", oldDocumentoidentificacao, documentoidentificacao);
    }

    public Integer getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Integer idendereco) {
        Integer oldIdendereco = this.idendereco;
        this.idendereco = idendereco;
        changeSupport.firePropertyChange("idendereco", oldIdendereco, idendereco);
    }

    @XmlTransient
    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    @XmlTransient
    public List<CadastroEntrada> getCadastroEntradaList() {
        return cadastroEntradaList;
    }

    public void setCadastroEntradaList(List<CadastroEntrada> cadastroEntradaList) {
        this.cadastroEntradaList = cadastroEntradaList;
    }

    @XmlTransient
    public List<ConsumoHospede> getConsumoHospedeList() {
        return consumoHospedeList;
    }

    public void setConsumoHospedeList(List<ConsumoHospede> consumoHospedeList) {
        this.consumoHospedeList = consumoHospedeList;
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

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senhafuncionario
     */
    public String getSenhafuncionario() {
        return senhafuncionario;
    }

    /**
     * @param senhafuncionario the senhafuncionario to set
     */
    public void setSenhafuncionario(String senhafuncionario) {
        this.senhafuncionario = senhafuncionario;
    }
    
}
