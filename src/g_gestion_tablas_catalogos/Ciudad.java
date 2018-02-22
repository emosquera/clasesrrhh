//QSGEN This file will be ignored in future code generations if it's changed
package g_gestion_tablas_catalogos;

import d_preparacion_planilla_personal.InstitucionEmbargo;
import b_legajo_personal.Persona;
import y_entity.base.EntityBase;
import java.util.List;
import javax.persistence.*;
/**
 * Clase Ciudad extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Ciudad
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CIUDAD")
public class Ciudad  extends EntityBase<Long>{
    /**
     * codigo de registro de la Ciudad
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * abreviatura para identificar a la Ciudad
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * nombre de la Ciudad
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * Lista de Instituciones de Embargo que pertenecen a la Ciudad
     *
     * @see #getInstitucionesEmbargo()
     */
    private List<InstitucionEmbargo> institucionesEmbargo;
    /**
     * listado de personas que residen en la Ciudad.
     *
     * @see #getPersonas()
     */
    private List<Persona> personas;
    /**
     * Departamento Territorial al que pertence la Ciudad.
     *
     * @see #getPersonas()
     */
    private DepartamentoTerritorial departamentoTerritorial;
    /**
     * Listado de barrios que pertenecen a la Ciudad.
     *
     * @see #getPersonas()
     */
    private List<Barrio> barrios;
    /**
     * Getter.
     *
     * @return codigo: codigo de la Ciudad.
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
     * @return abreviatura: abreviatura de la Ciudad.
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
     * @return nombre: nombre de la Ciudad.
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
     * @return institucionesEmbargo: listado de Instituciones de Embargo que pertenecen a la Ciudad
     */
    @OneToMany(mappedBy = "ciudad")
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
     * @return personas: listado de personas que residen en la Ciudad.
     */
    @OneToMany(mappedBy = "ciudad")
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
    /**
     * Getter.
     *
     * @return departamentoTerritorial: departamento territorial al cual pertenece la ciudad.
     */
    @ManyToOne
    @JoinColumn(name = "DEPARTAMENTO_TERRITORIAL_ID")
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
     * @return barrios: Listado de barrios que pertenecen a la Ciudad.
     */
    @OneToMany(mappedBy = "ciudad")
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.Ciudad[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Ciudad
     */
    public Ciudad() {
    }
    
}
