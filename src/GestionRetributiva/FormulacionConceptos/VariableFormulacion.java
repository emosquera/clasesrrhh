/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionRetributiva.FormulacionConceptos;

import Clasificadores.ConceptoPlanillaPersonal.ConceptoPlanillaPersonal;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import y_entity.base.EntityBase;
import z_enums.catalogo.TipoVariableFormulacionEnum;


@Entity
@Table(name="VFO_MV_VARIABLEFOR")
public class VariableFormulacion extends EntityBase<Long> {

    @OneToOne(mappedBy = "variableFormulacion")
    private FuncionFormulacion funcionFormulacion;

    @Enumerated(EnumType.STRING)
    private TipoVariableFormulacionEnum tipoVariable;
    
    private Double valorFijo;
    
    @ManyToOne
    @JoinColumn(name="CONCEPTO_ID")
    private ConceptoPlanillaPersonal conceptoReferenciado;
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VariableFormulacion)) {
            return false;
        }
        VariableFormulacion other = (VariableFormulacion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "VariableFormulacion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
