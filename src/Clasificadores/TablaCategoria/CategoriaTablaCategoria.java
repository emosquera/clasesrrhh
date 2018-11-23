//QSGEN This file will be ignored in future code generations if it's changed
package Clasificadores.TablaCategoria;

import Clasificadores.Cargo.Cargo;
import Clasificadores.Categoria.Categoria;
import Clasificadores.Puesto.Puesto;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase CategoriaTablaCategoria extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Categoria Asociadas a Tabla de Categorias
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CTC_AP_CATTABCAT")
public class CategoriaTablaCategoria extends EntityBase<Long> {
    /**
     * categoria asociada a la Tabla de Categorias
     *
     * @see #getCategoria()
     */    
    @ManyToOne
    @JoinColumn (name = "CATEGORIA_ID")
    private Categoria categoria;
    
    /**
     * Tabla de Categoria contenedora
     *
     * @see #getTablaCategorias()
     */
    @ManyToOne
    @JoinColumn (name = "TABLA_CATEGORIA_ID")
    private TablaCategoria tablaCategoria;
    
    
    /**
     * Cargo asociado a la Tabla de Categoria
     *
     * @see #getCargos()
     */
    @ManyToOne
    @JoinColumn (name = "CARGO_ID")
    private Cargo cargo;
    
    /**
     * Listado de {@link ConceptosPlanillaPersonal} asociados a traves de {@link ConceptoCategoriaTablaCategoria}
     */
    @OneToMany(mappedBy = "categoriaTablaCategoria")
    private List<ConceptoCategoriaTablaCategoria> conceptoCategoriaTablaCategorias;
    
    /**
     * Puestos asociados
     */
    @OneToMany(mappedBy = "categoriaTablaCategoria")
    private List<Puesto> puestos;
 
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaTablaCategoria)) {
            return false;
        }
        CategoriaTablaCategoria other = (CategoriaTablaCategoria) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "CategoriaTablaCategorias[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad CategoriaTablaCategorias
     */
    public CategoriaTablaCategoria() {
    }
    
}
