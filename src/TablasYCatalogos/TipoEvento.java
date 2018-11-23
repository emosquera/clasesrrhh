/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasYCatalogos;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import y_entity.base.EntityBase;
import z_enums.catalogo.NaturalezaEventoEnum;

/**
 * Clase TipoEvento extiende de {@link EntityBase}
 *
 * Contiene la definición de los Tipos de Eventos que pueden ser asociados a una {@link Disposicion}
 * 
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="TET_CL_TIPEVENTO")
public class TipoEvento extends EntityBase<Long> {

    /**
     * Nombre identificador.
     */
    private String evento;       
    
    /**
     * Significado del Evento
     *
     */
    private String descripcion;
    
    /**
     * Se especifica si el Evento es de Naturaleza Positiva, por ejemplo un Reconocimiento o Naturaleza Negativa, por ejemplo una Acta Administrativa.
     *
     */
    @Enumerated(EnumType.STRING)
    private NaturalezaEventoEnum naturaleza;
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEvento)) {
            return false;
        }
        TipoEvento other = (TipoEvento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "TipoEvento[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
