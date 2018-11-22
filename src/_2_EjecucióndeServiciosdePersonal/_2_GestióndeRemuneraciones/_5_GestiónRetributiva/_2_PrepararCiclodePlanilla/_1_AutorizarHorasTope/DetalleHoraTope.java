/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._5_GestiónRetributiva._2_PrepararCiclodePlanilla._1_AutorizarHorasTope;

import _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._3_IncorporacióndeRecursosHumanos._2_HabilitarFuncionario._2_RegistrarDisposición.Disposicion;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import y_entity.base.EntityBase;

@Entity
@Table(name="DHT_MV_DETHORATOPE")
public class DetalleHoraTope extends EntityBase<Long> {
   
    @ManyToOne
    @JoinColumn(name="HORATOPE_ID")
    private HoraTope horaTope;
    
   
    @ManyToOne
    @JoinColumn(name="DISPOSICION_ID")
    private Disposicion disposicion;
    
    private Double horaMaxima;
    
    private Double horaExtra;
    
    private Double horaAdicional;
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleHoraTope)) {
            return false;
        }
        DetalleHoraTope other = (DetalleHoraTope) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "DetalleHoraTope[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
