//QSGEN This file will be ignored in future code generations if it's changed
package g_gestion_tablas_catalogos;

import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase Universidad extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Universidades
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="UNIVERSIDAD")
public class Universidad extends EntityBase<Long> {
    /**
     * codigo de registro de la Universidad
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * abreviatura de la Universidad
     *
     * @see #getCodigo()
     */
    private String abreviatura;
    /**
     * descripcion de la Universidad
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Getter.
     *
     * @return codigo: codigo de la Universidad
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
     * @return abreviatura: abreviatura de la Universidad
     */
    @Column(name="ABREVIATURA", nullable = false, length = 9)
    public String getAbreviatura() {
        return abreviatura;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo abreviatura
     *
     * @param abreviatura
     */
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    /**
     * Getter.
     *
     * @return descripcion: descripcion de la Universidad
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
        if (!(object instanceof Universidad)) {
            return false;
        }
        Universidad other = (Universidad) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "g_gestion_tablas_catalogos.Universidad[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Universidad
     */
    public Universidad() {
    }
    
}
