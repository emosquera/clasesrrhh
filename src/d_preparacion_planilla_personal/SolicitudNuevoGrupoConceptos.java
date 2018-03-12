//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.EstadoSolicitudGrupoConceptosEnum;
/**
 * Clase SolicitudNuevoGrupoConceptos extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la solicitud de nuevo grupo de conceptos
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="SOLICITUD_NUEVO_GRUPO_CONCEPTOS")
public class SolicitudNuevoGrupoConceptos extends EntityBase<Long> {
    /**
     * Grupo de Conceptos de Planilla de Personal a ser aprobado
     *
     * @see #getGrupoConceptos()
     */
    private GrupoConceptosPlanillaPersonal grupoConceptos;
    /**
     * Comentarios referentes a la aprobacion o rechazo del grupo de conceptos
     *
     * @see #getComentarios()
     */
    private String comentarios;
    /**
     * fecha de respuesta a la solicitud
     *
     * @see #getFechaRespuesta()
     */
    private Date fechaRespuesta;
    /**
     * fecha de respuesta a la solicitud
     *
     * @see #getFechaRespuesta()
     */
    private EstadoSolicitudGrupoConceptosEnum estado;
    /**
     * Getter.
     *
     * @return grupoConceptos: Grupo de conceptos a ser aprobado
     */
    @OneToOne
    @JoinColumn(name="GRUPO_CONCEPTOS_PLANILLA_ID")
    public GrupoConceptosPlanillaPersonal getGrupoConceptos() {
        return grupoConceptos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo grupoConceptos
     *
     * @param grupoConceptos
     */
    public void setGrupoConceptos(GrupoConceptosPlanillaPersonal grupoConceptos) {
        this.grupoConceptos = grupoConceptos;
    }
    /**
     * Getter.
     *
     * @return comentarios: Comentarios referentes a la aprobacion
     */
    @Column(name="COMENTARIOS", nullable = false, length = 1000)
    public String getComentarios() {
        return comentarios;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo comentarios
     *
     * @param comentarios
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    /**
     * Getter.
     *
     * @return fechaRespuesta: fecha de respuesta de la solicitud
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_RESPUESTA", nullable = false)
    public Date getFechaRespuesta() {
        return fechaRespuesta;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaRespuesta
     *
     * @param fechaRespuesta
     */
    public void setFechaRespuesta(Date fechaRespuesta) {
        this.fechaRespuesta = fechaRespuesta;
    }
    /**
     * Getter.
     *
     * @return estado: estado de la solicitud
     */
    @Enumerated(EnumType.STRING)
    @Column(name="ESTADO", nullable = false)
    public EstadoSolicitudGrupoConceptosEnum getEstado() {
        return estado;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estado
     *
     * @param estado
     */
    public void setEstado(EstadoSolicitudGrupoConceptosEnum estado) {
        this.estado = estado;
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
        if (!(object instanceof SolicitudNuevoGrupoConceptos)) {
            return false;
        }
        SolicitudNuevoGrupoConceptos other = (SolicitudNuevoGrupoConceptos) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "d_preparacion_planilla_personal.SolicitudNuevoGrupoConceptos[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad SolicitudNuevoGrupoConceptos
     */
    public SolicitudNuevoGrupoConceptos() {
    }
        
}
