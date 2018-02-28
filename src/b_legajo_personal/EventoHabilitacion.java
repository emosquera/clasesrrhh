//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase EventoHabilitacion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al evento de habilitacion de Disposicion
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="EVENTO_HABILITACION")
public class EventoHabilitacion extends EntityBase<Long> {
    /**
     * disposicion a la cual se le asocia el evento
     *
     * @see #getDisposicion()
     */
    private Disposicion disposicion;
    /**
     * tipo de evento de habilitacion
     *
     * @see #getTipoEvento()
     */
    private TipoEventoHabilitacion tipoEvento;
    /**
     * fecha de inicio del evento de habilitacion
     *
     * @see #getFechaInicio()
     */
    private Date fechaInicio;
    /**
     * fecha de fin del evento de habilitacion
     *
     * @see #getFechaInicio()
     */
    private Date fechaFin;
    /**
     * Getter.
     *
     * @return disposicion: Disposicion al cual se le asocia el evento
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
     * @return tipoEvento: Tipo de evento al cual se le asocia el evento
     */
    @ManyToOne
    @JoinColumn(name="TIPO_EVENTO_HABILITACION_ID")
    public TipoEventoHabilitacion getTipoEvento() {
        return tipoEvento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoEvento
     *
     * @param tipoEvento
     */
    public void setTipoEvento(TipoEventoHabilitacion tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    /**
     * Getter.
     *
     * @return fechaInicio: fecha de inicio del evento de habilitacion
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
     * @return fechaFin: fecha de fin del evento de habilitacion
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_FIN", nullable = false)
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EventoHabilitacion)) {
            return false;
        }
        EventoHabilitacion other = (EventoHabilitacion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.EventoHabilitacion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad EventoHabilitacion
     */
    public EventoHabilitacion() {
    }
    
}
