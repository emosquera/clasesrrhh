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
 * Clase MotivoFallecimiento extiende de {@link EntityBase}
 *
 * Contiene la definición de los Motivos de Falleciemiento
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="MFA_CL_MOTFALLEC")
public class MotivoFallecimiento extends EntityBase<Long> {

    /**
     * Descripción que identifica el Motivo de Fallecimiento.
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
        if (!(object instanceof MotivoFallecimiento)) {
            return false;
        }
        MotivoFallecimiento other = (MotivoFallecimiento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "MotivoFallecimiento[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
