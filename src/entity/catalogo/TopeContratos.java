//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
import java.util.List;
import javax.persistence.*;
/**
 * Clase TopeContratos extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Tope de Contratos
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TOPE_CONTRATOS")
public class TopeContratos extends EntityBase<Long> {
    /**
     * Estructura Organizacional a la cual esta asociada el Tope de Contratos
     *
     * @see #getEstructuraOrganizacional()
     */
    private EstructuraOrganizacional estructuraOrganizacional;
    /**
     * codigo del Tope de Contratos
     *
     * @see #getCodigo()
     */
    private String codigo;//: String(10)
    /**
     * descripcion del Tope de Contratos
     *
     * @see #getDescripcion()
     */
    private String descripcion;//:String(200)
    /**
     * version del Tope de Contratos
     *
     * @see #getVersion()
     */
    private int version;
    /**
     * año del Tope de Contratos
     *
     * @see #getAño()
     */
    private int año;
    /**
     * Listado de detalles del Tope de Contratos
     *
     * @see #getDetallesTopeContratos()
     */
    private List<DetalleTopeContratos> detallesTopeContratos;
    /**
     * Getter.
     *
     * @return estructuraOrganizacional: Estructura Organizacional a la cual esta asociada el Tope de Contratos.
     */
    @ManyToOne
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
     * @return codigo: codigo del Tope de Contratos.
     */
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
     * @return descripcion: descripcion del Tope de Contratos.
     */
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
     * @return version: version del Tope de Contratos.
     */
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
     * @return año: año del Tope de Contratos.
     */
    public int getAño() {
        return año;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo año
     *
     * @param año
     */
    public void setAño(int año) {
        this.año = año;
    }
    /**
     * Getter.
     *
     * @return detallesTopeContratos: detalles asociados al Tope de Contratos.
     */
    @OneToMany(mappedBy = "TOPE_CONTRATOS")
    public List<DetalleTopeContratos> getDetallesTopeContratos() {
        return detallesTopeContratos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo detallesTopeContratos
     *
     * @param detallesTopeContratos
     */
    public void setDetallesTopeContratos(List<DetalleTopeContratos> detallesTopeContratos) {
        this.detallesTopeContratos = detallesTopeContratos;
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
        if (!(object instanceof TopeContratos)) {
            return false;
        }
        TopeContratos other = (TopeContratos) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.TopeContratos[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TopeContratos
     */
    public TopeContratos() {
    }
    
}
