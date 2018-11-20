//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._5_GestionarTabladeCategorías._1_GestionarTabladeCategorías;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._4_GestionarConceptosdeBeneficios._1_GestionarConceptosdePlanilladePersonal.ConceptoPlanillaPersonal;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.TipoFormulacionEnum;
/**
 * Clase ConceptoCategoriaTablaCategoria extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Concepto asociado al Cargo y Categoria Asociada a la Tabla de Categoria
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CCT_AP_CONCATTABCAT")
public class ConceptoCategoriaTablaCategoria extends EntityBase<Long> {

    /**
     * Remuneraciones del Concepto asociado al Cargo y Categoria Asociada a la Tabla de Categoria
     */
    @OneToMany(mappedBy = "conceptoCategoriaTablaCategoria")
    private List<RemuneracionConceptoCategoriaTablaCategoria> remuneracionConceptoCategoriaTablaCategorias;
    
    
   /**
    * Identificador único de la asociación del concepto de planilla de personal a la categoría y Cargo asociados a la tabla de categorías.
    * @return 
    */
    private String codigo;
    
    
    /**
     * {@link CategoriaTablaCategoria} del Concepto
     */
    @ManyToOne
    @JoinColumn(name="CATTABCAT_ID")
    private CategoriaTablaCategoria categoriaTablaCategoria;
    
    /**
     * {@link ConceptoPlanilla}
     * @return 
     */
    @ManyToOne
    @JoinColumn(name="CONCEPTO_ID")
    private ConceptoPlanillaPersonal concepto;

    /**
     * Indica si el concepto asociado a la categoría y cargo asociados a la Tabla de Categorias es usado para formular a través del Anexo de Personal, Tope de Contratos u Otros gastos de personal.
     */
    @Enumerated(EnumType.STRING)
    private TipoFormulacionEnum tipoFormulacion;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConceptoCategoriaTablaCategoria)) {
            return false;
        }
        ConceptoCategoriaTablaCategoria other = (ConceptoCategoriaTablaCategoria) object;
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
