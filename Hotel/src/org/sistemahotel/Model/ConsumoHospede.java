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
import javax.persistence.JoinTable;
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
@Table(name = "consumo_hospede")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConsumoHospede.findAll", query = "SELECT c FROM ConsumoHospede c"),
    @NamedQuery(name = "ConsumoHospede.findByIdconsumohospede", query = "SELECT c FROM ConsumoHospede c WHERE c.idconsumohospede = :idconsumohospede"),
    @NamedQuery(name = "ConsumoHospede.findByQuantidadeconsumida", query = "SELECT c FROM ConsumoHospede c WHERE c.quantidadeconsumida = :quantidadeconsumida"),
    @NamedQuery(name = "ConsumoHospede.findByDatahoraconsumo", query = "SELECT c FROM ConsumoHospede c WHERE c.datahoraconsumo = :datahoraconsumo"),
    @NamedQuery(name = "ConsumoHospede.findByValortotalconsumido", query = "SELECT c FROM ConsumoHospede c WHERE c.valortotalconsumido = :valortotalconsumido")})
public class ConsumoHospede implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idconsumohospede")
    private Integer idconsumohospede;
    @Basic(optional = false)
    @Column(name = "quantidadeconsumida")
    private int quantidadeconsumida;
    @Column(name = "datahoraconsumo")
    @Temporal(TemporalType.DATE)
    private Date datahoraconsumo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "valortotalconsumido")
    private BigDecimal valortotalconsumido;
    
    @JoinTable(name = "consumohospede_tem_produto", joinColumns = {
        @JoinColumn(name = "idconsumohospede", referencedColumnName = "idconsumohospede")}, inverseJoinColumns = {
        @JoinColumn(name = "idproduto", referencedColumnName = "idproduto")})
    @ManyToMany
    private List<Produto> produtoConsumidos;
    
    @JoinColumn(name = "idcadastroentrada", referencedColumnName = "idcadastroentrada")
    @ManyToOne(optional = false)
    private CadastroEntrada idcadastroentrada;
    
    @JoinColumn(name = "idfuncionario", referencedColumnName = "idfuncionario")
    @ManyToOne(optional = false)
    private Funcionario idfuncionario;

    public ConsumoHospede() {
    }

    public ConsumoHospede(Integer idconsumohospede) {
        this.idconsumohospede = idconsumohospede;
    }

    public ConsumoHospede(Integer idconsumohospede, int quantidadeconsumida, BigDecimal valortotalconsumido) {
        this.idconsumohospede = idconsumohospede;
        this.quantidadeconsumida = quantidadeconsumida;
        this.valortotalconsumido = valortotalconsumido;
    }

    public Integer getIdconsumohospede() {
        return idconsumohospede;
    }

    public void setIdconsumohospede(Integer idconsumohospede) {
        this.idconsumohospede = idconsumohospede;
    }

    public int getQuantidadeconsumida() {
        return quantidadeconsumida;
    }

    public void setQuantidadeconsumida(int quantidadeconsumida) {
        this.quantidadeconsumida = quantidadeconsumida;
    }

    public Date getDatahoraconsumo() {
        return datahoraconsumo;
    }

    public void setDatahoraconsumo(Date datahoraconsumo) {
        this.datahoraconsumo = datahoraconsumo;
    }

    public BigDecimal getValortotalconsumido() {
        return valortotalconsumido;
    }

    public void setValortotalconsumido(BigDecimal valortotalconsumido) {
        this.valortotalconsumido = valortotalconsumido;
    }

    @XmlTransient
    public List<Produto> getProdutoConsumidos() {
        return produtoConsumidos;
    }

    public void setProdutoConsumidos(List<Produto> produtoConsumidos) {
        this.produtoConsumidos = produtoConsumidos;
    }

    public CadastroEntrada getIdcadastroentrada() {
        return idcadastroentrada;
    }

    public void setIdcadastroentrada(CadastroEntrada idcadastroentrada) {
        this.idcadastroentrada = idcadastroentrada;
    }

    public Funcionario getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Funcionario idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconsumohospede != null ? idconsumohospede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConsumoHospede)) {
            return false;
        }
        ConsumoHospede other = (ConsumoHospede) object;
        if ((this.idconsumohospede == null && other.idconsumohospede != null) || (this.idconsumohospede != null && !this.idconsumohospede.equals(other.idconsumohospede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.ConsumoHospede[ idconsumohospede=" + idconsumohospede + " ]";
    }
    
}
