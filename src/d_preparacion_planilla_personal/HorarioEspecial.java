//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.DiaSemanaEnum;
/**
 * Clase HorarioEspecial extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a al horario especial otorgado a un funcionario
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="HORARIO_ESPECIAL")
public class HorarioEspecial extends EntityBase<Long> {
    /**
     * dia de la semana del horario especial
     *
     * @see #getDiaSemana()
     */
    private DiaSemanaEnum diaSemana;
    /**
     * hora de inicio  del horario especial
     *
     * @see #getHoraInicio()
     */
    private String horaInicio;
    /**
     * hora de fin  del horario especial
     *
     * @see #getHoraFin()
     */
    private String horaFin;
    /**
     * hora de inicio de descanso  del horario especia
     *
     * @see #getHoraDescansoInicio()
     */
    private String horaDescansoInicio;
    /**
     * hora de fin de descanso del horario especial
     *
     * @see #getHoraDescansoFin()
     */
    private String horaDescansoFin;
    /**
     * permiso al cual se asocia el horario especial
     *
     * @see #getPermiso()
     */
    private Permiso permiso;
    /**
     * Getter.
     *
     * @return diaSemana: dia de la semana del Horario Especial
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
     * @return horaInicio: hora inicio del Horario Especial
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
     * @return horaFin: hora fin del Horario Especial
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
     * @return horaDescansoInicio: hora inicio del descanso del Horario Especial
     */
    @Column(name="HORA_INICIO_DESCANSO", nullable = true, length = 2)
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
     * @return horaDescansoFin: hora fin del descanso del Horario Especial
     */
    @Column(name="HORA_FIN_DESCANSO", nullable = true, length = 2)
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
     * @return permiso: permiso al cual se asocia el horario especial
     */
    @ManyToOne
    @JoinColumn(name="PERMISO_ID")
    public Permiso getPermiso() {
        return permiso;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo permiso
     *
     * @param permiso
     */
    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
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
        if (!(object instanceof HorarioEspecial)) {
            return false;
        }
        HorarioEspecial other = (HorarioEspecial) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.HorarioEspecial[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad HorarioEspecial
     */
    public HorarioEspecial() {
    }
    
}
