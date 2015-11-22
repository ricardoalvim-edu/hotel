/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
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
    @NamedQuery(name = "CategoriaAcomodacao.findById", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.idCategoria = :id"),
    @NamedQuery(name = "CategoriaAcomodacao.findByNomeCategoria", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.nomeCategoria = :nome"),
    @NamedQuery(name = "CategoriaAcomodacao.findByDescricaotipoacomodacao", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.descricaoCategoria = :descricao"),
    @NamedQuery(name = "CategoriaAcomodacao.findByQuantidadetipoacomodacao", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.qtdAcomodacoes = :quantidade"),
    @NamedQuery(name = "CategoriaAcomodacao.findByPrecodiariatipoacomodacao", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.precoDiaria = :preco"),
    @NamedQuery(name = "CategoriaAcomodacao.findByQuantidadeadultos", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.qtdAdultos = :quantidade"),
    @NamedQuery(name = "CategoriaAcomodacao.findByQuantidadecriancas", query = "SELECT c FROM CategoriaAcomodacao c WHERE c.qtdCriancas = :quantidadecriancas")
})
public class CategoriaAcomodacao implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcategoriaacomodacao")
    private Integer idCategoria;
    
    @Basic(optional = false)
    @Column(name = "nometipoacomodacao")
    private String nomeCategoria;
    
    @Column(name = "descricaotipoacomodacao")
    private String descricaoCategoria;
    
    @Column(name = "quantidadetipoacomodacao")
    private Integer qtdAcomodacoes;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precodiariatipoacomodacao")
    private BigDecimal precoDiaria;
    
    @Column(name = "quantidadeadultos")
    private Integer qtdAdultos;
    
    @Column(name = "quantidadecriancas")
    private Integer qtdCriancas;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAcomodacao")
    private List<Acomodacao> acomodacao;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcategoriaacomodacao")
    private List<Reserva> reserva;

    public CategoriaAcomodacao() { 
        nomeCategoria = "";
        descricaoCategoria = "";
        qtdAcomodacoes = 0;
        qtdAdultos = 0;
        qtdCriancas = 0;
        precoDiaria = new BigDecimal("0");
        
    }

    public CategoriaAcomodacao(Integer idcategoriaacomodacao) {
        this.idCategoria = idcategoriaacomodacao;
    }

    public CategoriaAcomodacao(Integer idcategoriaacomodacao, String nometipoacomodacao) {
        this.idCategoria = idcategoriaacomodacao;
        this.nomeCategoria = nometipoacomodacao;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {

        this.idCategoria = idCategoria;
        
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        
        this.nomeCategoria = nomeCategoria;
        
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaotipoacomodacao) {
        this.descricaoCategoria = descricaotipoacomodacao;      
    }

    public Integer getQtdAcomodacoes() {
        return qtdAcomodacoes;
    }

    public void setQtdAcomodacoes(Integer qtdAcomodacoes) {
        this.qtdAcomodacoes = qtdAcomodacoes;
    }

    public BigDecimal getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(BigDecimal precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public Integer getQtdAdultos() {
        return qtdAdultos;
    }

    public void setQtdAdultos(Integer qtdAdultos) {
        this.qtdAdultos = qtdAdultos;
    }

    public Integer getQtdCriancas() {
        return qtdCriancas;
    }

    public void setQtdCriancas(Integer quantidadecriancas) {
        this.qtdCriancas = quantidadecriancas;
    }

    @XmlTransient
    public List<Acomodacao> getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(List<Acomodacao> acomodacao) {
        this.acomodacao = acomodacao;
    }

    @XmlTransient
    public List<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(List<Reserva> reserva) {
        this.reserva = reserva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoria != null ? idCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaAcomodacao)) {
            return false;
        }
        CategoriaAcomodacao other = (CategoriaAcomodacao) object;
        if ((this.idCategoria == null && other.idCategoria != null) || (this.idCategoria != null && !this.idCategoria.equals(other.idCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nomeCategoria;
    }
    
}
