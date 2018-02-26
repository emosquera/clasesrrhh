//QSGEN This file will be ignored in future code generations if it's changed
package b_legajo_personal;

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
@Table(name="BAJA_FUNCIONARIO")
public class BajaFuncionario extends EntityBase<Long> {
    /**
     * Disposicion del Funcionario a la cual se da de baja
     *
     * @see #getDisposicion()
     */
    private Disposicion disposicion;
    /**
     * codigo de registro de la Baja del Funcionario
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * Fecha de registro de la Baja de Funcionario
     *
     * @see #getFechaBaja()
     */
    private Date fechaBaja;
    /**
     * Tipo de Baja del Funcionario
     *
     * @see #getTipoBaja()
     */
    private TipoBaja tipoBaja;
    /**
     * descripcion de la Baja del Funcionario
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * Getter.
     *
     * @return disposicion: Disposicion del Funcionario a la cual se da de baja
     */
    @OneToOne(mappedBy = "bajaFuncionario")
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
     * @return codigo: codigo de registro de la Baja del Funcionario
     */
    @Column(name="CODIGO", nullable = false, length = 5)
    public String getCodigo() {
        return codigo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo codigo
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * Getter.
     *
     * @return fechaBaja: fecha de registro de la Baja del Funcionario
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="FECHA", nullable = false)
    public Date getFechaBaja() {
        return fechaBaja;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fechaBaja
     *
     * @param fechaBaja
     */
    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    /**
     * Getter.
     *
     * @return tipoBaja: Tipo de Baja del Funcionario
     */
    @ManyToOne
    @JoinColumn(name="TIPO_BAJA_ID")
    public TipoBaja getTipoBaja() {
        return tipoBaja;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoBaja
     *
     * @param tipoBaja
     */
    public void setTipoBaja(TipoBaja tipoBaja) {
        this.tipoBaja = tipoBaja;
    }
    /**
     * Getter.
     *
     * @return descripcion: descripcion del Tipo de Baja del Funcionario
     */
    @Column(name="DESCRIPCION", nullable = false, length = 1000)
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo descripcion
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        if (!(object instanceof BajaFuncionario)) {
            return false;
        }
        BajaFuncionario other = (BajaFuncionario) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.BajaFuncionario[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad BajaFuncionario
     */
    public BajaFuncionario() {
    }
    
}
