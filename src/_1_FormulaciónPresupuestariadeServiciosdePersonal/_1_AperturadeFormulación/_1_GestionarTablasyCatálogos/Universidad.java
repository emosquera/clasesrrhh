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
 * Clase Universidad extiende de {@link EntityBase}
 *
 * Contiene la definición de las Universidades
 * 
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name = "UNI_CL_UNIVERSIDAD")
public class Universidad extends EntityBase<Long> {
    
    /**
     * Personas que se han formado en la Universidad 
     */
    @OneToMany(mappedBy = "institucion")
    private List<FormacionPersona> formacionPersonas;
        
    /**
     * Descripcion de la Universidad
     */
    private String nombre;
    
    
    /**
     * Siglas que identifican la Universidad
     */
    private String siglas;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Universidad)) {
            return false;
        }
        Universidad other = (Universidad) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Universidad[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
