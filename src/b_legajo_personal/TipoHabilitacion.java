//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import y_entity.base.EntityBase;
import java.util.List;
import javax.persistence.*;
/**
 * Clase TipoHabilitacion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al tipo de habilitacion
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_HABILITACION")
public class TipoHabilitacion extends EntityBase<Long> {
    
    /**
     * codigo de registro del Tipo de Habilitacion
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion del Tipo de Habilitacion
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * tipos de Disposiciones Asociadas al Tipo de Habilitacion
     *
     * @see #getTipoDisposiciones()
     */
    private List<TipoDisposicion> tipoDisposiciones;
    /**
     * Getter.
     *
     * @return codigo: codigo identificador del TipoHabilitacion
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
     * @return descripcion: descripcion del TipoHabilitacion.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 75)
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
     * @return tipoDisposiciones: tipos de disposiciones asociadas al TipoHabilitacion.
     */
    @OneToMany(mappedBy = "resoluciones")
    public List<TipoDisposicion> getTipoDisposiciones() {
        return tipoDisposiciones;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoDisposiciones
     *
     * @param tipoDisposiciones 
     */
    public void setTipoDisposiciones(List<TipoDisposicion> tipoDisposiciones) {
        this.tipoDisposiciones = tipoDisposiciones;
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
        if (!(object instanceof TipoHabilitacion)) {
            return false;
        }
        TipoHabilitacion other = (TipoHabilitacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.catalogo.TipoHabilitacion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoHabilitacion
     */
    public TipoHabilitacion() {
    }
    
}
