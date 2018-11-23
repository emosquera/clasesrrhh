//QSGEN This file will be ignored in future code generations if it's changed
package Clasificadores.Categoria;

import Clasificadores.TablaCategoria.CategoriaTablaCategoria;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.FlujoClasificadoresEstandar;
/**
 * Clase Categoria extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Categoria
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CAT_CL_CATEGORIA")
public class Categoria extends EntityBase<Long> {
    /**
     * codigo de registro de la Categoria
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * nombre de la Categoria
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * descripcion de la Categoria
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    
    /**
     * Número de la normativa legal que da sustento a la creación o modificación de la Categoria.
     * @return 
     */
    private String normativaLegal;
    
    /**
     * Listado de Asociaciones Categoria - Cargo - TablaCategoria de la Categoria
     */
    @OneToMany(mappedBy = "categoria")
    private List<CategoriaTablaCategoria> categoriaTablaCategoriass;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Categoria[ id=" + id + " ]";
    }
    
    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Categoria
     */
    public Categoria() {
    }
    
}
