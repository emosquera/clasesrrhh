//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos;

import _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._3_IncorporacióndeRecursosHumanos._2_HabilitarFuncionario._2_RegistrarDisposición.Disposicion;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase TipoDisposicion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al tipo de Disposicion
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TDI_CL_TIPODISPO")
public class TipoDisposicion extends EntityBase<Long> {
    /**
     * codigo de registro del Tipo de Disposicion
     *
     * @see #getCodigo()
     */
    private String codigo;
    
    /**
     * descripcion del Tipo de Disposicion
     *
     * @see #getDescripcion()
     */
    private String descripcion;        
    
    
    /**
     * Requisitos del Tipo de Disposicion
     */
    @ManyToMany
    @JoinTable(name = "RTD_MA_REQTIPDIS",
        joinColumns = @JoinColumn(name = "TIPO_DISPO_ID"),
        inverseJoinColumns = @JoinColumn(name = "REQUISITO_ID")
    )
    private List<RequisitoDisposicion> requisitos;
    
    @OneToMany(mappedBy = "tipoDisposicion")
    private List<Disposicion> disposiciones;
    
    
        
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDisposicion)) {
            return false;
        }
        TipoDisposicion other = (TipoDisposicion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.TipoDisposicion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad TipoDisposicion
     */
    public TipoDisposicion() {
    }

}
