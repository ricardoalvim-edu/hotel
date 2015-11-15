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
import javax.persistence.ManyToOne;
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
@Table(name = "hospede")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hospede.findAll", query = "SELECT h FROM Hospede h"),
    @NamedQuery(name = "Hospede.findByIdhospede", query = "SELECT h FROM Hospede h WHERE h.idhospede = :idhospede"),
    @NamedQuery(name = "Hospede.findByNomehospede", query = "SELECT h FROM Hospede h WHERE h.nomehospede = :nomehospede"),
    @NamedQuery(name = "Hospede.findByRghospede", query = "SELECT h FROM Hospede h WHERE h.rghospede = :rghospede"),
    @NamedQuery(name = "Hospede.findByRgemissorhospede", query = "SELECT h FROM Hospede h WHERE h.rgemissorhospede = :rgemissorhospede"),
    @NamedQuery(name = "Hospede.findByCpfhospede", query = "SELECT h FROM Hospede h WHERE h.cpfhospede = :cpfhospede"),
    @NamedQuery(name = "Hospede.findByDatanascimentohospede", query = "SELECT h FROM Hospede h WHERE h.datanascimentohospede = :datanascimentohospede"),
    @NamedQuery(name = "Hospede.findByFiliacaohospede", query = "SELECT h FROM Hospede h WHERE h.filiacaohospede = :filiacaohospede"),
    @NamedQuery(name = "Hospede.findByPassaportehospedeestrangeiro", query = "SELECT h FROM Hospede h WHERE h.passaportehospedeestrangeiro = :passaportehospedeestrangeiro")})
public class Hospede implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhospede")
    private Integer idhospede;
    @Column(name = "nomehospede")
    private String nomehospede;
    @Column(name = "rghospede")
    private String rghospede;
    @Column(name = "rgemissorhospede")
    private String rgemissorhospede;
    @Column(name = "cpfhospede")
    private String cpfhospede;
    @Column(name = "datanascimentohospede")
    @Temporal(TemporalType.DATE)
    private Date datanascimentohospede;
    @Column(name = "filiacaohospede")
    private String filiacaohospede;
    @Column(name = "passaportehospedeestrangeiro")
    private String passaportehospedeestrangeiro;
    @JoinTable(name = "hospede_tem_telefone", joinColumns = {
        @JoinColumn(name = "idhospede", referencedColumnName = "idhospede")}, inverseJoinColumns = {
        @JoinColumn(name = "idtelefone", referencedColumnName = "idtelefone")})
    @ManyToMany
    private Collection<Telefone> telefoneCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhospede")
    private Collection<CadastroEntrada> cadastroEntradaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhospede")
    private Collection<Acompanhante> acompanhanteCollection;
    @JoinColumn(name = "idendereco", referencedColumnName = "idendereco")
    @ManyToOne
    private Endereco idendereco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhospede")
    private Collection<Reserva> reservaCollection;

    public Hospede() {
    }

    public Hospede(Integer idhospede) {
        this.idhospede = idhospede;
    }

    public Integer getIdhospede() {
        return idhospede;
    }

    public void setIdhospede(Integer idhospede) {
        this.idhospede = idhospede;
    }

    public String getNomehospede() {
        return nomehospede;
    }

    public void setNomehospede(String nomehospede) {
        this.nomehospede = nomehospede;
    }

    public String getRghospede() {
        return rghospede;
    }

    public void setRghospede(String rghospede) {
        this.rghospede = rghospede;
    }

    public String getRgemissorhospede() {
        return rgemissorhospede;
    }

    public void setRgemissorhospede(String rgemissorhospede) {
        this.rgemissorhospede = rgemissorhospede;
    }

    public String getCpfhospede() {
        return cpfhospede;
    }

    public void setCpfhospede(String cpfhospede) {
        this.cpfhospede = cpfhospede;
    }

    public Date getDatanascimentohospede() {
        return datanascimentohospede;
    }

    public void setDatanascimentohospede(Date datanascimentohospede) {
        this.datanascimentohospede = datanascimentohospede;
    }

    public String getFiliacaohospede() {
        return filiacaohospede;
    }

    public void setFiliacaohospede(String filiacaohospede) {
        this.filiacaohospede = filiacaohospede;
    }

    public String getPassaportehospedeestrangeiro() {
        return passaportehospedeestrangeiro;
    }

    public void setPassaportehospedeestrangeiro(String passaportehospedeestrangeiro) {
        this.passaportehospedeestrangeiro = passaportehospedeestrangeiro;
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
    public Collection<Acompanhante> getAcompanhanteCollection() {
        return acompanhanteCollection;
    }

    public void setAcompanhanteCollection(Collection<Acompanhante> acompanhanteCollection) {
        this.acompanhanteCollection = acompanhanteCollection;
    }

    public Endereco getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Endereco idendereco) {
        this.idendereco = idendereco;
    }

    @XmlTransient
    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhospede != null ? idhospede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospede)) {
            return false;
        }
        Hospede other = (Hospede) object;
        if ((this.idhospede == null && other.idhospede != null) || (this.idhospede != null && !this.idhospede.equals(other.idhospede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.Hospede[ idhospede=" + idhospede + " ]";
    }
    
}
