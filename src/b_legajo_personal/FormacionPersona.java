//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import y_entity.base.EntityBase;
import g_gestion_tablas_catalogos.EspecialidadAcademica;
import g_gestion_tablas_catalogos.NivelAcademico;
import g_gestion_tablas_catalogos.OficioProfesion;
import z_enums.catalogo.EstadoAvanceAcademico;
import z_enums.catalogo.TipoDocumentoProbatorioCapacitacion;
import java.util.Date;
import javax.persistence.*;
/**
 * Clase FormacionPersona extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Formacion de una Persona
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="FORMACION_PERSONA")
public class FormacionPersona extends EntityBase<Long>  {
    /**
     * oficio o profesion asociado a la Formacion
     *
     * @see #getOficioProfesion()
     */
    private OficioProfesion oficioProfesion;
    /**
     * nivel academico asociado a la Formacion
     *
     * @see #getNivelAcademico()
     */
    private NivelAcademico nivelAcademico;
    /**
     * especialidad academica asociada a la Formacion
     *
     * @see #getEspecialidadAcademica()
     */
    private EspecialidadAcademica especialidadAcademica;
    /**
     * institucionn que imparte la Formacion
     *
     * @see #getInstitucion()
     */
    private String institucion;
    /**
     * fecha de inicio de la Formacion
     *
     * @see #getFechaInicio()
     */
    private Date fechaInicio;
    /**
     * fecha cuando finaliza la Formacion
     *
     * @see #getFechaFin()
     */
    private Date fechaFin;
    /**
     * horas totales de la Formacion
     *
     * @see #getHorasTotales()
     */
    private float horasTotales;
    /**
     * horas cursadas de la Formacion
     *
     * @see #getHorasCursadas()
     */
    private float horasCursadas;
    /**
     * estado de avance de la Formacion
     *
     * @see #getEstadoAvanceAcademico()
     */
    private EstadoAvanceAcademico estadoAvanceAcademico;
/**
     * tipo documento probatorio de la Formacion
     *
     * @see #getTipoDocumentoProbatorio()
     */
    private TipoDocumentoProbatorioCapacitacion tipoDocumentoProbatorio;
    /**
     * numero de documento academico de la Formacion
     *
     * @see #getNumeroDocumentoProbatorio()
     */
    private String numeroDocumentoAcademico;
    /**
     * Persona que recibe la Formacion
     *
     * @see #getPersona()
     */
    private Persona persona;
    /**
     * Getter.
     *
     * @return oficioProfesion: oficio o profesion asociado a la Formacion.
     */
    @ManyToOne
    @JoinColumn(name = "OFICIO_PROFESION_ID")
    public OficioProfesion getOficioProfesion() {
        return oficioProfesion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo oficioProfesion
     *
     * @param oficioProfesion
     */
    public void setOficioProfesion(OficioProfesion oficioProfesion) {
        this.oficioProfesion = oficioProfesion;
    }
    /**
     * Getter.
     *
     * @return nivelAcademico: nivel academico asociado a la Formacion.
     */
    @ManyToOne
    @JoinColumn(name = "NIVEL_ACADEMICO_ID")
    public NivelAcademico getNivelAcademico() {
        return nivelAcademico;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo nivelAcademico
     *
     * @param nivelAcademico
     */
    public void setNivelAcademico(NivelAcademico nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
    /**
     * Getter.
     *
     * @return especialidadAcademica: especialidad academica asociada a la Formacion.
     */
    @ManyToOne
    @JoinColumn(name = "ESPECIALIDAD_ACADEMICA_ID")
    public EspecialidadAcademica getEspecialidadAcademica() {
        return especialidadAcademica;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo especialidadAcademica
     *
     * @param especialidadAcademica
     */
    public void setEspecialidadAcademica(EspecialidadAcademica especialidadAcademica) {
        this.especialidadAcademica = especialidadAcademica;
    }
    /**
     * Getter.
     *
     * @return institucion: institucion que imparte la Formacion.
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
     * @return fechaInicio: fecha de inicio de la Formacion.
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
     * @return fechaFin: fecha de finalizacion de la Formacion.
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
     * @return horasTotales: horas totales de la Formacion.
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
     * @return horasCursadas: horas cursadas por la persona de la Formacion.
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
     * @return estadoAvanceAcademico: estado del avance acedemico de la persona en la Formacion.
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
     * @return tipoDocumentoProbatorio: tipo de documento probatorio de la Formacion.
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
     * @return numeroDocumentoAcademico: numero que identifica al docummento Academico de Formacion.
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
     * @return persona: persona que recibe la Formacion.
     */ 
    @ManyToOne
    @JoinColumn(name="PERSONA_ID", nullable = false)
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
        if (!(object instanceof FormacionPersona)) {
            return false;
        }
        FormacionPersona other = (FormacionPersona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.FormacionPersona[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad FormacionPersona
     */
    public FormacionPersona() {
    }
        
}
