/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TablasYCatalogos;

import Clasificadores.DatosPersona.Persona;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import y_entity.base.EntityBase;
import z_enums.catalogo.SistemaVerificacionEnum;

/**
 * Clase TipoDocumentoIdentificacion extiende de {@link EntityBase}
 *
 * Contiene la definición de los Tipos de Documentos de Identificacion
 * 
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="IDN_CL_TIPODOCIDENT")
public class TipoDocumentoIdentificacion extends EntityBase<Long> {
    
    /**
     * Descripcion del Servicio WEB que permite identificar una Cedula, RUC o Pasaporte
     */
    private String descripcion;
    
    /**
     * Tipo de Servicio WEB, para identificar internamente el Servicio WEB que se debe usar
     */
    @Enumerated(EnumType.STRING)
    private SistemaVerificacionEnum sistemaVerificacion;
    @OneToMany(mappedBy = "tipoDocumentoIdentificacion")
    private List<Persona> personas;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocumentoIdentificacion)) {
            return false;
        }
        TipoDocumentoIdentificacion other = (TipoDocumentoIdentificacion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "TipoDocumentoIdentificacion[ id=" + id + " ]";
    }

    /**
     *
     * @return
     */
    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TipoDocumentoIdentificacion() {
    }
    
    
}
