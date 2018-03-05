//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import entity.externos.FuenteFinanciamiento;
import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase ConceptosFuncionarioPlanilla extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a los conceptos asociados a los funcionarios de la Planilla de Personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CONCEPTOS_FUNCIONARIO_PLANILLA")
public class ConceptosFuncionarioPlanilla extends EntityBase<Long> {
    /**
     * Disposicion de Funcionario Asociado al Concepto
     *
     * @see #getFuncionario()
     */
    private FuncionarioPlanilla funcionario;
    /**
     * Fecha desde la cual se aplica el concepto al funcionario
     *
     * @see #getFechaDesde()
     */
    private Date fechaDesde;
    /**
     * Fecha hasta la cual se aplica el concepto al funcionario
     *
     * @see #getFechaHasta()
     */
    private Date fechaHasta;
    /**
     * cantidad del concepto de funcionario
     *
     * @see #getCantidad()
     */
    private Double cantidad;
    /**
     * monto del concepto de funcionario
     *
     * @see #getMonto()
     */
    private Double monto;
    /**
     * Monto Acumulado del concepto de funcionario
     *
     * @see #getAcumulado()
     */
    private Double acumulado;
    /**
     * indica si el concepto de funcionario esta activo o no
     *
     * @see #getActivo()
     */
    private Boolean activo;
    /**
     * Concepto asociado a la disposicion del funcionario
     *
     * @see #getConcepto()
     */
    private ConceptoPlanillaPersonal concepto;
    /**
     * Fuente de financiamiento asociado al concepto
     *
     * @see #getFuenteFinanciamiento()
     */
    private FuenteFinanciamiento fuenteFinanciamiento;
    /**
     * Getter.
     *
     * @return funcionario: Disposicion de Funcionario Asociado al Concepto.
     */
    @ManyToOne
    @JoinColumn(name="FUNCIONARIO_PLANILLA_ID")
    public FuncionarioPlanilla getFuncionario() {
        return funcionario;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo funcionario
     *
     * @param funcionario
     */
    public void setFuncionario(FuncionarioPlanilla funcionario) {
        this.funcionario = funcionario;
    }
    /**
     * Getter.
     *
     * @return fechaDesde: Fecha desde la cual se aplica el concepto al funcionario.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_DESDE", nullable = false)
    public Date getFechaDesde() {
        return fechaDesde;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaDesde
     *
     * @param fechaDesde
     */
    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }
    /**
     * Getter.
     *
     * @return fechaHasta: Fecha hasta la cual se aplica el concepto al funcionario.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_HASTA", nullable = false)
    public Date getFechaHasta() {
        return fechaHasta;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaHasta
     *
     * @param fechaHasta
     */
    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    /**
     * Getter.
     *
     * @return cantidad: cantidad del concepto de funcionario.
     */
    @Column(name="CANTIDAD", nullable = false)
    public Double getCantidad() {
        return cantidad;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo cantidad
     *
     * @param cantidad
     */
    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }
    /**
     * Getter.
     *
     * @return monto: monto del concepto de funcionario.
     */
    @Column(name="MONTO", nullable = false)
    public Double getMonto() {
        return monto;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo monto
     *
     * @param monto
     */
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    /**
     * Getter.
     *
     * @return acumulado: monto acumulado del concepto de funcionario.
     */
    @Column(name="ACUMULADO", nullable = false)
    public Double getAcumulado() {
        return acumulado;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo acumulado
     *
     * @param acumulado
     */
    public void setAcumulado(Double acumulado) {
        this.acumulado = acumulado;
    }
    /**
     * Getter.
     *
     * @return activo: indica si el concepto de funcionario esta activo o no.
     */
    @Column(name="ACTIVO", nullable = false)
    public Boolean getActivo() {
        return activo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo activo
     *
     * @param activo
     */
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    /**
     * Getter.
     *
     * @return concepto: Concepto asociado a la disposicion del funcionario.
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
     * @return fuenteFinanciamiento: fuenteFinanciamiento asociado a la disposicion del funcionario.
     */
    @ManyToOne
    @JoinColumn(name="FUENTE_FINANCIAMIENTO_ID")
    public FuenteFinanciamiento getFuenteFinanciamiento() {
        return fuenteFinanciamiento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fuenteFinanciamiento
     *
     * @param fuenteFinanciamiento
     */
    public void setFuenteFinanciamiento(FuenteFinanciamiento fuenteFinanciamiento) {
        this.fuenteFinanciamiento = fuenteFinanciamiento;
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
        if (!(object instanceof ConceptosFuncionarioPlanilla)) {
            return false;
        }
        ConceptosFuncionarioPlanilla other = (ConceptosFuncionarioPlanilla) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.ConceptosFuncionarioPlanilla[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad ConceptosFuncionarioPlanilla
     */
    public ConceptosFuncionarioPlanilla() {
    }
    
}
