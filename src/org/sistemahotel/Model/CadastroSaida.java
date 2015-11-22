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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "cadastro_saida")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CadastroSaida.findAll", query = "SELECT c FROM CadastroSaida c"),
    @NamedQuery(name = "CadastroSaida.findByIdcadastrosaida", query = "SELECT c FROM CadastroSaida c WHERE c.idcadastrosaida = :idcadastrosaida"),
    @NamedQuery(name = "CadastroSaida.findByDatahorasaida", query = "SELECT c FROM CadastroSaida c WHERE c.datahorasaida = :datahorasaida"),
    @NamedQuery(name = "CadastroSaida.findByQuantidadediariascobradas", query = "SELECT c FROM CadastroSaida c WHERE c.quantidadediariascobradas = :quantidadediariascobradas"),
    @NamedQuery(name = "CadastroSaida.findByValorgastotelefonema", query = "SELECT c FROM CadastroSaida c WHERE c.valorgastotelefonema = :valorgastotelefonema"),
    @NamedQuery(name = "CadastroSaida.findByDescontoconcedido", query = "SELECT c FROM CadastroSaida c WHERE c.descontoconcedido = :descontoconcedido"),
    @NamedQuery(name = "CadastroSaida.findByValordiaria", query = "SELECT c FROM CadastroSaida c WHERE c.valordiaria = :valordiaria")})
public class CadastroSaida implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcadastrosaida")
    private Integer idcadastrosaida;
    @Basic(optional = false)
    @Column(name = "datahorasaida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahorasaida;
    @Basic(optional = false)
    @Column(name = "quantidadediariascobradas")
    private int quantidadediariascobradas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valorgastotelefonema")
    private BigDecimal valorgastotelefonema;
    @Column(name = "descontoconcedido")
    private BigDecimal descontoconcedido;
    @Column(name = "valordiaria")
    private BigDecimal valordiaria;
    @OneToMany(mappedBy = "idcadastrosaida")
    private List<Fatura> faturaList;
    @JoinColumn(name = "idcadastroentrada", referencedColumnName = "idcadastroentrada")
    @OneToOne(optional = false)
    private CadastroEntrada idcadastroentrada;
    @JoinColumn(name = "idtipopagamento", referencedColumnName = "idtipopagamento")
    @ManyToOne(optional = false)
    private TipoPagamento idtipopagamento;

    public CadastroSaida() {
    }

    public CadastroSaida(Integer idcadastrosaida) {
        this.idcadastrosaida = idcadastrosaida;
    }

    public CadastroSaida(Integer idcadastrosaida, Date datahorasaida, int quantidadediariascobradas, BigDecimal valorgastotelefonema) {
        this.idcadastrosaida = idcadastrosaida;
        this.datahorasaida = datahorasaida;
        this.quantidadediariascobradas = quantidadediariascobradas;
        this.valorgastotelefonema = valorgastotelefonema;
    }

    public Integer getIdcadastrosaida() {
        return idcadastrosaida;
    }

    public void setIdcadastrosaida(Integer idcadastrosaida) {
        this.idcadastrosaida = idcadastrosaida;
    }

    public Date getDatahorasaida() {
        return datahorasaida;
    }

    public void setDatahorasaida(Date datahorasaida) {
        this.datahorasaida = datahorasaida;
    }

    public int getQuantidadediariascobradas() {
        return quantidadediariascobradas;
    }

    public void setQuantidadediariascobradas(int quantidadediariascobradas) {
        this.quantidadediariascobradas = quantidadediariascobradas;
    }

    public BigDecimal getValorgastotelefonema() {
        return valorgastotelefonema;
    }

    public void setValorgastotelefonema(BigDecimal valorgastotelefonema) {
        this.valorgastotelefonema = valorgastotelefonema;
    }

    public BigDecimal getDescontoconcedido() {
        return descontoconcedido;
    }

    public void setDescontoconcedido(BigDecimal descontoconcedido) {
        this.descontoconcedido = descontoconcedido;
    }

    public BigDecimal getValordiaria() {
        return valordiaria;
    }

    public void setValordiaria(BigDecimal valordiaria) {
        this.valordiaria = valordiaria;
    }

    @XmlTransient
    public List<Fatura> getFaturaList() {
        return faturaList;
    }

    public void setFaturaList(List<Fatura> faturaList) {
        this.faturaList = faturaList;
    }

    public CadastroEntrada getIdcadastroentrada() {
        return idcadastroentrada;
    }

    public void setIdcadastroentrada(CadastroEntrada idcadastroentrada) {
        this.idcadastroentrada = idcadastroentrada;
    }

    public TipoPagamento getIdtipopagamento() {
        return idtipopagamento;
    }

    public void setIdtipopagamento(TipoPagamento idtipopagamento) {
        this.idtipopagamento = idtipopagamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcadastrosaida != null ? idcadastrosaida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadastroSaida)) {
            return false;
        }
        CadastroSaida other = (CadastroSaida) object;
        if ((this.idcadastrosaida == null && other.idcadastrosaida != null) || (this.idcadastrosaida != null && !this.idcadastrosaida.equals(other.idcadastrosaida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.CadastroSaida[ idcadastrosaida=" + idcadastrosaida + " ]";
    }
    
}
