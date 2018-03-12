//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.TipoSeguroEnum;
/**
 * Clase Seguro extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Seguro
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="SEGURO")
public class Seguro extends EntityBase<Long> {
    /**
     * Disposicion a la cual se le asocia el Seguro
     *
     * @see #getDisposicion()
     */
    private Disposicion disposicion;
    /**
     * Tipo de Seguro
     *
     * @see #getTipoSeguro()
     */
    private TipoSeguroEnum tipoSeguro;
    /**
     * fecha de registro del Seguro
     *
     * @see #getFechaRegistro()
     */
    private Date fechaRegistro;
    /**
     * fecha hasta la cual esta vigente el seguro
     *
     * @see #getFechaValidez()
     */
    private Date fechaValidez;
    /**
     * numero de referencia del seguro
     *
     * @see #getNumeroReferencia()
     */
    private String numeroReferencia;
    /**
     * Getter.
     *
     * @return disposicion: disposicion a la cual esta asociada el seguro.
     */
    @ManyToOne
    @JoinColumn(name="DISPOSICION_ID")
    public Disposicion getDisposicion() {
        return disposicion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo disposicion
     *
     * @param disposicion
     */
    public void setDisposicion(Disposicion disposicion) {
        this.disposicion = disposicion;
    }
    /**
     * Getter.
     *
     * @return tipoSeguro: Tipo de seguro.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_SEGURO", nullable = false)
    public TipoSeguroEnum getTipoSeguro() {
        return tipoSeguro;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoSeguro
     *
     * @param tipoSeguro
     */
    public void setTipoSeguro(TipoSeguroEnum tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }
    /**
     * Getter.
     *
     * @return fechaRegistro: fecha de registro del seguro.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_REGISTRO", nullable = false)
    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaRegistro
     *
     * @param fechaRegistro
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    /**
     * Getter.
     *
     * @return fechaValidez: fecha hasta la cual es valido el seguro.
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA_VALIDEZ", nullable = false)
    public Date getFechaValidez() {
        return fechaValidez;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaValidez
     *
     * @param fechaValidez
     */
    public void setFechaValidez(Date fechaValidez) {
        this.fechaValidez = fechaValidez;
    }
    /**
     * Getter.
     *
     * @return numeroReferencia: numero de referencia del seguro.
     */
    @Column(name="NUMERO_REFERENCIA", nullable = false, length = 15)
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo numeroReferencia
     *
     * @param numeroReferencia
     */
    public void setNumeroReferencia(String numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
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
        if (!(object instanceof Seguro)) {
            return false;
        }
        Seguro other = (Seguro) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.Seguro[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Seguro
     */
    public Seguro() {
    }
    
}
