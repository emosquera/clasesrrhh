//QSGEN This file will be ignored in future code generations if it's changed
package Clasificadores.EstructuraOrganizacional;

import y_entity.base.EntityBase;
import java.util.List;
import javax.persistence.*;
/**
 * Clase ElementoEstructuraOrganizacional extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a los Elementos de la Estructura Organizacional
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CEO_AP_CONFESTORG")
public class ConfiguracionEstructuraOrganizacional extends EntityBase<Long> {    
    /**
     * formato generado con los codigos de los Elementos de la Estructura Organizacional
     *
     * @see #getFormato()
     */
    private String formato;
    
    /**
     * Listado de Elementos que conforman la Configuracion de Estructura Organizacionl
     */
    @OneToMany(mappedBy = "configuracionEstructuraOrganizacional")
    private List<ElementoEstructuraOrganizacional> elementoEstructuraOrganizacionals;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfiguracionEstructuraOrganizacional)) {
            return false;
        }
        ConfiguracionEstructuraOrganizacional other = (ConfiguracionEstructuraOrganizacional) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.ConfiguracionEstructuraOrganizacional[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad ElementoEstructuraOrganizacional
     */
    public ConfiguracionEstructuraOrganizacional() {
    }
    
}
