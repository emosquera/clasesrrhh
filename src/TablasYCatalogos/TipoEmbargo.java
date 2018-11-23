/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasYCatalogos;

import GestionRetributiva.Embargos.Embargo;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;

/**
 * Clase TipoEmbargo extiende de {@link EntityBase}
 *
 * Contiene la definición de los Tipos de Embargos
 * 
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name = "TEM_CL_TIPOEMBAR")
public class TipoEmbargo extends EntityBase<Long> {

    @OneToMany(mappedBy = "tipoEmbargo")
    private List<Embargo> embargos;

    /**
     * Descripcion del Tipo de Modalidad de Contrato
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
        if (!(object instanceof TipoEmbargo)) {
            return false;
        }
        TipoEmbargo other = (TipoEmbargo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "TipoEmbargo[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
