/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasYCatalogos;

import Clasificadores.DiscapacidadPersona.DiscapacidadPersona;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;

/**
 * Clase Discapacidad extiende de {@link EntityBase}
 *
 * Contiene la información de las Discapacidades que se le pueden asociar a una {@link Persona}
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name = "DIS_CL_DISCAP")
public class Discapacidad extends EntityBase<Long> {

    /**
     * Listado de Personas que tienen la Discapacidad
     */
    @OneToMany(mappedBy = "discapacidad")
    private List<DiscapacidadPersona> discapacidadPersonas;
        
    /**
     * Describe los efectos de la discapacidad
     */
    private String descripcion;
    
    
    /**
     * Indica si la discapacidad es temporal (False) o permanente (True)
     */
    private Boolean isPermanente;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Discapacidad)) {
            return false;
        }
        Discapacidad other = (Discapacidad) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Discapacidad[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
