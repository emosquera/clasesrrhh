//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase LayoutProformaFuncionarios extiende de {@link EntityBase}
 *
 * Contiene la información del layout de la proforma de funcionarios
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="LAYOUT_PROFORMA_FUNCIONARIOS")
public class LayoutProformaFuncionarios extends EntityBase<Long> {
    /**
     * codigo de registro del Layout
     *
     * @see #getCodigo()
     */
    private int codigo;
    /**
     * descripcion del Layout
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * numero de columnas del Layout
     *
     * @see #getNumeroColumnas()
     */
    private int numeroColumnas;
    /**
     * Proformas de funcionarios asociados al Layout
     *
     * @see #getProformasFuncionarios()
     */
    private List<ProformaFuncionarios> proformasFuncionarios;
    //private Disposicion disposicion;
    /**
     * Getter.
     *
     * @return codigo: codigo de registro del Layout.
     */
    @Column(name="CODIGO", nullable = false)
    public int getCodigo() {
        return codigo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo codigo
     *
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Getter.
     *
     * @return descripcion: descripcion del Layout.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 50)
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
     * @return numeroColumnas: numero de columnas del Layout.
     */
    @Column(name="NUMERO_COLUMNAS", nullable = false)
    public int getNumeroColumnas() {
        return numeroColumnas;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo numeroColumnas
     *
     * @param numeroColumnas
     */
    public void setNumeroColumnas(int numeroColumnas) {
        this.numeroColumnas = numeroColumnas;
    }
    /**
     * Getter.
     *
     * @return proformasFuncionarios: Proformas de funcionarios asociadas al Layout.
     */
    @OneToMany(mappedBy = "layoutProforma")
    public List<ProformaFuncionarios> getProformasFuncionarios() {
        return proformasFuncionarios;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo proformasFuncionarios
     *
     * @param proformasFuncionarios
     */
    public void setProformasFuncionarios(List<ProformaFuncionarios> proformasFuncionarios) {
        this.proformasFuncionarios = proformasFuncionarios;
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
        if (!(object instanceof LayoutProformaFuncionarios)) {
            return false;
        }
        LayoutProformaFuncionarios other = (LayoutProformaFuncionarios) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.LayoutProformaFuncionarios[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad LayoutProformaFuncionarios
     */
    public LayoutProformaFuncionarios() {
    }
    
}
