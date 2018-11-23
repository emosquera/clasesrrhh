//QSGEN This file will be ignored in future code generations if it's changed
package Clasificadores.DiscapacidadPersona;

import TablasYCatalogos.Discapacidad;
import Clasificadores.DatosPersona.Persona;
import y_entity.base.EntityBase;
import z_enums.catalogo.TipoDocumentoProbatorioDiscapacidadEnum;
import java.util.Date;
import javax.persistence.*;
/**
 * Clase DiscapacidadPersona extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a las Discapacidades de una Persona
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="DPE_CL_DISCAPPER")
public class DiscapacidadPersona extends EntityBase<Long> {
    
    /**
     * Discapacidad asociada a la persona
     *
     */
    @ManyToOne
    @JoinColumn(name="DISCAPACIDAD_ID")
    private Discapacidad discapacidad;
    
    /**
     * fecha Inicio de la Discapacidad de la Persona
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    
    /**
     * fecha Fin de la Discapacidad de la Persona, Solo cuando la Discapacidad no es permanente
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    
    /**
     * Tipo de documento probatorio de la discapacidad
     *
     */
    @Enumerated(EnumType.STRING)
    private TipoDocumentoProbatorioDiscapacidadEnum tipoDocumentoProbatorio;
    
    /**
     * numero de Documento probatorio de la discapacidad
     *
     */
    private int numeroDocumento;
    
    /**
     * persona a la cual se le asocia la discapacidad
     *
     */
    @ManyToOne
    @JoinColumn(name="PERSONA_ID")
    private Persona persona;
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiscapacidadPersona)) {
            return false;
        }
        DiscapacidadPersona other = (DiscapacidadPersona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.DiscapacidadPersona[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad DiscapacidadPersona
     */
    public DiscapacidadPersona() {
    }
    
}
