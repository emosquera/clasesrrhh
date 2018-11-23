//QSGEN This file will be ignored in future code generations if it's changed
package FormularServiciosPersonal.TopeContratos;

import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.MesEnum;

@Entity
@Table(name="DIT_MV_DETIMPTOPCON")
public class DetalleImporteTopeContrato extends EntityBase<Long> {
    
           
    /**
     * Mes a Formular de la Linea
     * @return 
     */
    private MesEnum mes;
    
    /**
     * Cantidad de puestos por mes que aplican para la línea del Detalle del Tope de Contrato .
     * @return 
     */
    private Integer puestos;
    
    /**
     * Monto mensual que viene dado por el Concepto de Planilla de Personal seleccionado por el usuario en la línea del Tope de Contrato
     * @return 
     */
    private Double importe;
    
    /**
     * Detalle de Tope de Contrato al que pertenece el Importe
     * @return 
     */
    @ManyToOne
    @JoinColumn(name="DETTOPECON_ID")
    private DetalleTopeContrato detalleTopeContrato;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleImporteTopeContrato)) {
            return false;
        }
        DetalleImporteTopeContrato other = (DetalleImporteTopeContrato) object;
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
    public DetalleImporteTopeContrato() {
    }
    
}
