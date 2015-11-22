/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GILIARD
 */
@Entity
@Table(name = "fatura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fatura.findAll", query = "SELECT f FROM Fatura f"),
    @NamedQuery(name = "Fatura.findByIdfatura", query = "SELECT f FROM Fatura f WHERE f.idfatura = :idfatura"),
    @NamedQuery(name = "Fatura.findByNumerofatura", query = "SELECT f FROM Fatura f WHERE f.numerofatura = :numerofatura"),
    @NamedQuery(name = "Fatura.findByDatavencimento", query = "SELECT f FROM Fatura f WHERE f.datavencimento = :datavencimento"),
    @NamedQuery(name = "Fatura.findByDatapagamento", query = "SELECT f FROM Fatura f WHERE f.datapagamento = :datapagamento"),
    @NamedQuery(name = "Fatura.findByValortotalpago", query = "SELECT f FROM Fatura f WHERE f.valortotalpago = :valortotalpago"),
    @NamedQuery(name = "Fatura.findByJurospago", query = "SELECT f FROM Fatura f WHERE f.jurospago = :jurospago"),
    @NamedQuery(name = "Fatura.findByMultapaga", query = "SELECT f FROM Fatura f WHERE f.multapaga = :multapaga")})
public class Fatura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfatura")
    private Integer idfatura;
    @Basic(optional = false)
    @Column(name = "numerofatura")
    private String numerofatura;
    @Column(name = "datavencimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datavencimento;
    @Column(name = "datapagamento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datapagamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valortotalpago")
    private BigDecimal valortotalpago;
    @Column(name = "jurospago")
    private BigDecimal jurospago;
    @Column(name = "multapaga")
    private BigDecimal multapaga;
    @JoinColumn(name = "idcadastrosaida", referencedColumnName = "idcadastrosaida")
    @ManyToOne
    private CadastroSaida idcadastrosaida;

    public Fatura() {
    }

    public Fatura(Integer idfatura) {
        this.idfatura = idfatura;
    }

    public Fatura(Integer idfatura, String numerofatura, BigDecimal valortotalpago) {
        this.idfatura = idfatura;
        this.numerofatura = numerofatura;
        this.valortotalpago = valortotalpago;
    }

    public Integer getIdfatura() {
        return idfatura;
    }

    public void setIdfatura(Integer idfatura) {
        this.idfatura = idfatura;
    }

    public String getNumerofatura() {
        return numerofatura;
    }

    public void setNumerofatura(String numerofatura) {
        this.numerofatura = numerofatura;
    }

    public Date getDatavencimento() {
        return datavencimento;
    }

    public void setDatavencimento(Date datavencimento) {
        this.datavencimento = datavencimento;
    }

    public Date getDatapagamento() {
        return datapagamento;
    }

    public void setDatapagamento(Date datapagamento) {
        this.datapagamento = datapagamento;
    }

    public BigDecimal getValortotalpago() {
        return valortotalpago;
    }

    public void setValortotalpago(BigDecimal valortotalpago) {
        this.valortotalpago = valortotalpago;
    }

    public BigDecimal getJurospago() {
        return jurospago;
    }

    public void setJurospago(BigDecimal jurospago) {
        this.jurospago = jurospago;
    }

    public BigDecimal getMultapaga() {
        return multapaga;
    }

    public void setMultapaga(BigDecimal multapaga) {
        this.multapaga = multapaga;
    }

    public CadastroSaida getIdcadastrosaida() {
        return idcadastrosaida;
    }

    public void setIdcadastrosaida(CadastroSaida idcadastrosaida) {
        this.idcadastrosaida = idcadastrosaida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfatura != null ? idfatura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fatura)) {
            return false;
        }
        Fatura other = (Fatura) object;
        if ((this.idfatura == null && other.idfatura != null) || (this.idfatura != null && !this.idfatura.equals(other.idfatura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.Fatura[ idfatura=" + idfatura + " ]";
    }
    
}
