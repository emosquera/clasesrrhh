//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
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
@Table(name="CONFIGURACION_EO")
public class ConfiguracionEstructuraOrganizacional extends EntityBase<Long> {
    /**
     * Listado de Elementos que permite generar la configuracion de la Estructura Organizacional
     *
     * @see #getElementoEstructuraOrganizacional()
     */
    @OneToMany(mappedBy = "configuracionEstructuraOrganizacional")
    private List<ElementoEstructuraOrganizacional> elementosEstructuraOrganizacional;
    /**
     * formato generado con los codigos de los Elementos de la Estructura Organizacional
     *
     * @see #getFormato()
     */
    private String formato;
    /**
     * Getter.
     *
     * @return elementosEstructuraOrganizacional: Listado de Elementos de Estructura Organizacional.
     */
    public List<ElementoEstructuraOrganizacional> getElementosEstructuraOrganizacional() {
        return elementosEstructuraOrganizacional;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo elementosEstructuraOrganizacional
     *
     * @param elementosEstructuraOrganizacional
     */
    public void setElementosEstructuraOrganizacional(List<ElementoEstructuraOrganizacional> elementosEstructuraOrganizacional) {
        this.elementosEstructuraOrganizacional = elementosEstructuraOrganizacional;
    }
    /**
     * Getter.
     *
     * @return formato: formato generado de los Elementos de Estructura Organizacional.
     */
    public String getFormato() {
        return formato;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo formato
     *
     * @param formato
     */
    public void setFormato(String formato) {
        this.formato = formato;
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
        if (!(object instanceof ConfiguracionEstructuraOrganizacional)) {
            return false;
        }
        ConfiguracionEstructuraOrganizacional other = (ConfiguracionEstructuraOrganizacional) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.ConfiguracionEstructuraOrganizacional[ id=" + id + " ]";
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
