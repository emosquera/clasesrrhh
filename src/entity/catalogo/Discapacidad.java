//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
import enums.catalogo.TipoDiscapacidad;
import javax.persistence.*;
/**
 * Clase Discapacidad extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a las discapacidades
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="DISCAPACIDAD")
public class Discapacidad extends EntityBase<Long> {
    /**
     * codigo de registro del Discapacidad
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion de la Discapacidad
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * tipo de Discapacidad
     *
     * @see #getTipo()
     */
    private TipoDiscapacidad tipo;
    /**
     * Getter.
     *
     * @return codigo: codigo identificador de la Discapacidad.
     */
    @Column(name = "CODIGO", nullable = false, length = 5)
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
     * @return descripcion: descripcion de la Discapacidad.
     */
    @Column(name = "DESCRIPCION", nullable = false, length = 120)
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
     * @return tipo: tipo de Discapacidad.
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO", nullable = false)
    public TipoDiscapacidad getTipo() {
        return tipo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipo
     *
     * @param tipo
     */
    public void setTipo(TipoDiscapacidad tipo) {
        this.tipo = tipo;
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
        if (!(object instanceof Discapacidad)) {
            return false;
        }
        Discapacidad other = (Discapacidad) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.Discapacidad[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Discapacidad
     */
    public Discapacidad() {
    }
    
}
