/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.externos;

import a_programacion_presupuestaria.ElementoEstructuraOrganizacional;
import d_preparacion_planilla_personal.EntidadPlanillaPersonal;
import a_programacion_presupuestaria.EstructuraOrganizacional;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author syslife01
 */
@Entity
public class Nivel implements Serializable {

    @OneToMany(mappedBy = "nivel")
    private List<EstructuraOrganizacional> estructuraOrganizacionals;

    @OneToMany(mappedBy = "nivel")
    private List<ElementoEstructuraOrganizacional> elementoEstructuraOrganizacionals;

    @OneToMany(mappedBy = "nivel")
    private List<EntidadPlanillaPersonal> entidadPlanillaPersonals;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nivel)) {
            return false;
        }
        Nivel other = (Nivel) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.externos.Nivel[ id=" + id + " ]";
    }
    
}
