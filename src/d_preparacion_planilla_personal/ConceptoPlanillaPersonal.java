//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import y_entity.base.EntityBase;
import entity.externos.ObjetoGasto;
import java.util.List;
import z_enums.catalogo.TipoConceptoEnum;
import javax.persistence.*;
/**
 * Clase ConceptoPlanillaPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a los conceptos de la Planilla de Personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CONCEPTO_PLANILLA_PERSONAL")
public class ConceptoPlanillaPersonal extends EntityBase<Long> {
    /**
     * codigo del Concepto de la Planilla de Personal
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion del Concepto de la Planilla de Personal
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * abreviatura del Concepto de la Planilla de Personal
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * tipo de Concepto de la Planilla de Personal
     *
     * @see #getTipoConcepto()
     */
    private TipoConceptoEnum tipoConcepto;
    /**
     * objeto de gasto asociado al Concepto de la Planilla de Personal
     *
     * @see #getObjetoGasto()
     */
    private ObjetoGasto objetoGasto;
    /**
     * Listado de Grupos de conceptos a los cuales esta asociado el concepto
     *
     * @see #getConceptoGruposConceptosPlanillaPersonal()
     */
    private List<ConceptoGrupoConceptosPlanillaPersonal> conceptoGruposConceptosPlanillaPersonal;
    /**
     * Listado de conceptos de funcionarios asociados al concepto
     *
     * @see #getConceptosFuncionarioPlanillas()
     */
    private List<ConceptosFuncionarioPlanilla> conceptosFuncionarioPlanillas;
    /**
     * Listado de Embargos donde se aplica el concepto como descuento
     *
     * @see #getEmbargosConceptoAsociado()
     */
    private List<Embargo> embargosConceptoAsociado;
    /**
     * Listado de Embargos donde se aplica el concepto como base
     *
     * @see #getEmbargosConceptoBase()
     */
    private List<Embargo> embargosConceptoBase;
    /**
     * Getter.
     *
     * @return codigo: codigo del Concepto de la Planilla de Personal.
     */
    @Column(name="CODIGO", nullable = false, length = 8)
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
     * @return descripcion: descripcion del Concepto de la Planilla de Personal.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 50)
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
     * @return abreviatura: abreviatura del Concepto de la Planilla de Personal.
     */
    @Column(name="ABREVIATURA", nullable = false, length = 10)
    public String getAbreviatura() {
        return abreviatura;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo abreviatura
     *
     * @param abreviatura
     */
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    /**
     * Getter.
     *
     * @return TipoConceptoEnum: tipo de concepto de la Planilla de Personal.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_CONCEPTO", nullable = false)
    public TipoConceptoEnum getTipoConcepto() {
        return tipoConcepto;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoConcepto
     *
     * @param tipoConcepto
     */
    public void setTipoConcepto(TipoConceptoEnum tipoConcepto) {
        this.tipoConcepto = tipoConcepto;
    }
    /**
     * Getter.
     *
     * @return objetoGasto: Objeto de Gasto asociado al concepto de la Planilla de Personal.
     */
    @ManyToOne
    @JoinColumn(name="OBJETO_GASTO_ID")
    public ObjetoGasto getObjetoGasto() {
        return objetoGasto;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo objetoGasto
     *
     * @param objetoGasto
     */
    public void setObjetoGasto(ObjetoGasto objetoGasto) {
        this.objetoGasto = objetoGasto;
    }
    /**
     * Getter.
     *
     * @return conceptoGruposConceptosPlanillaPersonal: Listado de Grupos de conceptos a los cuales esta asociado el concepto.
     */
    @OneToMany(mappedBy = "concepto")
    public List<ConceptoGrupoConceptosPlanillaPersonal> getConceptosGrupoConceptosPlanillaPersonal() {
        return conceptoGruposConceptosPlanillaPersonal;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo conceptoGruposConceptosPlanillaPersonal
     *
     * @param conceptoGruposConceptosPlanillaPersonal
     */
    public void setConceptoGruposConceptosPlanillaPersonal(List<ConceptoGrupoConceptosPlanillaPersonal> conceptoGruposConceptosPlanillaPersonal) {
        this.conceptoGruposConceptosPlanillaPersonal = conceptoGruposConceptosPlanillaPersonal;
    }
    /**
     * Getter.
     *
     * @return conceptosFuncionarioPlanillas: Listado de conceptos de funcionarios asociados al Concepto.
     */
    @OneToMany(mappedBy = "concepto")
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
    /**
     * Getter.
     *
     * @return embargosConceptoAsociado: Listado de Embargos donde se aplica el concepto como descuento.
     */
    @OneToMany(mappedBy = "conceptoAsociado")
    public List<Embargo> getEmbargosConceptoAsociado() {
        return embargosConceptoAsociado;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo embargosConceptoAsociado
     *
     * @param embargosConceptoAsociado
     */
    public void setEmbargosConceptoAsociado(List<Embargo> embargosConceptoAsociado) {
        this.embargosConceptoAsociado = embargosConceptoAsociado;
    }
    /**
     * Getter.
     *
     * @return embargosConceptoBase: Listado de Embargos donde se aplica el concepto como base.
     */
    @OneToMany(mappedBy = "conceptoBase")
    public List<Embargo> getEmbargosConceptoBase() {
        return embargosConceptoBase;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo embargosConceptoBase
     *
     * @param embargosConceptoBase
     */
    public void setEmbargosConceptoBase(List<Embargo> embargosConceptoBase) {
        this.embargosConceptoBase = embargosConceptoBase;
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
        if (!(object instanceof ConceptoPlanillaPersonal)) {
            return false;
        }
        ConceptoPlanillaPersonal other = (ConceptoPlanillaPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.ConceptoPlanillaPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad ConceptoPlanillaPersonal
     */
    public ConceptoPlanillaPersonal() {
    }
    
    
}