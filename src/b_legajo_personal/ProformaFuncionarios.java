//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import a_programacion_presupuestaria.EstructuraOrganizacional;
import java.util.Date;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase ProformaFuncionarios extiende de {@link EntityBase}
 *
 * Contiene la información de la proforma de funcionarios
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="PROFORMA_FUNCIONARIOS")
public class ProformaFuncionarios extends EntityBase<Long> {
    /**
     * Estructura Organizacional a la cual se asocia la proforma de funcionarios
     *
     * @see #getEstructuraOrganizacional()
     */
    private EstructuraOrganizacional estructuraOrganizacional;
    /**
     * Layout de Proforma sobre la cual se genera la Proforma.
     *
     * @see #getLayoutProformaFuncionarios()
     */
    private LayoutProformaFuncionarios layoutProforma;
    /**
     * Version de la proforma de funcionarios.
     *
     * @see #getVersion()
     */
    private int version;
    /**
     * fecha de creacion de la proforma de funcionarios.
     *
     * @see #getFechaCreacion()
     */
    private Date fechaCreacion;
    /**
     * Datos a incluir en la proforma de funcionarios.
     *
     * @see #getInclusionDatos()
     */
    private List<TipoInclusionDatos> datosIncluidos;
    /**
     * Getter.
     *
     * @return estructuraOrganizacional: Estructura Organizacional a la cual se asocia la proforma de funcionarios.
     */
    @ManyToOne
    @JoinColumn(name="ESTRUCTURA_ORGANIZACIONAL_ID")
    public EstructuraOrganizacional getEstructuraOrganizacional() {
        return estructuraOrganizacional;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estructuraOrganizacional
     *
     * @param estructuraOrganizacional
     */
    public void setEstructuraOrganizacional(EstructuraOrganizacional estructuraOrganizacional) {
        this.estructuraOrganizacional = estructuraOrganizacional;
    }
    /**
     * Getter.
     *
     * @return layoutProforma: Layout de Proforma sobre la cual se genera la Proforma.
     */
    @ManyToOne
    @JoinColumn(name="LAYOUT_ID")
    public LayoutProformaFuncionarios getLayoutProforma() {
        return layoutProforma;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo layoutProforma
     *
     * @param layoutProforma
     */
    public void setLayoutProforma(LayoutProformaFuncionarios layoutProforma) {
        this.layoutProforma = layoutProforma;
    }
    /**
     * Getter.
     *
     * @return version: Version de la proforma de funcionarios.
     */
    @Column(name="VERSION", nullable = false)
    public int getVersion() {
        return version;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo version
     *
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }
    /**
     * Getter.
     *
     * @return fechaCreacion: fecha de creacion de la proforma de funcionarios.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_CREACION", nullable = false)
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaCreacion
     *
     * @param fechaCreacion
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    /**
     * Getter.
     *
     * @return datosIncluidos: Datos a incluir en la proforma de funcionarios.
     */
    @ManyToMany
    public List<TipoInclusionDatos> getDatosIncluidos() {
        return datosIncluidos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo datosIncluidos
     *
     * @param datosIncluidos
     */
    public void setDatosIncluidos(List<TipoInclusionDatos> datosIncluidos) {
        this.datosIncluidos = datosIncluidos;
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
        if (!(object instanceof ProformaFuncionarios)) {
            return false;
        }
        ProformaFuncionarios other = (ProformaFuncionarios) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.ProformaFuncionarios[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad ProformaFuncionarios
     */
    public ProformaFuncionarios() {
    }
    
}
