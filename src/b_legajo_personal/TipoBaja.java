//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoBaja extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Tipo de Baja
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_BAJA")
public class TipoBaja extends EntityBase<Long> {
    /**
     * codigo de registro del TipoBaja
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion del TipoBaja
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Listado de Bajas asociadas al Tipo de Baja
     *
     * @see #getBajaFuncionarios()
     */
    private List<BajaFuncionario> bajaFuncionarios;
    /**
     * Getter.
     *
     * @return codigo: codigo del TipoBaja.
     */
    @Column(name="CODIGO", nullable = false, length = 4)
    public String getCodigo() {
        return codigo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo codigo
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * Getter.
     *
     * @return descripcion: descripcion del TipoBaja.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 30)
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo descripcion
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Getter.
     *
     * @return bajaFuncionarios: Listado de bajas asociado al Tipo de Baja.
     */
    @OneToMany(mappedBy = "tipoBaja")
    public List<BajaFuncionario> getBajaFuncionarios() {
        return bajaFuncionarios;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo bajaFuncionarios
     *
     * @param bajaFuncionarios
     */
    public void setBajaFuncionarios(List<BajaFuncionario> bajaFuncionarios) {
        this.bajaFuncionarios = bajaFuncionarios;
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
        if (!(object instanceof TipoBaja)) {
            return false;
        }
        TipoBaja other = (TipoBaja) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.TipoBaja[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoBaja
     */
    public TipoBaja() {
    }
    
}
