/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos;

import javax.persistence.Entity;
import javax.persistence.Table;
import y_entity.base.EntityBase;

/**
 * Clase TipoAusenciaLaboral extiende de {@link EntityBase}
 *
 * Contiene la definición de los Tipos de Ausencias Laborales
 * 
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TAU_CL_TIPOAUSEN")
public class TipoAusenciaLaboral extends EntityBase<Long> {

    /**
     * Nombre identificador del Tipo de Ausencia Laboral.
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
        if (!(object instanceof TipoAusenciaLaboral)) {
            return false;
        }
        TipoAusenciaLaboral other = (TipoAusenciaLaboral) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "TipoEmbargo[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
