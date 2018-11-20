package b_legajo_personal;

import _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._3_IncorporacióndeRecursosHumanos._2_HabilitarFuncionario._2_RegistrarDisposición.Disposicion;
import java.io.File;
import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.MotivoFallecimientoEnum;
import z_enums.catalogo.TipoInformanteEnum;
/**
 * Clase DefuncionTrabajador extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Defuncion de un Trabajador
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="DEFUNCION_TRABAJADOR")
public class DefuncionTrabajador extends EntityBase<Long> {
    /**
     * Disposicion del Funcionario que fallece
     *
     * @see #getDisposicion()
     */
    private Disposicion disposicion;
    /**
     * Tipo de Informante del fallecimiento del Funcionario
     *
     * @see #getTipoInformante()
     */
    private TipoInformanteEnum tipoInformante;
    /**
     * nombre del Informante del fallecimiento del Funcionario
     *
     * @see #getNombreInformante()
     */
    private String nombreInformante;
    /**
     * fecha en que ser verifica el fallecimiento del Funcionario
     *
     * @see #getFechaInspeccion()
     */
    private Date fechaInspeccion;
    /**
     * fecha en que fallece el Funcionario
     *
     * @see #getFechaDefuncion()
     */
    private Date fechaDefuncion;
    /**
     * Motivo de fallecimiento del Funcionario
     *
     * @see #getMotivoFallecimiento()
     */
    private MotivoFallecimientoEnum motivoFallecimiento;
    /**
     * Observaciones referente al fallecimiento del Funcionario
     *
     * @see #getObservacion()
     */
    private String observacion;
    /**
     * documento asociado al fallecimiento del Funcionario
     *
     * @see #getDocumentoAsociado()
     */
    private File documentoAsociado;
    /**
     * Getter.
     *
     * @return disposicion: Disposicion del Funcionario que fallece
     */
    @OneToOne(mappedBy = "defuncionTrabajador")
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
     * @return tipoInformante: tipo de informante del fallecimiento del funcionario
     */
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_INFORMANTE", nullable = false)
    public TipoInformanteEnum getTipoInformante() {
        return tipoInformante;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoInformante
     *
     * @param tipoInformante
     */
    public void setTipoInformante(TipoInformanteEnum tipoInformante) {
        this.tipoInformante = tipoInformante;
    }
    /**
     * Getter.
     *
     * @return nombreInformante: nombre del informante del fallecimiento del funcionario
     */
    @Column(name="NOMBRE_INFORMANTE", nullable = false, length = 200)
    public String getNombreInformante() {
        return nombreInformante;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo nombreInformante
     *
     * @param nombreInformante
     */
    public void setNombreInformante(String nombreInformante) {
        this.nombreInformante = nombreInformante;
    }
    /**
     * Getter.
     *
     * @return fechaInspeccion: fecha de verificacion del fallecimiento del funcionario
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_INSPECCION", nullable = false)
    public Date getFechaInspeccion() {
        return fechaInspeccion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaInspeccion
     *
     * @param fechaInspeccion
     */
    public void setFechaInspeccion(Date fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }
    /**
     * Getter.
     *
     * @return fechaDefuncion: fecha cuando fallece el funcionario
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="NOMBRE_DEFUNCION", nullable = false)
    public Date getFechaDefuncion() {
        return fechaDefuncion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaDefuncion
     *
     * @param fechaDefuncion
     */
    public void setFechaDefuncion(Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }
    /**
     * Getter.
     *
     * @return motivoFallecimiento: motivo de fallecimiento del funcionario
     */
    @Enumerated(EnumType.STRING)
    @Column(name="MOTIVO_FALLECIMIENTO", nullable = false)
    public MotivoFallecimientoEnum getMotivoFallecimiento() {
        return motivoFallecimiento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo motivoFallecimiento
     *
     * @param motivoFallecimiento
     */
    public void setMotivoFallecimiento(MotivoFallecimientoEnum motivoFallecimiento) {
        this.motivoFallecimiento = motivoFallecimiento;
    }
    /**
     * Getter.
     *
     * @return observacion: observacion referente al fallecimiento del funcionario
     */
    @Column(name="OBSERVACION", nullable = false, length = 1000)
    public String getObservacion() {
        return observacion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo observacion
     *
     * @param observacion
     */
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    /**
     * Getter.
     *
     * @return documentoAsociado: documento asociado al del funcionario
     */
    @Column(name="DOCUMENTO_ASOCIADO", nullable = false)
    public File getDocumentoAsociado() {
        return documentoAsociado;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo documentoAsociado
     *
     * @param documentoAsociado
     */
    public void setDocumentoAsociado(File documentoAsociado) {
        this.documentoAsociado = documentoAsociado;
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
        if (!(object instanceof DefuncionTrabajador)) {
            return false;
        }
        DefuncionTrabajador other = (DefuncionTrabajador) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.DefuncionTrabajador[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad DefuncionTrabajador
     */
    public DefuncionTrabajador() {
    }
    
}
