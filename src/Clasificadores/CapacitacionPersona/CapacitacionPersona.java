//QSGEN This file will be ignored in future code generations if it's changed
package Clasificadores.CapacitacionPersona;

import Clasificadores.DatosPersona.Persona;
import y_entity.base.EntityBase;
import z_enums.catalogo.EstadoAvanceAcademicoEnum;
import z_enums.catalogo.TipoDocumentoProbatorioCapacitacionEnum;
import java.util.Date;
import javax.persistence.*;
/**
 * Clase CapacitacionPersona extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Capacitacion de una Persona
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CAPACITACION_PERSONA")
public class CapacitacionPersona extends EntityBase<Long> {
    
    /**
     * codigo de registro de la Capacitacion
     *
     */
    private String codigo;
    
    /**
     * descripcion de la Capacitacion
     *
     */
    private String descripcion;
    
    /**
     * institucion que imparte la Capacitacion
     *
     */
    private String institucion;
    
    /**
     * fecha de inicio de la Capacitacion
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    
    /**
     * fecha cuando finaliza la Capacitacion
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    
    /**
     * horas totales de la Capacitacion
     *
     */
    private float horasTotales;
    
    /**
     * horas cursadas de la Capacitacion
     *
     */
    private float horasCursadas;
    
    /**
     * estado de avance de la Capacitacion
     *
     */
    @Enumerated(EnumType.STRING)
    private EstadoAvanceAcademicoEnum estadoAvanceAcademico;
    
    /**
     * tipo documento probatorio de la Capacitacion
     *
     */
    @Enumerated(EnumType.STRING)
    private TipoDocumentoProbatorioCapacitacionEnum tipoDocumentoProbatorio;
    
    /**
     * numero de documento academico de la Capacitacion
     *
     */
    private String numeroDocumentoAcademico;
    
    /**
     * Persona que recibe la Capacitacion
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
        if (!(object instanceof CapacitacionPersona)) {
            return false;
        }
        CapacitacionPersona other = (CapacitacionPersona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "CapacitacionPersona[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad CapacitacionPersona
     */
    public CapacitacionPersona() {
    }

    
    
}
