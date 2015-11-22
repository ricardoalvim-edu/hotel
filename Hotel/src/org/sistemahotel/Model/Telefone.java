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
import javax.persistence.Transient;
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
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
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
    @ManyToMany(mappedBy = "telefoneList")
    private List<Hospede> hospedeList;
    @ManyToMany(mappedBy = "telefoneList")
    private List<Funcionario> funcionarioList;

    public Telefone() {
        this.ddd = "";
        this.ddi = "";
        this.telefone = "";
    }

    public Telefone(Integer idtelefone) {
        this.idtelefone = idtelefone;
    }

    public Integer getIdtelefone() {
        return idtelefone;
    }

    public void setIdtelefone(Integer idtelefone) {
        Integer oldIdtelefone = this.idtelefone;
        this.idtelefone = idtelefone;
        changeSupport.firePropertyChange("idtelefone", oldIdtelefone, idtelefone);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        String oldDdd = this.ddd;
        this.ddd = ddd;
        changeSupport.firePropertyChange("ddd", oldDdd, ddd);
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        String oldDdi = this.ddi;
        this.ddi = ddi;
        changeSupport.firePropertyChange("ddi", oldDdi, ddi);
    }

    @XmlTransient
    public List<Hospede> getHospedeList() {
        return hospedeList;
    }

    public void setHospedeList(List<Hospede> hospedeList) {
        this.hospedeList = hospedeList;
    }

    @XmlTransient
    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }

    public void setFuncionarioList(List<Funcionario> funcionarioList) {
        this.funcionarioList = funcionarioList;
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

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
