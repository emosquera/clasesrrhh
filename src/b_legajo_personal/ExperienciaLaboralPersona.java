//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import a_programacion_presupuestaria.Puesto;
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
@Table(name="EXPERIENCIA_LABORAL_PERSONA")
public class ExperienciaLaboralPersona extends EntityBase<Long> {
    /**
     * numero de registro de la Experiencia Laboral de la Persona
     *
     * @see #getNumero()
     */
    private int numero;
    /**
     * Puesto de la Experiencia Laboral de la Persona
     *
     * @see #getPuesto()
     */
    private Puesto puesto;
    /**
     * fecha de inicio de la Experiencia Laboral de la Persona
     *
     * @see #getFechaInicio()
     */
    private Date fechaInicio;
    /**
     * fecha de fin de la Experiencia Laboral de la Persona
     *
     * @see #getFechaFin()
     */
    private Date fechaFin;
    /**
     * Persona asociada a la experiencia laboral
     *
     * @see #getPersona()
     */
    private Persona persona;
    /**
     * Getter.
     *
     * @return numero: numero de registro de la Experiencia Laboral de la Persona.
     */ 
    @Column(name="NUMERO", nullable = false)
    public int getNumero() {
        return numero;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo numero
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * Getter.
     *
     * @return puesto: puesto de la Experiencia Laboral de la Persona.
     */ 
    @ManyToOne
    @JoinColumn(name="PUESTO_ID")
    public Puesto getPuesto() {
        return puesto;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo puesto
     *
     * @param puesto
     */
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    /**
     * Getter.
     *
     * @return fechaInicio: fecha de inicio de la Experiencia Laboral de la Persona.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_INICIO", nullable = false)
    public Date getFechaInicio() {
        return fechaInicio;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaInicio
     *
     * @param fechaInicio
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /**
     * Getter.
     *
     * @return fechaFin: fecha de fin de la Experiencia Laboral de la Persona.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_FIN", nullable = true)
    public Date getFechaFin() {
        return fechaFin;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaFin
     *
     * @param fechaFin
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    /**
     * Getter.
     *
     * @return persona: persona asociada a la Experiencia Laboral.
     */ 
    @ManyToOne
    @JoinColumn(name="PERSONA_ID")
    public Persona getPersona() {
        return persona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo persona
     *
     * @param persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
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
