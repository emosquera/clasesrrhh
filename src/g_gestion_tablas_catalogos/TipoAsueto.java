//QSGEN This file will be ignored in future code generations if it's changed
package g_gestion_tablas_catalogos;

import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoAsueto extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Tipo de Asueto
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_ASUETO")
public class TipoAsueto extends EntityBase<Long> {
    /**
     * codigo de registro del Tipo de Asueto
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * nombre del Tipo de Asueto
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * Getter.
     *
     * @return codigo: codigo del Tipo de Asueto.
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
     * @return nombre: nombre del Tipo de Asueto.
     */
    @Column(name="NOMBRE", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        if (!(object instanceof TipoAsueto)) {
            return false;
        }
        TipoAsueto other = (TipoAsueto) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "g_gestion_tablas_catalogos.TipoAsueto[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoAsueto
     */
    public TipoAsueto() {
    }
    
    
}
