/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasYCatalogos;

import javax.persistence.Entity;
import y_entity.base.EntityBase;

/**
 * Clase TipoPuesto extiende de {@link EntityBase}
 *
 * Contiene la definición de los Tipos de Puesto
 * 
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
public class TipoPuesto extends EntityBase<Long> {

    /**
     * Nombre del Tipo de Puesto
     */
    private String nombre;
    
    /**
     * Descripcion del Tipo de Puesto
     */
    private String descripcion;

   @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPuesto)) {
            return false;
        }
        TipoPuesto other = (TipoPuesto) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "TipoPuesto[ id=" + id + " ]";
    }

    /**
     *
     * @return
     */
    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
