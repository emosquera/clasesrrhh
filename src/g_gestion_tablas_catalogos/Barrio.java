//QSGEN This file will be ignored in future code generations if it's changed
package g_gestion_tablas_catalogos;

import b_legajo_personal.Persona;
import y_entity.base.EntityBase;
import java.util.List;
import javax.persistence.*;
/**
 * Clase Barrio extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al barrio
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="BARRIO")
public class Barrio extends EntityBase<Long>{
    /**
     * codigo de registro del Barrio
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * abreviatura para identificar al Barrio
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * nombre del Barrio
     *
     * @see #getNombre()
     */
    private String nombre;

    /**
     * listado de personas que residen en el Barrio
     *
     * @see #getPersonas()
     */
    private List<Persona> personas;
    
    /**
     * Ciudad a la que pertenece el Barrio
     *
     * @see #getCiudad()
     */
    private Ciudad ciudad;
    /**
     * Getter.
     *
     * @return codigo: codigo identificador del Barrio.
     */
    @Column(name="CODIGO", nullable=false, length = 9)
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
     * @return abreviatura: abreviatura del Barrio.
     */
    @Column(name="ABREVIATURA", nullable=false, length = 6)
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
     * @return nombre: nombre del Barrio.
     */
    @Column(name="NOMBRE", nullable=false, length = 100)
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
     * @return personas: listado de personas que residen en el Barrio.
     */
    @OneToMany(mappedBy = "barrio")
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
     * @return ciudad: ciudad a la cual pertenece el Barrio.
     */
    @ManyToOne
    @JoinColumn(name = "CIUDAD_ID")
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barrio)) {
            return false;
        }
        Barrio other = (Barrio) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "g_gestion_tablas_catalogos.Barrio[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Barrio
     */
    public Barrio() {
    }
    
}
