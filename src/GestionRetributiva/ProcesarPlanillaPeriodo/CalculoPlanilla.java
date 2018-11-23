/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionRetributiva.ProcesarPlanillaPeriodo;

import Clasificadores.PlanillaPersonal.PlanillaPersonal;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import y_entity.base.EntityBase;


@Entity
@Table(name="CPL_MA_CALCULOPLA")
public class CalculoPlanilla extends EntityBase<Long> {

    @OneToMany(mappedBy = "calculoPlanilla")
    private List<DetalleCalculoPlanilla> detallesCalculoPlanilla;

    @ManyToOne
    @JoinColumn(name="PLANILLA_ID")
    private PlanillaPersonal planilla;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    private int version;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CalculoPlanilla)) {
            return false;
        }
        CalculoPlanilla other = (CalculoPlanilla) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "_2_Ejecuci\u00f3ndeServiciosdePersonal._2_Gesti\u00f3ndeRemuneraciones._5_Gesti\u00f3nRetributiva._4_LiquidarPlanilla._1_ProcesarPlanillaporPeriodo.CalculoPlanilla[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
