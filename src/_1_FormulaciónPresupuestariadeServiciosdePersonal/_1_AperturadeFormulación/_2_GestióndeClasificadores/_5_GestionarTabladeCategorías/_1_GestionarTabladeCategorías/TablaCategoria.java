//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._5_GestionarTabladeCategorías._1_GestionarTabladeCategorías;

import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.FlujoClasificadoresEstandar;
/**
 * Clase TablaCategoria extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Tabla de Categorias
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TCG_CL_TABLACAT")
public class TablaCategoria extends EntityBase<Long> {
    /**
     * codigo de la Tabla de Categorias
     *
     * @see #getCodigo()
     */
    private String codigo;
    
    /**
     * nombre de la Tabla de Categorias
     *
     * @see #getNombre()
     */
    private String nombre;
    
    /**
     * abreviatura de la Tabla de Categorias
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
        
    
    /**
     * Ejercicio Fiscal valido de la Tabla Categoria
     * @return 
     */
    private Integer anno;
    
    /**
     * Listado de Asociaciones Categoria - Cargo - TablaCategoria de la TablaCategoria
     */
    @OneToMany(mappedBy = "tablaCategoria")
    private List<CategoriaTablaCategoria> categoriaTablaCategorias;
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TablaCategoria)) {
            return false;
        }
        TablaCategoria other = (TablaCategoria) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "TablaCategorias[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TablaCategorias
     */
    public TablaCategoria() {
    }

}
