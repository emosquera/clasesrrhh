//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._3_FormularServiciosdePersonal._3_GestionarOtrosGastosdePersonal;

import java.util.Date;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;

@Entity
@Table(name="OGA_MA_OTRGASPER")
public class OtroGastoPersonal extends EntityBase<Long> {
    
    
    
    private String escenario;
    
    
    private String descripcion;
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    @OneToMany(mappedBy = "otroGastoPersonal")
    private List<DetalleOtroGastoPersonal> detalleOtroGastoPersonales;
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OtroGastoPersonal)) {
            return false;
        }
        OtroGastoPersonal other = (OtroGastoPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "TopeContrato[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad AnexoPersonal
     */
    public OtroGastoPersonal() {
    }
    
}
