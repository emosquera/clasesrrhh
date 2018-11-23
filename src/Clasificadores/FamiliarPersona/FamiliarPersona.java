//QSGEN This file will be ignored in future code generations if it's changed
package Clasificadores.FamiliarPersona;

import TablasYCatalogos.TipoDocumentoIdentificacion;
import Clasificadores.DatosPersona.Persona;
import y_entity.base.EntityBase;
import z_enums.catalogo.ParentescoEnum;
import javax.persistence.*;
/**
 * Clase FamiliarPersona extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a los Familiares de una Persona
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="FPE_CL_FAMILIARPER")
public class FamiliarPersona extends EntityBase<Long>  {
    
    /**
     * parentesco del familiar con la Persona
     *
     */
    @Enumerated(EnumType.STRING)
    private ParentescoEnum parentesco;
    
    /**
     * tipo de documento de identificacion del familiar de la Persona
     *
     */
    @ManyToOne
    @JoinColumn(name="TIPDOCIDEN_ID")
    private TipoDocumentoIdentificacion tipoDocumentoIdentificacion;
    
    /**
     * numero de documento de identificacion del familiar con la Persona
     *
     */
    private String numeroDocumento;
    
    /**
     * Persona a la cual se le asocia el familiar
     *
     */
    @ManyToOne
    @JoinColumn(name="PERSONA_ID")
    private Persona persona;
    
    /**
     * Datos del Familiar
     *
     */
    @ManyToOne
    @JoinColumn(name="FAMILIAR_ID")
    private Persona familiar;
        

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FamiliarPersona)) {
            return false;
        }
        FamiliarPersona other = (FamiliarPersona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "FamiliarPersona[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad FamiliarPersona
     */
    public FamiliarPersona() {
    }
    
    
    
}
