//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import b_legajo_personal.Disposicion;
import y_entity.base.EntityBase;
import z_enums.catalogo.PeriodicidadPlanillaPersonal;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
/**
 * Clase TipoPlanillaPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a Planilla de Personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_PLANILLA_PERSONAL")
public class TipoPlanillaPersonal extends EntityBase<Long> {
    /**
     * codigo de registro de la Planilla de Personal
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion de la Planilla de Personal
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * fecha de inicio del periodo de la Planilla de Personal
     *
     * @see #getDesde()
     */
    private Date desde;
    /**
     * fecha de fin del periodo de la Planilla de Personal
     *
     * @see #getHasta()
     */
    private Date hasta;
    /**
     * periodicidad de la Planilla de Personal
     *
     * @see #getPeriodicidad()
     */
    private PeriodicidadPlanillaPersonal periodicidad;
    /**
     * Entidades Asociadas a la Planilla de Personal
     *
     * @see #getEntidadesPlanillaPersonal()
     */
    private List<EntidadPlanillaPersonal> entidadesPlanillaPersonal;
    /**
     * Listado de Grupos de conceptos asociados a la planilla de personal
     *
     * @see #getPlanillaPersonalGruposConceptos()
     */
    private List<PlanillaPersonalGrupoConceptos> planillaPersonalGruposConceptos;
    /**
     * Listado de disposiciones asociadas a la planilla
     *
     * @see #getFuncionariosPlanilla()
     */
    private List<FuncionarioPlanilla> funcionariosPlanilla;
    /**
     * Getter.
     *
     * @return codigo: codigo de registro de la Planilla de Personal.
     */
    @Column(name="CODIGO", nullable = false, length = 4)
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
     * @return descripcion: descripcion de la Planilla de Personal.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 75)
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
     * @return desde: fecha inicio del periodo de la Planilla de Personal.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_DESDE", nullable = false)
    public Date getDesde() {
        return desde;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo desde
     *
     * @param desde
     */
    public void setDesde(Date desde) {
        this.desde = desde;
    }
    /**
     * Getter.
     *
     * @return desde: fecha fin del periodo de la Planilla de Personal.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_HASTA", nullable = false)
    public Date getHasta() {
        return hasta;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo hasta
     *
     * @param hasta
     */
    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }
    /**
     * Getter.
     *
     * @return periodicidad: periodicidad de la Planilla de Personal.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="PERIODICIDAD", nullable = false)
    public PeriodicidadPlanillaPersonal getPeriodicidad() {
        return periodicidad;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo periodicidad
     *
     * @param periodicidad
     */
    public void setPeriodicidad(PeriodicidadPlanillaPersonal periodicidad) {
        this.periodicidad = periodicidad;
    }
    /**
     * Getter.
     *
     * @return entidadesPlanillaPersonal: Entidades asociadas a la Planilla de Personal.
     */
    @OneToMany(mappedBy = "tipoPlanillaPersonal")
    public List<EntidadPlanillaPersonal> getEntidadesPlanillaPersonal() {
        return entidadesPlanillaPersonal;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo entidadesPlanillaPersonal
     *
     * @param entidadesPlanillaPersonal
     */
    public void setEntidadesPlanillaPersonal(List<EntidadPlanillaPersonal> entidadesPlanillaPersonal) {
        this.entidadesPlanillaPersonal = entidadesPlanillaPersonal;
    }
    /**
     * Getter.
     *
     * @return planillaPersonalGruposConceptos: listado de grupo de conceptos asociados a la planilla de personal .
     */
    @OneToMany(mappedBy = "planillaPersonal")
    public List<PlanillaPersonalGrupoConceptos> getPlanillaPersonalGruposConceptos() {
        return planillaPersonalGruposConceptos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo planillaPersonalGruposConceptos
     *
     * @param planillaPersonalGruposConceptos
     */
    public void setPlanillaPersonalGruposConceptos(List<PlanillaPersonalGrupoConceptos> planillaPersonalGruposConceptos) {
        this.planillaPersonalGruposConceptos = planillaPersonalGruposConceptos;
    }
    /**
     * Getter.
     *
     * @return funcionariosPlanilla: Listado de disposiciones asociadas a la planilla.
     */
    @OneToMany(mappedBy = "planillaPersonal")
    public List<FuncionarioPlanilla> getFuncionariosPlanilla() {
        return funcionariosPlanilla;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo funcionariosPlanilla
     *
     * @param funcionariosPlanilla
     */
    public void setFuncionariosPlanilla(List<FuncionarioPlanilla> funcionariosPlanilla) {
        this.funcionariosPlanilla = funcionariosPlanilla;
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
        if (!(object instanceof TipoPlanillaPersonal)) {
            return false;
        }
        TipoPlanillaPersonal other = (TipoPlanillaPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.TipoPlanillaPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoPlanillaPersonal
     */
    public TipoPlanillaPersonal() {
    }
    
}
