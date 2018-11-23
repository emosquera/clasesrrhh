//QSGEN This file will be ignored in future code generations if it's changed
package GestionRetributiva.HorarioEspecial;

import IncorporacionRecursosHumanos.Disposicion.Disposicion;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
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
@Table(name="DHE_MV_DETHORAESP")
public class DetalleHorarioEspecial extends EntityBase<Long> {
    
    @ManyToOne
    @JoinColumn(name="HORESP_ID")
    private HorarioEspecial horarioEspecial;
    
    @Enumerated(EnumType.STRING)
    private DiaSemanaEnum diaSemana;
    
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horaInicio;
    
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horaFin;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleHorarioEspecial)) {
            return false;
        }
        DetalleHorarioEspecial other = (DetalleHorarioEspecial) object;
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
    public DetalleHorarioEspecial() {
    }
    
}
