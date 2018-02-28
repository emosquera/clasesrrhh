//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import g_gestion_tablas_catalogos.TipoCargo;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase Cargo extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Cargo
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CARGO")
public class Cargo extends EntityBase<Long> {
    /**
     * codigo de registro del Cargo
     *
     * @see #getCodigo()
     */
    private int codigo;
    /**
     * nombre del Cargo
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * Tipo del Cargo
     *
     * @see #getTipoCargo()
     */
    private TipoCargo tipoCargo;
    /**
     * funciones del Cargo
     *
     * @see #getFunciones()
     */
    private String funciones;
    /**
     * Categoria a la cual esta asociada el Cargo
     *
     * @see #getCategoriaTablaCategorias()
     */
    private CategoriaTablaCategorias categoriaTablaCategorias;
    /**
     * Listado de puestos asociados al Cargo
     *
     * @see #getCategoriaTablaCategorias()
     */
    private List<Puesto> puestos;
    /**
     * Listado de aprobaciones por resolucion
     *
     * @see #getCargosAprobadosResoluciones()
     */
    private List<CargosAprobadosResolucion> cargosAprobadosResoluciones;
    /**
     * Getter.
     *
     * @return codigo: codigo de registro del Cargo.
     */
    @Column(name="CODIGO", nullable = false)
    public int getCodigo() {
        return codigo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo codigo
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Getter.
     *
     * @return nombre: nombre del Cargo.
     */
    @Column(name="NOMBRE", nullable = false, length = 100)
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
     * @return tipoCargo: tipo de cargo.
     */
    @ManyToOne
    @JoinColumn(name="TIPO_CARGO_ID")
    public TipoCargo getTipoCargo() {
        return tipoCargo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoCargo
     *
     * @param tipoCargo
     */
    public void setTipoCargo(TipoCargo tipoCargo) {
        this.tipoCargo = tipoCargo;
    }
    /**
     * Getter.
     *
     * @return funciones: funciones del cargo.
     */
    @Column(name="FUNCIONES", nullable = true, length = 1000)
    public String getFunciones() {
        return funciones;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo funciones
     *
     * @param funciones
     */
    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }
    /**
     * Getter.
     *
     * @return categoriaTablaCategorias: categoria Asociada a la Tabla de Categoria a la cual esta asociada el Cargo.
     */
    @ManyToOne
    @JoinColumn(name="CATEGORIA_TABLA_CATEGORIAS_ID")
    public CategoriaTablaCategorias getCategoriaTablaCategorias() {
        return categoriaTablaCategorias;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo categoriaTablaCategorias
     *
     * @param categoriaTablaCategorias
     */
    public void setCategoriaTablaCategorias(CategoriaTablaCategorias categoriaTablaCategorias) {
        this.categoriaTablaCategorias = categoriaTablaCategorias;
    }
    /**
     * Getter.
     *
     * @return puestos: Listado de puestos asociados al Cargo.
     */
    @OneToMany(mappedBy = "cargo")
    public List<Puesto> getPuestos() {
        return puestos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo puestos
     *
     * @param puestos
     */
    public void setPuestos(List<Puesto> puestos) {
        this.puestos = puestos;
    }
    /**
     * Getter.
     *
     * @return cargosAprobadosResoluciones: Listado de aprobaciones por resolucion.
     */
    @OneToMany(mappedBy = "cargo")
    public List<CargosAprobadosResolucion> getCargosAprobadosResoluciones() {
        return cargosAprobadosResoluciones;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo cargosAprobadosResoluciones
     *
     * @param cargosAprobadosResoluciones
     */
    public void setCargosAprobadosResoluciones(List<CargosAprobadosResolucion> cargosAprobadosResoluciones) {
        this.cargosAprobadosResoluciones = cargosAprobadosResoluciones;
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
        if (!(object instanceof Cargo)) {
            return false;
        }
        Cargo other = (Cargo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.Cargo[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Cargo
     */
    public Cargo() {
    }
    
}