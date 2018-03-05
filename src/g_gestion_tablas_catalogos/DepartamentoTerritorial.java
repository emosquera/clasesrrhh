//QSGEN This file will be ignored in future code generations if it's changed
package g_gestion_tablas_catalogos;

import d_preparacion_planilla_personal.InstitucionEmbargo;
import b_legajo_personal.Persona;
import y_entity.base.EntityBase;
import java.util.List;
import javax.persistence.*;
/**
 * Clase DepartamentoTerritorial extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Departamento Territorial
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="DEPARTAMENTO_TERRITORIAL")
public class DepartamentoTerritorial extends EntityBase<Long>{
   /**
     * codigo de registro del DepartamentoTerritorial
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * abreviatura para identificar al DepartamentoTerritorial
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * nombre del DepartamentoTerritorial
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * pais al cual pertenece el DepartamentoTerritorial
     *
     * @see #getPais()
     */
    private Pais pais;
    /**
     * Lista de Instituciones de Embargo que pertenecen al Departamento Territorial
     *
     * @see #getInstitucionesEmbargo()
     */
    private List<InstitucionEmbargo> institucionesEmbargo;
    /**
     * listado de ciudades que pertenecen al Departamento Territorial
     *
     * @see #getCiudades()
     */
    private List<Ciudad> ciudades;
    /**
     * Getter.
     *
     * @return codigo: codigo del DepartamentoTerritorial.
     */
    @Column(name="CODIGO", nullable = false, length = 9)
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
     * @return abreviatura: abreviatura del DepartamentoTerritorial.
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
     * @return nombre: nombre del DepartamentoTerritorial.
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
     * @return pais: Pais al que pertenece el DepartamentoTerritorial
     */
    @ManyToOne
    @JoinColumn(name = "PAIS_ID")
    public Pais getPais() {
        return pais;
    }
    /**
     * Setter. Asigna un Pais al Departamento Territorial
     *
     * @param pais: Pais
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    /**
     * Getter.
     *
     * @return institucionesEmbargo: listado de Instituciones de Embargo que pertenecen al DepartamentoTerritorial
     */
    @OneToMany(mappedBy = "departamentoTerritorial")
    public List<InstitucionEmbargo> getInstitucionesEmbargo() {
        return institucionesEmbargo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo institucionesEmbargo
     *
     * @param institucionesEmbargo
     */
    public void setInstitucionesEmbargo(List<InstitucionEmbargo> institucionesEmbargo) {
        this.institucionesEmbargo = institucionesEmbargo;
    }
    /**
     * Getter.
     *
     * @return ciudades: listado de ciudades que pertenecen al Departamento Territorial.
     */
    @OneToMany(mappedBy = "departamentoTerritorial")
    public List<Ciudad> getCiudades() {
        return ciudades;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo ciudades
     *
     * @param ciudades
     */
    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
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
        if (!(object instanceof DepartamentoTerritorial)) {
            return false;
        }
        DepartamentoTerritorial other = (DepartamentoTerritorial) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.DepartamentoTerritorial[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad DepartamentoTerritorial
     */
    public DepartamentoTerritorial() {
    }
    
}
