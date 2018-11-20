//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._3_FormularServiciosdePersonal._3_GestionarOtrosGastosdePersonal;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._3_FormularServiciosdePersonal._2_GestionarTopedeContratos.*;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.MesEnum;

@Entity
@Table(name="DIO_MV_DETIMPOTRGAS")
public class DetalleImporteOtroGastoPersonal extends EntityBase<Long> {
    
           
    /**
     * Mes a Formular de la Linea
     * @return 
     */
    private MesEnum mes;
    

    private Integer puestos;
    

    private Double importe;
    
    @ManyToOne
    @JoinColumn(name="DETOTRGASPER_ID")
    private DetalleOtroGastoPersonal detalleOtroGastoPersonal;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleImporteOtroGastoPersonal)) {
            return false;
        }
        DetalleImporteOtroGastoPersonal other = (DetalleImporteOtroGastoPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "DetalleImporteAnexoPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad DetalleAnexoPersonal
     */
    public DetalleImporteOtroGastoPersonal() {
    }
    
}
