/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionRetributiva.CerrarPlanillaPeriodo;

import Clasificadores.ConceptoPlanillaPersonal.ConceptoPlanillaPersonal;
import IncorporacionRecursosHumanos.Disposicion.Disposicion;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import y_entity.base.EntityBase;

@Entity
@Table(name="DCR_MV_DETCIEPLA")
public class DetalleCierrePlanilla extends EntityBase<Long> {

    @ManyToOne
    @JoinColumn(name="CIERREPLA_ID")
    private CierrePlanilla cierrePlanilla;
        
    @ManyToOne
    @JoinColumn(name="DISPOSICION_ID")
    private Disposicion disposicion;
    
    @ManyToOne
    @JoinColumn(name="CONCEPTO_ID")
    private ConceptoPlanillaPersonal concepto;
    
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
        if (!(object instanceof DetalleCierrePlanilla)) {
            return false;
        }
        DetalleCierrePlanilla other = (DetalleCierrePlanilla) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "_2_Ejecuci\u00f3ndeServiciosdePersonal._2_Gesti\u00f3ndeRemuneraciones._5_Gesti\u00f3nRetributiva._4_LiquidarPlanilla._3_CerrarPlanillaporPeriodo.CierrePlanilla[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
