//QSGEN This file will be ignored in future code generations if it's changed
package TablasYCatalogos;

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
@Table(name="CIU_CL_CIUDAD")
public class Ciudad  extends EntityBase<Long>{
    /**
     * Codigo de registro de la Ciudad
     *
     * @see #getCodigo()
     */
    private String codigo;
    
    /**
     * Abreviación que identifica la ciudad.
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    
    /**
     * Nombre de la Ciudad
     *
     * @see #getNombre()
     */
    private String nombre;        
    
    /**
     * Departamento Territorial al que pertence la Ciudad.
     *
     * @see #getPersonas()
     */
    @ManyToOne
    @JoinColumn(name = "DEPARTAMENTO_TERRITORIAL_ID")
    private DepartamentoTerritorial departamentoTerritorial;
    
    /**
     * Listado de barrios que pertenecen a la Ciudad.
     *
     * @see #getPersonas()
     */
    @OneToMany(mappedBy = "ciudad")
    private List<Barrio> barrios;
            
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
        return "Ciudad[ id=" + id + " ]";
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
