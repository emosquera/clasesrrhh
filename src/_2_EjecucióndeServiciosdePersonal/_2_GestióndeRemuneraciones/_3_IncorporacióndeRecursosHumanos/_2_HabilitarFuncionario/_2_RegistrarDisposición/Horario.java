//QSGEN This file will be ignored in future code generations if it's changed
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._3_IncorporacióndeRecursosHumanos._2_HabilitarFuncionario._2_RegistrarDisposición;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._1_DefinirEstructuraOrganizacional._2_GestionarEstructuraOrganizacional.EstructuraOrganizacional;
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
    
    @ManyToOne
    @JoinColumn(name="DISPOSICION_ID")
    private Disposicion disposicion;
    
    /**
     * dia de la semana del horario
     *
     */
    private DiaSemanaEnum diaSemana;
    
    /**
     * hora de inicio  del horario
     *
     */
    private String horaInicio;
    
    /**
     * hora de fin  del horario
     *
     */
    private String horaFin;
    
    /**
     * hora de inicio de descanso  del horario
     *
     */
    private String horaDescansoInicio;
    
    /**
     * hora de fin de descanso del horario
     *
     */
    private String horaDescansoFin;
    
    
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
        return "Horario[ id=" + id + " ]";
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
