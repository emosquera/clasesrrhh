//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import y_entity.base.EntityBase;
import entity.externos.Entidad;
import entity.externos.Nivel;
import javax.persistence.*;
/**
 * Clase ElementoEstructuraOrganizacional extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a los Elementos de la Estructura Organizacional
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="ELEMENTO_ESTRUCTURA_ORGANIZACIONAL")
public class ElementoEstructuraOrganizacional extends EntityBase<Long> {
    /**
     * Nivel al cual pertenece el Elemento de la Estructura Organizacional
     *
     * @see #getNivel()
     */
    private Nivel nivel;
    /**
     * Entidad a la cual pertenece el Elemento de la Estructura Organizacional
     *
     * @see #getEntidad()
     */
    private Entidad entidad;
    /**
     * nombre del Elemento de la Estructura Organizacional
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * abreviatura del Elemento de la Estructura Organizacional
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * descripcion del Elemento de la Estructura Organizacional
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * longitud del Elemento de la Estructura Organizacional
     *
     * @see #getLongitud()
     */
    private int longitud;
    /**
     * orden del Elemento de la Estructura Organizacional
     *
     * @see #getOrden()
     */
    private int orden;
    /**
     * Configuracion a la cual pertenece el Elemento de la Estructura Organizacional
     *
     * @see #getConfiguracionEstructuraOrganizacional()
     */
    private ConfiguracionEstructuraOrganizacional configuracionEstructuraOrganizacional;
    /**
     * Getter.
     *
     * @return nivel: nivel al cual pertenece el Elemento de Estructura Organizacional.
     */
    @ManyToOne
    @JoinColumn(name="NIVEL_ID")
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
     * @return entidad: entidad a la cual pertenece el Elemento de Estructura Organizacional.
     */
    @ManyToOne
    @JoinColumn(name="ENTIDAD_ID")
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
     * @return nombre: nombre del Elemento de Estructura Organizacional.
     */
    @Column(name="NOMBRE", nullable = false, length = 150)
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
     * @return abreviatura: abreviatura del Elemento de Estructura Organizacional.
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
     * @return descripcion: descripcion del Elemento de Estructura Organizacional.
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
     * @return longitud: longitud del Elemento de Estructura Organizacional.
     */
    @Column(name="LONGITUD", nullable = false)
    public int getLongitud() {
        return longitud;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo longitud
     *
     * @param longitud
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    /**
     * Getter.
     *
     * @return orden: orden del Elemento de Estructura Organizacional.
     */
    @Column(name="ORDEN", nullable = false)
    public int getOrden() {
        return orden;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo orden
     *
     * @param orden
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }
    /**
     * Getter.
     *
     * @return configuracionEstructuraOrganizacional: Configuracion a la cual pertenece el Elemento de la Estructura Organizacional.
     */
    @ManyToOne
    @JoinColumn(name="CONFIGURACION_ESTRUCTURA_ORGANIZACIONAL_ID", nullable = false)
    public ConfiguracionEstructuraOrganizacional getConfiguracionEstructuraOrganizacional() {
        return configuracionEstructuraOrganizacional;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo configuracionEstructuraOrganizacional
     *
     * @param configuracionEstructuraOrganizacional
     */
    public void setConfiguracionEstructuraOrganizacional(ConfiguracionEstructuraOrganizacional configuracionEstructuraOrganizacional) {
        this.configuracionEstructuraOrganizacional = configuracionEstructuraOrganizacional;
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
        if (!(object instanceof ElementoEstructuraOrganizacional)) {
            return false;
        }
        ElementoEstructuraOrganizacional other = (ElementoEstructuraOrganizacional) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.ElementoEstructuraOrganizacional[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad ElementoEstructuraOrganizacional
     */
    public ElementoEstructuraOrganizacional() {
    }
    
}
