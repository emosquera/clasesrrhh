/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionRetributiva.FormulacionConceptos;

import GestionRetributiva.FormulaPlanillaPersonal.FormulaPlanillaPersonal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;


@Entity
@Table(name="CFO_MV_CONDICIONFOR")
public class CondicionFormulacion extends EntityBase<Long> {

    @OneToMany(mappedBy = "condicionFormulacion")
    private List<ReglaCondicionFormulacion> reglaCondicionesFormulacion;

    @OneToMany(mappedBy = "condicionFormula")
    private List<ValorComponenteFormula> valorerComponenteFormula;

    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="FORMULACON_ID")
    private FormulacionConceptoPlanillaPersonal formulacionConcepto;
    
    @ManyToOne
    @JoinColumn(name="FORMULAPLA_ID")
    private FormulaPlanillaPersonal formulaPlanilla;
    
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
        if (!(object instanceof CondicionFormulacion)) {
            return false;
        }
        CondicionFormulacion other = (CondicionFormulacion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "CondicionFormulacion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
