//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._2_GestionarCargos._1_GestionarCargo;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos.TipoCargo;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._5_GestionarTabladeCategorías._1_GestionarTabladeCategorías.CategoriaTablaCategoria;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase Cargo extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Cargo
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CGO_CL_CARGO")
public class Cargo extends EntityBase<Long> {
    /**
     * codigo de registro del Cargo
     *
     * @see #getCodigo()
     */
    private int codigo;
    
    /**
     * nombre del Cargo
     *
     * @see #getNombre()
     */
    private String nombre;
    
    /**
     * Tipo del Cargo
     *
     * @see #getTipoCargo()
     */
    @ManyToOne
    @JoinColumn(name="TIPO_CARGO_ID")
    private TipoCargo tipoCargo;
                    
    
    /**
     * Número de la normativa legal que da sustento a la creación o modificación del Cargo.
     * @return 
     */
    private String normativaLegal;
    
    
    /**
     * Listado de Asociaciones Categoria - Cargo - TablaCategoria del Cargo
     */
    @OneToMany(mappedBy = "cargo")
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
        if (!(object instanceof Cargo)) {
            return false;
        }
        Cargo other = (Cargo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Cargo[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Cargo
     */
    public Cargo() {
    }
    
}