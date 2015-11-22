/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author GILIARD
 */
@Entity
@Table(name = "funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Funcionario.findAll", query = "SELECT f FROM Funcionario f"),
    @NamedQuery(name = "Funcionario.findByIdfuncionario", query = "SELECT f FROM Funcionario f WHERE f.idfuncionario = :idfuncionario"),
    @NamedQuery(name = "Funcionario.findByNomefuncionario", query = "SELECT f FROM Funcionario f WHERE f.nomefuncionario = :nomefuncionario"),
    @NamedQuery(name = "Funcionario.findByDatanascimento", query = "SELECT f FROM Funcionario f WHERE f.datanascimento = :datanascimento"),
    @NamedQuery(name = "Funcionario.findByUsuario", query = "SELECT f FROM Funcionario f WHERE f.usuario = :usuario"),
    @NamedQuery(name = "Funcionario.findByDocumentoidentificacao", query = "SELECT f FROM Funcionario f WHERE f.numeroRG = :numeroRG"),
    @NamedQuery(name = "Funcionario.findByIdendereco", query = "SELECT f FROM Funcionario f WHERE f.endereco = :endereco")})
public class Funcionario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfuncionario")
    private Integer idfuncionario;
    
    @Column(name = "nomefuncionario")
    private String nomefuncionario;
    
    @Column(name = "usuariofuncionario")
    private String usuario;    
    
    @Column(name = "senhafuncionario")
    private String senhafuncionario;
    /*
        Mudei o tipo de dado da coluna correspondete no postgres. Lembrar de executar o comando
        ALTER TABLE funcionario ALTER COLUMN datanascimento TYPE CHAR(10);
    */
    @Column(name = "datanascimento")
    private String datanascimento;
    /*
        Mudei o tipo de dado da coluna correspondete no postgres. Lembrar de executar o comando
        
        ALTER TABLE funcionario ADD COLUMN numeroRG VARCHAR(20);
        ALTER TABLE funcionario ADD COLUMN orgaoEmissor VARCHAR(20);
        ALTER TABLE funcionario ADD COLUMN numeroCPF VARCHAR(20);
    */
    @Column(name = "numeroRG")
    private String numeroRG;
    
    @Column(name = "orgaoEmissor")
    private String orgaoEmissor;
    
    @Column(name = "numeroCPF")
    private String numeroCPF;
    
    @JoinColumn(name = "idendereco")
    @OneToOne
    private Endereco endereco;
    
    @JoinTable(name = "funcionario_tem_telefone", joinColumns = {
        @JoinColumn(name = "idfuncionario", referencedColumnName = "idfuncionario")}, inverseJoinColumns = {
        @JoinColumn(name = "idtelefone", referencedColumnName = "idtelefone")})
    @ManyToMany
    private List<Telefone> telefoneList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfuncionario")
    private List<CadastroEntrada> cadastroEntradaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfuncionario")
    private List<ConsumoHospede> consumoHospedeList;

    public Funcionario() {
        this.nomefuncionario = "";
        this.datanascimento = "";
        this.numeroCPF = "";
        this.numeroRG = "";
        this.orgaoEmissor = "";    
    }

    public Integer getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    public String getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(String nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getNumeroRG() {
        return numeroRG;
    }

    public void setNumeroRG(String numeroRG) {
        this.numeroRG = numeroRG;
    }
    
    public void setOrgaoEmissor(String orgao){
        this.orgaoEmissor = orgao;
    }
    
    public String getOrgaoEmissor(){
       return this.orgaoEmissor;
    }
    
    public void setCPF(String cpf){
        this.numeroCPF = cpf;
    }
    
    public String getCPF(){
        return this.numeroCPF;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @XmlTransient
    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    @XmlTransient
    public List<CadastroEntrada> getCadastroEntradaList() {
        return cadastroEntradaList;
    }

    public void setCadastroEntradaList(List<CadastroEntrada> cadastroEntradaList) {
        this.cadastroEntradaList = cadastroEntradaList;
    }

    @XmlTransient
    public List<ConsumoHospede> getConsumoHospedeList() {
        return consumoHospedeList;
    }

    public void setConsumoHospedeList(List<ConsumoHospede> consumoHospedeList) {
        this.consumoHospedeList = consumoHospedeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfuncionario != null ? idfuncionario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.idfuncionario == null && other.idfuncionario != null) || (this.idfuncionario != null && !this.idfuncionario.equals(other.idfuncionario))) {
            return false;
        }
        return true;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senhafuncionario
     */
    public String getSenhafuncionario() {
        return senhafuncionario;
    }

    /**
     * @param senhafuncionario the senhafuncionario to set
     */
    public void setSenhafuncionario(String senhafuncionario) {
        this.senhafuncionario = senhafuncionario;
    }
    
}
