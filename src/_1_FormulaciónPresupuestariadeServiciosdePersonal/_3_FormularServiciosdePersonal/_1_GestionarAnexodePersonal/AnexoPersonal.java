//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._3_FormularServiciosdePersonal._1_GestionarAnexodePersonal;

import java.util.Date;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase AnexoPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Anexo de Personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="ANX_MA_ANXOPER")
public class AnexoPersonal extends EntityBase<Long> {
    
    
    /**
     * Identifica el código de modificación del Anexo de Personal.
     *
     */
    private String escenario;
    
    /**
     * descripcion del Anexo de Personal
     *
     */
    private String descripcion;
    
    /**
     * Indica la fecha de creación del Escenario del Anexo de Personal.
     *
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha;
    
    /**
     * Listado de Detalle del Anexo de Personal
     */
    @OneToMany(mappedBy = "anexoPersonal")
    private List<DetalleAnexoPersonal> detalleAnexoPersonals;
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnexoPersonal)) {
            return false;
        }
        AnexoPersonal other = (AnexoPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.AnexoPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad AnexoPersonal
     */
    public AnexoPersonal() {
    }
    
}
