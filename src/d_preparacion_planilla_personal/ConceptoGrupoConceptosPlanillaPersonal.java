//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase ConceptoGrupoConceptosPlanillaPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a los conceptos asociados a grupo de conceptos de la planilla de personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CONCEPTO_GRUPO_CONCEPTOS_PLANILLA_PERSONAL")
public class ConceptoGrupoConceptosPlanillaPersonal extends EntityBase<Long> {
    /**
     * Concepto asociado al grupo de conceptos
     *
     * @see #getConcepto()
     */
    private ConceptoPlanillaPersonal concepto;
    /**
     * grupo de conceptos al cual se asocia el concepto
     *
     * @see #getGrupo()
     */
    private GrupoConceptosPlanillaPersonal grupo;
    /**
     * Getter.
     *
     * @return concepto: Concepto asociado al grupo de conceptos
     */
    @ManyToOne
    @JoinColumn(name="CONCEPTO_PLANILLA_PERSONAL_ID")
    public ConceptoPlanillaPersonal getConcepto() {
        return concepto;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo concepto
     *
     * @param concepto
     */
    public void setConcepto(ConceptoPlanillaPersonal concepto) {
        this.concepto = concepto;
    }
    /**
     * Getter.
     *
     * @return grupo: grupo de conceptos al cual se asocia el concepto.
     */
    @ManyToOne
    @JoinColumn(name="GRUPO_CONCEPTOS_PLANILLA_PERSONAL_ID")
    public GrupoConceptosPlanillaPersonal getGrupo() {
        return grupo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo grupo
     *
     * @param grupo
     */
    public void setGrupo(GrupoConceptosPlanillaPersonal grupo) {
        this.grupo = grupo;
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
        if (!(object instanceof ConceptoGrupoConceptosPlanillaPersonal)) {
            return false;
        }
        ConceptoGrupoConceptosPlanillaPersonal other = (ConceptoGrupoConceptosPlanillaPersonal) object;
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
    public ConceptoGrupoConceptosPlanillaPersonal() {
    }
    
}
