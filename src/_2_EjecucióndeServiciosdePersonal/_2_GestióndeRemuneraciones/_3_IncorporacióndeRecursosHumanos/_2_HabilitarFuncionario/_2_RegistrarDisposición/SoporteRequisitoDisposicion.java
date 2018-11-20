//QSGEN This file will be ignored in future code generations if it's changed
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._3_IncorporacióndeRecursosHumanos._2_HabilitarFuncionario._2_RegistrarDisposición;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos.RequisitoDisposicion;
import y_entity.base.EntityBase;
import javax.persistence.*;

@Entity
@Table(name="SRD_MV_SOPREQDISP")
public class SoporteRequisitoDisposicion extends EntityBase<Long> {

    @ManyToOne
    @JoinColumn(name="DISPOSICION_ID")
    private Disposicion disposicion;
    
    
    @ManyToOne
    @JoinColumn(name="REQDISPO_ID")
    private RequisitoDisposicion requisitoDisposicion;
    
    private Boolean verificado;
    
    private String comentario;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SoporteRequisitoDisposicion)) {
            return false;
        }
        SoporteRequisitoDisposicion other = (SoporteRequisitoDisposicion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "SoporteRequisitoDisposicion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Disposicion
     */
    public SoporteRequisitoDisposicion() {
    }

}