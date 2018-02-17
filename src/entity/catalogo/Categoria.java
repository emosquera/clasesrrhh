//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
import enums.catalogo.EstadoCategoria;
import javax.persistence.*;
/**
 * Clase Categoria extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Categoria
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CATEGORIA")
public class Categoria extends EntityBase<Long> {
    /**
     * codigo de registro de la Categoria
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * nombre de la Categoria
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * descripcion de la Categoria
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * monto de la Categoria
     *
     * @see #getMonto()
     */
    private Double monto;
    /**
     * estado que tiene la Categoria
     *
     * @see #getEstado()
     */
    private EstadoCategoria estado;
    /**
     * Getter.
     *
     * @return codigo: codigo de la Categoria.
     */
    @Column(name="CODIGO", nullable = false, length = 5)
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
     * @return nombre: nombre de la Categoria.
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
    /**
     * Getter.
     *
     * @return descripcion: descripcion de la Categoria.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 500)
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
     * @return monto: monto de la Categoria.
     */
    @Column(name="MONTO", nullable = false)
    public Double getMonto() {
        return monto;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo monto
     *
     * @param monto
     */
    public void setMonto(Double monto) {
        this.monto = monto;
    }
    /**
     * Getter.
     *
     * @return estado: estado que tiene la Categoria.
     */
    @Column(name="ESTADO", nullable = false)
    public EstadoCategoria getEstado() {
        return estado;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estado
     *
     * @param estado
     */
    public void setEstado(EstadoCategoria estado) {
        this.estado = estado;
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
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.Categoria[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Categoria
     */
    public Categoria() {
    }
    
}
