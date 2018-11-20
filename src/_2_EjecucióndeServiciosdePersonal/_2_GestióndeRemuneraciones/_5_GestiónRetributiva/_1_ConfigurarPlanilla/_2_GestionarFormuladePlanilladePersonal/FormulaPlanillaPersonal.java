/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._5_GestiónRetributiva._1_ConfigurarPlanilla._2_GestionarFormuladePlanilladePersonal;

import _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._5_GestiónRetributiva._1_ConfigurarPlanilla._3_GestionarFormulacióndeConceptos.CondicionFormulacion;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;

@Entity
@Table(name="FPP_MA_FORMULAPLA")
public class FormulaPlanillaPersonal extends EntityBase<Long> {

    @OneToMany(mappedBy = "formulaPlanilla")
    private List<CondicionFormulacion> condicionesFormulacion;

    @OneToMany(mappedBy = "formulaPlanilla")
    private List<ComponenteFormulaPlanilla> componentesFormulaPlanilla;

    private String descripcion;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormulaPlanillaPersonal)) {
            return false;
        }
        FormulaPlanillaPersonal other = (FormulaPlanillaPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "FormulaPlanillaPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
