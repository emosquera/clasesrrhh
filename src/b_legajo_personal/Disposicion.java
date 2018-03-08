//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import a_programacion_presupuestaria.Puesto;
import d_preparacion_planilla_personal.FuncionarioPlanilla;
import d_preparacion_planilla_personal.Permiso;
import java.util.Date;
import java.util.List;
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
     * Defuncion del funcionario asociado a la Disposicion
     *
     * @see #getDefuncionTrabajador()
     */
    private DefuncionTrabajador defuncionTrabajador;
    /**
     * Listado de Permisos asociados a la disposicion
     *
     * @see #getPermisos()
     */
    private List<Permiso> permisos;
    /**
     * Listado de Seguros asociados a la disposicion
     *
     * @see #getSeguros()
     */
    private List<Seguro> seguros;
    /**
     * Listado de eventos de habilitacion asociados a la disposicion
     *
     * @see #getEventosHabilitacion()
     */
    private List<EventoHabilitacion> eventosHabilitacion;
    /**
     * Listado de planillas a las cuales se ha asociado la disposicion
     *
     * @see #getFuncionarioPlanillas()
     */
    private List<FuncionarioPlanilla> funcionarioPlanillas;
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
    /**
     * Getter.
     *
     * @return estatus: estatus de la Disposicion
     */
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
    @JoinColumn(name="BAJA_FUNCIONARIO_ID")
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
    /**
     * Getter.
     *
     * @return defuncionTrabajador: Defuncion de Funcionario asociado a la Disposicion
     */
    @OneToOne
    @JoinColumn(name="DEFUNCION_TRABAJADOR_ID")
    public DefuncionTrabajador getDefuncionTrabajador() {
        return defuncionTrabajador;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo defuncionTrabajador
     *
     * @param defuncionTrabajador
     */
    public void setDefuncionTrabajador(DefuncionTrabajador defuncionTrabajador) {
        this.defuncionTrabajador = defuncionTrabajador;
    }
    /**
     * Getter.
     *
     * @return permisos: permisos asociados a la disposicion
     */
    @OneToMany(mappedBy = "disposicion")
    public List<Permiso> getPermisos() {
        return permisos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo permisos
     *
     * @param permisos
     */
    public void setPermisos(List<Permiso> permisos) {
        this.permisos = permisos;
    }
    /**
     * Getter.
     *
     * @return seguros: seguros asociados a la disposicion
     */
    @OneToMany(mappedBy = "disposicion")
    public List<Seguro> getSeguros() {
        return seguros;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo seguros
     *
     * @param seguros
     */
    public void setSeguros(List<Seguro> seguros) {
        this.seguros = seguros;
    }
    /**
     * Getter.
     *
     * @return eventosHabilitacion: Listado de eventos de habilitacion asociados a la disposicion
     */
    @OneToMany(mappedBy = "disposicion")
    public List<EventoHabilitacion> getEventosHabilitacion() {
        return eventosHabilitacion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo eventosHabilitacion
     *
     * @param eventosHabilitacion
     */
    public void setEventosHabilitacion(List<EventoHabilitacion> eventosHabilitacion) {
        this.eventosHabilitacion = eventosHabilitacion;
    }
    /**
     * Getter.
     *
     * @return funcionarioPlanillas: Listado de planillas a las cuales se ha asociado la Disposicion
     */
    @OneToMany(mappedBy = "disposicion")
    public List<FuncionarioPlanilla> getFuncionarioPlanillas() {
        return funcionarioPlanillas;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo funcionarioPlanillas
     *
     * @param funcionarioPlanillas
     */
    public void setFuncionarioPlanillas(List<FuncionarioPlanilla> funcionarioPlanillas) {
        this.funcionarioPlanillas = funcionarioPlanillas;
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