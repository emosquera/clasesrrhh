//QSGEN This file will be ignored in future code generations if it's changed
package g_gestion_tablas_catalogos;

import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoMovimientoPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al tipo de movimientos de personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_MOVIMIENTO_PERSONAL")
public class TipoMovimientoPersonal extends EntityBase<Long> {
    /**
     * codigo de registro del tipo de movimientos de personal
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * nombre del tipo de movimientos de personal
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * abreviatura del tipo de movimientos de personal
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * Getter.
     *
     * @return codigo: codigo del tipo de movimientos de personal
     */
    @Column(name="CODIGO", nullable = false, length = 9)
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
     * @return nombre: nombre del tipo de movimientos de personal
     */
    @Column(name="NOMBRE", nullable = false, length = 255)
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
    /**
     * Getter.
     *
     * @return abreviatura: abreviatura del tipo de movimientos de personal
     */
    @Column(name="ABREVIATURA", nullable = false, length = 10)
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMovimientoPersonal)) {
            return false;
        }
        TipoMovimientoPersonal other = (TipoMovimientoPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "g_gestion_tablas_catalogos.TipoMovimientoPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoMovimientoPersonal
     */
    public TipoMovimientoPersonal() {
    }
    
}
