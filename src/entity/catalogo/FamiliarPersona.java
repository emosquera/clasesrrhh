//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
import enums.catalogo.Parentesco;
import enums.catalogo.TipoDocumentoIdentificacion;
import javax.persistence.*;
/**
 * Clase FamiliarPersona extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a los Familiares de una Persona
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="FAMILIAR_PERSONA")
public class FamiliarPersona extends EntityBase<Long>  {
    /**
     * parentesco del familiar con la Persona
     *
     * @see #getParentesco()
     */
    private Parentesco parentesco;
    /**
     * tipo de documento de identificacion del familiar de la Persona
     *
     * @see #getTipoDocumentoIdentificacion()
     */
    private TipoDocumentoIdentificacion tipoDocumentoIdentificacion;
    /**
     * numero de documento de identificacion del familiar con la Persona
     *
     * @see #getNumeroDocumento()
     */
    private String numeroDocumento;
    /**
     * Persona a la cual se le asocia el familiar
     *
     * @see #getPersona()
     */
    private Persona persona;
    /**
     * Getter.
     *
     * @return parentesco: parentesco del familiar con la persona.
     */
    @Column(name="PARENTESCO", nullable = false)
    public Parentesco getParentesco() {
        return parentesco;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo parentesco
     *
     * @param parentesco
     */
    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }
    /**
     * Getter.
     *
     * @return tipoDocumentoIdentificacion: tipo de documento de identificacion del familiar con la persona.
     */
    @Column(name="TIPO_DOCUMENTO_IDENTIFICACION", nullable = false)
    public TipoDocumentoIdentificacion getTipoDocumentoIdentificacion() {
        return tipoDocumentoIdentificacion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoDocumentoIdentificacion
     *
     * @param tipoDocumentoIdentificacion
     */
    public void setTipoDocumentoIdentificacion(TipoDocumentoIdentificacion tipoDocumentoIdentificacion) {
        this.tipoDocumentoIdentificacion = tipoDocumentoIdentificacion;
    }
    /**
     * Getter.
     *
     * @return numeroDocumento: numeero de documento de identificacion del familiar con la persona.
     */
    @Column(name="NUMERO_DOCUMENTO_IDENTIFICACION", nullable = false)
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo numeroDocumento
     *
     * @param numeroDocumento
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    /**
     * Getter.
     *
     * @return persona: persona a la cual se le asocia el familiar.
     */
    @ManyToOne
    public Persona getPersona() {
        return persona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo persona
     *
     * @param persona
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FamiliarPersona)) {
            return false;
        }
        FamiliarPersona other = (FamiliarPersona) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.FamiliarPersona[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad FamiliarPersona
     */
    public FamiliarPersona() {
    }
    
    
    
}
