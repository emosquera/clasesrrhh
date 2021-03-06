/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasificadores.PlanillaPersonal;

import TablasYCatalogos.TipoPlanillaPersonal;
import IncorporacionRecursosHumanos.Disposicion.Disposicion;
import GestionRetributiva.GrupoConceptosPlanillaPersonal.GrupoConceptoPlanillaPersonal;
import GestionRetributiva.FormulacionConceptos.FormulacionConceptoPlanillaPersonal;
import GestionRetributiva.AutorizarHorasTope.HoraTope;
import GestionRetributiva.ProcesarPlanillaPeriodo.CalculoPlanilla;
import GestionRetributiva.CerrarPlanillaPeriodo.CierrePlanilla;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import y_entity.base.EntityBase;
import z_enums.catalogo.PeriodicidadPlanillaPersonalEnum;


@Entity
@Table(name="PLP_CL_PLANILLA")
public class PlanillaPersonal extends EntityBase<Long> {

    @OneToMany(mappedBy = "planillaPersonal")
    private List<CierrePlanilla> cierresPlanilla;

    @OneToMany(mappedBy = "planilla")
    private List<CalculoPlanilla> calculosPlanilla;

    @OneToMany(mappedBy = "planillaPersonal")
    private List<HoraTope> horasTope;

    @OneToMany(mappedBy = "planilla")
    private List<FormulacionConceptoPlanillaPersonal> formulacionesConceptoPlanillaPersonal;

    @OneToMany(mappedBy = "planilla")
    private List<GrupoConceptoPlanillaPersonal> grupoConceptosPlanillaPersonal;

    @OneToMany(mappedBy = "planillaPersonal")
    private List<Disposicion> disposiciones;
    
    /**
     * Codigo de la Nomina
     * @return 
     */
    private String codigo;
    
    /**
     * Descripcion de la Nomina
     * @return 
     */
    private String nombre;
    
    /**
     * Fecha de Inicio del Periodo actual de Calculo de Nomina
     * @return 
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date desde;
    
    /**
     * Fecha Final del Periodo actual de Calculo de Nomina
     * @return 
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date hasta;
    
    /**
     * 
     * @return 
     */
    @Enumerated(EnumType.STRING)
    private PeriodicidadPlanillaPersonalEnum periodicidad;
    
    /**
     * Tipo de Planilla
     * @return 
     */
    @ManyToOne
    @JoinColumn(name="TIPPLAPER_ID")
    private TipoPlanillaPersonal tipoPlanillaPersonal;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanillaPersonal)) {
            return false;
        }
        PlanillaPersonal other = (PlanillaPersonal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlanillaPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
