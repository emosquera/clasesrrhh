//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase GrupoConceptosPlanillaPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al grupo de conceptos de la planilla de personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="GRUPO_CONCEPTOS_PLANILLA_PERSONAL")
public class GrupoConceptosPlanillaPersonal extends EntityBase<Long> {
    /**
     * codigo del Grupo de Conceptos de la Planilla de Personal
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion del Grupo de Conceptos de la Planilla de Personal
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Listado de conceptos asociados al grupo
     *
     * @see #getConceptosGrupoConceptosPlanillaPersonal()
     */
    private List<ConceptoGrupoConceptosPlanillaPersonal> conceptosGrupoConceptosPlanillaPersonal;
    /**
     * Listado de Planillas de Personal a las cuales se le asocia el grupo de conceptos
     *
     * @see #getPlanillasPersonalGrupoConceptos()
     */
    private List<PlanillaPersonalGrupoConceptos> planillasPersonalGrupoConceptos;
    /**
     * Getter.
     *
     * @return codigo: codigo del Grupo de Conceptos.
     */
    @Column(name="CODIGO", nullable = false, length = 5)
    public String getCodigo() {
        return codigo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo codigo
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * Getter.
     *
     * @return descripcion: descripcion del Grupo de Conceptos.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 200)
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo descripcion
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Getter.
     *
     * @return conceptosGrupoConceptosPlanillaPersonal: Listado de conceptos asociados al grupo.
     */
    @OneToMany(mappedBy = "grupo")
    public List<ConceptoGrupoConceptosPlanillaPersonal> getConceptosGrupoConceptosPlanillaPersonal() {
        return conceptosGrupoConceptosPlanillaPersonal;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo conceptosGrupoConceptosPlanillaPersonal
     *
     * @param conceptosGrupoConceptosPlanillaPersonal
     */
    public void setConceptosGrupoConceptosPlanillaPersonal(List<ConceptoGrupoConceptosPlanillaPersonal> conceptosGrupoConceptosPlanillaPersonal) {
        this.conceptosGrupoConceptosPlanillaPersonal = conceptosGrupoConceptosPlanillaPersonal;
    }
    /**
     * Getter.
     *
     * @return planillasPersonalGrupoConceptos: Listado de Planillas de Personal a las cuales se le asocia el grupo de conceptos.
     */
    @OneToMany(mappedBy = "grupoConceptos")
    public List<PlanillaPersonalGrupoConceptos> getPlanillasPersonalGrupoConceptos() {
        return planillasPersonalGrupoConceptos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo planillasPersonalGrupoConceptos
     *
     * @param planillasPersonalGrupoConceptos
     */
    public void setPlanillasPersonalGrupoConceptos(List<PlanillaPersonalGrupoConceptos> planillasPersonalGrupoConceptos) {
        this.planillasPersonalGrupoConceptos = planillasPersonalGrupoConceptos;
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
        if (!(object instanceof GrupoConceptosPlanillaPersonal)) {
            return false;
        }
        GrupoConceptosPlanillaPersonal other = (GrupoConceptosPlanillaPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.GrupoConceptosPlanillaPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad GrupoConceptosPlanillaPersonal
     */
    public GrupoConceptosPlanillaPersonal() {
    }
    
}
