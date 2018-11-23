//QSGEN This file will be ignored in future code generations if it's changed
package Clasificadores.FormacionPersona;

import Clasificadores.DatosPersona.Persona;
import y_entity.base.EntityBase;
import TablasYCatalogos.EspecialidadAcademica;
import TablasYCatalogos.NivelAcademico;
import TablasYCatalogos.OficioProfesion;
import TablasYCatalogos.Universidad;
import z_enums.catalogo.EstadoAvanceAcademicoEnum;
import z_enums.catalogo.TipoDocumentoProbatorioCapacitacionEnum;
import java.util.Date;
import javax.persistence.*;
/**
 * Clase FormacionPersona extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Formacion de una Persona
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="FOP_CL_FORMACIONPER")
public class FormacionPersona extends EntityBase<Long>  {
    
    /**
     * oficio o profesion asociado a la Formacion
     *
     */
    @ManyToOne
    @JoinColumn(name="OFICIOPROF_ID")
    private OficioProfesion oficioProfesion;
    
    /**
     * nivel academico asociado a la Formacion
     *
     */
    @ManyToOne
    @JoinColumn(name="NIVACADEMICO_ID")
    private NivelAcademico nivelAcademico;
    
    /**
     * especialidad academica asociada a la Formacion
     *
     */
    @ManyToOne
    @JoinColumn(name="ESPACADEMICA_ID")
    private EspecialidadAcademica especialidadAcademica;
    
    /**
     * institucionn que imparte la Formacion
     *
     */
    @ManyToOne
    @JoinColumn(name="UNIVERSIDAD_ID")
    private Universidad institucion;
    
    /**
     * fecha de inicio de la Formacion
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    
    /**
     * fecha cuando finaliza la Formacion
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    
    /**
     * horas totales de la Formacion
     *
     */
    private float horasTotales;
    
    /**
     * horas cursadas de la Formacion
     *
     */
    private float horasCursadas;
    
    /**
     * estado de avance de la Formacion
     *
     */
    @Enumerated(EnumType.STRING)
    private EstadoAvanceAcademicoEnum estadoAvanceAcademico;
        
    /**
     * tipo documento probatorio de la Formacion
     *
     */
    @Enumerated(EnumType.STRING)
    private TipoDocumentoProbatorioCapacitacionEnum tipoDocumentoProbatorio;
    
    /**
     * numero de documento academico de la Formacion
     *
     */
    private String numeroDocumentoAcademico;
    
    /**
     * Persona que recibe la Formacion
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
        if (!(object instanceof FormacionPersona)) {
            return false;
        }
        FormacionPersona other = (FormacionPersona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.FormacionPersona[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad FormacionPersona
     */
    public FormacionPersona() {
    }
        
}
