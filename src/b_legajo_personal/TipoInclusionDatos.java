//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoInclusionDatos extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al tipo de inclusion de datos
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TIPO_INCLUSION_DATOS")
public class TipoInclusionDatos extends EntityBase<Long> {
    /**
     * codigo de registro del Tipo de Inclusion de Datos
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * informacion a incluir del Tipo de Inclusion de Datos
     *
     * @see #getInformacion()
     */
    private String informacion;
    /**
     * Listado de proformas de funcionarios donde se ha incluido los datos
     *
     * @see #getInformacion()
     */
    private List<ProformaFuncionarios> proformasFuncionarios;
    /**
     * Getter.
     *
     * @return codigo: codigo identificador del TipoInclusionDatos
     */
    @Column(name="CODIGO", nullable = false, length = 5)
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
     * @return informacion: informacion a incluir del TipoInclusionDatos.
     */
    @Column(name="INFORMACION", nullable = false, length = 120)
    public String getInformacion() {
        return informacion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo informacion
     *
     * @param informacion
     */
    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }
    /**
     * Getter.
     *
     * @return proformasFuncionarios: listado de proformas donde se ha incluido los datos.
     */
    @ManyToMany(mappedBy = "datosIncluidos")
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
        if (!(object instanceof TipoInclusionDatos)) {
            return false;
        }
        TipoInclusionDatos other = (TipoInclusionDatos) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.TipoInclusionDatos[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoInclusionDatos
     */
    public TipoInclusionDatos() {
    }
    
}
