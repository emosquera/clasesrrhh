//QSGEN This file will be ignored in future code generations if it's changed
package TablasYCatalogos;

import Clasificadores.DatosPersona.Persona;
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
@Table(name="PAI_CL_PAIS")
public class Pais extends EntityBase<Long> {
    
    /**
     * codigo de registro del Pais
     *
     * @see #getCodigo()
     */
    private String codigo;
    
    /**
     * Código ISO 3166 alfa-3 que identifica el país
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
     * nombre del Pais
     *
     * @see #getCodigoIso()
     */
    private String codigoIso;
    
    /**
     * Nacionalidad del Pais
     *
     * @see #getNacionalidad()
     */
    private String nacionalidad;
    
    /**
     * Listado de Depatamentos Territoriales asociados al Pais
     *
     * @see #getDepartamentosTerritoriales()
     */
    @OneToMany(mappedBy = "pais")
    private List<DepartamentoTerritorial> departamentosTerritoriales;
    @OneToMany(mappedBy = "nacionalidad")
    private List<Persona> personas;
    
    
    
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
        return "Pais[ id=" + id + " ]";
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
