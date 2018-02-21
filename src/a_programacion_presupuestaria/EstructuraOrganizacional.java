//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import y_entity.base.EntityBase;
import entity.externos.Entidad;
import entity.externos.Nivel;
import z_enums.catalogo.EstadoEstructuraOrganizacional;
import java.util.List;
import javax.persistence.*;
/**
 * Clase EstructuraOrganizacional extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Estructura Organizacional
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="ESTRUCTURA_ORGANIZACIONAL")
public class EstructuraOrganizacional extends EntityBase<Long> {
    /**
     * Nivel al cual pertenece la Estructura Organizacional
     *
     * @see #getNivel()
     */
    private Nivel nivel;
    /**
     * Entidad a la cual pertenece la Estructura Organizacional
     *
     * @see #getEntidad()
     */
    private Entidad entidad;
    /**
     * codigo de la Estructura Organizacional
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * abreviatura de la Estructura Organizacional
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * descripcion de la Estructura Organizacional
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * estado de la Estructura Organizacional
     *
     * @see #getEstado()
     */
    private EstadoEstructuraOrganizacional estado;
    /**
     * codigo padre de la Estructura Organizacional
     *
     * @see #getCodigoPadre()
     */
    private String codigoPadre;
    /**
     * topes de Contratos de la Estructura Organizacional
     *
     * @see #getTopesContratos()
     */
    private List<TopeContratos> topesContratos;
    /**
     * Tablas de Categorias asociadas a la Estructura Organizacional
     *
     * @see #getTablasCategorias()
     */
    private List<TablaCategorias> tablasCategorias;
    /**
     * Getter.
     *
     * @return nivel: nivel al cual pertenece la Estructura Organizacional.
     */
    @ManyToOne
    @Column(name="NIVEL", nullable = false)
    public Nivel getNivel() {
        return nivel;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo nivel
     *
     * @param nivel
     */
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
    /**
     * Getter.
     *
     * @return entidad: entidad al cual pertenece la Estructura Organizacional.
     */
    @ManyToOne
    @Column(name="ENTIDAD", nullable = false)
    public Entidad getEntidad() {
        return entidad;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo entidad
     *
     * @param entidad
     */
    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }
    /**
     * Getter.
     *
     * @return codigo: codigo de la Estructura Organizacional.
     */
    @Column(name="CODIGO", nullable = false, length = 30)
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
     * @return abreviatura: abreviatura de la Estructura Organizacional.
     */
    @Column(name="ABREVIATURA", nullable = false, length = 5)
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
     * @return descripcion: descripcion de la Estructura Organizacional.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 200)
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
     * @return estado: estado de la Estructura Organizacional.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="ESTADO", nullable = false)
    public EstadoEstructuraOrganizacional getEstado() {
        return estado;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estado
     *
     * @param estado
     */
    public void setEstado(EstadoEstructuraOrganizacional estado) {
        this.estado = estado;
    }
    /**
     * Getter.
     *
     * @return codigoPadre: codigo de la Estructura Organizacional padre.
     */
    @Column(name="CODIGO_PADRE", nullable = false, length = 30)
    public String getCodigoPadre() {
        return codigoPadre;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo codigoPadre
     *
     * @param codigoPadre
     */
    public void setCodigoPadre(String codigoPadre) {
        this.codigoPadre = codigoPadre;
    }
    /**
     * Getter.
     *
     * @return topesContratos: topes de contratos de la Estructura Organizacional padre.
     */
    @OneToMany(mappedBy = "estructuraOrganizacional")
    public List<TopeContratos> getTopesContratos() {
        return topesContratos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo topesContratos
     *
     * @param topesContratos
     */
    public void setTopesContratos(List<TopeContratos> topesContratos) {
        this.topesContratos = topesContratos;
    }
    /**
     * Getter.
     *
     * @return tablasCategorias: Tablas de Categorias asociadas a la Estructura Organizacional.
     */
    @OneToMany(mappedBy = "estructuraOrganizacional")
    public List<TablaCategorias> getTablasCategorias() {
        return tablasCategorias;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tablasCategorias
     *
     * @param tablasCategorias
     */
    public void setTablasCategorias(List<TablaCategorias> tablasCategorias) {
        this.tablasCategorias = tablasCategorias;
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
        if (!(object instanceof EstructuraOrganizacional)) {
            return false;
        }
        EstructuraOrganizacional other = (EstructuraOrganizacional) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.EstructuraOrganizacional[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad EstructuraOrganizacional
     */
    public EstructuraOrganizacional() {
    }
    
    
}
