//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase InstitucionEmbargo extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la institucionn de embargo
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="INSTITUCION_EMBARGO")
public class InstitucionEmbargo extends EntityBase<Long> {
    /**
     * codigo de registro de la Institucion de Embargo
     *
     * @see #getCodigo()
     */
    private Integer codigo;
    /**
     * descripcion de la Institucion de Embargo
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * calle  de ubicacion de la Institucion de Embargo
     *
     * @see #getCalle()
     */
    private String calle ;
    /**
     * Ciudad donde esta ubicada la Institucion de Embargo
     *
     * @see #getCiudad()
     */
    private Ciudad ciudad;
    /**
     * Departamento Territorial donde esta ubicada la Institucion de Embargo
     *
     * @see #getDepartamentoTerritorial()
     */
    private DepartamentoTerritorial departamentoTerritorial;
    /**
     * telefono de contacto de la Institucion de Embargo
     *
     * @see #getTelefono()
     */
    private String telefono;
    /**
     * RUC de la Institucion de Embargo
     *
     * @see #getRuc()
     */
    private String ruc;
    /**
     * Getter.
     *
     * @return codigo: codigo de registro de la Institucion de Embargo.
     */
    @Column(name="CODIGO", nullable = false)
    public Integer getCodigo() {
        return codigo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo codigo
     *
     * @param codigo
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    /**
     * Getter.
     *
     * @return descripcion: descripcion de la Institucion de Embargo.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 150)
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
     * @return calle: direccion de la Institucion de Embargo.
     */
    @Column(name="CALLE", nullable = false, length = 120)
    public String getCalle() {
        return calle;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo calle
     *
     * @param calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
    /**
     * Getter.
     *
     * @return ciudad: ciudad donde se encuentra ubicada la Institucion de Embargo.
     */
    @Column(name="CIUDAD", nullable = false)
    @ManyToOne
    public Ciudad getCiudad() {
        return ciudad;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo ciudad
     *
     * @param ciudad
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    /**
     * Getter.
     *
     * @return departamentoTerritorial: departamento territorial donde se encuentra ubicada la Institucion de Embargo.
     */
    @Column(name="DEPARTAMENTO_TERRITORIAL", nullable = false)
    @ManyToOne
    public DepartamentoTerritorial getDepartamentoTerritorial() {
        return departamentoTerritorial;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo departamentoTerritorial
     *
     * @param departamentoTerritorial
     */
    public void setDepartamentoTerritorial(DepartamentoTerritorial departamentoTerritorial) {
        this.departamentoTerritorial = departamentoTerritorial;
    }
    /**
     * Getter.
     *
     * @return telefono: numero de telefono de contacto de la Institucion de Embargo.
     */
    @Column(name="TELEFONO", nullable = false, length = 16)
    public String getTelefono() {
        return telefono;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo telefono
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * Getter.
     *
     * @return ruc: RUC de la Institucion de Embargo.
     */
    @Column(name="RUC", nullable = false, length = 12)
    public String getRuc() {
        return ruc;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo ruc
     *
     * @param ruc
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
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
        if (!(object instanceof InstitucionEmbargo)) {
            return false;
        }
        InstitucionEmbargo other = (InstitucionEmbargo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.InstitucionEmbargo[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad InstitucionEmbargo
     */
    public InstitucionEmbargo() {
    }
    
}
