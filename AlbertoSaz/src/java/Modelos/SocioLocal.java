/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alberto
 */
@Entity
@Table(name = "SociosLocales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SocioLocal.findAll", query = "SELECT s FROM SocioLocal s")
    , @NamedQuery(name = "SocioLocal.findByCodSocio", query = "SELECT s FROM SocioLocal s WHERE s.codSocio = :codSocio")
    , @NamedQuery(name = "SocioLocal.findByNomSocio", query = "SELECT s FROM SocioLocal s WHERE s.nomSocio = :nomSocio")
    , @NamedQuery(name = "SocioLocal.findByOrden", query = "SELECT s FROM SocioLocal s WHERE s.orden = :orden")})
public class SocioLocal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "cod_socio")
    private String codSocio;
    @Size(max = 50)
    @Column(name = "nom_socio")
    private String nomSocio;
    @Column(name = "orden")
    private Short orden;

    public SocioLocal() {
    }

    public SocioLocal(String codSocio) {
        this.codSocio = codSocio;
    }

    public String getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(String codSocio) {
        this.codSocio = codSocio;
    }

    public String getNomSocio() {
        return nomSocio;
    }

    public void setNomSocio(String nomSocio) {
        this.nomSocio = nomSocio;
    }

    public Short getOrden() {
        return orden;
    }

    public void setOrden(Short orden) {
        this.orden = orden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSocio != null ? codSocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SocioLocal)) {
            return false;
        }
        SocioLocal other = (SocioLocal) object;
        if ((this.codSocio == null && other.codSocio != null) || (this.codSocio != null && !this.codSocio.equals(other.codSocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.SocioLocal[ codSocio=" + codSocio + " ]";
    }
    
}
