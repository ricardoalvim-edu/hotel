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
    @NamedQuery(name = "CategoriaProduto.findByIdcategoria", query = "SELECT c FROM CategoriaProduto c WHERE c.idCategoria = :idcategoria"),
    @NamedQuery(name = "CategoriaProduto.findByNomecategoria", query = "SELECT c FROM CategoriaProduto c WHERE c.nomeCategoria = :nomecategoria"),
    @NamedQuery(name = "CategoriaProduto.findByDescricao", query = "SELECT c FROM CategoriaProduto c WHERE c.descricao = :descricao")})
public class CategoriaProduto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcategoria")
    private Integer idCategoria;
    @Column(name = "nomecategoria")
    private String nomeCategoria;
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(mappedBy = "idcategoria")
    private Collection<Produto> produto;

    public CategoriaProduto()
    {
        nomeCategoria = "";
        descricao = "" ;
    }

    public CategoriaProduto(Integer idcategoria) {
        this.idCategoria = idcategoria;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public Collection<Produto> getProduto() {
        return produto;
    }

    public void setProduto(Collection<Produto> produto) {
        this.produto = produto;
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
        if (!(object instanceof CategoriaProduto)) {
            return false;
        }
        CategoriaProduto other = (CategoriaProduto) object;
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
