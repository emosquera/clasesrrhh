//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import entity.externos.TipoMoneda;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TablaCategorias extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Tabla de Categorias
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TABLA_CATEGORIAS")
public class TablaCategorias extends EntityBase<Long> {
    /**
     * codigo de la Tabla de Categorias
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * nombre de la Tabla de Categorias
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * abreviatura de la Tabla de Categorias
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * tipo de moneda de los salarios de la Tabla de Categorias
     *
     * @see #getTipoMoneda()
     */
    private TipoMoneda tipoMoneda;
    /**
     * Listado de categorias asociadas a la Tabla de Categorias
     *
     * @see #getCategoriasTablaCategorias()
     */
    private List<CategoriaTablaCategorias> categoriasTablaCategorias;
    /**
     * Estructura Organizacional a la cual pertenece la Tabla de Categorias
     *
     * @see #getEstructuraOrganizacional()
     */
    private EstructuraOrganizacional estructuraOrganizacional;
    /**
     * Getter.
     *
     * @return codigo: codigo de la Tabla de Categorias.
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
     * @return nombre: nombre de la Tabla de Categorias.
     */
    @Column(name="NOMBRE", nullable = false, length = 500)
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
     * @return abreviatura: abreviatura de la Tabla de Categorias.
     */
    @Column(name="ABREVIATURA", nullable = false, length = 6)
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
     * @return tipoMoneda: Tipo de Moneda de los Salarios Asociados a la Tabla de Categorias.
     */
    @ManyToOne
    @JoinColumn(name="TIPO_MONEDA_ID")
    public TipoMoneda getTipoMoneda() {
        return tipoMoneda;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoMoneda
     *
     * @param tipoMoneda
     */
    public void setTipoMoneda(TipoMoneda tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }
    /**
     * Getter.
     *
     * @return categoriasTablaCategorias: Listado de Categorias Asociadas a la Tabla de Categorias.
     */
    @OneToMany(mappedBy = "tablaCategorias")
    public List<CategoriaTablaCategorias> getCategoriasTablaCategorias() {
        return categoriasTablaCategorias;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo categoriasTablaCategorias
     *
     * @param categoriasTablaCategorias
     */
    public void setCategoriaTablaCategoriass(List<CategoriaTablaCategorias> categoriasTablaCategorias) {
        this.categoriasTablaCategorias = categoriasTablaCategorias;
    }
    /**
     * Getter.
     *
     * @return estructuraOrganizacional: Estructura Organizacional a la cual pertenece la Tabla de Categorias.
     */
    @ManyToOne
    @Column(name="ESTRUCTURA_ORGANIZACIONAL_ID", nullable = false)
    public EstructuraOrganizacional getEstructuraOrganizacional() {
        return estructuraOrganizacional;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estructuraOrganizacional
     *
     * @param estructuraOrganizacional
     */
    public void setEstructuraOrganizacional(EstructuraOrganizacional estructuraOrganizacional) {
        this.estructuraOrganizacional = estructuraOrganizacional;
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
        if (!(object instanceof TablaCategorias)) {
            return false;
        }
        TablaCategorias other = (TablaCategorias) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.TablaCategorias[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TablaCategorias
     */
    public TablaCategorias() {
    }

}
