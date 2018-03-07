//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import b_legajo_personal.Disposicion;
import java.io.File;
import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.DiaSemana;
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

    
    private Disposicion disposicion;
    private Permiso permiso;
    private DiaSemana dia;
    private String horaInicio;
    private String horaFin;

    public Disposicion getDisposicion() {
        return disposicion;
    }

    public void setDisposicion(Disposicion disposicion) {
        this.disposicion = disposicion;
    }

    public DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
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

    public HorarioEspecial() {
    }
    
}
