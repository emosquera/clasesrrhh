/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasYCatalogos;

import GestionRetributiva.Embargos.Embargo;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import y_entity.base.EntityBase;

/**
 * Clase InstitucionEmbargo extiende de {@link EntityBase}
 *
 * Contiene la definición de las Instituciones de Embargo
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
public class InstitucionEmbargo extends EntityBase<Long> {

    /**
     * codigo de registro de la Institucion de Embargo
     *
     */
    private Integer codigo;
    
    /**
     * Nombre de la Institucion de Embargo
     *
     */
    private String nombre;
    
    /**
     * calle  de ubicacion de la Institucion de Embargo
     *
     */
    private String calle ;
    
    /**
     * Barrio al que pertenece la Insitucion. A traves del Barrio, obtenemos la Ciudad, el Dpto. Territorial y el Pais
     */
    @ManyToOne
    @JoinColumn(name = "BARRIO_ID")
    private Barrio barrio;
    
    /**
     * Número exterior de la calle del domicilio de la institución de embargo
     *
     */
    private String numeroExterior;
    
    /**
     * Número interior de la calle del domicilio de la institución de embargo
     */
    private String numeroInterior;
    
    /**
     * Nombre de la persona a contactar en la institución de embargo
     */
    private String contacto;
    
    /**
     * Correo de la persona a contactar de la institución de embargo
     */
    private String correo;
    
    /**
     * telefono de contacto de la Institucion de Embargo
     *
     */
    private String telefono;
    
    /**
     * RUC de la Institucion de Embargo
     *
     */
    private String ruc;
    
    
    @OneToMany(mappedBy = "institucionEmbargo")
    private List<Embargo> embargos;
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InstitucionEmbargo)) {
            return false;
        }
        InstitucionEmbargo other = (InstitucionEmbargo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "InstitucionEmbargo[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad InstitucionEmbargo
     */
    public InstitucionEmbargo() {
    }
    
}
