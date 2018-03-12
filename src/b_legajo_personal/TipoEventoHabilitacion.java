//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import java.util.List;
import y_entity.base.EntityBase;
import z_enums.catalogo.NaturalezaEventoEnum;
import javax.persistence.*;
/**
 * Clase TipoEventoHabilitacion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al tipo de evento de habilitacion
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_EVENTO_HABILITACION")
public class TipoEventoHabilitacion extends EntityBase<Long> {
    /**
     * tipoEvento de registro del Tipo de Evento de Habilitacion
     *
     * @see #getTipoEvento()
     */
    private Integer tipoEvento;
    /**
     * evento del Tipo de Evento de Habilitacion
     *
     * @see #getEvento()
     */
    private String evento ;
    /**
     * descripcion del Tipo de Evento de Habilitacion
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * naturaleza del Tipo de Evento de Habilitacion
     *
     * @see #getNaturaleza()
     */
    private NaturalezaEventoEnum naturaleza;
    /**
     * Listado de eventos asociados al Tipo de Evento de Habilitacion
     *
     * @see #getEventosHabilitacion()
     */
    private List<EventoHabilitacion> eventosHabilitacion;
    /**
     * Getter.
     *
     * @return tipoEvento: codigo identificador del TipoEventoHabilitacion.
     */
    @Column(name="TIPO_EVENTO", nullable = false)
    public Integer getTipoEvento() {
        return tipoEvento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoEvento
     *
     * @param tipoEvento
     */
    public void setTipoEvento(Integer tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    /**
     * Getter.
     *
     * @return evento: evento del TipoEventoHabilitacion.
     */
    @Column(name="EVENTO", nullable = false, length = 30)
    public String getEvento() {
        return evento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo evento
     *
     * @param evento
     */
    public void setEvento(String evento) {
        this.evento = evento;
    }
    /**
     * Getter.
     *
     * @return descripcion: descripcion del TipoEventoHabilitacion.
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
     * @return naturaleza: naturaleza del TipoEventoHabilitacion.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="NATURALEZA", nullable = false)
    public NaturalezaEventoEnum getNaturaleza() {
        return naturaleza;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo naturaleza
     *
     * @param naturaleza
     */
    public void setNaturaleza(NaturalezaEventoEnum naturaleza) {
        this.naturaleza = naturaleza;
    }
    /**
     * Getter.
     *
     * @return eventosHabilitacion: Listado de eventos asociados al tipo de evento de habilitacion.
     */
    @OneToMany(mappedBy = "tipoEvento")
    public List<EventoHabilitacion> getEventosHabilitacion() {
        return eventosHabilitacion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo eventosHabilitacion
     *
     * @param eventosHabilitacion
     */
    public void setEventosHabilitacion(List<EventoHabilitacion> eventosHabilitacion) {
        this.eventosHabilitacion = eventosHabilitacion;
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
        if (!(object instanceof TipoEventoHabilitacion)) {
            return false;
        }
        TipoEventoHabilitacion other = (TipoEventoHabilitacion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.tipoEventoHabilitacion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoEventoHabilitacion
     */
    public TipoEventoHabilitacion() {
    }
    
}
