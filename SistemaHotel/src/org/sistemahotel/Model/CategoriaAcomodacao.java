/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "categoria_acomodacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaAcomodacao.findAll", query = "SELECT c FROM CategoriaAcomodacao c"),
    @NamedQuery(name = "CategoriaAcomodacao.findByIdcategoriaacomodacao", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.idcategoriaacomodacao = :idcategoriaacomodacao"),
    @NamedQuery(name = "CategoriaAcomodacao.findByCodtipoacomodacao", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.codtipoacomodacao = :codtipoacomodacao"),
    @NamedQuery(name = "CategoriaAcomodacao.findByNometipoacomodacao", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.nometipoacomodacao = :nometipoacomodacao"),
    @NamedQuery(name = "CategoriaAcomodacao.findByDescricaotipoacomodacao", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.descricaotipoacomodacao = :descricaotipoacomodacao"),
    @NamedQuery(name = "CategoriaAcomodacao.findByQuantidadetipoacomodacao", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.quantidadetipoacomodacao = :quantidadetipoacomodacao"),
    @NamedQuery(name = "CategoriaAcomodacao.findByPrecodiariatipoacomodacao", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.precodiariatipoacomodacao = :precodiariatipoacomodacao"),
    @NamedQuery(name = "CategoriaAcomodacao.findByQuantidadeadultos", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.quantidadeadultos = :quantidadeadultos"),
    @NamedQuery(name = "CategoriaAcomodacao.findByQuantidadecriancas", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.quantidadecriancas = :quantidadecriancas")})
public class CategoriaAcomodacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcategoriaacomodacao")
    private Integer idcategoriaacomodacao;
    @Basic(optional = false)
    @Column(name = "codtipoacomodacao")
    private String codtipoacomodacao;
    @Basic(optional = false)
    @Column(name = "nometipoacomodacao")
    private String nometipoacomodacao;
    @Column(name = "descricaotipoacomodacao")
    private String descricaotipoacomodacao;
    @Column(name = "quantidadetipoacomodacao")
    private Integer quantidadetipoacomodacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precodiariatipoacomodacao")
    private BigDecimal precodiariatipoacomodacao;
    @Column(name = "quantidadeadultos")
    private Integer quantidadeadultos;
    @Column(name = "quantidadecriancas")
    private Integer quantidadecriancas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcategoriaacomodacao")
    private Collection<Acomodacao> acomodacaoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcategoriaacomodacao")
    private Collection<Reserva> reservaCollection;

    public CategoriaAcomodacao() {
    }

    public CategoriaAcomodacao(Integer idcategoriaacomodacao) {
        this.idcategoriaacomodacao = idcategoriaacomodacao;
    }

    public CategoriaAcomodacao(Integer idcategoriaacomodacao, String codtipoacomodacao, String nometipoacomodacao) {
        this.idcategoriaacomodacao = idcategoriaacomodacao;
        this.codtipoacomodacao = codtipoacomodacao;
        this.nometipoacomodacao = nometipoacomodacao;
    }

    public Integer getIdcategoriaacomodacao() {
        return idcategoriaacomodacao;
    }

    public void setIdcategoriaacomodacao(Integer idcategoriaacomodacao) {
        this.idcategoriaacomodacao = idcategoriaacomodacao;
    }

    public String getCodtipoacomodacao() {
        return codtipoacomodacao;
    }

    public void setCodtipoacomodacao(String codtipoacomodacao) {
        this.codtipoacomodacao = codtipoacomodacao;
    }

    public String getNometipoacomodacao() {
        return nometipoacomodacao;
    }

    public void setNometipoacomodacao(String nometipoacomodacao) {
        this.nometipoacomodacao = nometipoacomodacao;
    }

    public String getDescricaotipoacomodacao() {
        return descricaotipoacomodacao;
    }

    public void setDescricaotipoacomodacao(String descricaotipoacomodacao) {
        this.descricaotipoacomodacao = descricaotipoacomodacao;
    }

    public Integer getQuantidadetipoacomodacao() {
        return quantidadetipoacomodacao;
    }

    public void setQuantidadetipoacomodacao(Integer quantidadetipoacomodacao) {
        this.quantidadetipoacomodacao = quantidadetipoacomodacao;
    }

    public BigDecimal getPrecodiariatipoacomodacao() {
        return precodiariatipoacomodacao;
    }

    public void setPrecodiariatipoacomodacao(BigDecimal precodiariatipoacomodacao) {
        this.precodiariatipoacomodacao = precodiariatipoacomodacao;
    }

    public Integer getQuantidadeadultos() {
        return quantidadeadultos;
    }

    public void setQuantidadeadultos(Integer quantidadeadultos) {
        this.quantidadeadultos = quantidadeadultos;
    }

    public Integer getQuantidadecriancas() {
        return quantidadecriancas;
    }

    public void setQuantidadecriancas(Integer quantidadecriancas) {
        this.quantidadecriancas = quantidadecriancas;
    }

    @XmlTransient
    public Collection<Acomodacao> getAcomodacaoCollection() {
        return acomodacaoCollection;
    }

    public void setAcomodacaoCollection(Collection<Acomodacao> acomodacaoCollection) {
        this.acomodacaoCollection = acomodacaoCollection;
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
        hash += (idcategoriaacomodacao != null ? idcategoriaacomodacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaAcomodacao)) {
            return false;
        }
        CategoriaAcomodacao other = (CategoriaAcomodacao) object;
        if ((this.idcategoriaacomodacao == null && other.idcategoriaacomodacao != null) || (this.idcategoriaacomodacao != null && !this.idcategoriaacomodacao.equals(other.idcategoriaacomodacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.CategoriaAcomodacao[ idcategoriaacomodacao=" + idcategoriaacomodacao + " ]";
    }
    
}
