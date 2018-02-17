//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoRetencion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Tipo de Retencion
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_RETENCION")
public class TipoRetencion extends EntityBase<Long> {
    /**
     * codigo de registro del TipoRetencion
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion del TipoRetencion
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Getter.
     *
     * @return codigo: codigo del TipoRetencion.
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
     * @return descripcion: descripcion del TipoRetencion.
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
        if (!(object instanceof TipoRetencion)) {
            return false;
        }
        TipoRetencion other = (TipoRetencion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.TipoRetencion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoRetencion
     */
    public TipoRetencion() {
    }
}
