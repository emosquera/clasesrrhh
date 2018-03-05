//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase AnexoPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Anexo de Personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="ANEXO_PERSONAL")
public class AnexoPersonal extends EntityBase<Long> {
    /**
     * estructura Organizacional a la cual esta asociada el Anexo de Personal
     *
     * @see #getEstructuraOrganizacional()
     */
    private EstructuraOrganizacional estructuraOrganizacional;
    /**
     * codigo de registro del Anexo de Personal
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion del Anexo de Personal
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * version del Anexo de Personal
     *
     * @see #getVersion()
     */
    private int version;
    /**
     * año del Anexo de Personal
     *
     * @see #getAnio()
     */
    private int anio;
    /**
     * Listado de detalles del Anexo de Personal
     *
     * @see #getDetallesAnexoPersonal()
     */
    private List<DetalleAnexoPersonal> detallesAnexoPersonal;
    
    /**
     * Getter.
     *
     * @return estructuraOrganizacional: estructura Organizacional a la cual esta asociada el Anexo de Personal.
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
     * @return codigo: codigo del Anexo de Personal.
     */
    @Column(name="CODIGO", nullable = false, length = 10)
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
     * @return descipcion: descripcion del Anexo de Personal.
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
     * @return version: version del Anexo de Personal.
     */
    @Column(name="VERSION", nullable = false)
    public int getVersion() {
        return version;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo version
     *
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }
    /**
     * Getter.
     *
     * @return anio: año del Anexo de Personal.
     */
    @Column(name="ANIO", nullable = false)
    public int getAnio() {
        return anio;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo anio
     *
     * @param anio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Getter.
     *
     * @return detallesAnexoPersonal: Listado de detalle del Anexo de Personal.
     */
    @OneToMany(mappedBy = "anexoPersonal")
    public List<DetalleAnexoPersonal> getDetallesAnexoPersonal() {
        return detallesAnexoPersonal;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo detallesAnexoPersonal
     *
     * @param detallesAnexoPersonal
     */
    public void setDetallesAnexoPersonal(List<DetalleAnexoPersonal> detallesAnexoPersonal) {
        this.detallesAnexoPersonal = detallesAnexoPersonal;
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
        if (!(object instanceof AnexoPersonal)) {
            return false;
        }
        AnexoPersonal other = (AnexoPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.AnexoPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad AnexoPersonal
     */
    public AnexoPersonal() {
    }
    
}
