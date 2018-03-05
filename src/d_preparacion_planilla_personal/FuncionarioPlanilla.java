//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import b_legajo_personal.Disposicion;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase FuncionarioPlanilla extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la asociacion de Funcionarios a Planilla de Personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="FUNCIONARIO_PLANILLA")
public class FuncionarioPlanilla extends EntityBase<Long> {
    /**
     * disposicion asociada a la planilla de personal
     *
     * @see #getDisposicion()
     */
    private Disposicion disposicion;
    /**
     * Planilla de personal asociada a la Disposicion
     *
     * @see #getPlanillaPersonal()
     */
    private TipoPlanillaPersonal planillaPersonal;
    /**
     * Listado de Conceptos asociados al funcionario
     *
     * @see #getConceptosFuncionarioPlanillas()
     */
    private List<ConceptosFuncionarioPlanilla> conceptosFuncionarioPlanillas;
    /**
     * Getter.
     *
     * @return disposicion: disposicion asociada a la planilla de personal.
     */
    @ManyToOne
    @JoinColumn(name="DISPOSICION_ID")
    public Disposicion getDisposicion() {
        return disposicion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo disposicion
     *
     * @param disposicion
     */
    public void setDisposicion(Disposicion disposicion) {
        this.disposicion = disposicion;
    }
    /**
     * Getter.
     *
     * @return planillaPersonal: Planilla de personal asociada a la Disposicion.
     */
    @ManyToOne
    @JoinColumn(name="TIPO_PLANILLA_PERSONAL_ID")
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
     * @return conceptosFuncionarioPlanillas: Planilla de personal asociada a la Disposicion.
     */
    @OneToMany(mappedBy = "funcionario")
    public List<ConceptosFuncionarioPlanilla> getConceptosFuncionarioPlanillas() {
        return conceptosFuncionarioPlanillas;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo conceptosFuncionarioPlanillas
     *
     * @param conceptosFuncionarioPlanillas
     */
    public void setConceptosFuncionarioPlanillas(List<ConceptosFuncionarioPlanilla> conceptosFuncionarioPlanillas) {
        this.conceptosFuncionarioPlanillas = conceptosFuncionarioPlanillas;
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
        if (!(object instanceof FuncionarioPlanilla)) {
            return false;
        }
        FuncionarioPlanilla other = (FuncionarioPlanilla) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.FuncionarioPlanilla[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad FuncionarioPlanilla
     */
    public FuncionarioPlanilla() {
    }
    
}
