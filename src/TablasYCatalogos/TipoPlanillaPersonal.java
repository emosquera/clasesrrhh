/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasYCatalogos;

import Clasificadores.PlanillaPersonal.PlanillaPersonal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;

/**
 * Clase TipoMovimientoPersonal extiende de {@link EntityBase}
 *
 * Contiene la definición de los Tipos de Planilla de Personal
 * 
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name = "TPP_CL_TIPPLANIPER")
public class TipoPlanillaPersonal extends EntityBase<Long> {

    @OneToMany(mappedBy = "tipoPlanillaPersonal")
    private List<PlanillaPersonal> planillaPersonals;

    /**
     * Descripcion del Tipo de Planilla de Personal
     */
    private String descripcion;
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPlanillaPersonal)) {
            return false;
        }
        TipoPlanillaPersonal other = (TipoPlanillaPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "TipoModalidadContrato[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
