/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasYCatalogos;

import javax.persistence.Entity;
import javax.persistence.Table;
import y_entity.base.EntityBase;

/**
 * Clase TipoJornadaLaboral extiende de {@link EntityBase}
 *
 * Contiene la definición de los Tipos de Jornada Laboral
 * 
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TJL_CL_TIPJORLAB")
public class TipoJornadaLaboral extends EntityBase<Long> {
    
    /**
     * Nombre identificador de la Jornada Laboral.
     */
    private String nombre;            
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoJornadaLaboral)) {
            return false;
        }
        TipoJornadaLaboral other = (TipoJornadaLaboral) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "TipoJornadaLaboral[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
