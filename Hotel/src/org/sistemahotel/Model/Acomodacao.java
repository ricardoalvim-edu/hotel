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
    @NamedQuery(name = "Acomodacao.findByIdacomodacao", query = "SELECT a FROM Acomodacao a WHERE a.idAcomodacao = :idacomodacao"),
    @NamedQuery(name = "Acomodacao.findByAndaracomodacao", query = "SELECT a FROM Acomodacao a WHERE a.andar = :andaracomodacao"),
    @NamedQuery(name = "Acomodacao.findByNumeroacomodacao", query = "SELECT a FROM Acomodacao a WHERE a.numero = :numeroacomodacao")})
public class Acomodacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAcomodacao")
    private Integer idAcomodacao;
    @Column(name = "andaracomodacao")
    private String andar;
    @Basic(optional = false)
    @Column(name = "numeroacomodacao")
    private String numero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idacomodacao")
    private Collection<CadastroEntrada> cadastroEntrada;
    @JoinColumn(name = "idcategoriaacomodacao", referencedColumnName = "idcategoriaacomodacao")
    @ManyToOne(optional = false)
    private CategoriaAcomodacao idCategoria;

    public Acomodacao() {
        this.andar = "";
        this.numero = "";
    }

    public Acomodacao(String andarAcomodacao, String numeroAcomodacao) {
        this.andar = andarAcomodacao;
        this.numero = numeroAcomodacao;
    }

    public Integer getIdAcomodacao() {
        return idAcomodacao;
    }

    public void setIdAcomodacao(Integer idAcomodacao) {
        this.idAcomodacao = idAcomodacao;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @XmlTransient
    public Collection<CadastroEntrada> getCadastroEntrada() {
        return cadastroEntrada;
    }

    public void setCadastroEntrada(Collection<CadastroEntrada> cadastroEntrada) {
        this.cadastroEntrada = cadastroEntrada;
    }

    public CategoriaAcomodacao getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(CategoriaAcomodacao idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcomodacao != null ? idAcomodacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acomodacao)) {
            return false;
        }
        Acomodacao other = (Acomodacao) object;
        if ((this.idAcomodacao == null && other.idAcomodacao != null) || (this.idAcomodacao != null && !this.idAcomodacao.equals(other.idAcomodacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.Acomodacao[ idacomodacao=" + idAcomodacao + " ]";
    }
    
}
