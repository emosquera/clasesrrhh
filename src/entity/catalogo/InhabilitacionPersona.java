//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
import enums.catalogo.MotivoInhabilitacion;
import java.util.Date;
import javax.persistence.*;
/**
 * Clase InhabilitacionPersona extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a las Inhabilitaciones APN de una Persona
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="INHABILITACIONES_PERSONA")
public class InhabilitacionPersona extends EntityBase<Long> {
    /**
     * fecha de inicio de la Inhabilitacion
     *
     * @see #getFechaInicio()
     */
    private Date fechaInicio;
    /**
     * fecha fin de la Inhabilitacion
     *
     * @see #getFechaFin()
     */
    private Date fechaFin;
    /**
     * expediente de la Inhabilitacion
     *
     * @see #getExpediente()
     */
    private String expediente;
    /**
     * motivo de la Inhabilitacion
     *
     * @see #getMotivo()
     */
    private MotivoInhabilitacion motivoInhabilitacion;
    /**
     * descripcion de la Inhabilitacion
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Getter.
     *
     * @return fechaInicio: fecha de inicio de la Inhabilitacion.
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
     * @return fechaFin: fecha fin de la Inhabilitacion.
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
     * @return expendiente: expediente de la Inhabilitacion.
     */
    @Column(name="EXPEDIENTE", nullable = false, length = 120)
    public String getExpediente() {
        return expediente;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo expediente
     *
     * @param expediente
     */
    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }
    /**
     * Getter.
     *
     * @return motivoInhabilitacion: motivo de la Inhabilitacion.
     */
    @Column(name="MOTIVO_INHABILITACION", nullable = false)
    public MotivoInhabilitacion getMotivoInhabilitacion() {
        return motivoInhabilitacion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo motivoInhabilitacion
     *
     * @param motivoInhabilitacion
     */
    public void setMotivoInhabilitacion(MotivoInhabilitacion motivoInhabilitacion) {
        this.motivoInhabilitacion = motivoInhabilitacion;
    }
    /**
     * Getter.
     *
     * @return descripcion: descripcion de la Inhabilitacion.
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InhabilitacionPersona)) {
            return false;
        }
        InhabilitacionPersona other = (InhabilitacionPersona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.InhabilitacionesPersona[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad InhabilitacionPersona
     */
    public InhabilitacionPersona() {
    }
    
}
