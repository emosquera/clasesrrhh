/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._4_GestionarFormacióndePersona.FormacionPersona;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;

/**
 * Clase OficioProfesion extiende de {@link EntityBase}
 *
 * Contiene la definición de los Oficios y Profesiones
 * 
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="OFP_CL_OFPROFE")
public class OficioProfesion extends EntityBase<Long> {

    /**
     * Personas que tienen en su Formacion la Profesion
     */
    @OneToMany(mappedBy = "oficioProfesion")
    private List<FormacionPersona> formacionPersonas;
    
    /**
     * Nombre identificador del Oficio o Profesion.
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
        if (!(object instanceof OficioProfesion)) {
            return false;
        }
        OficioProfesion other = (OficioProfesion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "OficioProfesion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
