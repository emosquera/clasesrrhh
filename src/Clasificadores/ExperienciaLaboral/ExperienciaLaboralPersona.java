//QSGEN This file will be ignored in future code generations if it's changed
package Clasificadores.ExperienciaLaboral;

import Clasificadores.DatosPersona.Persona;
import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase ExperienciaLaboralPersona extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Experiencia Laboral de una Persona
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="ELP_CL_EXPLABPER")
public class ExperienciaLaboralPersona extends EntityBase<Long> {
    /**
     * Numero de registro de la Experiencia Laboral de la Persona
     *
     */
    private int numero;
    
    /**
     * Puesto de la Experiencia Laboral de la Persona
     *
     */
    private String institucion;
    
    /**
     * Registro Único de Contribuyente de la institución o empresa donde laboro la persona.
     */
    private String ruc;
    
    /**
     * Cargo ocupado por la persona en la institución o empresa.
     */
    private String cargo;
    
    /**
     * Responsabilidades asignadas en la ejecución del cargo.
     */
    private String funciones;
    
    /**
     * fecha de inicio de la Experiencia Laboral de la Persona
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    
    /**
     * fecha de fin de la Experiencia Laboral de la Persona
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    
    /**
     * Persona asociada a la experiencia laboral
     *
     * @see #getPersona()
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
        if (!(object instanceof ExperienciaLaboralPersona)) {
            return false;
        }
        ExperienciaLaboralPersona other = (ExperienciaLaboralPersona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.ExperienciaLaboralPersona[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad ExperienciaLaboralPersona
     */
    public ExperienciaLaboralPersona() {
    }
    
}
