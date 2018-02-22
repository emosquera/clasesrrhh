//QSGEN This file will be ignored in future code generations if it's changed
package g_gestion_tablas_catalogos;

import y_entity.base.EntityBase;
import java.util.List;
import javax.persistence.*;
/**
 * Clase Pais extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Pais
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="PAIS")
public class Pais extends EntityBase<Long> {
    /**
     * codigo de registro del Pais
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * abreviatura para identificar al Pais
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * nombre del Pais
     *
     * @see #getNombre()
     */
    private String nombre;
    
    /**
     * Listado de Depatamentos Territoriales asociados al Pais
     *
     * @see #getDepartamentosTerritoriales()
     */
    private List<DepartamentoTerritorial> departamentosTerritoriales;
    
    
    /**
     * Getter.
     *
     * @return codigo: codigo del Pais.
     */
    @Column(name = "CODIGO", nullable = false, length = 9)
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
     * @return abreviatura: abreviatura del Pais.
     */
    @Column(name = "ABREVIATURA", nullable = false, length = 6)
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
     * @return nombre: nombre del Pais.
     */
    @Column(name = "NOMBRE", nullable = false, length = 100)
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
    
    @OneToMany(mappedBy = "pais")
    public List<DepartamentoTerritorial> getDepartamentosTerritoriales() {
        return departamentosTerritoriales;
    }

    public void setDepartamentosTerritoriales(List<DepartamentoTerritorial> departamentosTerritoriales) {
        this.departamentosTerritoriales = departamentosTerritoriales;
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
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.Pais[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Pais
     */
    public Pais() {
    }
    
}
