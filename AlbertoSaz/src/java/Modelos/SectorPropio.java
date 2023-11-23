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
@Table(name = "SectoresPropios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SectorPropio.findAll", query = "SELECT s FROM SectorPropio s")
    , @NamedQuery(name = "SectorPropio.findByCodSector", query = "SELECT s FROM SectorPropio s WHERE s.codSector = :codSector")
    , @NamedQuery(name = "SectorPropio.findByNomSector", query = "SELECT s FROM SectorPropio s WHERE s.nomSector = :nomSector")})
public class SectorPropio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "cod_sector")
    private String codSector;
    @Size(max = 50)
    @Column(name = "nom_sector")
    private String nomSector;

    public SectorPropio() {
    }

    public SectorPropio(String codSector) {
        this.codSector = codSector;
    }

    public String getCodSector() {
        return codSector;
    }

    public void setCodSector(String codSector) {
        this.codSector = codSector;
    }

    public String getNomSector() {
        return nomSector;
    }

    public void setNomSector(String nomSector) {
        this.nomSector = nomSector;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSector != null ? codSector.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SectorPropio)) {
            return false;
        }
        SectorPropio other = (SectorPropio) object;
        if ((this.codSector == null && other.codSector != null) || (this.codSector != null && !this.codSector.equals(other.codSector))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.SectorPropio[ codSector=" + codSector + " ]";
    }
    
}
