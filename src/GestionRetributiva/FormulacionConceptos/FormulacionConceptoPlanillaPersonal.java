/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionRetributiva.FormulacionConceptos;

import Clasificadores.ConceptoPlanillaPersonal.ConceptoPlanillaPersonal;
import Clasificadores.PlanillaPersonal.PlanillaPersonal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;


@Entity
@Table(name="FOC_MA_FORMULACON")
public class FormulacionConceptoPlanillaPersonal extends EntityBase<Long> {

    @OneToMany(mappedBy = "formulacionConcepto")
    private List<CondicionFormulacion> condicionesFormulacion;

    @ManyToOne
    @JoinColumn(name="PLANILLA_ID")
    private PlanillaPersonal planilla;
    
    
    @ManyToOne
    @JoinColumn(name="CONCEPTO_ID")
    private ConceptoPlanillaPersonal concepto;
    
    private Integer orden;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormulacionConceptoPlanillaPersonal)) {
            return false;
        }
        FormulacionConceptoPlanillaPersonal other = (FormulacionConceptoPlanillaPersonal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FormulacionConceptoPlanillaPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
