/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemahotel.Model;

import java.io.Serializable;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "hospede")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hospede.findAll", query = "SELECT h FROM Hospede h"),
    @NamedQuery(name = "Hospede.findByIdhospede", query = "SELECT h FROM Hospede h WHERE h.idhospede = :idhospede"),
    @NamedQuery(name = "Hospede.findByNomehospede", query = "SELECT h FROM Hospede h WHERE h.nomehospede = :nomehospede"),
    @NamedQuery(name = "Hospede.findByRghospede", query = "SELECT h FROM Hospede h WHERE h.rghospede = :rghospede"),
    @NamedQuery(name = "Hospede.findByRgemissorhospede", query = "SELECT h FROM Hospede h WHERE h.rgEmissor = :rgEmissor"),
    @NamedQuery(name = "Hospede.findByCpfhospede", query = "SELECT h FROM Hospede h WHERE h.cpfhospede = :cpfhospede"),
    @NamedQuery(name = "Hospede.findByDatanascimentohospede", query = "SELECT h FROM Hospede h WHERE h.dataNascimento = :datanascimentohospede"),
    @NamedQuery(name = "Hospede.findByFiliacaohospede", query = "SELECT h FROM Hospede h WHERE h.filiacao = :filiacaohospede"),
    @NamedQuery(name = "Hospede.findByPassaportehospedeestrangeiro", query = "SELECT h FROM Hospede h WHERE h.passaporte = :passaportehospedeestrangeiro")})
public class Hospede implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhospede")
    private Integer idhospede;
    
    @Column(name = "nomehospede")
    private String nomehospede;
    
    @Column(name = "rghospede")
    private String rghospede;
    
    @Column(name = "rgemissorhospede")
    private String rgEmissor;
    
    @Column(name = "cpfhospede")
    private String cpfhospede;
    
    /*
        Mudei o tipo de dado da coluna correspondete no postgres. Lembrar de executar o comando
        
        ALTER TABLE hospede ALTER COLUMN datanascimentohospede TYPE CHAR(10);
    */
    @Column(name = "datanascimentohospede")
    private String dataNascimento;
    
    @Column(name = "filiacaohospede")
    private String filiacao;
    
    @Column(name = "passaportehospedeestrangeiro")
    private String passaporte;
    
    @Column(name = "paisorigem")
    private String paisOrigem;
    
    @JoinTable(name = "hospede_tem_telefone", joinColumns = {
        @JoinColumn(name = "idhospede", referencedColumnName = "idhospede")}, inverseJoinColumns = {
        @JoinColumn(name = "idtelefone", referencedColumnName = "idtelefone")})
    @ManyToMany
    private List<Telefone> telefoneList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhospede")
    private List<CadastroEntrada> cadastroEntrada;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhospede")
    private List<Acompanhante> acompanhante;
    
    @JoinColumn(name = "idendereco", referencedColumnName = "idendereco")
    @ManyToOne
    private Endereco endereco;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idhospede")
    private List<Reserva> reserva;

    public Hospede() {
        this.cpfhospede = "";
        this.endereco = new Endereco();
        this.telefoneList = null;
        this.paisOrigem = "";
        this.reserva = null;
        this.rgEmissor = null;
        this.rghospede = null;
        this.dataNascimento = null;
        this.filiacao = null;
    }

    public Hospede(Integer idhospede) {
        this.idhospede = idhospede;
    }

    public Integer getIdhospede() {
        return idhospede;
    }

    public void setIdhospede(Integer idhospede) {
        this.idhospede = idhospede;
    }

    public String getNomehospede() {
        return nomehospede;
    }

    public void setNomehospede(String nomehospede) {
        this.nomehospede = nomehospede;
    }

    public String getRghospede() {
        return rghospede;
    }

    public void setRghospede(String rghospede) {
        this.rghospede = rghospede;
    }

    public String getRgEmissor() {
        return rgEmissor;
    }

    public void setRgEmissor(String rgEmissor) {
        this.rgEmissor = rgEmissor;
    }

    public String getCpfhospede() {
        return cpfhospede;
    }

    public void setCpfhospede(String cpfhospede) {
        this.cpfhospede = cpfhospede;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }
    
    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @XmlTransient
    public List<Telefone> getTelefoneList() {
        return telefoneList;
    }

    public void setTelefoneList(List<Telefone> telefoneList) {
        this.telefoneList = telefoneList;
    }

    @XmlTransient
    public List<CadastroEntrada> getCadastroEntrada() {
        return cadastroEntrada;
    }

    public void setCadastroEntrada(List<CadastroEntrada> cadastroEntrada) {
        this.cadastroEntrada = cadastroEntrada;
    }

    @XmlTransient
    public List<Acompanhante> getAcompanhante() {
        return acompanhante;
    }

    public void setAcompanhante(List<Acompanhante> acompanhante) {
        this.acompanhante = acompanhante;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
        hash += (idhospede != null ? idhospede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospede)) {
            return false;
        }
        Hospede other = (Hospede) object;
        if ((this.idhospede == null && other.idhospede != null) || (this.idhospede != null && !this.idhospede.equals(other.idhospede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.sistemahotel.Model.Hospede[ idhospede=" + idhospede + " ]";
    }


    
}
