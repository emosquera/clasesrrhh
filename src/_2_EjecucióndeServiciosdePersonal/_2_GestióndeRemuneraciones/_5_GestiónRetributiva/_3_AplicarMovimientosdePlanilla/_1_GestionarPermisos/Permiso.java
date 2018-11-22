//QSGEN This file will be ignored in future code generations if it's changed
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._5_GestiónRetributiva._3_AplicarMovimientosdePlanilla._1_GestionarPermisos;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos.TipoPermiso;
import _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._3_IncorporacióndeRecursosHumanos._2_HabilitarFuncionario._2_RegistrarDisposición.Disposicion;
import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase Permiso extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al permiso otorgado a un trabajador
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="PMO_MA_PERMISO")
public class Permiso extends EntityBase<Long> {
    /**
     * disposicion a la cual se le asocia el permiso
     *
     * @see #getDisposicion()
     */
    @ManyToOne
    @JoinColumn(name="DISPOSICION_ID")
    private Disposicion disposicion;
    /**
     * fecha de inicio del permiso
     *
     * @see #getFechaInicio()
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    /**
     * fecha de fin del permiso
     *
     * @see #getFechaFin()
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    /**
     * tipo de permiso
     *
     * @see #getTipoPermiso()
     */
    @ManyToOne
    @JoinColumn(name="TIPOPER_ID")
    private TipoPermiso tipoPermiso;
    
    /**
     * descripcion del permiso
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permiso)) {
            return false;
        }
        Permiso other = (Permiso) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.Permiso[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Permiso
     */
    public Permiso() {
    }

}
