//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoEventoResolucion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al tipo de evento de resolucion
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_EVENTO_RESOLUCION")
public class TipoEventoResolucion extends EntityBase<Long> {
    /**
     * tipoEvento de registro del Tipo de Evento de Resolucion
     *
     * @see #getTipoEvento()
     */
    private Integer tipoEvento;
    /**
     * descripcion del Tipo de Evento de Resolucion
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Getter.
     *
     * @return tipoEvento: codigo identificador del TipoEventoResolucion.
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
     * @return descripcion: descripcion del TipoEventoResolucion.
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEventoResolucion)) {
            return false;
        }
        TipoEventoResolucion other = (TipoEventoResolucion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.TipoEventoResolucion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoEventoResolucion
     */
    public TipoEventoResolucion() {
    }
    
}
