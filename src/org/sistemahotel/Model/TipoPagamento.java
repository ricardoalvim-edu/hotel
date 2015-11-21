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
@Table(name = "tipo_pagamento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoPagamento.findAll", query = "SELECT t FROM TipoPagamento t"),
    @NamedQuery(name = "TipoPagamento.findByIdtipopagamento", query = "SELECT t FROM TipoPagamento t WHERE t.idtipopagamento = :idtipopagamento"),
    @NamedQuery(name = "TipoPagamento.findByNometipopagamento", query = "SELECT t FROM TipoPagamento t WHERE t.nometipopagamento = :nometipopagamento"),
    @NamedQuery(name = "TipoPagamento.findByDescricaotipopagamento", query = "SELECT t FROM TipoPagamento t WHERE t.descricaotipopagamento = :descricaotipopagamento")})
public class TipoPagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipopagamento")
    private Integer idtipopagamento;
    @Basic(optional = false)
    @Column(name = "nometipopagamento")
    private String nometipopagamento;
    @Basic(optional = false)
    @Column(name = "descricaotipopagamento")
    private String descricaotipopagamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipopagamento")
    private Collection<CadastroSaida> cadastroSaidaCollection;

    public TipoPagamento() {
    }

    public TipoPagamento(Integer idtipopagamento) {
        this.idtipopagamento = idtipopagamento;
    }

    public TipoPagamento(Integer idtipopagamento, String nometipopagamento, String descricaotipopagamento) {
        this.idtipopagamento = idtipopagamento;
        this.nometipopagamento = nometipopagamento;
        this.descricaotipopagamento = descricaotipopagamento;
    }

    public Integer getIdtipopagamento() {
        return idtipopagamento;
    }

    public void setIdtipopagamento(Integer idtipopagamento) {
        this.idtipopagamento = idtipopagamento;
    }

    public String getNometipopagamento() {
        return nometipopagamento;
    }

    public void setNometipopagamento(String nometipopagamento) {
        this.nometipopagamento = nometipopagamento;
    }

    public String getDescricaotipopagamento() {
        return descricaotipopagamento;
    }

    public void setDescricaotipopagamento(String descricaotipopagamento) {
        this.descricaotipopagamento = descricaotipopagamento;
    }

    @XmlTransient
    public Collection<CadastroSaida> getCadastroSaidaCollection() {
        return cadastroSaidaCollection;
    }

    public void setCadastroSaidaCollection(Collection<CadastroSaida> cadastroSaidaCollection) {
        this.cadastroSaidaCollection = cadastroSaidaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipopagamento != null ? idtipopagamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPagamento)) {
            return false;
        }
        TipoPagamento other = (TipoPagamento) object;
        if ((this.idtipopagamento == null && other.idtipopagamento != null) || (this.idtipopagamento != null && !this.idtipopagamento.equals(other.idtipopagamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.TipoPagamento[ idtipopagamento=" + idtipopagamento + " ]";
    }
    
}
