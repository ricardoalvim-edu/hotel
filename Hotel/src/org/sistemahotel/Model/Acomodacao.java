/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GILIARD
 */
@Entity
@Table(name = "acomodacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acomodacao.findAll", query = "SELECT a FROM Acomodacao a"),
    @NamedQuery(name = "Acomodacao.findByIdacomodacao", query = "SELECT a FROM Acomodacao a WHERE a.idacomodacao = :idacomodacao"),
    @NamedQuery(name = "Acomodacao.findByAndaracomodacao", query = "SELECT a FROM Acomodacao a WHERE a.andaracomodacao = :andaracomodacao"),
    @NamedQuery(name = "Acomodacao.findByNumeroacomodacao", query = "SELECT a FROM Acomodacao a WHERE a.numeroacomodacao = :numeroacomodacao")})
public class Acomodacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idacomodacao")
    private Integer idacomodacao;
    @Column(name = "andaracomodacao")
    private String andaracomodacao;
    @Basic(optional = false)
    @Column(name = "numeroacomodacao")
    private String numeroacomodacao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idacomodacao")
    private Collection<CadastroEntrada> cadastroEntradaCollection;
    @JoinColumn(name = "idcategoriaacomodacao", referencedColumnName = "idcategoriaacomodacao")
    @ManyToOne(optional = false)
    private CategoriaAcomodacao idcategoriaacomodacao;

    public Acomodacao() {
    }

    public Acomodacao(Integer idacomodacao) {
        this.idacomodacao = idacomodacao;
    }

    public Acomodacao(Integer idacomodacao, String numeroacomodacao) {
        this.idacomodacao = idacomodacao;
        this.numeroacomodacao = numeroacomodacao;
    }

    public Integer getIdacomodacao() {
        return idacomodacao;
    }

    public void setIdacomodacao(Integer idacomodacao) {
        this.idacomodacao = idacomodacao;
    }

    public String getAndaracomodacao() {
        return andaracomodacao;
    }

    public void setAndaracomodacao(String andaracomodacao) {
        this.andaracomodacao = andaracomodacao;
    }

    public String getNumeroacomodacao() {
        return numeroacomodacao;
    }

    public void setNumeroacomodacao(String numeroacomodacao) {
        this.numeroacomodacao = numeroacomodacao;
    }

    @XmlTransient
    public Collection<CadastroEntrada> getCadastroEntradaCollection() {
        return cadastroEntradaCollection;
    }

    public void setCadastroEntradaCollection(Collection<CadastroEntrada> cadastroEntradaCollection) {
        this.cadastroEntradaCollection = cadastroEntradaCollection;
    }

    public CategoriaAcomodacao getIdcategoriaacomodacao() {
        return idcategoriaacomodacao;
    }

    public void setIdcategoriaacomodacao(CategoriaAcomodacao idcategoriaacomodacao) {
        this.idcategoriaacomodacao = idcategoriaacomodacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idacomodacao != null ? idacomodacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acomodacao)) {
            return false;
        }
        Acomodacao other = (Acomodacao) object;
        if ((this.idacomodacao == null && other.idacomodacao != null) || (this.idacomodacao != null && !this.idacomodacao.equals(other.idacomodacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.Acomodacao[ idacomodacao=" + idacomodacao + " ]";
    }
    
}
