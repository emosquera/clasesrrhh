//QSGEN This file will be ignored in future code generations if it's changed
package ProgramacionServiciosPersonal.Plaza;

import Clasificadores.Puesto.Puesto;
import java.util.Date;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase ResolucionEEN extiende de {@link EntityBase}
 *
 * Contiene la información de la resolucion emitida por el equipo economico nacional
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="PLZ_MA_PLAZA")
public class Plaza extends EntityBase<Long> {

    private String numero;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    private String descripcion;
    
    private String observacion;
    
    private String numeroResolucion;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaResolucion; 
    
    @ManyToMany
    @JoinTable(name = "PPL_MV_PUESTOPLAZA",
        joinColumns = @JoinColumn(name = "PLAZA_ID"),
        inverseJoinColumns = @JoinColumn(name = "PUESTO_ID")
    )
    private List<Puesto> puestos;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plaza)) {
            return false;
        }
        Plaza other = (Plaza) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Plaza[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad ResolucionEEN
     */
    public Plaza() {
    }
    
}
