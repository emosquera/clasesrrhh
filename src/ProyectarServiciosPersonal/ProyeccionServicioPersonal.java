/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectarServiciosPersonal;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import y_entity.base.EntityBase;

@Entity
public class ProyeccionServicioPersonal extends EntityBase<Long> {

    /**
     * Breve descripción de la proyección.
     * @return 
     */
    private String descripcion;
    
    /**
     * Identifica el escenario
     * @return 
     */
    private String escenario;
    
    /**
     * Fecha en que se creó el escenario de proyección, esta fecha es llenada automáticamente por el sistema al momento de crear una nueva proyección.
     * @return 
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    /**
     * Es el año donde se extraer la información del presupuesto de ejecución.
     * @return 
     */
    private Integer annoBase;
    
    /**
     * Porcentaje inicial para el calculo de la proyección. 
     * @return 
     */
    private Double porcentajeProyeccion;
    
    /**
     * Observaciones de la proyección
     * @return 
     */
    private String observacion;
    
    /**
     * Indica si la proyección seleccionada es definitiva.
     * @return 
     */
    private Boolean definitiva;
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProyeccionServicioPersonal)) {
            return false;
        }
        ProyeccionServicioPersonal other = (ProyeccionServicioPersonal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProyeccionServicioPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
