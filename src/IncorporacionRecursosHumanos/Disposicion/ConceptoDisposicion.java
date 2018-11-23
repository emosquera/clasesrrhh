//QSGEN This file will be ignored in future code generations if it's changed
package IncorporacionRecursosHumanos.Disposicion;

import TablasYCatalogos.DepartamentoTerritorial;
import Clasificadores.ConceptoPlanillaPersonal.ConceptoPlanillaPersonal;
import GestionRetributiva.ProcesarPlanillaPeriodo.DetalleCalculoPlanilla;
import java.util.Date;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;

@Entity
@Table(name="CDI_MV_CONCEPTODISPO")
public class ConceptoDisposicion extends EntityBase<Long> {

    @ManyToOne
    @JoinColumn(name="DISPOSICION_ID")
    private Disposicion disposicion;
    
    @ManyToOne
    @JoinColumn(name="DPTOTERR_ID")
    private DepartamentoTerritorial departamentoterritorial;
    
    @ManyToOne
    @JoinColumn(name="CONCEPTO_ID")
    private ConceptoPlanillaPersonal concepto;
    
    private Double monto;
    
    private Double cantidad;
    
    private Double acumulado;
    
    private Boolean activo;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaDesde;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaHasta;
    @OneToMany(mappedBy = "conceptoDisposicion")
    private List<DetalleCalculoPlanilla> detallesCalculoPlanilla;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConceptoDisposicion)) {
            return false;
        }
        ConceptoDisposicion other = (ConceptoDisposicion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ConceptoDisposicion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Disposicion
     */
    public ConceptoDisposicion() {
    }

}