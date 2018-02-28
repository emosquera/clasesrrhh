//QSGEN This file will be ignored in future code generations if it's changed
package c_foja_servicio;

import b_legajo_personal.Persona;
import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.EstadoJubilacionRetiro;
/**
 * Clase Jubilacion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Jubilacion.
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="JUBILACION")
public class Jubilacion extends EntityBase<Long> {
    /**
     * codigo de registro de la Jubilacion
     *
     * @see #getCodigo()
     */
    private Integer codigo;
    /**
     * Persona a la cual se asocia la Jubilacion
     *
     * @see #getPersona()
     */
    private Persona persona;
    /**
     * Fecha en que se realiza la solicitud de Jubilacion
     *
     * @see #getFechaSolicitud()
     */
    private Date fechaSolicitud;
    /**
     * Fecha en la que se aprueba o rechaza la Jubilacion
     *
     * @see #getFechaRespuesta()
     */
    private Date fechaRespuesta;
    /**
     * Estado de la Jubilacion
     *
     * @see #getEstado()
     */
    private EstadoJubilacionRetiro estado;
    /**
     * Getter.
     *
     * @return codigo: codigo de registro de la Jubilacion.
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
     * @return persona: persona a la cual se le asocia la Jubilacion.
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
    /**
     * Getter.
     *
     * @return fechaSolicitud: fecha en la que se solicita la Jubilacion.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_SOLICITUD", nullable = false)
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaSolicitud
     *
     * @param fechaSolicitud
     */
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
    /**
     * Getter.
     *
     * @return fechaRespuesta: fecha en la cual se aprueba o rechaza la Jubilacion.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_RESPUESTA", nullable = true)
    public Date getFechaRespuesta() {
        return fechaRespuesta;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaRespuesta
     *
     * @param fechaRespuesta
     */
    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }
    /**
     * Getter.
     *
     * @return estado: estado de la Jubilacion.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="ESTADO", nullable = false)
    public EstadoJubilacionRetiro getEstado() {
        return estado;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estado
     *
     * @param estado
     */
    public void setEstado(EstadoJubilacionRetiro estado) {
        this.estado = estado;
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
        if (!(object instanceof Jubilacion)) {
            return false;
        }
        Jubilacion other = (Jubilacion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "c_foja_servicio.Jubilacion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Jubilacion
     */
    public Jubilacion() {
    }
    
}
