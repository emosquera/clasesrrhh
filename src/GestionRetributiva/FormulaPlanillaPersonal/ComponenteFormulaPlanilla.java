/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionRetributiva.FormulaPlanillaPersonal;

import GestionRetributiva.FormulacionConceptos.ValorComponenteFormula;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;
import z_enums.catalogo.TipoComponenteEnum;


@Entity
@Table(name="CFP_AP_COMPOFORMU")
public class ComponenteFormulaPlanilla extends EntityBase<Long> {

    @OneToMany(mappedBy = "componenteFormula")
    private List<ValorComponenteFormula> valoresComponenteFormula;

    @ManyToOne
    @JoinColumn(name="FORMULAPLA_ID")
    private FormulaPlanillaPersonal formulaPlanilla;
    
    private Integer orden;
    
    @Enumerated(EnumType.STRING)
    private TipoComponenteEnum tipoComponente;
    
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
        if (!(object instanceof ComponenteFormulaPlanilla)) {
            return false;
        }
        ComponenteFormulaPlanilla other = (ComponenteFormulaPlanilla) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ComponenteFormulaPlanilla[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
