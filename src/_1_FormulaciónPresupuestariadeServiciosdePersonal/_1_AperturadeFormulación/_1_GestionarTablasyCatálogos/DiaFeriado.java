/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import y_entity.base.EntityBase;
import z_enums.catalogo.MesEnum;

/**
 * Clase DiaFeriado extiende de {@link EntityBase}
 *
 * Contiene la información de los Dias Feriados por Instituccion
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="DFE_CL_DIAFERIADO")
public class DiaFeriado extends EntityBase<Long> {

    /**
     * Dia del Mes
     */
    private Integer dia;          
    
    /**
     * Mes del Dia Feriado
     */
    @Enumerated(EnumType.ORDINAL)
    private MesEnum mes;
    

    /**
     * 
     * Indica si el dia feriado aplica para todas las instituciones
     */
    private Boolean isGeneral;
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiaFeriado)) {
            return false;
        }
        DiaFeriado other = (DiaFeriado) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "DiaFeriado[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
