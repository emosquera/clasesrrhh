//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import a_programacion_presupuestaria.Puesto;
import d_preparacion_planilla_personal.TipoPlanillaPersonal;
import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.EstatusDisposicion;
/**
 * Clase Disposicion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Disposicion
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="DISPOSICION")
public class Disposicion extends EntityBase<Long> {
    /**
     * Persona asociada a la Disposicion
     *
     * @see #getPersona()
     */
    private Persona persona;
    /**
     * Tipo de Disposicion
     *
     * @see #getTipoDisposicion()
     */
    private TipoDisposicion tipoDisposicion;
    /**
     * puesto Asociado a la Disposicion
     *
     * @see #getTipoPuesto()
     */
    private Puesto puesto;
    /**
     * Planilla de Personal a la cual esta asociada la Disposicion
     *
     * @see #getPlanillaPersonal()
     */
    private TipoPlanillaPersonal planillaPersonal;
    /**
     * Fecha de registro de la Disposicion
     *
     * @see #getFechaDisposicion()
     */
    private Date fechaDisposicion;
    /**
     * Fecha de Inicio de la Disposicion
     *
     * @see #getFechaInicio()
     */
    private Date fechaInicio;
    /**
     * Fecha de Fin de la Disposicion
     *
     * @see #getFechaFin()
     */
    private Date fechaFin;
    //private List<Horario> horarios;
    //private List<ResolucionDisposicion> resoluciones
    //private DocumentoProbatorioResolucion documentoProbatorio;
    /**
     * Estatus de la Disposicion
     *
     * @see #getEstatus()
     */
    private EstatusDisposicion estatus;
    /**
     * Baja del funcionario asociado a la Disposicion
     *
     * @see #getBajaFuncionario()
     */
    private BajaFuncionario bajaFuncionario;
    /**
     * Getter.
     *
     * @return persona: Persona asociada a la disposicion
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
     * @return tipoDisposicion: Tipo de la Disposicion
     */
    @ManyToOne
    @JoinColumn(name="TIPO_DISPOSICION_ID")
    public TipoDisposicion getTipoDisposicion() {
        return tipoDisposicion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoDisposicion
     *
     * @param tipoDisposicion
     */
    public void setTipoDisposicion(TipoDisposicion tipoDisposicion) {
        this.tipoDisposicion = tipoDisposicion;
    }
    /**
     * Getter.
     *
     * @return puesto: Puesto al cual se asocia la disposicion
     */
    @OneToOne(mappedBy = "disposicion")
    public Puesto getPuesto() {
        return puesto;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo puesto
     *
     * @param puesto
     */
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    /**
     * Getter.
     *
     * @return planillaPersonal: Planilla de Personal a la cual se asocia la Disposicion
     */
    @ManyToOne
    @JoinColumn(name="PLANILLA_PERSONAL_ID")
    public TipoPlanillaPersonal getPlanillaPersonal() {
        return planillaPersonal;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo planillaPersonal
     *
     * @param planillaPersonal
     */
    public void setPlanillaPersonal(TipoPlanillaPersonal planillaPersonal) {
        this.planillaPersonal = planillaPersonal;
    }
    /**
     * Getter.
     *
     * @return fechaDisposicion: fecha de registro de la Disposicion
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_DISPOSICION", nullable = false)
    public Date getFechaDisposicion() {
        return fechaDisposicion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaDisposicion
     *
     * @param fechaDisposicion
     */
    public void setFechaDisposicion(Date fechaDisposicion) {
        this.fechaDisposicion = fechaDisposicion;
    }
    /**
     * Getter.
     *
     * @return fechaInicio: fecha de inicio de la Disposicion
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
     * @return fechaFin: fecha de fin de la Disposicion
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
    @Enumerated(EnumType.STRING)
    @Column(name="ESTATUS", nullable = false)
    public EstatusDisposicion getEstatus() {
        return estatus;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estatus
     *
     * @param estatus
     */
    public void setEstatus(EstatusDisposicion estatus) {
        this.estatus = estatus;
    }
    /**
     * Getter.
     *
     * @return bajaFuncionario: Baja de Funcionario asociado a la Disposicion
     */
    @OneToOne
    public BajaFuncionario getBajaFuncionario() {
        return bajaFuncionario;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo bajaFuncionario
     *
     * @param bajaFuncionario
     */
    public void setBajaFuncionario(BajaFuncionario bajaFuncionario) {
        this.bajaFuncionario = bajaFuncionario;
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
        if (!(object instanceof Disposicion)) {
            return false;
        }
        Disposicion other = (Disposicion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.Disposicion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Disposicion
     */
    public Disposicion() {
    }
        
}