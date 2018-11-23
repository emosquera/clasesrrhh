/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionRetributiva.ProcesarPlanillaPeriodo;

import IncorporacionRecursosHumanos.Disposicion.ConceptoDisposicion;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import y_entity.base.EntityBase;


@Entity
@Table(name="DCL_MV_DETCALPLA")
public class DetalleCalculoPlanilla extends EntityBase<Long> {

    @ManyToOne
    @JoinColumn(name="CALCULOPLA_ID")
    private CalculoPlanilla calculoPlanilla;
    
    @ManyToOne
    @JoinColumn(name="CPTODISPO_ID")
    private ConceptoDisposicion conceptoDisposicion;
    
    private Double monto;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleCalculoPlanilla)) {
            return false;
        }
        DetalleCalculoPlanilla other = (DetalleCalculoPlanilla) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "DetalleCalculoPlanillaCalculoPlanilla[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
