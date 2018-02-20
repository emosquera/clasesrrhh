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
     * ciudad a la cual pertenece el DepartamentoTerritorial
     *
     * @see #getCiudad()
     */
    private Ciudad ciudad;
    /**
     * Lista de Barrio que pertenecen al DepartamentoTerritorial
     *
     * @see #getBarrios()
     */
    private List<Barrio> barrios;
    /**
     * Lista de Instituciones de Embargo que pertenecen al Departamento Territorial
     *
     * @see #getInstitucionesEmbargo()
     */
    private List<InstitucionEmbargo> institucionesEmbargo;
    /**
     * listado de personas que residen en el Departamento Territorial.
     *
     * @see #getPersonas()
     */
    private List<Persona> personas;
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
     * @return ciudad: ciudad a la que pertenece el DepartamentoTerritorial
     */
    @ManyToOne
    @Column(name="CIUDAD", nullable=false)
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
     * @return barrios: listado de Barrio que pertenecen al DepartamentoTerritorial
     */
    @OneToMany(mappedBy = "DEPARTAMENTO_TERRITORIAL")
    public List<Barrio> getBarrios() {
        return barrios;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo barrios
     *
     * @param barrios
     */
    public void setBarrios(List<Barrio> barrios) {
        this.barrios = barrios;
    }
    /**
     * Getter.
     *
     * @return institucionesEmbargo: listado de Instituciones de Embargo que pertenecen al DepartamentoTerritorial
     */
    @OneToMany(mappedBy = "DEPARTAMENTO_TERRITORIAL")
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
     * @return personas: listado de personas que residen en el Departamento Territorial.
     */
    @OneToMany(mappedBy = "DEPARTAMENTO_TERRITORIAL")
    public List<Persona> getPersonas() {
        return personas;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo personas
     *
     * @param personas
     */
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
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
