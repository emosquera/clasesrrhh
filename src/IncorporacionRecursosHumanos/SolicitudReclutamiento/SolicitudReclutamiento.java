/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IncorporacionRecursosHumanos.SolicitudReclutamiento;

import Clasificadores.Puesto.Puesto;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import y_entity.base.EntityBase;


@Entity
@Table(name="SRC_MA_SOLRECLUTA")
public class SolicitudReclutamiento extends EntityBase {

    @OneToMany(mappedBy = "solicitudRecltamiento")
    private List<SeleccionadoReclutamiento> seleccionadoReclutamientos;

    private String numero;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    private String descripcion;
    
    private String observacion;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    
    @ManyToOne
    @JoinColumn(name="PUESTO_ID")
    private Puesto puesto;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudReclutamiento)) {
            return false;
        }
        SolicitudReclutamiento other = (SolicitudReclutamiento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SolicitudReclutamiento[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
