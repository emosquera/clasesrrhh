//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.Mes;
/**
 * Clase CategoriaTablaCategorias extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Categoria Asociadas a Tabla de Categorias
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CATEGORIA_TABLA_CATEGORIAS")
public class CategoriaTablaCategorias extends EntityBase<Long> {
    /**
     * categoria asociada a la Tabla de Categorias
     *
     * @see #getCategoria()
     */
    private Categoria categoria;
    /**
     * Tabla de Categoria asociada a Categorias
     *
     * @see #getTablaCategorias()
     */
    private TablaCategorias tablaCategorias;
    /**
     * Monto de salario para la categoria en el mes
     *
     * @see #getMontoSalario()
     */
    private Double montoSalario;
    /**
     * Mes al cual se le asocia el Salario
     *
     * @see #getMes()
     */
    private Mes mes;
    /**
     * Listado de Cargos Asociados a la Categoria asociada a la Tabla de Categorias
     *
     * @see #getCargos()
     */
    private List<Cargo> cargos;
    /**
     * Getter.
     *
     * @return categoria: categoria asociada a la Tabla de Categorias.
     */
    @ManyToOne
    @JoinColumn(name="CATEGORIA_ID")
    public Categoria getCategoria() {
        return categoria;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo categoria
     *
     * @param categoria
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    /**
     * Getter.
     *
     * @return TablaCategorias: Tabla de Categoria asociada a Categorias.
     */
    @ManyToOne
    @JoinColumn(name="TABLA_CATEGORIA_ID")
    public TablaCategorias getTablaCategorias() {
        return tablaCategorias;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tablaCategorias
     *
     * @param tablaCategorias
     */
    public void setTablaCategorias(TablaCategorias tablaCategorias) {
        this.tablaCategorias = tablaCategorias;
    }
    /**
     * Getter.
     *
     * @return montoSalario: Monto de salario para la categoria en el mes.
     */
    @Column(name="MONTO", nullable = false)
    public Double getMontoSalario() {
        return montoSalario;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo montoSalario
     *
     * @param montoSalario
     */
    public void setMontoSalario(Double montoSalario) {
        this.montoSalario = montoSalario;
    }
    /**
     * Getter.
     *
     * @return mes: Mes al cual se le asocia el Salario.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="MES", nullable = false)
    public Mes getMes() {
        return mes;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo mes
     *
     * @param mes
     */
    public void setMes(Mes mes) {
        this.mes = mes;
    }
    /**
     * Getter.
     *
     * @return cargos: Listado de Cargos Asociados a la Categoria asociada a la Tabla de Categorias.
     */
    @OneToMany(mappedBy = "categoriaTablaCategorias")
    public List<Cargo> getCargos() {
        return cargos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo cargos
     *
     * @param cargos
     */
    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriaTablaCategorias)) {
            return false;
        }
        CategoriaTablaCategorias other = (CategoriaTablaCategorias) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.CategoriaTablaCategorias[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad CategoriaTablaCategorias
     */
    public CategoriaTablaCategorias() {
    }
    
}
