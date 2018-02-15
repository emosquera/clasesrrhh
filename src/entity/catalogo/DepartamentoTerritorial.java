//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
import java.util.List;
import javax.persistence.*;
/**
 * Clase DepartamentoTerritorial extiende de {@link BaseBienEntity}
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
     * Código de registro del departamento territorial
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * Abreviatura para identificar al departamento territorial
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * Nombre del departamento territorial
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * Ciudad a la cual pertenece el departamento territorial
     *
     * @see #getCiudad()
     */
    private Ciudad ciudad;
    private List<Barrio> barrios;

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
    @OneToMany(mappedBy = "DEPARTAMENTO_TERRITORIAL")
    public List<Barrio> getBarrios() {
        return barrios;
    }

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
    
    public DepartamentoTerritorial() {
    }
}
