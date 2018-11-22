//QSGEN This file will be ignored in future code generations if it's changed
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._5_GestiónRetributiva._3_AplicarMovimientosdePlanilla._2_GestionarHorariosEspeciales;

import _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._3_IncorporacióndeRecursosHumanos._2_HabilitarFuncionario._2_RegistrarDisposición.Disposicion;
import java.util.Date;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase HorarioEspecial extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a al horario especial otorgado a un funcionario
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="HES_MA_HORARIOESP")
public class HorarioEspecial extends EntityBase<Long> {
    
    @ManyToOne
    @JoinColumn(name="DIPOSICION_ID")
    private Disposicion disposicion;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    
    private String descripcion;
    
    @OneToMany(mappedBy = "horarioEspecial")
    private List<DetalleHorarioEspecial> detallesHorarioEspecial;

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
