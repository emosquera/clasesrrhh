/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._5_GestiónRetributiva._1_ConfigurarPlanilla._3_GestionarFormulacióndeConceptos;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import y_entity.base.EntityBase;
import z_enums.catalogo.FuncionFormulacionEnum;
import z_enums.catalogo.ParametroFuncioneEnum;


@Entity
@Table(name="FUF_MV_FUNCIONFOR")
public class FuncionFormulacion extends EntityBase<Long> {

    @OneToMany(mappedBy = "funcionFormulacion")
    private List<CondicionFuncion> condicionesFuncion;

        
    @OneToOne
    @JoinColumn(name="VARIABLEFOR_ID")
    private VariableFormulacion variableFormulacion;
    
    @Enumerated(EnumType.STRING)
    private FuncionFormulacionEnum funcionFormulacion;
    
    @Enumerated(EnumType.STRING)
    private ParametroFuncioneEnum parametroFuncion;

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FuncionFormulacion)) {
            return false;
        }
        FuncionFormulacion other = (FuncionFormulacion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "FuncionFormulacion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
