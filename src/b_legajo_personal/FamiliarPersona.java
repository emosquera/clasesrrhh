//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import y_entity.base.EntityBase;
import z_enums.catalogo.ParentescoEnum;
import z_enums.catalogo.TipoDocumentoIdentificacionEnum;
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
    private ParentescoEnum parentesco;
    /**
     * tipo de documento de identificacion del familiar de la Persona
     *
     * @see #getTipoDocumentoIdentificacion()
     */
    private TipoDocumentoIdentificacionEnum tipoDocumentoIdentificacion;
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
     * Datos del Familiar
     *
     * @see #getPersona()
     */
    private Persona familiar;
    /**
     * Getter.
     *
     * @return parentesco: parentesco del familiar con la persona.
     */
    @Column(name="PARENTESCO", nullable = false)
    public ParentescoEnum getParentesco() {
        return parentesco;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo parentesco
     *
     * @param parentesco
     */
    public void setParentesco(ParentescoEnum parentesco) {
        this.parentesco = parentesco;
    }
    /**
     * Getter.
     *
     * @return tipoDocumentoIdentificacion: tipo de documento de identificacion del familiar con la persona.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_DOCUMENTO_IDENTIFICACION", nullable = false)
    public TipoDocumentoIdentificacionEnum getTipoDocumentoIdentificacion() {
        return tipoDocumentoIdentificacion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoDocumentoIdentificacion
     *
     * @param tipoDocumentoIdentificacion
     */
    public void setTipoDocumentoIdentificacion(TipoDocumentoIdentificacionEnum tipoDocumentoIdentificacion) {
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
    @JoinColumn(name="PERSONA_ID")
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
    /**
     * Getter.
     *
     * @return familiar: datos de la persona familiar.
     */
    @OneToOne
    @JoinColumn(name="FAMILIAR_ID")
    public Persona getFamiliar() {
        return familiar;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo familiar
     *
     * @param familiar
     */
    public void setFamiliar(Persona familiar) {
        this.familiar = familiar;
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
        return "b_legajo_personal.FamiliarPersona[ id=" + id + " ]";
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
