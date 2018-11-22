/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos;

import _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._4_MovilidaddeFuncionarios._1_GestionarBajadePersona._1_GestionarSolicituddeBajadePersona.BajaFuncionario;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;

/**
 * Clase TipoBajaFuncionario extiende de {@link EntityBase}
 *
 * Contiene la definición de los Tipos de Bajas de Funcionarios
 * 
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TAS_CL_TIPOASUET")
public class TipoBajaFuncionario extends EntityBase<Long> {

    @OneToMany(mappedBy = "tipoBaja")
    private List<BajaFuncionario> bajasFuncionario;
    
    /**
     * Breve descripción del Tipo de Baja.
     */
    private String descripcion;        


    /**
     * Indica si se deben inactivar todas las disposiciones asociadas a la persona que se le da la baja.
     * 
     */
    private Boolean isAbsoluta;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoBajaFuncionario)) {
            return false;
        }
        TipoBajaFuncionario other = (TipoBajaFuncionario) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "TipoEmbargo[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
