//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import java.util.Date;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase ResolucionEEN extiende de {@link EntityBase}
 *
 * Contiene la información de la resolucion emitida por el equipo economico nacional
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="RESOLUCION_EEN")
public class ResolucionEEN extends EntityBase<Long> {
    /**
     * numero de la resolucion del EEN
     *
     * @see #getNumeroResolucion()
     */
    private String numeroResolucion;
    /**
     * Estructura Organizacional asociada a la resolucion del EEN
     *
     * @see #getEstructuraOrganizacional()
     */
    private EstructuraOrganizacional estructuraOrganizacional;
    /**
     * Numero de Acta de la resolucion del EEN
     *
     * @see #getNumeroActa()
     */
    private String numeroActa;
    /**
     * fecha de la resolucion del EEN
     *
     * @see #getFecha()
     */
    private Date fecha;
    /**
     * Listado de cargos aprobados en la resolucion
     *
     * @see #getCargosAprobadosResolucion()
     */
    private List<CargosAprobadosResolucion> cargosAprobadosResolucion;
    /**
     * Getter.
     *
     * @return numeroResolucion: numero de la resolucion del EEN
     */
    @Column(name="NUMERO_RESOLUCION", nullable = false, length = 20)
    public String getNumeroResolucion() {
        return numeroResolucion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo numeroResolucion
     *
     * @param numeroResolucion
     */
    public void setNumeroResolucion(String numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }
    /**
     * Getter.
     *
     * @return estructuraOrganizacional: Estructura Organizacional asociada a la resolucion del EEN
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
     * @return numeroActa: numero de acta de la resolucion del EEN
     */
    @Column(name="NUMERO_ACTA", nullable = false, length = 20)
    public String getNumeroActa() {
        return numeroActa;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo numeroActa
     *
     * @param numeroActa
     */
    public void setNumeroActa(String numeroActa) {
        this.numeroActa = numeroActa;
    }
    /**
     * Getter.
     *
     * @return fecha: fecha de la resolucion del EEN
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA", nullable = false)
    public Date getFecha() {
        return fecha;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fecha
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    /**
     * Getter.
     *
     * @return cargosAprobadosResolucion: cargos aprobados en resolucion del EEN
     */
    @OneToMany(mappedBy = "resolucionEEN")
    public List<CargosAprobadosResolucion> getCargosAprobadosResolucion() {
        return cargosAprobadosResolucion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo cargosAprobadosResolucion
     *
     * @param cargosAprobadosResolucion
     */
    public void setCargosAprobadosResolucion(List<CargosAprobadosResolucion> cargosAprobadosResolucion) {
        this.cargosAprobadosResolucion = cargosAprobadosResolucion;
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
        if (!(object instanceof ResolucionEEN)) {
            return false;
        }
        ResolucionEEN other = (ResolucionEEN) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.ResolucionEEN[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResolucionEEN() {
    }
    
}
