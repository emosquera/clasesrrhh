//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import a_programacion_presupuestaria.EstructuraOrganizacional;
import y_entity.base.EntityBase;
import z_enums.catalogo.DiaSemanaEnum;
import javax.persistence.*;
/**
 * Clase Horario extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al horario
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="HORARIO")
public class Horario extends EntityBase<Long> {
    /**
     * dia de la semana del horario
     *
     * @see #getDiaSemana()
     */
    private DiaSemanaEnum diaSemana;
    /**
     * hora de inicio  del horario
     *
     * @see #getHoraInicio()
     */
    private String horaInicio;
    /**
     * hora de fin  del horario
     *
     * @see #getHoraFin()
     */
    private String horaFin;
    /**
     * hora de inicio de descanso  del horario
     *
     * @see #getHoraDescansoInicio()
     */
    private String horaDescansoInicio;
    /**
     * hora de fin de descanso del horario
     *
     * @see #getHoraDescansoFin()
     */
    private String horaDescansoFin;
    /**
     * Estructura Organizacional a la cual esta asociada el horario
     *
     * @see #getEstructuraOrganizacional()
     */
    private EstructuraOrganizacional estructuraOrganizacional;
    /**
     * Getter.
     *
     * @return diaSemana: dia de la semana del Horario
     */
    @Enumerated(EnumType.STRING)
    @Column(name="DIA")
    public DiaSemanaEnum getDiaSemana() {
        return diaSemana;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo diaSemana
     *
     * @param diaSemana
     */
    public void setDiaSemana(DiaSemanaEnum diaSemana) {
        this.diaSemana = diaSemana;
    }
    /**
     * Getter.
     *
     * @return horaInicio: hora inicio del Horario
     */
    @Column(name="HORA_INICIO", nullable = false, length = 2)
    public String getHoraInicio() {
        return horaInicio;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo horaInicio
     *
     * @param horaInicio
     */
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    /**
     * Getter.
     *
     * @return horaFin: hora fin del Horario
     */
    @Column(name="HORA_FIN", nullable = false, length = 2)
    public String getHoraFin() {
        return horaFin;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo horaFin
     *
     * @param horaFin
     */
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    /**
     * Getter.
     *
     * @return horaDescansoInicio: hora inicio del descanso del Horario
     */
    @Column(name="HORA_INICIO_DESCANSO", nullable = false, length = 2)
    public String getHoraDescansoInicio() {
        return horaDescansoInicio;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo horaDescansoInicio
     *
     * @param horaDescansoInicio
     */
    public void setHoraDescansoInicio(String horaDescansoInicio) {
        this.horaDescansoInicio = horaDescansoInicio;
    }
    /**
     * Getter.
     *
     * @return horaDescansoFin: hora fin del descanso del Horario
     */
    @Column(name="HORA_FIN_DESCANSO", nullable = false, length = 2)
    public String getHoraDescansoFin() {
        return horaDescansoFin;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo horaDescansoFin
     *
     * @param horaDescansoFin
     */
    public void setHoraDescansoFin(String horaDescansoFin) {
        this.horaDescansoFin = horaDescansoFin;
    }
    /**
     * Getter.
     *
     * @return estructuraOrganizacional: estructura organizacional a la cual esta asociada el Horario
     */
    @ManyToOne
    @JoinColumn(name="ESTRUCTURA_ORGANIZACIONAL_ID")
    public EstructuraOrganizacional getEstructuraOrganizacional() {
        return estructuraOrganizacional;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estructuraOrganizacional
     *
     * @param estructuraOrganizacional
     */
    public void setEstructuraOrganizacional(EstructuraOrganizacional estructuraOrganizacional) {
        this.estructuraOrganizacional = estructuraOrganizacional;
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
        if (!(object instanceof Horario)) {
            return false;
        }
        Horario other = (Horario) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.Horario[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Horario
     */
    public Horario() {
    }
        
}
