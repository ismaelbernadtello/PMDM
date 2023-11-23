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
@Table(name = "Sedes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sede.findAll", query = "SELECT s FROM Sede s")
    , @NamedQuery(name = "Sede.findByCodSede", query = "SELECT s FROM Sede s WHERE s.codSede = :codSede")
    , @NamedQuery(name = "Sede.findByNomSede", query = "SELECT s FROM Sede s WHERE s.nomSede = :nomSede")
    , @NamedQuery(name = "Sede.findByDireccion", query = "SELECT s FROM Sede s WHERE s.direccion = :direccion")
    , @NamedQuery(name = "Sede.findByCiudad", query = "SELECT s FROM Sede s WHERE s.ciudad = :ciudad")
    , @NamedQuery(name = "Sede.findByTelefono", query = "SELECT s FROM Sede s WHERE s.telefono = :telefono")
    , @NamedQuery(name = "Sede.findByCodInspectoria", query = "SELECT s FROM Sede s WHERE s.codInspectoria = :codInspectoria")
    , @NamedQuery(name = "Sede.findByPais", query = "SELECT s FROM Sede s WHERE s.pais = :pais")
    , @NamedQuery(name = "Sede.findBySocioLocal", query = "SELECT s FROM Sede s WHERE s.socioLocal = :socioLocal")})
public class Sede implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "cod_sede")
    private String codSede;
    @Size(max = 100)
    @Column(name = "nom_sede")
    private String nomSede;
    @Size(max = 255)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 100)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 30)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 3)
    @Column(name = "cod_inspectoria")
    private String codInspectoria;
    @Size(max = 2)
    @Column(name = "pais")
    private String pais;
    @Size(max = 3)
    @Column(name = "socio_local")
    private String socioLocal;

    public Sede() {
    }

    public Sede(String codSede) {
        this.codSede = codSede;
    }

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public String getNomSede() {
        return nomSede;
    }

    public void setNomSede(String nomSede) {
        this.nomSede = nomSede;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodInspectoria() {
        return codInspectoria;
    }

    public void setCodInspectoria(String codInspectoria) {
        this.codInspectoria = codInspectoria;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSocioLocal() {
        return socioLocal;
    }

    public void setSocioLocal(String socioLocal) {
        this.socioLocal = socioLocal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSede != null ? codSede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sede)) {
            return false;
        }
        Sede other = (Sede) object;
        if ((this.codSede == null && other.codSede != null) || (this.codSede != null && !this.codSede.equals(other.codSede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.Sede[ codSede=" + codSede + " ]";
    }
    
}
