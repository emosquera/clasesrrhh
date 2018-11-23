//QSGEN This file will be ignored in future code generations if it's changed
package FormularServiciosPersonal.OtrosGastosPersonal;

import TablasYCatalogos.DepartamentoTerritorial;
import Clasificadores.TablaCategoria.ConceptoCategoriaTablaCategoria;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.MesEnum;

@Entity
@Table(name="DOG_MV_DETOTRGASPER")
public class DetalleOtroGastoPersonal extends EntityBase<Long> {
    
    @ManyToOne
    @JoinColumn(name="OTRGASPER_ID")
    private OtroGastoPersonal otroGastoPersonal;
           
    /**
     * Departamento Territorial que forma parte de la Linea Presupuestaria
     * @return 
     */
    @ManyToOne
    @JoinColumn(name="DEPTERRITORIAL_ID")
    private DepartamentoTerritorial departamentoTerritorial;
    
    /**
     *  Cargo - Categoria - TablaCategoria - Concepto a Formular
     * @return 
     */
    @ManyToOne
    @JoinColumn(name="CONCATTABCAT_ID")
    private ConceptoCategoriaTablaCategoria conceptoCategoriaTablaCategoria;
    
    /**
     * Anno de la Formulacion
     * @return 
     */
    private Integer anno;
    

    private Integer meses;
    

    @Enumerated(EnumType.STRING)
    private MesEnum mesDesde;
    
    /**
     * Cantidad total de puestos a Formular .
     * @return 
     */
    private Integer cantidadPuestos;
    
 
    private Double importeTotal;
    
    
    @OneToMany(mappedBy = "detalleOtroGastoPersonal")
    private List<DetalleImporteOtroGastoPersonal> detalleImporteOtroGastoPersonals;

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleOtroGastoPersonal)) {
            return false;
        }
        DetalleOtroGastoPersonal other = (DetalleOtroGastoPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "DetalleOtroGastoPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad DetalleAnexoPersonal
     */
    public DetalleOtroGastoPersonal() {
    }
    
}
