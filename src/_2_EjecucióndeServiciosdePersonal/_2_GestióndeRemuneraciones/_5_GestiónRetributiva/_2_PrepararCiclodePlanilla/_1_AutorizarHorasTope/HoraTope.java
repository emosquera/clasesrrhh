/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._5_GestiónRetributiva._2_PrepararCiclodePlanilla._1_AutorizarHorasTope;

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
@Table(name="HTO_MA_HORATOPE")
public class HoraTope extends EntityBase<Long> {

    @OneToMany(mappedBy = "horaTope")
    private List<DetalleHoraTope> montosHoraTope;

    @ManyToOne
    @JoinColumn(name="PLANILLA_ID")
    private PlanillaPersonal planillaPersonal;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaDesde;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaHasta;        

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HoraTope)) {
            return false;
        }
        HoraTope other = (HoraTope) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "_2_Ejecuci\u00f3ndeServiciosdePersonal._2_Gesti\u00f3ndeRemuneraciones._5_Gesti\u00f3nRetributiva._2_PrepararCiclodePlanilla._1_AutorizarHorasTope.HoraTope[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
