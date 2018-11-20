//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._3_FormularServiciosdePersonal._2_GestionarTopedeContratos;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos.DepartamentoTerritorial;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._5_GestionarTabladeCategorías._1_GestionarTabladeCategorías.ConceptoCategoriaTablaCategoria;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.MesEnum;
/**
 * Clase DetalleTopeContrato extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Detalle del Tope de Contrato
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="DTC_MV_DETTOPECON")
public class DetalleTopeContrato extends EntityBase<Long> {
    
    @ManyToOne
    @JoinColumn(name="TOPECON_ID")
    private TopeContrato topeContrato;
    
           
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
    
    /**
     * Número de meses que aplican para la línea del Detalle del Tope de Contrato .
     * @return 
     */
    private Integer meses;
    
    /**
     * Indica el mes inicial para formular la linea del Detalle del Tope de Contrato .
     * @return 
     */
    @Enumerated(EnumType.STRING)
    private MesEnum mesDesde;
    
    /**
     * Cantidad total de puestos a Formular .
     * @return 
     */
    private Integer cantidadPuestos;
    
    /**
     * Monto total de la Formulacion de la línea del Detalle del Tope de Contrato .
     * @return 
     */
    private Double importeTotal;
        
    /**
     * Listao de Importes mensuales de la línea del Detalle de Tope de Contrato.
     * @return 
     */
    @OneToMany(mappedBy = "detalleTopeContrato")
    private List<DetalleImporteTopeContrato> detalleImporteTopeContratos;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleTopeContrato)) {
            return false;
        }
        DetalleTopeContrato other = (DetalleTopeContrato) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "DetalleTopeContrato[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad DetalleAnexoPersonal
     */
    public DetalleTopeContrato() {
    }
    
}
