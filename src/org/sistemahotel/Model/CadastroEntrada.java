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
import javax.persistence.CascadeType;
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
@Table(name = "cadastro_entrada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CadastroEntrada.findAll", query = "SELECT c FROM CadastroEntrada c"),
    @NamedQuery(name = "CadastroEntrada.findByIdcadastroentrada", query = "SELECT c FROM CadastroEntrada c WHERE c.idcadastroentrada = :idcadastroentrada"),
    @NamedQuery(name = "CadastroEntrada.findByDatahoraentrada", query = "SELECT c FROM CadastroEntrada c WHERE c.datahoraentrada = :datahoraentrada"),
    @NamedQuery(name = "CadastroEntrada.findByDatahorasaidaprevista", query = "SELECT c FROM CadastroEntrada c WHERE c.datahorasaidaprevista = :datahorasaidaprevista"),
    @NamedQuery(name = "CadastroEntrada.findByDesconto", query = "SELECT c FROM CadastroEntrada c WHERE c.desconto = :desconto"),
    @NamedQuery(name = "CadastroEntrada.findByNumerocartaocredito", query = "SELECT c FROM CadastroEntrada c WHERE c.numerocartaocredito = :numerocartaocredito"),
    @NamedQuery(name = "CadastroEntrada.findByCodcartaocredito", query = "SELECT c FROM CadastroEntrada c WHERE c.codcartaocredito = :codcartaocredito")})
public class CadastroEntrada implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcadastroentrada")
    private Integer idcadastroentrada;
    @Basic(optional = false)
    @Column(name = "datahoraentrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahoraentrada;
    @Basic(optional = false)
    @Column(name = "datahorasaidaprevista")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahorasaidaprevista;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "desconto")
    private BigDecimal desconto;
    @Column(name = "numerocartaocredito")
    private String numerocartaocredito;
    @Column(name = "codcartaocredito")
    private String codcartaocredito;
    @ManyToMany(mappedBy = "cadastroEntradaList")
    private List<Acompanhante> acompanhanteList;
    @JoinColumn(name = "idacomodacao", referencedColumnName = "idacomodacao")
    @ManyToOne(optional = false)
    private Acomodacao idacomodacao;
    @JoinColumn(name = "idfuncionario", referencedColumnName = "idfuncionario")
    @ManyToOne(optional = false)
    private Funcionario idfuncionario;
    @JoinColumn(name = "idhospede", referencedColumnName = "idhospede")
    @ManyToOne(optional = false)
    private Hospede idhospede;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcadastroentrada")
    private List<ConsumoHospede> consumoHospedeList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idcadastroentrada")
    private CadastroSaida cadastroSaida;

    public CadastroEntrada() {
    }

    public CadastroEntrada(Integer idcadastroentrada) {
        this.idcadastroentrada = idcadastroentrada;
    }

    public CadastroEntrada(Integer idcadastroentrada, Date datahoraentrada, Date datahorasaidaprevista) {
        this.idcadastroentrada = idcadastroentrada;
        this.datahoraentrada = datahoraentrada;
        this.datahorasaidaprevista = datahorasaidaprevista;
    }

    public Integer getIdcadastroentrada() {
        return idcadastroentrada;
    }

    public void setIdcadastroentrada(Integer idcadastroentrada) {
        this.idcadastroentrada = idcadastroentrada;
    }

    public Date getDatahoraentrada() {
        return datahoraentrada;
    }

    public void setDatahoraentrada(Date datahoraentrada) {
        this.datahoraentrada = datahoraentrada;
    }

    public Date getDatahorasaidaprevista() {
        return datahorasaidaprevista;
    }

    public void setDatahorasaidaprevista(Date datahorasaidaprevista) {
        this.datahorasaidaprevista = datahorasaidaprevista;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
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

    @XmlTransient
    public List<Acompanhante> getAcompanhanteList() {
        return acompanhanteList;
    }

    public void setAcompanhanteList(List<Acompanhante> acompanhanteList) {
        this.acompanhanteList = acompanhanteList;
    }

    public Acomodacao getIdacomodacao() {
        return idacomodacao;
    }

    public void setIdacomodacao(Acomodacao idacomodacao) {
        this.idacomodacao = idacomodacao;
    }

    public Funcionario getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Funcionario idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public Hospede getIdhospede() {
        return idhospede;
    }

    public void setIdhospede(Hospede idhospede) {
        this.idhospede = idhospede;
    }

    @XmlTransient
    public List<ConsumoHospede> getConsumoHospedeList() {
        return consumoHospedeList;
    }

    public void setConsumoHospedeList(List<ConsumoHospede> consumoHospedeList) {
        this.consumoHospedeList = consumoHospedeList;
    }

    public CadastroSaida getCadastroSaida() {
        return cadastroSaida;
    }

    public void setCadastroSaida(CadastroSaida cadastroSaida) {
        this.cadastroSaida = cadastroSaida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcadastroentrada != null ? idcadastroentrada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadastroEntrada)) {
            return false;
        }
        CadastroEntrada other = (CadastroEntrada) object;
        if ((this.idcadastroentrada == null && other.idcadastroentrada != null) || (this.idcadastroentrada != null && !this.idcadastroentrada.equals(other.idcadastroentrada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.CadastroEntrada[ idcadastroentrada=" + idcadastroentrada + " ]";
    }
    
}
