//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._4_GestionarConceptosdeBeneficios._1_GestionarConceptosdePlanilladePersonal.ConceptoPlanillaPersonal;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._1_GestionarDatosdePersona.Persona;
import entity.externos.Beneficiario;
import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.TipoCalculoEmbargoEnum;
/**
 * Clase Embargo extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Embargo
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="EMBARGO")
public class Embargo extends EntityBase<Long> {
    /**
     * codigo de registro del Embargo
     *
     * @see #getCodigo()
     */
    private Integer codigo;
    /**
     * tipo de Embargo
     *
     * @see #getTipoEmbargo()
     */
    private TipoEmbargo tipoEmbargo;
    /**
     * descripcion del Embargo
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Institucion que realiza el embargo
     *
     * @see #getInstitucionEmbargo()
     */
    private InstitucionEmbargo institucionEmbargo;
    /**
     * Funcionario al cual se le realiza el embargo
     *
     * @see #getFuncionario()
     */
    private Persona funcionario;
    /**
     * fecha de registro del embargo
     *
     * @see #getFechaRegistro()
     */
    private Date fechaRegistro;
    /**
     * fecha de sentencia del embargo
     *
     * @see #getFechaSentencia()
     */
    private Date fechaSentencia;
    /**
     * referencia del docummento de embargo
     *
     * @see #getReferenciaDocumento()
     */
    private String referenciaDocumento;
    /**
     * Concepto de descuento del Embargo
     *
     * @see #getConceptoAsociado()
     */
    private ConceptoPlanillaPersonal conceptoAsociado;
    /**
     * fecha de inicio del embargo
     *
     * @see #getFechaInicio()
     */
    private Date fechaInicio;
    /**
     * fecha de fin del embargo
     *
     * @see #getFechaFin()
     */
    private Date fechaFin;
    /**
     * Concepto sobre el cual se realiza el Embargo
     *
     * @see #getConceptoBase()
     */
    private ConceptoPlanillaPersonal conceptoBase;
    /**
     * tipo de calculo del embargo
     *
     * @see #getTipoCalculo()
     */
    private TipoCalculoEmbargoEnum tipoCalculo;
    /**
     * valor segun el tipo de calculo del embargo
     *
     * @see #getValor()
     */
    private double valor;
    /**
     * beneficiario del embargo
     *
     * @see #getBeneficiario()
     */
    private Beneficiario beneficiario;
    /**
     * relacion del beneficiario del embargo con el funcionario
     *
     * @see #getRelacion()
     */
    private String relacion;
    /**
     * Getter.
     *
     * @return codigo: codigo de registro del embargo.
     */
    @Column(name="CODIGO", nullable = false)
    public Integer getCodigo() {
        return codigo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo codigo
     *
     * @param codigo
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    /**
     * Getter.
     *
     * @return tipoEmbargo: tipo de embargo.
     */
    @ManyToOne
    @JoinColumn(name="TIPO_EMBARGO_ID")
    public TipoEmbargo getTipoEmbargo() {
        return tipoEmbargo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoEmbargo
     *
     * @param tipoEmbargo
     */
    public void setTipoEmbargo(TipoEmbargo tipoEmbargo) {
        this.tipoEmbargo = tipoEmbargo;
    }
    /**
     * Getter.
     *
     * @return descripcion: descripcion del embargo.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 30)
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
     * @return institucionEmbargo: institucion que realiza el embargo.
     */
    @ManyToOne
    @JoinColumn(name="INSTITUCION_EMBARGO_ID")
    public InstitucionEmbargo getInstitucionEmbargo() {
        return institucionEmbargo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo institucionEmbargo
     *
     * @param institucionEmbargo
     */
    public void setInstitucionEmbargo(InstitucionEmbargo institucionEmbargo) {
        this.institucionEmbargo = institucionEmbargo;
    }
    /**
     * Getter.
     *
     * @return funcionario: funcionario al cual se le realiza el embargo
     */
    @ManyToOne
    @JoinColumn(name="PERSONA_ID")
    public Persona getFuncionario() {
        return funcionario;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo funcionario
     *
     * @param funcionario
     */
    public void setFuncionario(Persona funcionario) {
        this.funcionario = funcionario;
    }
    /**
     * Getter.
     *
     * @return fechaRegistro: fecha de registro del embargo
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_REGISTRO", nullable = false)
    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaRegistro
     *
     * @param fechaRegistro
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    /**
     * Getter.
     *
     * @return fechaSentencia: fecha de sentencia del embargo
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_SENTENCIA", nullable = false)
    public Date getFechaSentencia() {
        return fechaSentencia;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaSentencia
     *
     * @param fechaSentencia
     */
    public void setFechaSentencia(Date fechaSentencia) {
        this.fechaSentencia = fechaSentencia;
    }
    /**
     * Getter.
     *
     * @return referenciaDocumento: referencia del documento del embargo
     */
    @Column(name="REFERENCIA_DOCUMENTO", nullable = false, length = 30)
    public String getReferenciaDocumento() {
        return referenciaDocumento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo referenciaDocumento
     *
     * @param referenciaDocumento
     */
    public void setReferenciaDocumento(String referenciaDocumento) {
        this.referenciaDocumento = referenciaDocumento;
    }
    /**
     * Getter.
     *
     * @return fechaInicio: fecha de inicio del embargo
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_INICIO", nullable = false)
    public Date getFechaInicio() {
        return fechaInicio;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaInicio
     *
     * @param fechaInicio
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /**
     * Getter.
     *
     * @return fechaFin: fecha de fin del embargo
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_FIN", nullable = true)
    public Date getFechaFin() {
        return fechaFin;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaFin
     *
     * @param fechaFin
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    /**
     * Getter.
     *
     * @return tipoCalculo: tipo de calculo del embargo
     */
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_CALCULO", nullable = false)
    public TipoCalculoEmbargoEnum getTipoCalculo() {
        return tipoCalculo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoCalculo
     *
     * @param tipoCalculo
     */
    public void setTipoCalculo(TipoCalculoEmbargoEnum tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }
    /**
     * Getter.
     *
     * @return valor: valor de acuerdo al tipo de calculo del embargo
     */
    @Column(name="VALOR", nullable = false)
    public double getValor() {
        return valor;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo valor
     *
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    /**
     * Getter.
     *
     * @return beneficiario: beneficiario del embargo
     */
    @ManyToOne
    @JoinColumn(name="BENEFICIARIO_ID")
    public Beneficiario getBeneficiario() {
        return beneficiario;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo beneficiario
     *
     * @param beneficiario
     */
    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }
    /**
     * Getter.
     *
     * @return relacion: relacion del beneficiario con el funcionario del embargo
     */
    @Column(name="RELACION", nullable = false, length = 30)
    public String getRelacion() {
        return relacion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo relacion
     *
     * @param relacion
     */
    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }
    /**
     * Getter.
     *
     * @return conceptoAsociado: Concepto de descuento del Embargo
     */
    @ManyToOne
    @JoinColumn(name="CONCEPTO_ASOCIADO_ID")
    public ConceptoPlanillaPersonal getConceptoAsociado() {
        return conceptoAsociado;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo conceptoAsociado
     *
     * @param conceptoAsociado
     */
    public void setConceptoAsociado(ConceptoPlanillaPersonal conceptoAsociado) {
        this.conceptoAsociado = conceptoAsociado;
    }
    /**
     * Getter.
     *
     * @return conceptoBase: Concepto sobre el cual se realiza el Embargo
     */
    @ManyToOne
    @JoinColumn(name="CONCEPTO_BASE_ID")
    public ConceptoPlanillaPersonal getConceptoBase() {
        return conceptoBase;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo conceptoBase
     *
     * @param conceptoBase
     */
    public void setConceptoBase(ConceptoPlanillaPersonal conceptoBase) {
        this.conceptoBase = conceptoBase;
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
        if (!(object instanceof Embargo)) {
            return false;
        }
        Embargo other = (Embargo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.Embargo[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Embargo
     */
    public Embargo() {
    }
    
}
