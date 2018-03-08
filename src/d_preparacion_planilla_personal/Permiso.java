//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import b_legajo_personal.Disposicion;
import java.io.File;
import java.util.Date;
import java.util.List;
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
@Table(name="PERMISO")
public class Permiso extends EntityBase<Long> {
    /**
     * disposicion a la cual se le asocia el permiso
     *
     * @see #getDisposicion()
     */
    private Disposicion disposicion;
    /**
     * fecha de inicio del permiso
     *
     * @see #getFechaInicio()
     */
    private Date fechaInicio;
    /**
     * fecha de fin del permiso
     *
     * @see #getFechaFin()
     */
    private Date fechaFin;
    /**
     * tipo de permiso
     *
     * @see #getTipoPermiso()
     */
    private TipoPermiso tipoPermiso;
    /**
     * Documentos que justifican el permiso
     *
     * @see #getDocumentosJustificativos()
     */
    private File documentosJustificativos;
    /**
     * descripcion del permiso
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Listado de horario especial asociados al Permiso
     *
     * @see #getHorariosEspecial()
     */
    private List<HorarioEspecial> horariosEspecial;
    /**
     * Getter.
     *
     * @return disposicion: Disposicion a la cual se le asocia el permiso.
     */
    @ManyToOne
    @JoinColumn(name="DISPOSICION_ID")
    public Disposicion getDisposicion() {
        return disposicion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo disposicion
     *
     * @param disposicion
     */
    public void setDisposicion(Disposicion disposicion) {
        this.disposicion = disposicion;
    }
    /**
     * Getter.
     *
     * @return fechaInicio: fecha de inicio del permiso.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_INICIO", nullable = false)
    public Date getFechaInicio() {
        return fechaInicio;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaInicio
     *
     * @param fechaInicio
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    /**
     * Getter.
     *
     * @return fechaFin: fecha de fin del permiso.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_FIN", nullable = false)
    public Date getFechaFin() {
        return fechaFin;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaFin
     *
     * @param fechaFin
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    /**
     * Getter.
     *
     * @return tipoPermiso: tipo de permiso.
     */
    @ManyToOne
    @JoinColumn(name="TIPO_PERMISO_ID")
    public TipoPermiso getTipoPermiso() {
        return tipoPermiso;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoPermiso
     *
     * @param tipoPermiso
     */
    public void setTipoPermiso(TipoPermiso tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }
    /**
     * Getter.
     *
     * @return documentosJustificativos: Documentos que verifican el permiso.
     */
    @Column(name="DOCUMENTOS_JUSTIFICATIVOS", nullable = false)
    public File getDocumentosJustificativos() {
        return documentosJustificativos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo documentosJustificativos
     *
     * @param documentosJustificativos
     */
    public void setDocumentosJustificativos(File documentosJustificativos) {
        this.documentosJustificativos = documentosJustificativos;
    }
    /**
     * Getter.
     *
     * @return descripcion: descripcion del permiso.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 1000)
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
     * @return horariosEspecial: Listado de horario especial asociados al Permiso.
     */
    @OneToMany(mappedBy = "permiso")
    public List<HorarioEspecial> getHorariosEspecial() {
        return horariosEspecial;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo horariosEspecial
     *
     * @param horariosEspecial
     */
    public void setHorariosEspecial(List<HorarioEspecial> horariosEspecial) {
        this.horariosEspecial = horariosEspecial;
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
