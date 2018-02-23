//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase SolicitudNuevaCategoria extiende de {@link EntityBase}
 *
 * Contiene la información relacionada con la Solicitud de la Nueva Categoria
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="SOLICITUD_NUEVA_CATEGORIA")
public class SolicitudNuevaCategoria extends EntityBase<Long> {
    /**
     * Indica si la solicitud esta Habilitada
     *
     * @see #getHabilitada()
     */
    private boolean habilitada;
    /**
     * Estructura Organizacional que realiza la solicitud de la nueva categoria
     *
     * @see #getEstructuraOrganizacional()
     */
    private EstructuraOrganizacional estructuraOrganizacional;
    /**
     * Numero de registro de la Solicitud de Nueva Categoria
     *
     * @see #getNumeroSolicitud()
     */
    private String numeroSolicitud;
    /**
     * fecha de la Solicitud de Nueva Categoria
     *
     * @see #getFecha()
     */
    private Date fecha;
    /**
     * descripcion de la Solicitud de Nueva Categoria
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Categoria a la cual se le solicita la aprobacion
     *
     * @see #getCategoria()
     */
    private Categoria categoria;
    /**
     * Getter.
     *
     * @return habilitada: Indica si la solicitud esta Habilitada.
     */
    @Column(name="HABILITADA", nullable = false)
    public boolean getHabilitada() {
        return habilitada;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo habilitada
     *
     * @param habilitada
     */
    public void setHabilitada(boolean habilitada) {
        this.habilitada = habilitada;
    }
    /**
     * Getter.
     *
     * @return estructuraOrganizacional: Estructura Organizacional que realiza la solicitud de la nueva categoria.
     */
    @ManyToOne
    @JoinColumn(name="ESTRUCTURA_ORGANIZACIONAL_ID")
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
    /**
     * Getter.
     *
     * @return numeroSolicitud: Numero de registro de la Solicitud de Nueva Categoria.
     */
    @Column(name="NUMERO_SOLICITUD", nullable = false, length = 10)
    public String getNumeroSolicitud() {
        return numeroSolicitud;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo numeroSolicitud
     *
     * @param numeroSolicitud
     */
    public void setNumeroSolicitud(String numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }
    /**
     * Getter.
     *
     * @return fecha: fecha de la Solicitud de Nueva Categoria.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA", nullable = false)
    public Date getFecha() {
        return fecha;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fecha
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    /**
     * Getter.
     *
     * @return descripcion: descripcion de la Solicitud de Nueva Categoria.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 10)
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
     * @return categoria: Categoria a la cual se le solicita la aprobacion.
     */
    @OneToOne
    @JoinColumn(name="CATEGORIA_ID")
    public Categoria getCategoria() {
        return categoria;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo categoria
     *
     * @param categoria
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
        if (!(object instanceof SolicitudNuevaCategoria)) {
            return false;
        }
        SolicitudNuevaCategoria other = (SolicitudNuevaCategoria) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.SolicitudNuevaCategoria[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad SolicitudNuevaCategoria
     */
    public SolicitudNuevaCategoria() {
    }
    
    
}
