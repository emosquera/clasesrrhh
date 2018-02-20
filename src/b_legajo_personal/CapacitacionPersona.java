//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import y_entity.base.EntityBase;
import z_enums.catalogo.EstadoAvanceAcademico;
import z_enums.catalogo.TipoDocumentoProbatorioCapacitacion;
import java.util.Date;
import javax.persistence.*;
/**
 * Clase CapacitacionPersona extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Capacitacion de una Persona
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CAPACITACION_PERSONA")
public class CapacitacionPersona extends EntityBase<Long> {
    /**
     * codigo de registro de la Capacitacion
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion de la Capacitacion
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * institucion que imparte la Capacitacion
     *
     * @see #getInstitucion()
     */
    private String institucion;
    /**
     * fecha de inicio de la Capacitacion
     *
     * @see #getFechaInicio()
     */
    private Date fechaInicio;
    /**
     * fecha cuando finaliza la Capacitacion
     *
     * @see #getFechaFin()
     */
    private Date fechaFin;
    /**
     * horas totales de la Capacitacion
     *
     * @see #getHorasTotales()
     */
    private float horasTotales;
    /**
     * horas cursadas de la Capacitacion
     *
     * @see #getHorasCursadas()
     */
    private float horasCursadas;
    /**
     * estado de avance de la Capacitacion
     *
     * @see #getEstadoAvanceAcademico()
     */
    private EstadoAvanceAcademico estadoAvanceAcademico;
    /**
     * tipo documento probatorio de la Capacitacion
     *
     * @see #getTipoDocumentoProbatorio()
     */
    private TipoDocumentoProbatorioCapacitacion tipoDocumentoProbatorio;
    /**
     * numero de documento academico de la Capacitacion
     *
     * @see #getNumeroDocumentoProbatorio()
     */
    private String numeroDocumentoAcademico;
    /**
     * Persona que recibe la Capacitacion
     *
     * @see #getPersona()
     */
    private Persona persona;
    /**
     * Getter.
     *
     * @return codigo: codigo de la Capacitacion.
     */
    @Column(name="CODIGO", nullable = false, length = 14)
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
     * @return descripcion: descripcion de la Capacitacion.
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
     * @return institucion: institucion que imparte la Capacitacion.
     */ 
    @Column(name="INSTITUCION", nullable = false, length = 100)
    public String getInstitucion() {
        return institucion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo institucion
     *
     * @param institucion
     */
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    /**
     * Getter.
     *
     * @return fechaInicio: fecha de inicio de la Capacitacion.
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
     * @return fechaFin: fecha de finalizacion de la Capacitacion.
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
     * @return horasTotales: horas totales de la Capacitacion.
     */ 
    @Column(name="HORAS_TOTALES", nullable = false)
    public float getHorasTotales() {
        return horasTotales;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo horasTotales
     *
     * @param horasTotales
     */
    public void setHorasTotales(float horasTotales) {
        this.horasTotales = horasTotales;
    }
    /**
     * Getter.
     *
     * @return horasCursadas: horas cursadas por la persona de la Capacitacion.
     */ 
    @Column(name="HORAS_CURSADAS", nullable = false)
    public float getHorasCursadas() {
        return horasCursadas;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo horasCursadas
     *
     * @param horasCursadas
     */
    public void setHorasCursadas(float horasCursadas) {
        this.horasCursadas = horasCursadas;
    }
    /**
     * Getter.
     *
     * @return estadoAvanceAcademico: estado del avance acedemico de la persona en la Capacitacion.
     */ 
    @Enumerated(EnumType.STRING)
    @Column(name="ESTADO_AVANCE_ACADEMICO", nullable = false)
    public EstadoAvanceAcademico getEstadoAvanceAcademico() {
        return estadoAvanceAcademico;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estadoAvanceAcademico
     *
     * @param estadoAvanceAcademico
     */
    public void setEstadoAvanceAcademico(EstadoAvanceAcademico estadoAvanceAcademico) {
        this.estadoAvanceAcademico = estadoAvanceAcademico;
    }
    /**
     * Getter.
     *
     * @return tipoDocumentoProbatorio: tipo de documento probatorio de la Capacitacion.
     */ 
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_DOCUMENTO_PROBATORIO", nullable = true)
    public TipoDocumentoProbatorioCapacitacion getTipoDocumentoProbatorio() {
        return tipoDocumentoProbatorio;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoDocumentoProbatorio
     *
     * @param tipoDocumentoProbatorio
     */
    public void setTipoDocumentoProbatorio(TipoDocumentoProbatorioCapacitacion tipoDocumentoProbatorio) {
        this.tipoDocumentoProbatorio = tipoDocumentoProbatorio;
    }
    /**
     * Getter.
     *
     * @return numeroDocumentoAcademico: numero que identifica al docummento Academico de Capacitacion.
     */ 
    @Column(name="NUMERO_DOCUMENTO_ACADEMICO", nullable = true, length = 14)
    public String getNumeroDocumentoAcademico() {
        return numeroDocumentoAcademico;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo numeroDocumentoAcademico
     *
     * @param numeroDocumentoAcademico
     */
    public void setNumeroDocumentoAcademico(String numeroDocumentoAcademico) {
        this.numeroDocumentoAcademico = numeroDocumentoAcademico;
    }
    /**
     * Getter.
     *
     * @return persona: persona que recibe la Capacitacion.
     */ 
    @ManyToOne
    public Persona getPersona() {
        return persona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo persona
     *
     * @param persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
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
        if (!(object instanceof CapacitacionPersona)) {
            return false;
        }
        CapacitacionPersona other = (CapacitacionPersona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.CapacitacionPersona[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad CapacitacionPersona
     */
    public CapacitacionPersona() {
    }

    
    
}
