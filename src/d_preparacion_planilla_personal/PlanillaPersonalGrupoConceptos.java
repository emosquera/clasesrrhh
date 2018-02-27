//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase PlanillaPersonalGrupoConceptos extiende de {@link EntityBase}
 *
 * Contiene la información de la relacion de la Planilla de Personal con los Grupos de Conceptos
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="PLANILLA_PERSONAL_GRUPO_CONCEPTOS")
public class PlanillaPersonalGrupoConceptos extends EntityBase<Long> {
    /**
     * Planilla Personal a la cual se le asocia el Grupo de Conceptos
     *
     * @see #getPlanillaPersonal()
     */
    
    private TipoPlanillaPersonal planillaPersonal;
    /**
     * Grupo de Conceptos a la cual se le asocia la Planilla de Personal
     *
     * @see #getGrupoConceptos()
     */
    
    private GrupoConceptosPlanillaPersonal grupoConceptos;
    /**
     * Getter.
     *
     * @return planillaPersonal: Planilla Personal a la cual se le asocia el Grupo de Conceptos.
     */
    @ManyToOne
    @JoinColumn(name="PLANILLA_PERSONAL_ID")
    public TipoPlanillaPersonal getPlanillaPersonal() {
        return planillaPersonal;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo planillaPersonal
     *
     * @param planillaPersonal
     */
    public void setPlanillaPersonal(TipoPlanillaPersonal planillaPersonal) {
        this.planillaPersonal = planillaPersonal;
    }
    /**
     * Getter.
     *
     * @return grupoConceptos: Grupo de Conceptos a la cual se le asocia la Planilla de Personal.
     */
    @ManyToOne
    @JoinColumn(name="GRUPO_CONCEPTOS_ID")
    public GrupoConceptosPlanillaPersonal getGrupoConceptos() {
        return grupoConceptos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo grupoConceptos
     *
     * @param grupoConceptos
     */
    public void setGrupoConceptos(GrupoConceptosPlanillaPersonal grupoConceptos) {
        this.grupoConceptos = grupoConceptos;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanillaPersonalGrupoConceptos)) {
            return false;
        }
        PlanillaPersonalGrupoConceptos other = (PlanillaPersonalGrupoConceptos) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.PlanillaPersonalGrupoConceptos[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad PlanillaPersonalGrupoConceptos
     */
    public PlanillaPersonalGrupoConceptos() {
    }
    
}
