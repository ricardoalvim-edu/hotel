/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findByIdreservas", query = "SELECT r FROM Reserva r WHERE r.idreservas = :idreservas"),
    @NamedQuery(name = "Reserva.findByDatahorachegadareserva", query = "SELECT r FROM Reserva r WHERE r.datahorachegadareserva = :datahorachegadareserva"),
    @NamedQuery(name = "Reserva.findByDatahorasaidareserva", query = "SELECT r FROM Reserva r WHERE r.datahorasaidareserva = :datahorasaidareserva"),
    @NamedQuery(name = "Reserva.findByNumerocartaocredito", query = "SELECT r FROM Reserva r WHERE r.numerocartaocredito = :numerocartaocredito"),
    @NamedQuery(name = "Reserva.findByCodcartaocredito", query = "SELECT r FROM Reserva r WHERE r.codcartaocredito = :codcartaocredito"),
    @NamedQuery(name = "Reserva.findByDesconto", query = "SELECT r FROM Reserva r WHERE r.desconto = :desconto"),
    @NamedQuery(name = "Reserva.findByMultadesistencia", query = "SELECT r FROM Reserva r WHERE r.multadesistencia = :multadesistencia")})
public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreservas")
    private Integer idreservas;
    @Basic(optional = false)
    @Column(name = "datahorachegadareserva")
    @Temporal(TemporalType.DATE)
    private Date datahorachegadareserva;
    @Column(name = "datahorasaidareserva")
    @Temporal(TemporalType.DATE)
    private Date datahorasaidareserva;
    @Column(name = "numerocartaocredito")
    private String numerocartaocredito;
    @Column(name = "codcartaocredito")
    private String codcartaocredito;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "desconto")
    private BigDecimal desconto;
    @Column(name = "multadesistencia")
    private BigDecimal multadesistencia;
    @ManyToMany(mappedBy = "reservaList")
    private List<Acompanhante> acompanhanteList;
    @JoinColumn(name = "idcategoriaacomodacao", referencedColumnName = "idcategoriaacomodacao")
    @ManyToOne(optional = false)
    private CategoriaAcomodacao idcategoriaacomodacao;
    @JoinColumn(name = "idhospede", referencedColumnName = "idhospede")
    @ManyToOne(optional = false)
    private Hospede idhospede;

    public Reserva() {
        this.codcartaocredito = "";
        this.acompanhanteList = null;
        this.datahorachegadareserva = null;
        this.datahorasaidareserva = null;
        this.desconto = new BigDecimal(0.0);
        this.multadesistencia = new BigDecimal(0.0);       
    }

    public Reserva(Integer idreservas) {
        this.idreservas = idreservas;
    }

    public Reserva(Integer idreservas, Date datahorachegadareserva) {
        this.idreservas = idreservas;
        this.datahorachegadareserva = datahorachegadareserva;
    }

    public Integer getIdreservas() {
        return idreservas;
    }

    public void setIdreservas(Integer idreservas) {
        this.idreservas = idreservas;
    }

    public Date getDatahorachegadareserva() {
        return datahorachegadareserva;
    }

    public void setDatahorachegadareserva(Date datahorachegadareserva) {
        this.datahorachegadareserva = datahorachegadareserva;
    }

    public Date getDatahorasaidareserva() {
        return datahorasaidareserva;
    }

    public void setDatahorasaidareserva(Date datahorasaidareserva) {
        this.datahorasaidareserva = datahorasaidareserva;
    }

    public String getNumerocartaocredito() {
        return numerocartaocredito;
    }

    public void setNumerocartaocredito(String numerocartaocredito) {
        this.numerocartaocredito = numerocartaocredito;
    }

    public String getCodcartaocredito() {
        return codcartaocredito;
    }

    public void setCodcartaocredito(String codcartaocredito) {
        this.codcartaocredito = codcartaocredito;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getMultadesistencia() {
        return multadesistencia;
    }

    public void setMultadesistencia(BigDecimal multadesistencia) {
        this.multadesistencia = multadesistencia;
    }

    @XmlTransient
    public List<Acompanhante> getAcompanhanteList() {
        return acompanhanteList;
    }

    public void setAcompanhanteList(List<Acompanhante> acompanhanteList) {
        this.acompanhanteList = acompanhanteList;
    }

    public CategoriaAcomodacao getIdcategoriaacomodacao() {
        return idcategoriaacomodacao;
    }

    public void setIdcategoriaacomodacao(CategoriaAcomodacao idcategoriaacomodacao) {
        this.idcategoriaacomodacao = idcategoriaacomodacao;
    }

    public Hospede getIdhospede() {
        return idhospede;
    }

    public void setIdhospede(Hospede idhospede) {
        this.idhospede = idhospede;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservas != null ? idreservas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.idreservas == null && other.idreservas != null) || (this.idreservas != null && !this.idreservas.equals(other.idreservas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.Reserva[ idreservas=" + idreservas + " ]";
    }
    
}
