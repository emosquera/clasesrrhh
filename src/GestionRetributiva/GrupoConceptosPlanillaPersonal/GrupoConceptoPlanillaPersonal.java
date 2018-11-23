//QSGEN This file will be ignored in future code generations if it's changed
package GestionRetributiva.GrupoConceptosPlanillaPersonal;

import Clasificadores.ConceptoPlanillaPersonal.ConceptoPlanillaPersonal;
import Clasificadores.PlanillaPersonal.PlanillaPersonal;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase GrupoConceptoPlanillaPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al grupo de conceptos de la planilla de personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="GCP_AP_GRUCONPLA")
public class GrupoConceptoPlanillaPersonal extends EntityBase<Long> {
    /**
     * codigo del Grupo de Conceptos de la Planilla de Personal
     *
     */
    private String codigo;
    /**
     * descripcion del Grupo de Conceptos de la Planilla de Personal
     *
     */
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="PLANILLA_ID")
    private PlanillaPersonal planilla;
    
    @ManyToMany
    @JoinTable(name = "CGC_MA_CONGRUCON",
        joinColumns = @JoinColumn(name = "GRUPOCON_ID"),
        inverseJoinColumns = @JoinColumn(name = "CONCEPTO_ID")
    )
    private List<ConceptoPlanillaPersonal> conceptos;
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoConceptoPlanillaPersonal)) {
            return false;
        }
        GrupoConceptoPlanillaPersonal other = (GrupoConceptoPlanillaPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "GrupoConceptoPlanillaPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad GrupoConceptosPlanillaPersonal
     */
    public GrupoConceptoPlanillaPersonal() {
    }
    
}
