/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IncorporacionRecursosHumanos.SolicitudReclutamiento;

import Clasificadores.DatosPersona.Persona;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import y_entity.base.EntityBase;


@Entity
@Table(name="SEL_MV_SELECCRECLUT")
public class SeleccionadoReclutamiento extends EntityBase {

    private Integer orden;
    
    @ManyToOne
    @JoinColumn(name="PERSONA_ID")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name="SOLRECLUT_ID")
    private SolicitudReclutamiento solicitudRecltamiento;
   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeleccionadoReclutamiento)) {
            return false;
        }
        SeleccionadoReclutamiento other = (SeleccionadoReclutamiento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SeleccionadoReclutamiento[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
