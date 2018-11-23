//QSGEN This file will be ignored in future code generations if it's changed
package TablasYCatalogos;

import FormularServiciosPersonal.AnexoPersonal.DetalleAnexoPersonal;
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
@Table(name="DTR_CL_DEPATERRI")
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
    @ManyToOne
    @JoinColumn(name = "PAIS_ID")
    private Pais pais;
    
    /**
     * listado de ciudades que pertenecen al Departamento Territorial
     *
     * @see #getCiudades()
     */
    @OneToMany(mappedBy = "departamentoTerritorial")
    private List<Ciudad> ciudades; 
            
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
        return "DepartamentoTerritorial[ id=" + id + " ]";
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
