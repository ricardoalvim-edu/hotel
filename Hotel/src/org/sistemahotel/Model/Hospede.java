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
    private Date dataNascimento;
    
    @Column(name = "filiacaohospede")
    private String filiacao;
    
    @Column(name = "passaportehospedeestrangeiro")
    private String passaporte;
    
    @JoinTable(name = "hospede_tem_telefone", joinColumns = {
        @JoinColumn(name = "idhospede", referencedColumnName = "idhospede")}, inverseJoinColumns = {
        @JoinColumn(name = "idtelefone", referencedColumnName = "idtelefone")})
    @ManyToMany
    private Collection<Telefone> telefoneCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhospede")
    private Collection<CadastroEntrada> cadastroEntrada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhospede")
    private Collection<Acompanhante> acompanhante;
    @JoinColumn(name = "idendereco", referencedColumnName = "idendereco")
    @ManyToOne
    private Endereco idendereco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhospede")
    private Collection<Reserva> reserva;

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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    @XmlTransient
    public Collection<Telefone> getTelefoneCollection() {
        return telefoneCollection;
    }

    public void setTelefoneCollection(Collection<Telefone> telefoneCollection) {
        this.telefoneCollection = telefoneCollection;
    }

    @XmlTransient
    public Collection<CadastroEntrada> getCadastroEntrada() {
        return cadastroEntrada;
    }

    public void setCadastroEntrada(Collection<CadastroEntrada> cadastroEntrada) {
        this.cadastroEntrada = cadastroEntrada;
    }

    @XmlTransient
    public Collection<Acompanhante> getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(Collection<Acompanhante> acompanhante) {
        this.acompanhante = acompanhante;
    }

    public Endereco getIdendereco() {
        return idendereco;
    }

    public void setIdendereco(Endereco idendereco) {
        this.idendereco = idendereco;
    }

    @XmlTransient
    public Collection<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(Collection<Reserva> reserva) {
        this.reserva = reserva;
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
