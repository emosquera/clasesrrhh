//QSGEN This file will be ignored in future code generations if it's changed
package c_foja_servicio;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._1_GestionarDatosdePersona.Persona;
import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.EstadoJubilacionRetiroEnum;
/**
 * Clase Retiro extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Retiro.
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="RETIRO")
public class Retiro extends EntityBase<Long> {
    /**
     * codigo de registro del Retiro
     *
     * @see #getCodigo()
     */
    private Integer codigo;
    /**
     * Persona a la cual se asocia el Retiro
     *
     * @see #getPersona()
     */
    private Persona persona;
    /**
     * Fecha en que se realiza la solicitud del Retiro
     *
     * @see #getFechaSolicitud()
     */
    private Date fechaSolicitud;
    /**
     * Fecha en la que se aprueba o rechaza el Retiro
     *
     * @see #getFechaRespuesta()
     */
    private Date fechaRespuesta;
    /**
     * Estado del Retiro
     *
     * @see #getEstado()
     */
    private EstadoJubilacionRetiroEnum estado;
    /**
     * Getter.
     *
     * @return codigo: codigo de registro del Retiro.
     */
    @Column(name="CODIGO", nullable = false)
    public Integer getCodigo() {
        return codigo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo codigo
     *
     * @param codigo
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    /**
     * Getter.
     *
     * @return persona: persona a la cual se le asocia el Retiro.
     */
    
    @ManyToOne
    @JoinColumn(name="PERSONA_ID")
    public Persona getPersona() {
        return persona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo persona
     *
     * @param persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    /**
     * Getter.
     *
     * @return fechaSolicitud: fecha en la que se solicita el Retiro.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_SOLICITUD", nullable = false)
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaSolicitud
     *
     * @param fechaSolicitud
     */
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
    /**
     * Getter.
     *
     * @return fechaRespuesta: fecha en la cual se aprueba o rechaza la Jubilacion.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_RESPUESTA", nullable = true)
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
     * @return estado: estado de la Jubilacion.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="ESTADO", nullable = false)
    public EstadoJubilacionRetiroEnum getEstado() {
        return estado;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estado
     *
     * @param estado
     */
    public void setEstado(EstadoJubilacionRetiroEnum estado) {
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
        if (!(object instanceof Retiro)) {
            return false;
        }
        Retiro other = (Retiro) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "c_foja_servicio.Retiro[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Retiro
     */
    public Retiro() {
    }
    
}
