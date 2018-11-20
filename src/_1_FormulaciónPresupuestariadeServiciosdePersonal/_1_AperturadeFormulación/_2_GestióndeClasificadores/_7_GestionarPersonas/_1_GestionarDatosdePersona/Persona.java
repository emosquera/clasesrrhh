//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._1_GestionarDatosdePersona;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos.Barrio;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos.Pais;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos.TipoDocumentoIdentificacion;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._2_GestionarDiscapacidaddePersona.DiscapacidadPersona;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._3_GestionarExperienciaLaboraldePersona.ExperienciaLaboralPersona;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._4_GestionarFormacióndePersona.FormacionPersona;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._5_GestionarCapacitacióndePersona.CapacitacionPersona;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._6_GestionarFamiliaresdePersona.FamiliarPersona;
import _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._3_IncorporacióndeRecursosHumanos._2_HabilitarFuncionario._2_RegistrarDisposición.Disposicion;
import y_entity.base.EntityBase;
import z_enums.catalogo.EstadoCivilEnum;
import z_enums.catalogo.EstadoDatosPersonaEnum;
import z_enums.catalogo.GrupoSanguineoEnum;
import z_enums.catalogo.MotivoFallecimientoEnum;
import z_enums.catalogo.SexoEnum;
import z_enums.catalogo.TipoContribuyenteEnum;
import z_enums.catalogo.TipoRegistroConducirEnum;
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
@Table(name="PRS_CL_PERSONA")
public class Persona extends EntityBase<Long>{
    
    /**
     * Tipo de Documento de Identificacion con que se registra la Persona
     */
    @ManyToOne
    @JoinColumn(name="TIPDOCIDEN_ID")
    private TipoDocumentoIdentificacion tipoDocumentoIdentificacion;
    
    /**
     * Documento de Identidad de la Persona
     *
     */
    private String documentoIdentificacion; 
    
    /**
     * tipo de contribuyente que es la Persona
     *
     */
    @Enumerated(EnumType.STRING)
    private TipoContribuyenteEnum tipoContribuyente;
    
    /**
     * Primer y Segundo nombre de la Persona
     *
     */
    private String nombres;
    
    /**
     * apellido paterno de la Persona
     *
     */
    private String apellidoPaterno;
    
    /**
     * apellido materno de la Persona
     *
     */
    private String apellidoMaterno;
    
    /**
     * RUC de la Persona
     *
     */
    private String ruc;
    
    /**
     * Nombre asociado al RUC de la persona.
     */
    private String razonSocial;
    
    /**
     * tipo de genero de la Persona
     *
     */
    @Enumerated(EnumType.STRING)
    private SexoEnum sexo;
    
    /**
     * estado civil de la Persona
     */
    @Enumerated(EnumType.STRING)
    private EstadoCivilEnum estadoCivil;
    
    /**
     * fecha de nacimiento de la Persona
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;
    
    /**
     * Pais de nacimiento
     *
     */
    @ManyToOne
    @JoinColumn(name="PAIS_ID")
    private Pais nacionalidad;
    
    /**
     * Lugar de nacimiento de la Persona
     *
     */
    private String lugarNacimiento;
    
    /**
     * direccion de la Persona
     *
     */
    private String direccion;
    
    /**
     * numero exterior de la Persona
     *     
     */
    private Integer numeroExterior;
    
    /**
     * numero interior de la Persona
     *
     */
    private Integer numeroInterior;
    
    /**
     * Barrio donde reside la Persona
     *
     */
    @ManyToOne
    @JoinColumn(name="BARRIO_ID")
    private Barrio barrio;
    
    /**
     * telefono de la Persona
     *
     */
    private String telefono;
    
    /**
     * celular de la Persona
     *
     */
    private String celular;
    
    
    /**
     * registro de conducir de la Persona
     *
     */
    private String registroConducir;
    
    /**
     * tipo de registro de conducir de la Persona
     *
     */
    @Enumerated(EnumType.STRING)
    private TipoRegistroConducirEnum tipoRegistroConducir;
    
    /**
     * correo electronico personal de la Persona
     *
     */
    private String correoElectronicoPersonal;
    
    /**
     * grupo sanguineo de la Persona
     *
     */
    @Enumerated(EnumType.STRING)
    private GrupoSanguineoEnum grupoSanguineo;
    
    /**
     *  fecha de fallecimiento de la Persona
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFallecimiento;
    
    /**
     * motivo de fallecimiento de la Persona
     *
     */
    @Enumerated(EnumType.STRING)
    private MotivoFallecimientoEnum motivoFallecimiento;
    
    
    /**
     * estado de los datos de la Persona
     *
     */
    private EstadoDatosPersonaEnum estadoDatosPersona;
    
    /**
     * Estado de la persona
     *
     */
    private boolean activo;
    
    /**
     * Numero de Acta de Defuncion
     * @return 
     */
    private String actaDefuncion;
    
    /**
     * Listado de Discapacidades de la Persona a traves de {@link DiscapacidadPersona}
     */
    @OneToMany(mappedBy = "persona")
    private List<DiscapacidadPersona> discapacidadPersonas;
    
    /**
     *Listado de Experiancia Laboral de la Persona a traves de {@link ExperienciaLaboralPersona}
     */
    @OneToMany(mappedBy = "persona")
    private List<ExperienciaLaboralPersona> experienciaLaboralPersonas;
    
    /**
     * Listado de Formacion de la Persona
     */
    @OneToMany(mappedBy = "persona")
    private List<FormacionPersona> formacionPersonas;
    
    /**
     *  Listado de Capacitaciones de la Personas
     * 
     */
    @OneToMany(mappedBy = "persona")
    private List<CapacitacionPersona> capacitacionPersonas;
    
    /**
     * Listado de Familiares de la Persona
     * 
     */
    @OneToMany(mappedBy = "familiar")
    private List<FamiliarPersona> familiarPersonas;
    
    
    @OneToMany(mappedBy = "persona")
    private List<Disposicion> disposiciones;
    
    
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
        return "b_legajo_personal.Persona[ id=" + id + " ]";
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
