//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import y_entity.base.EntityBase;
import g_gestion_tablas_catalogos.Barrio;
import g_gestion_tablas_catalogos.Ciudad;
import g_gestion_tablas_catalogos.DepartamentoTerritorial;
import z_enums.catalogo.EstadoCivil;
import z_enums.catalogo.EstatusPersona;
import z_enums.catalogo.GrupoSanguineo;
import z_enums.catalogo.MotivoFallecimiento;
import z_enums.catalogo.Sexo;
import z_enums.catalogo.TipoContribuyente;
import z_enums.catalogo.TipoRegistroConducir;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
/**
 * Clase Persona extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Persona
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="PERSONA")
public class Persona extends EntityBase<Long>{
    /**
     * cedula de identidad de la Persona
     *
     * @see #getCedula()
     */
    private String cedula; 
    /**
     * tipo de contribuyente que es la Persona
     *
     * @see #getTipoContribuyente()
     */
    private TipoContribuyente tipoContribuyente;
    /**
     * nombres de la Persona
     *
     * @see #getNombres()
     */
    private String nombres;
    /**
     * apellido paterno de la Persona
     *
     * @see #getApellidoPaterno()
     */
    private String apellidoPaterno;
    /**
     * apellido materno de la Persona
     *
     * @see #getApellidoMaterno()
     */
    private String apellidoMaterno;
    /**
     * RUC de la Persona
     *
     * @see #getRuc()
     */
    private String ruc;
    /**
     * tipo de genero de la Persona
     *
     * @see #getSexo()
     */
    private Sexo sexo;
    /**
     * estado civil de la Persona
     *
     * @see #getEstadoCivil()
     */
    private EstadoCivil estadoCivil;
    /**
     * fecha de nacimiento de la Persona
     *
     * @see #getFechaNacimiento()
     */
    private Date fechaNacimiento;
    /**
     * Nacionalidad de la Persona
     *
     * @see #getNacionalidad()
     */
    private String nacionalidad;
    /**
     * lugar de nacimiento de la Persona
     *
     * @see #getLugarNacimiento()
     */
    private String lugarNacimiento;
    /**
     * direccion de la Persona
     *
     * @see #getCalle()
     */
    private String calle;
    /**
     * numero exterior de la Persona
     *
     * @see #getNumeroExterior()
     */
    private String numeroExterior;
    /**
     * numero interior de la Persona
     *
     * @see #getNumeroInterior()
     */
    private String numeroInterior;
    /**
     * ciudad de residencia de la Persona
     *
     * @see #getCiudad()
     */
    private Ciudad ciudad;
    /**
     * Departamento Territorial donde reside la Persona
     *
     * @see #getDepartamentoTerritorial()
     */
    private DepartamentoTerritorial departamentoTerritorial;
    /**
     * Barrio donde reside la Persona
     *
     * @see #getBarrio()
     */
    private Barrio barrio;
    /**
     * telefono de la Persona
     *
     * @see #getTelefono()
     */
    private String telefono;
    /**
     * celular de la Persona
     *
     * @see #getCelular()
     */
    private String celular;
    /**
     * correo electronico institucional de la Persona
     *
     * @see #getCorreoElectronicoIntitucional()
     */
    private String correoElectronicoInstitucional;
    /**
     * registro de conducir de la Persona
     *
     * @see #getRegistroConducir()
     */
    private String registroConducir;
    /**
     * tipo de registro de conducir de la Persona
     *
     * @see #getTipoRegistroConducir()
     */
    private TipoRegistroConducir tipoRegistroConducir;
    /**
     * correo electronico personal de la Persona
     *
     * @see #getCorreoElectronicoPersonal()
     */
    private String correoElectronicoPersonal;
    /**
     * grupo sanguineo de la Persona
     *
     * @see #getGrupoSanguineo()
     */
    private GrupoSanguineo grupoSanguineo;
    /**
     *  fecha de fallecimiento de la Persona
     *
     * @see #getFechaFallecimiento()
     */
    private Date fechaFallecimiento;
    /**
     * motivo de fallecimiento de la Persona
     *
     * @see #getMotivoFallecimiento()
     */
    private MotivoFallecimiento motivoFallecimiento;
    /**
     * Listado de familiares de la Persona
     *
     * @see #getCapacitacionesPersona()
     */
    private List<FamiliarPersona> familiaresPersona;
    /**
     * Listado de las discapacidades de la Persona
     *
     * @see #getDiscapacidadesPersona()
     */
    private List<DiscapacidadPersona> discapacidadesPersona;
    /**
     * Listado de las formaciones de la Persona
     *
     * @see #getFormacionesPersona()
     */
    private List<FormacionPersona> formacionesPersona;
    /**
     * Listado de las capacitaciones de la Persona
     *
     * @see #getCapacitacionesPersona()
     */
    private List<CapacitacionPersona> capacitacionesPersona;
    /**
     * Listado de las inhabilitaciones de APN de la Persona
     *
     * @see #getInhabilitacionesPersona()
     */
    private List<InhabilitacionPersona> inhabilitacionesPersona;
    /**
     * Listado de las experiencias laborales de la Persona
     *
     * @see #getExperienciasLaboralesPersona()
     */
    private List<ExperienciaLaboralPersona> experienciasLaboralesPersona;
    /**
     * estatus de la Persona
     *
     * @see #getEstatusPersona()
     */
    private EstatusPersona estatusPersona;
    /**
     * Listado de Disposiciones ocupadas por la Persona
     *
     * @see #getDisposiciones()
     */
    private List<Disposicion> disposiciones;
    /**
     * Getter.
     *
     * @return cedula: cedula de identidad de la Persona.
     */
    @Column(name="CEDULA", nullable = true, length = 18)
    public String getCedula() {
        return cedula;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo cedula
     *
     * @param cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    /**
     * Getter.
     *
     * @return tipoContribuyente: tipo de contribuyente que es la Persona.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_CONTRIBUYENTE", nullable = true)
    public TipoContribuyente getTipoContribuyente() {
        return tipoContribuyente;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoContribuyente
     *
     * @param tipoContribuyente
     */
    public void setTipoContribuyente(TipoContribuyente tipoContribuyente) {
        this.tipoContribuyente = tipoContribuyente;
    }
    /**
     * Getter.
     *
     * @return nombres: nombres de la Persona.
     */
    @Column(name="NOMBRES", nullable = false, length = 100)
    public String getNombres() {
        return nombres;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo nombres
     *
     * @param nombres
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    /**
     * Getter.
     *
     * @return apellidoPaterno: apellido paterno de la Persona.
     */
    @Column(name="APELLIDO_PATERNO", nullable = false, length = 100)
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo apellidoPaterno
     *
     * @param apellidoPaterno
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    /**
     * Getter.
     *
     * @return apellidoMaterno: apellido materno de la Persona.
     */
    @Column(name="APELLIDO_MATERNO", nullable = false, length = 100)
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo apellidoMaterno
     *
     * @param apellidoMaterno
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    /**
     * Getter.
     *
     * @return ruc: RUC de la Persona.
     */
    @Column(name="RUC", nullable = true, length = 12)
    public String getRuc() {
        return ruc;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo ruc
     *
     * @param ruc
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    /**
     * Getter.
     *
     * @return sexo: Genero de la Persona.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="SEXO", nullable = false)
    public Sexo getSexo() {
        return sexo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo sexo
     *
     * @param sexo
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    /**
     * Getter.
     *
     * @return estadoCivil: estado civil  de la Persona.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="ESTADO_CIVIL", nullable = false)
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estadoCivil
     *
     * @param estadoCivil
     */
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    /**
     * Getter.
     *
     * @return fechaNacimiento: fecha de nacimiento de la Persona.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_NACIMIENTO", nullable = false)
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaNacimiento
     *
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Getter.
     *
     * @return nacionalidad: nacionalidad de la Persona.
     */
    @Column(name="NACIONALIDAD", nullable = false, length = 40)
    public String getNacionalidad() {
        return nacionalidad;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo nacionalidad
     *
     * @param nacionalidad
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    /**
     * Getter.
     *
     * @return lugarNacimiento: lugar de nacimiento de la Persona.
     */
    @Column(name="LUGAR_NACIMIENTO", nullable = false, length = 50)
    public String getLugarNacimiento() {
        return lugarNacimiento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo lugarNacimiento
     *
     * @param lugarNacimiento
     */
    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }
    /**
     * Getter.
     *
     * @return calle: direccion de residencia de la Persona.
     */
    @Column(name="CALLE", nullable = false, length = 50)
    public String getCalle() {
        return calle;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo calle
     *
     * @param calle
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }
    /**
     * Getter.
     *
     * @return numeroExterior: numero exterior de la Persona.
     */
    @Column(name="NUMERO_EXTERIOR", nullable = false, length = 16)
    public String getNumeroExterior() {
        return numeroExterior;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo numeroExterior
     *
     * @param numeroExterior
     */
    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }
    /**
     * Getter.
     *
     * @return numeroInterior: numero interior de la Persona.
     */
    @Column(name="NUMERO_INTERIOR", nullable = false, length = 16)
    public String getNumeroInterior() {
        return numeroInterior;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo numeroInterior
     *
     * @param numeroInterior
     */
    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }
    /**
     * Getter.
     *
     * @return ciudad: ciudad donde reside la Persona.
     */
    @ManyToOne
    @JoinColumn(name="CIUDAD_ID")
    public Ciudad getCiudad() {
        return ciudad;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo ciudad
     *
     * @param ciudad
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    /**
     * Getter.
     *
     * @return departamentoTerritorial: departamento territorial donde reside la Persona.
     */
    @ManyToOne
    @JoinColumn(name="DEPARTAMENTO_TERRITORIAL_ID")
    public DepartamentoTerritorial getDepartamentoTerritorial() {
        return departamentoTerritorial;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo departamentoTerritorial
     *
     * @param departamentoTerritorial
     */
    public void setDepartamentoTerritorial(DepartamentoTerritorial departamentoTerritorial) {
        this.departamentoTerritorial = departamentoTerritorial;
    }
    /**
     * Getter.
     *
     * @return barrio: barrio donde reside la Persona.
     */
    @ManyToOne
    @JoinColumn(name="BARRIO_ID")
    public Barrio getBarrio() {
        return barrio;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo barrio
     *
     * @param barrio
     */
    public void setBarrio(Barrio barrio) {
        this.barrio = barrio;
    }
    /**
     * Getter.
     *
     * @return telefono: telefono de la Persona.
     */
    @Column(name="TELEFONO", nullable = false, length = 16)
    public String getTelefono() {
        return telefono;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo telefono
     *
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * Getter.
     *
     * @return celular: celular de la Persona.
     */
    @Column(name="CELULAR", nullable = false, length = 16)
    public String getCelular() {
        return celular;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo celular
     *
     * @param celular
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }
    /**
     * Getter.
     *
     * @return correoElectronicoInstitucional: correo institucional de la Persona.
     */
    @Column(name="CORREO_INSTITUCIONAL", nullable = false, length = 100)
    public String getCorreoElectronicoInstitucional() {
        return correoElectronicoInstitucional;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo correoElectronicoInstitucional
     *
     * @param correoElectronicoInstitucional
     */
    public void setCorreoElectronicoInstitucional(String correoElectronicoInstitucional) {
        this.correoElectronicoInstitucional = correoElectronicoInstitucional;
    }
    /**
     * Getter.
     *
     * @return registroConducir: registro de conducir de la Persona.
     */
    @Column(name="REGISTRO_CONDUCIR", nullable = true, length = 20)
    public String getRegistroConducir() {
        return registroConducir;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo registroConducir
     *
     * @param registroConducir
     */
    public void setRegistroConducir(String registroConducir) {
        this.registroConducir = registroConducir;
    }
    /**
     * Getter.
     *
     * @return tipoRegistroConducir: tipo de registro de conducir de la Persona.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_REGISTRO_CONDUCIR", nullable = true)
    public TipoRegistroConducir getTipoRegistroConducir() {
        return tipoRegistroConducir;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoRegistroConducir
     *
     * @param tipoRegistroConducir
     */
    public void setTipoRegistroConducir(TipoRegistroConducir tipoRegistroConducir) {
        this.tipoRegistroConducir = tipoRegistroConducir;
    }
    /**
     * Getter.
     *
     * @return correoElectronicoPersonal: correo personal de la Persona.
     */
    @Column(name="CORREO_PERSONAL", nullable = false, length = 100)
    public String getCorreoElectronicoPersonal() {
        return correoElectronicoPersonal;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo correoElectronicoPersonal
     *
     * @param correoElectronicoPersonal
     */
    public void setCorreoElectronicoPersonal(String correoElectronicoPersonal) {
        this.correoElectronicoPersonal = correoElectronicoPersonal;
    }
    /**
     * Getter.
     *
     * @return grupoSanguineo: grupo sanguineo de la Persona.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="GRUPO_SANGUINEO", nullable = false)
    public GrupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo grupoSanguineo
     *
     * @param grupoSanguineo
     */
    public void setGrupoSanguineo(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
    /**
     * Getter.
     *
     * @return fechaFallecimiento: fecha de fallecimiento de la Persona.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_FALLECIMIENTO", nullable = true)
    public Date getFechaFallecimiento() {
        return fechaFallecimiento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaFallecimiento
     *
     * @param fechaFallecimiento
     */
    public void setFechaFallecimiento(Date fechaFallecimiento) {
        this.fechaFallecimiento = fechaFallecimiento;
    }
    /**
     * Getter.
     *
     * @return motivoFallecimiento: motivo de fallecimiento de la Persona.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="MOTIVO_FALLECIMIENTO", nullable = true)
    public MotivoFallecimiento getMotivoFallecimiento() {
        return motivoFallecimiento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo motivoFallecimiento
     *
     * @param motivoFallecimiento
     */
    public void setMotivoFallecimiento(MotivoFallecimiento motivoFallecimiento) {
        this.motivoFallecimiento = motivoFallecimiento;
    }
    /**
     * Getter.
     *
     * @return familiaresPersona: listado de familiares de la Persona.
     */
    @OneToMany(mappedBy = "persona")
    public List<FamiliarPersona> getFamiliaresPersona() {
        return familiaresPersona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo familiaresPersona
     *
     * @param familiaresPersona
     */
    public void setFamiliaresPersona(List<FamiliarPersona> familiaresPersona) {
        this.familiaresPersona = familiaresPersona;
    }
    /**
     * Getter.
     *
     * @return discapacidadesPersona: listado de discapacidades de la Persona.
     */
    @OneToMany(mappedBy = "persona")
    public List<DiscapacidadPersona> getDiscapacidadesPersona() {
        return discapacidadesPersona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo discapacidadesPersona
     *
     * @param discapacidadesPersona
     */
    public void setDiscapacidadESPersona(List<DiscapacidadPersona> discapacidadesPersona) {
        this.discapacidadesPersona = discapacidadesPersona;
    }
    /**
     * Getter.
     *
     * @return formacionesPersona: listado de cada formacion recibida por la Persona.
     */
    @OneToMany(mappedBy = "persona")
    public List<FormacionPersona> getFormacionesPersona() {
        return formacionesPersona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo formacionesPersona
     *
     * @param formacionesPersona
     */
    public void setFormacionesPersona(List<FormacionPersona> formacionesPersona) {
        this.formacionesPersona = formacionesPersona;
    }
    /**
     * Getter.
     *
     * @return capacitacionesPersona: Listado de cada capacitacion recibida por la Persona.
     */
    @OneToMany(mappedBy = "persona")
    public List<CapacitacionPersona> getCapacitacionesPersona() {
        return capacitacionesPersona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo capacitacionesPersona
     *
     * @param capacitacionesPersona
     */
    public void setCapacitacionesPersona(List<CapacitacionPersona> capacitacionesPersona) {
        this.capacitacionesPersona = capacitacionesPersona;
    }
    /**
     * Getter.
     *
     * @return inhabilitacionesPersona: Listado de cada inhabilitacion de APN que ha recibido la Persona.
     */
    @OneToMany(mappedBy = "persona")
    public List<InhabilitacionPersona> getInhabilitacionesPersona() {
        return inhabilitacionesPersona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo inhabilitacionesPersona
     *
     * @param inhabilitacionesPersona
     */
    public void setInhabilitacionesPersona(List<InhabilitacionPersona> inhabilitacionesPersona) {
        this.inhabilitacionesPersona = inhabilitacionesPersona;
    }
    /**
     * Getter.
     *
     * @return experienciasLaboralesPersona: Listado de experiencias laborales de la Persona.
     */
    @OneToMany(mappedBy = "persona")
    public List<ExperienciaLaboralPersona> getExperienciasLaboralesPersona() {
        return experienciasLaboralesPersona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo experienciasLaboralesPersona
     *
     * @param experienciasLaboralesPersona
     */
    public void setExperienciasLaboralesPersona(List<ExperienciaLaboralPersona> experienciasLaboralesPersona) {
        this.experienciasLaboralesPersona = experienciasLaboralesPersona;
    }
    /**
     * Getter.
     *
     * @return estatusPersona: estatus de la Persona.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="ESTATUS", nullable = false)
    public EstatusPersona getEstatusPersona() {
        return estatusPersona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estatusPersona
     *
     * @param estatusPersona
     */
    public void setEstatusPersona(EstatusPersona estatusPersona) {
        this.estatusPersona = estatusPersona;
    }
    /**
     * Getter.
     *
     * @return disposiciones: Listado de Disposiciones ocupada por la Persona.
     */
    @OneToMany(mappedBy = "persona")
    public List<Disposicion> getDisposiciones() {
        return disposiciones;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo disposiciones
     *
     * @param disposiciones
     */
    public void setDisposiciones(List<Disposicion> disposiciones) {
        this.disposiciones = disposiciones;
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
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.Persona[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Persona
     */
    public Persona() {
    }
    
}
