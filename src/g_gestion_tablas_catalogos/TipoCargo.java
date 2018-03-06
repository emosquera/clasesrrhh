//QSGEN This file will be ignored in future code generations if it's changed
package g_gestion_tablas_catalogos;

import a_programacion_presupuestaria.Cargo;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoCargo extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Tipo de Cargo
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_CARGO")
public class TipoCargo extends EntityBase<Long> {
    /**
     * codigo de registro del TipoCargo
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * abreviatura para identificar al TipoCargo
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * nombre del TipoCargo
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * Listado de cargos asociados al TipoCargo
     *
     * @see #getCargos()
     */
    private List<Cargo> cargos;
    /**
     * Getter.
     *
     * @return codigo: codigo del TipoCargo.
     */
    @Column(name="CODIGO", nullable = false, length = 9)
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
     * @return abreviatura: abreviatura del TipoCargo.
     */
    @Column(name="ABREVIATURA", nullable = false, length = 6)
    public String getAbreviatura() {
        return abreviatura;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo abreviatura
     *
     * @param abreviatura
     */
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    /**
     * Getter.
     *
     * @return nombre: nombre del TipoCargo.
     */
    @Column(name="NOMBRE", nullable = false, length = 100)
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter.
     *
     * @return cargos: Listado de cargos asociados al TipoCargo.
     */
    @OneToMany(mappedBy = "tipoCargo")
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
        if (!(object instanceof TipoCargo)) {
            return false;
        }
        TipoCargo other = (TipoCargo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "g_gestion_tablas_catalogos.TipoCargo[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoCargo
     */
    public TipoCargo() {
    }
    
}
