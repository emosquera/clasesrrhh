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
 * Clase TipoCargo extiende de {@link EntityBase}
 *
 * Contiene la definición de los Tipos de Cargos
 * 
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TCA_CL_TIPOCARGO")
public class TipoCargo extends EntityBase<Long> {
    
    /**
     * Nombre o Descripcion del Tipo de Cargo
     */
    private String nombre;
    
    /**
     * Abreviatura que identifica el Tipo de Cargo
     */
    private String abreviatura;

   @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCargo)) {
            return false;
        }
        TipoCargo other = (TipoCargo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "TipoCargo[ id=" + id + " ]";
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
