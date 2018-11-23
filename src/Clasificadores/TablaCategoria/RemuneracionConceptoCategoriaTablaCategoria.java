//QSGEN This file will be ignored in future code generations if it's changed
package Clasificadores.TablaCategoria;

import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.MesEnum;
/**
 * Clase ConceptoCategoriaTablaCategoria extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Concepto asociado al Cargo y Categoria Asociada a la Tabla de Categoria
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="RCC_AP_REMCONTABC")
public class RemuneracionConceptoCategoriaTablaCategoria extends EntityBase<Long> {   
    
    /**
     * Concepto asociado al Cargo y Categoria Asociada a la Tabla de Categoria al cual pertenece el Monto
     */
    @ManyToOne
    @JoinColumn(name="CONCATTABCAT_ID")
    private ConceptoCategoriaTablaCategoria conceptoCategoriaTablaCategoria;
    
    /**
     * Mes del año para el cual se define la remuneración por el concepto.
     */
    @Enumerated(EnumType.STRING)
    private MesEnum mes;
    
    /**
     * Remuneración expresada en el Tipo de Moneda definida en la {@link TablaCategoria}.
     * @return 
     */
    private Double monto;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RemuneracionConceptoCategoriaTablaCategoria)) {
            return false;
        }
        RemuneracionConceptoCategoriaTablaCategoria other = (RemuneracionConceptoCategoriaTablaCategoria) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ConceptoCategoriaTablaCategoria[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
