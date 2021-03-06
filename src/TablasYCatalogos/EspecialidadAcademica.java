/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasYCatalogos;

import Clasificadores.FormacionPersona.FormacionPersona;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;

/**
 * Clase EspecialidadAcademica extiende de {@link EntityBase}
 *
 * Contiene la definición de las Especialidades Academicas
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="EAC_CL_ESPACADEM")
public class EspecialidadAcademica extends EntityBase<Long> {

    /**
     * Personas que tienen en su Formacion la Especialidad Academica
     */
    @OneToMany(mappedBy = "especialidadAcademica")
    private List<FormacionPersona> formacionPersonas;
    
    /**
     * Nombre identificador de la Especialidad Academica.
     */
    private String nombre;            
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EspecialidadAcademica)) {
            return false;
        }
        EspecialidadAcademica other = (EspecialidadAcademica) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "EspecialidadAcademica[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
