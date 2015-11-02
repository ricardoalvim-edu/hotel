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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "acompanhante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acompanhante.findAll", query = "SELECT a FROM Acompanhante a"),
    @NamedQuery(name = "Acompanhante.findByIdacompanhante", query = "SELECT a FROM Acompanhante a WHERE a.idacompanhante = :idacompanhante"),
    @NamedQuery(name = "Acompanhante.findByNomeacompanhante", query = "SELECT a FROM Acompanhante a WHERE a.nomeacompanhante = :nomeacompanhante"),
    @NamedQuery(name = "Acompanhante.findByIdadeacompanhante", query = "SELECT a FROM Acompanhante a WHERE a.idadeacompanhante = :idadeacompanhante")})
public class Acompanhante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idacompanhante")
    private Integer idacompanhante;
    @Basic(optional = false)
    @Column(name = "nomeacompanhante")
    private String nomeacompanhante;
    @Basic(optional = false)
    @Column(name = "idadeacompanhante")
    private int idadeacompanhante;
    @JoinTable(name = "acompanhante_cadastro_entrada", joinColumns = {
        @JoinColumn(name = "idacompanhante", referencedColumnName = "idacompanhante")}, inverseJoinColumns = {
        @JoinColumn(name = "idcadastroentrada", referencedColumnName = "idcadastroentrada")})
    @ManyToMany
    private Collection<CadastroEntrada> cadastroEntradaCollection;
    @JoinTable(name = "acompanhante_reserva", joinColumns = {
        @JoinColumn(name = "idacompanhante", referencedColumnName = "idacompanhante")}, inverseJoinColumns = {
        @JoinColumn(name = "idreservas", referencedColumnName = "idreservas")})
    @ManyToMany
    private Collection<Reserva> reservaCollection;
    @JoinColumn(name = "idhospede", referencedColumnName = "idhospede")
    @ManyToOne(optional = false)
    private Hospede idhospede;

    public Acompanhante() {
    }

    public Acompanhante(Integer idacompanhante) {
        this.idacompanhante = idacompanhante;
    }

    public Acompanhante(Integer idacompanhante, String nomeacompanhante, int idadeacompanhante) {
        this.idacompanhante = idacompanhante;
        this.nomeacompanhante = nomeacompanhante;
        this.idadeacompanhante = idadeacompanhante;
    }

    public Integer getIdacompanhante() {
        return idacompanhante;
    }

    public void setIdacompanhante(Integer idacompanhante) {
        this.idacompanhante = idacompanhante;
    }

    public String getNomeacompanhante() {
        return nomeacompanhante;
    }

    public void setNomeacompanhante(String nomeacompanhante) {
        this.nomeacompanhante = nomeacompanhante;
    }

    public int getIdadeacompanhante() {
        return idadeacompanhante;
    }

    public void setIdadeacompanhante(int idadeacompanhante) {
        this.idadeacompanhante = idadeacompanhante;
    }

    @XmlTransient
    public Collection<CadastroEntrada> getCadastroEntradaCollection() {
        return cadastroEntradaCollection;
    }

    public void setCadastroEntradaCollection(Collection<CadastroEntrada> cadastroEntradaCollection) {
        this.cadastroEntradaCollection = cadastroEntradaCollection;
    }

    @XmlTransient
    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
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
        hash += (idacompanhante != null ? idacompanhante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acompanhante)) {
            return false;
        }
        Acompanhante other = (Acompanhante) object;
        if ((this.idacompanhante == null && other.idacompanhante != null) || (this.idacompanhante != null && !this.idacompanhante.equals(other.idacompanhante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.Acompanhante[ idacompanhante=" + idacompanhante + " ]";
    }
    
}
