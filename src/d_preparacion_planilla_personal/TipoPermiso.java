//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoPermiso extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Tipo de Permiso
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_PERMISO")
public class TipoPermiso extends EntityBase<Long> {
    /**
     * codigo de registro del TipoPermiso
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion del TipoPermiso
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Listado de permisos asociados al tipo de permiso
     *
     * @see #getDescripcion()
     */
    private List<Permiso> permisos;
    /**
     * Getter.
     *
     * @return codigo: codigo del TipoPermiso.
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
     * @return descripcion: descripcion del TipoPermiso.
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
     * @return permisos: permisos asociados al tipo de permiso.
     */
    @OneToMany(mappedBy = "tipoPermiso")
    public List<Permiso> getPermisos() {
        return permisos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo permisos
     *
     * @param permisos
     */
    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
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
        if (!(object instanceof TipoPermiso)) {
            return false;
        }
        TipoPermiso other = (TipoPermiso) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.TipoPermiso[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * Constructor por defecto de la entidad TipoPermiso
     */
    public TipoPermiso() {
    }
    
}
