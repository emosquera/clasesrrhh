//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoDisposicion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al tipo de Disposicion
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_DISPOSICION")
public class TipoDisposicion extends EntityBase<Long> {
    /**
     * codigo de registro del Tipo de Disposicion
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion del Tipo de Disposicion
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * resuluciones del Tipo de Disposicion
     *
     * @see #getResoluciones()
     */
    private TipoHabilitacion resoluciones;
    /**
     * Getter.
     *
     * @return codigo: codigo identificador del TipoDisposicion
     */
    @Column(name="CODIGO", nullable = false, length = 10)
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
     * @return descripcion: descripcion del TipoDisposicion.
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
    /**
     * Getter.
     *
     * @return resoluciones: resoluciones del TipoDisposicion.
     */
    @ManyToOne
    @Column(name="RESOLUCIONES", nullable = false)
    public TipoHabilitacion getResoluciones() {
        return resoluciones;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo resoluciones
     *
     * @param resoluciones
     */
    public void setResoluciones(TipoHabilitacion resoluciones) {
        this.resoluciones = resoluciones;
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
        if (!(object instanceof TipoDisposicion)) {
            return false;
        }
        TipoDisposicion other = (TipoDisposicion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.TipoDisposicion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TipoDisposicion() {
    }
    
}
