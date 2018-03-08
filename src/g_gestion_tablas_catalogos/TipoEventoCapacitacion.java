//QSGEN This file will be ignored in future code generations if it's changed
package g_gestion_tablas_catalogos;

import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoEventoCapacitacion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Tipo de Evento de Capacitacion
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_EVENTO_CAPACITACION")
public class TipoEventoCapacitacion extends EntityBase<Long> {
    /**
     * codigo de registro del Tipo de Evento de Capacitacion
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion del Tipo de Evento de Capacitacion
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Getter.
     *
     * @return codigo: codigo del Tipo de Evento de Capacitacion.
     */
    @Column(name="CODIGO", nullable = false, length = 4)
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
     * @return descripcion: descripcion del Tipo de Evento de Capacitacion.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 100)
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
        if (!(object instanceof TipoEventoCapacitacion)) {
            return false;
        }
        TipoEventoCapacitacion other = (TipoEventoCapacitacion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "g_gestion_tablas_catalogos.TipoEventoCapacitacion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoEventoCapacitacion
     */
    public TipoEventoCapacitacion() {
    }
    
}
