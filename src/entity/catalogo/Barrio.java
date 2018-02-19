//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
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
     * departamentoTerritorial al cual pertenece el Barrio
     *
     * @see #getDepartamentoTerritorial()
     */
    private DepartamentoTerritorial departamentoTerritorial;
    /**
     * listado de personas que residen en el Barrio
     *
     * @see #getPersonas()
     */
    private List<Persona> personas;
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
     * @return departamentoTerritorial: departamentoTerritorial al cual pertenece el Barrio.
     */
    @ManyToOne
    @Column(name="DEPARTAMENTO_TERRITORIAL", nullable=false)
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
     * @return personas: listado de personas que residen en el Barrio.
     */
    @OneToMany(mappedBy = "BARRIO")
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
        if (!(object instanceof Barrio)) {
            return false;
        }
        Barrio other = (Barrio) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.Barrio[ id=" + id + " ]";
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
