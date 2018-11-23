//QSGEN This file will be ignored in future code generations if it's changed
package IncorporacionRecursosHumanos.Disposicion;

import TablasYCatalogos.TipoDisposicion;
import Clasificadores.DatosPersona.Persona;
import Clasificadores.Puesto.Puesto;
import Clasificadores.PlanillaPersonal.PlanillaPersonal;
import MovilidaddeFuncionarios.SolicitudBajaPersona.BajaFuncionario;
import GestionRetributiva.AutorizarHorasTope.DetalleHoraTope;
import GestionRetributiva.Permisos.Permiso;
import GestionRetributiva.HorarioEspecial.HorarioEspecial;
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
    
    @OneToMany(mappedBy = "disposicion")
    private List<DetalleHoraTope> montosHoraTope;
    
    @OneToMany(mappedBy = "disposicion")
    private List<Permiso> permisos;
    
    @OneToMany(mappedBy = "disposicion")
    private List<HorarioEspecial> horariosEspeciales;
    
    @ManyToMany(mappedBy = "disposiciones")
    private List<BajaFuncionario> bajasFuncionario;
    
    
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