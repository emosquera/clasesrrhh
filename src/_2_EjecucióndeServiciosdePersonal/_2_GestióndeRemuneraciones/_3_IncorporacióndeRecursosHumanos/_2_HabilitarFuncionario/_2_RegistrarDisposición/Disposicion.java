//QSGEN This file will be ignored in future code generations if it's changed
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._3_IncorporacióndeRecursosHumanos._2_HabilitarFuncionario._2_RegistrarDisposición;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos.TipoDisposicion;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._1_GestionarDatosdePersona.Persona;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._6_GestionarPuestos._1_GestionarPuesto.Puesto;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._8_GestionarPlanilladePersonal.PlanillaPersonal;
import java.util.Date;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase Disposicion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Disposicion
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="DPO_MA_DISPOSICION")
public class Disposicion extends EntityBase<Long> {

    @ManyToOne
    @JoinColumn(name="PERSONA_ID")
    private Persona persona;
   
    @ManyToOne
    @JoinColumn(name="TIPDISPO_ID")
    private TipoDisposicion tipoDisposicion;
   
    @ManyToOne
    @JoinColumn(name="PUESTO_ID")
    private Puesto puesto;
 
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaDisposicion;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
  
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    
    @ManyToOne
    @JoinColumn(name="PLANILLA_ID")
    private PlanillaPersonal planillaPersonal;
    
    private String correoInstitucional;
    
    private Boolean activa;
    
    private String observacion;
    
    @OneToMany(mappedBy = "disposicion")
    private List<ConceptoDisposicion> conceptosDisposicion;
    
    @OneToMany(mappedBy = "disposicion")
    private List<SoporteRequisitoDisposicion> soporteRequisitosDisposicion;
    
    @OneToMany(mappedBy = "disposicion")
    private List<Horario> horarios;
    
    
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