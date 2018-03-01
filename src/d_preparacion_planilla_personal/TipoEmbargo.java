//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoEmbargo extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Tipo de Embargo
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_EMBARGO")
public class TipoEmbargo extends EntityBase<Long>  {
    /**
     * codigo de registro del TipoEmbargo
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion del TipoEmbargo
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * embargos asociados al tipo
     *
     * @see #getEmbargos()
     */
    private List<Embargo> embargos;
    /**
     * Getter.
     *
     * @return codigo: codigo del TipoEmbargo.
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
     * @return descripcion: descripcion del TipoEmbargo.
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
     * @return embargos: Embargos asociados al tipo.
     */
    @OneToMany(mappedBy = "tipoEmbargo")
    public List<Embargo> getEmbargos() {
        return embargos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo embargos
     *
     * @param embargos
     */
    public void setEmbargos(List<Embargo> embargos) {
        this.embargos = embargos;
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
        if (!(object instanceof TipoEmbargo)) {
            return false;
        }
        TipoEmbargo other = (TipoEmbargo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.TipoEmbargo[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoEmbargo
     */
    public TipoEmbargo() {
    }
    
}
