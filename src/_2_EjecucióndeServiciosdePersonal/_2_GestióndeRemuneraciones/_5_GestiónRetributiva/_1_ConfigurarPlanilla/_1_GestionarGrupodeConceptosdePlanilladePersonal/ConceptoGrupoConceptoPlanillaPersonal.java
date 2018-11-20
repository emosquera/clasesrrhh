//QSGEN This file will be ignored in future code generations if it's changed
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._5_GestiónRetributiva._1_ConfigurarPlanilla._1_GestionarGrupodeConceptosdePlanilladePersonal;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._4_GestionarConceptosdeBeneficios._1_GestionarConceptosdePlanilladePersonal.ConceptoPlanillaPersonal;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase ConceptoGrupoConceptoPlanillaPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a los conceptos asociados a grupo de conceptos de la planilla de personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CGP_AP_CONGRUPOPLA")
public class ConceptoGrupoConceptoPlanillaPersonal extends EntityBase<Long> {
    /**
     * Concepto asociado al grupo de conceptos
     *
     * @see #getConcepto()
     */
    
    @ManyToOne
    @JoinColumn(name="CONPLAPER_ID")
    private ConceptoPlanillaPersonal concepto;
    
    /**
     * grupo de conceptos al cual se asocia el concepto
     *
     * @see #getGrupo()
     */
    
    @ManyToOne
    @JoinColumn(name="GRUCONPLAPER_ID")
    private GrupoConceptoPlanillaPersonal grupo;
    
    
   
   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConceptoGrupoConceptoPlanillaPersonal)) {
            return false;
        }
        ConceptoGrupoConceptoPlanillaPersonal other = (ConceptoGrupoConceptoPlanillaPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.ConceptoGrupoConceptosPlanillaPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad ConceptoGrupoConceptosPlanillaPersonal
     */
    public ConceptoGrupoConceptoPlanillaPersonal() {
    }
    
}
