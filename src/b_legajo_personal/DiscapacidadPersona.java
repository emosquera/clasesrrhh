//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import g_gestion_tablas_catalogos.Discapacidad;
import y_entity.base.EntityBase;
import z_enums.catalogo.TipoDocumentoProbatorioDiscapacidad;
import java.util.Date;
import javax.persistence.*;
/**
 * Clase DiscapacidadPersona extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a las Discapacidades de una Persona
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
public class DiscapacidadPersona extends EntityBase<Long> {
    /**
     * discapacidad asociada a la persona
     *
     * @see #getDiscapacidad()
     */
    private Discapacidad discapacidad;
    /**
     * fecha Inicio de la Discapacidad de la Persona
     *
     * @see #getFechaInicio()
     */
    private Date fechaInicio;
    /**
     * fecha Fin de la Discapacidad de la Persona, Solo cuando la Discapacidad no es permanente
     *
     * @see #getFechaFin()
     */
    private Date fechaFin;
    /**
     * Tipo de documento probatorio de la discapacidad
     *
     * @see #getTipoDocumentoProbatorioDiscapacidad()
     */
    private TipoDocumentoProbatorioDiscapacidad tipoDocumentoProbatorio;
    /**
     * numero de Documento probatorio de la discapacidad
     *
     * @see #getNumeroDocumento()
     */
    private int numeroDocumento;
    /**
     * persona a la cual se le asocia la discapacidad
     *
     * @see #getPersona()
     */
    private Persona persona;
    /**
     * Getter.
     *
     * @return discapacidad: Discapacidad que se asocia a la persona.
     */
    @ManyToOne
    @JoinColumn(name="DISCAPACIDAD_ID")
    public Discapacidad getDiscapacidad() {
        return discapacidad;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo discapacidad
     *
     * @param discapacidad
     */
    public void setDiscapacidad(Discapacidad discapacidad) {
        this.discapacidad = discapacidad;
    }
    /**
     * Getter.
     *
     * @return fechaInicio: fecha de inicio de la discapacidad.
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
     * @return fechaFin: fecha de fin de la discapacidad.
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
     * @return tipoDocumentoProbatorio: tipo de documento probatorio de la discapacidad.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_DOCUMENTO_PROBATORIO", nullable = false)
    public TipoDocumentoProbatorioDiscapacidad getTipoDocumentoProbatorio() {
        return tipoDocumentoProbatorio;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoDocumentoProbatorio
     *
     * @param tipoDocumentoProbatorio
     */
    public void setTipoDocumentoProbatorio(TipoDocumentoProbatorioDiscapacidad tipoDocumentoProbatorio) {
        this.tipoDocumentoProbatorio = tipoDocumentoProbatorio;
    }
    /**
     * Getter.
     *
     * @return numeroDocumento: numero de documento probatorio de la discapacidad.
     */
    @Column(name="NUMERO_DOCUMENTO_PROBATORIO", nullable = false)
    public int getNumeroDocumento() {
        return numeroDocumento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo numeroDocumento
     *
     * @param numeroDocumento
     */
    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    /**
     * Getter.
     *
     * @return persona: persona a la cual se le asocia la discapacidad.
     */
    @ManyToOne
    @JoinColumn(name="PERSONA_ID")
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
        if (!(object instanceof DiscapacidadPersona)) {
            return false;
        }
        DiscapacidadPersona other = (DiscapacidadPersona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.DiscapacidadPersona[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad DiscapacidadPersona
     */
    public DiscapacidadPersona() {
    }
    
}
