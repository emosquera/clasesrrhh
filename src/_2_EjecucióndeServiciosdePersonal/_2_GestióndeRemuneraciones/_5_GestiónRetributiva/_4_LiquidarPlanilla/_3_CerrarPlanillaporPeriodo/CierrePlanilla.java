/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._5_GestiónRetributiva._4_LiquidarPlanilla._3_CerrarPlanillaporPeriodo;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._8_GestionarPlanilladePersonal.PlanillaPersonal;
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
@Table(name="CRP_MA_CIERREPLA")
public class CierrePlanilla extends EntityBase<Long> {

    @OneToMany(mappedBy = "cierrePlanilla")
    private List<DetalleCierrePlanilla> detallesCierrePlanilla;

    @ManyToOne
    @JoinColumn(name="PLANILLA_ID")
    private PlanillaPersonal planillaPersonal;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaCierre;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaIniPla;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFinPlan;
    
    private int versionCalculoPlanilla;
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CierrePlanilla)) {
            return false;
        }
        CierrePlanilla other = (CierrePlanilla) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
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
