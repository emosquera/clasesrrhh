//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import y_entity.base.EntityBase;
import entity.externos.Nivel;
import z_enums.catalogo.EstadoEntidadPlanillaPersonal;
import javax.persistence.*;
/**
 * Clase EntidadPlanillaPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a las Entidades de la Planilla de Personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="ENTIDAD_PLANILLA_PERSONAL")
public class EntidadPlanillaPersonal extends EntityBase<Long> {
    /**
     * codigo de registro de la Entidad de la Planilla de Personal
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion de la Entidad de la Planilla de Personal
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Nivel al cual pertenece la Entidad de la Planilla de Personal
     *
     * @see #getNivel()
     */
    private Nivel nivel;
    /**
     * Estado de la Entidad de la Planilla de Personal
     *
     * @see #getEstadoEntidad()
     */
    private EstadoEntidadPlanillaPersonal estadoEntidad;
    /**
     * Planilla de Personal a la cual esta asociada la Entidad.
     *
     * @see #getTipoPlanillaPersonal()
     */
    private TipoPlanillaPersonal tipoPlanillaPersonal;
    /**
     * Getter.
     *
     * @return codigo: codigo identificador de la Entidad de la Planilla de Personal.
     */
    @Column(name = "CODIGO", nullable = false, length = 4)
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
     * @return descripcion: descripcion de la Entidad de la Planilla de Personal.
     */
    @Column(name = "DESCRIPCION", nullable = false, length = 75)
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
     * @return nivel: nivel al cual pertenece la Entidad de la Planilla de Personal.
     */ 
    @ManyToOne
    @Column(name = "NIVEL", nullable = false)
    public Nivel getNivel() {
        return nivel;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo nivel
     *
     * @param nivel
     */
    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }
    /**
     * Getter.
     *
     * @return estadoEntidad: estado de la Entidad de la Planilla de Personal.
     */ 
    @Enumerated(EnumType.STRING)
    @Column(name="ESTADO_ENTIDAD")
    public EstadoEntidadPlanillaPersonal getEstadoEntidad() {
        return estadoEntidad;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estadoEntidad
     *
     * @param estadoEntidad
     */
    public void setEstadoEntidad(EstadoEntidadPlanillaPersonal estadoEntidad) {
        this.estadoEntidad = estadoEntidad;
    }
    /**
     * Getter.
     *
     * @return tipoPlanillaPersonal: Planilla de Personal a la cual esta asociada la Entidad.
     */ 
    @ManyToOne
    public TipoPlanillaPersonal getTipoPlanillaPersonal() {
        return tipoPlanillaPersonal;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoPlanillaPersonal
     *
     * @param tipoPlanillaPersonal
     */
    public void setTipoPlanillaPersonal(TipoPlanillaPersonal tipoPlanillaPersonal) {
        this.tipoPlanillaPersonal = tipoPlanillaPersonal;
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
        if (!(object instanceof EntidadPlanillaPersonal)) {
            return false;
        }
        EntidadPlanillaPersonal other = (EntidadPlanillaPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.EntidadPlanillaPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad EntidadPlanillaPersonal
     */
    public EntidadPlanillaPersonal() {
    }
    
}
