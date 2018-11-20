//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._1_DefinirEstructuraOrganizacional._1_ConfigurarEstructuraOrganizacional;

import y_entity.base.EntityBase;
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
@Table(name="EEO_AP_ELEESTORG")
public class ElementoEstructuraOrganizacional extends EntityBase<Long> {
    
    /**
     * nombre del Elemento de la Estructura Organizacional
     *
     * @see #getNombre()
     */
    private String nombre;
    
    /**
     * abreviatura del Elemento de la Estructura Organizacional
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    
    /**
     * descripcion del Elemento de la Estructura Organizacional
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    
    /**
     * longitud del Elemento de la Estructura Organizacional
     *
     * @see #getLongitud()
     */
    private int longitud;
    
    /**
     * orden del Elemento de la Estructura Organizacional
     *
     * @see #getOrden()
     */
    private int orden;
    
    /**
     * Configuracion a la cual pertenece el Elemento de la Estructura Organizacional
     *
     * @see #getConfiguracionEstructuraOrganizacional()
     */
    @ManyToOne
    @JoinColumn(name="CONFESTORG_ID", nullable = false)
    private ConfiguracionEstructuraOrganizacional configuracionEstructuraOrganizacional;
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ElementoEstructuraOrganizacional)) {
            return false;
        }
        ElementoEstructuraOrganizacional other = (ElementoEstructuraOrganizacional) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.ElementoEstructuraOrganizacional[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad ElementoEstructuraOrganizacional
     */
    public ElementoEstructuraOrganizacional() {
    }
    
}
