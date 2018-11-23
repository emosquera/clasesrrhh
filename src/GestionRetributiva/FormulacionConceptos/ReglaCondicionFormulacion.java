/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionRetributiva.FormulacionConceptos;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import y_entity.base.EntityBase;
import z_enums.catalogo.TipoConectorLogicoEnum;
import z_enums.catalogo.TipoOperadorLogicoEnum;

@Entity
@Table(name="RCF_MV_REGCONDFOR")
public class ReglaCondicionFormulacion extends EntityBase<Long> {

    @ManyToOne
    @JoinColumn(name="CONDICIONFOR_ID")
    private CondicionFormulacion condicionFormulacion;
    
    private int orden;
    
    @Enumerated(EnumType.STRING)
    private TipoOperadorLogicoEnum tipoOperadorLogico;
    
    @Enumerated(EnumType.STRING)
    private TipoConectorLogicoEnum tipoConectorLogico;
    
    @OneToOne
    @JoinColumn(name="VARFORMUVI_ID")
    private VariableFormulacion valorInicial;
    
    @OneToOne
    @JoinColumn(name="VARFORMUVF_ID")
    private VariableFormulacion valorFinal;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglaCondicionFormulacion)) {
            return false;
        }
        ReglaCondicionFormulacion other = (ReglaCondicionFormulacion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ReglaCondicionFormulacion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
