//QSGEN This file will be ignored in future code generations if it's changed
package MovilidaddeFuncionarios.SolicitudBajaPersona;

import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase BajaFuncionario extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Baja de Funcionario
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="RFU_MV_RESPFUNC")
public class ResponsabilidadFuncionario extends EntityBase<Long> {
    
    @ManyToOne
    @JoinColumn(name="BAJAFUNC_ID")
    private BajaFuncionario bajaFuncionario;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCierre;
    
    private String nombreNotificador;
    
    private String subSistema;
    
    private Boolean cerrado;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResponsabilidadFuncionario)) {
            return false;
        }
        ResponsabilidadFuncionario other = (ResponsabilidadFuncionario) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "ResponsabilidadFuncionario[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad BajaFuncionario
     */
    public ResponsabilidadFuncionario() {
    }
    
}
