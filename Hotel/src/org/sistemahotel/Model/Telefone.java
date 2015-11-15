/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GILIARD
 */
@Entity
@Table(name = "telefone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefone.findAll", query = "SELECT t FROM Telefone t"),
    @NamedQuery(name = "Telefone.findByIdtelefone", query = "SELECT t FROM Telefone t WHERE t.idtelefone = :idtelefone"),
    @NamedQuery(name = "Telefone.findByTelefone", query = "SELECT t FROM Telefone t WHERE t.telefone = :telefone"),
    @NamedQuery(name = "Telefone.findByDdd", query = "SELECT t FROM Telefone t WHERE t.ddd = :ddd"),
    @NamedQuery(name = "Telefone.findByDdi", query = "SELECT t FROM Telefone t WHERE t.ddi = :ddi")})
public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtelefone")
    private Integer idtelefone;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "ddd")
    private String ddd;
    @Column(name = "ddi")
    private String ddi;
    @ManyToMany(mappedBy = "telefoneCollection")
    private Collection<Hospede> hospedeCollection;
    @ManyToMany(mappedBy = "telefoneCollection")
    private Collection<Funcionario> funcionarioCollection;

    public Telefone() {
    }

    public Telefone(Integer idtelefone) {
        this.idtelefone = idtelefone;
    }

    public Integer getIdtelefone() {
        return idtelefone;
    }

    public void setIdtelefone(Integer idtelefone) {
        this.idtelefone = idtelefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    @XmlTransient
    public Collection<Hospede> getHospedeCollection() {
        return hospedeCollection;
    }

    public void setHospedeCollection(Collection<Hospede> hospedeCollection) {
        this.hospedeCollection = hospedeCollection;
    }

    @XmlTransient
    public Collection<Funcionario> getFuncionarioCollection() {
        return funcionarioCollection;
    }

    public void setFuncionarioCollection(Collection<Funcionario> funcionarioCollection) {
        this.funcionarioCollection = funcionarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtelefone != null ? idtelefone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefone)) {
            return false;
        }
        Telefone other = (Telefone) object;
        if ((this.idtelefone == null && other.idtelefone != null) || (this.idtelefone != null && !this.idtelefone.equals(other.idtelefone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.Telefone[ idtelefone=" + idtelefone + " ]";
    }
    
}
