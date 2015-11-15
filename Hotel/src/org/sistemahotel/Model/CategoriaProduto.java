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
@Table(name = "categoria_produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriaProduto.findAll", query = "SELECT c FROM CategoriaProduto c"),
    @NamedQuery(name = "CategoriaProduto.findByIdcategoria", query = "SELECT c FROM CategoriaProduto c WHERE c.idcategoria = :idcategoria"),
    @NamedQuery(name = "CategoriaProduto.findByNomecategoria", query = "SELECT c FROM CategoriaProduto c WHERE c.nomecategoria = :nomecategoria"),
    @NamedQuery(name = "CategoriaProduto.findByDescricao", query = "SELECT c FROM CategoriaProduto c WHERE c.descricao = :descricao")})
public class CategoriaProduto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcategoria")
    private Integer idcategoria;
    @Column(name = "nomecategoria")
    private String nomecategoria;
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(mappedBy = "idcategoria")
    private Collection<Produto> produtoCollection;

    public CategoriaProduto() {
    }

    public CategoriaProduto(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNomecategoria() {
        return nomecategoria;
    }

    public void setNomecategoria(String nomecategoria) {
        this.nomecategoria = nomecategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public Collection<Produto> getProdutoCollection() {
        return produtoCollection;
    }

    public void setProdutoCollection(Collection<Produto> produtoCollection) {
        this.produtoCollection = produtoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcategoria != null ? idcategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaProduto)) {
            return false;
        }
        CategoriaProduto other = (CategoriaProduto) object;
        if ((this.idcategoria == null && other.idcategoria != null) || (this.idcategoria != null && !this.idcategoria.equals(other.idcategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.CategoriaProduto[ idcategoria=" + idcategoria + " ]";
    }
    
}
