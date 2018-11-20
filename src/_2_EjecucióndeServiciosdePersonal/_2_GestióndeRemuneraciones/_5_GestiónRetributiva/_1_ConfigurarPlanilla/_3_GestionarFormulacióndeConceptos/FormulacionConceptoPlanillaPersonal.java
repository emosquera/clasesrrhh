/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._5_GestiónRetributiva._1_ConfigurarPlanilla._3_GestionarFormulacióndeConceptos;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._4_GestionarConceptosdeBeneficios._1_GestionarConceptosdePlanilladePersonal.ConceptoPlanillaPersonal;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._8_GestionarPlanilladePersonal.PlanillaPersonal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;


@Entity
@Table(name="FOC_MA_FORMULACON")
public class FormulacionConceptoPlanillaPersonal extends EntityBase<Long> {

    @OneToMany(mappedBy = "formulacionConcepto")
    private List<CondicionFormulacion> condicionesFormulacion;

    @ManyToOne
    @JoinColumn(name="PLANILLA_ID")
    private PlanillaPersonal planilla;
    
    
    @ManyToOne
    @JoinColumn(name="CONCEPTO_ID")
    private ConceptoPlanillaPersonal concepto;
    
    private Integer orden;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormulacionConceptoPlanillaPersonal)) {
            return false;
        }
        FormulacionConceptoPlanillaPersonal other = (FormulacionConceptoPlanillaPersonal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FormulacionConceptoPlanillaPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
