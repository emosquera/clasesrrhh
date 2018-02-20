//QSGEN This file will be ignored in future code generations if it's changed
package d_preparacion_planilla_personal;

import y_entity.base.EntityBase;
import entity.externos.ObjetoGasto;
import z_enums.catalogo.TipoConcepto;
import javax.persistence.*;
/**
 * Clase ConceptoPlanillaPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a los conceptos de la Planilla de Personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CONCEPTO_PLANILLA_PERSONAL")
public class ConceptoPlanillaPersonal extends EntityBase<Long> {
    /**
     * codigo del Concepto de la Planilla de Personal
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * descripcion del Concepto de la Planilla de Personal
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    /**
     * abreviatura del Concepto de la Planilla de Personal
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * tipo de Concepto de la Planilla de Personal
     *
     * @see #getTipoConcepto()
     */
    private TipoConcepto tipoConcepto;
    /**
     * objeto de gasto asociado al Concepto de la Planilla de Personal
     *
     * @see #getObjetoGasto()
     */
    private ObjetoGasto objetoGasto;
    /**
     * Getter.
     *
     * @return codigo: codigo del Concepto de la Planilla de Personal.
     */
    @Column(name="CODIGO", nullable = false, length = 8)
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
     * @return descripcion: descripcion del Concepto de la Planilla de Personal.
     */
    @Column(name="DESCRIPCION", nullable = false, length = 50)
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
    /**
     * Getter.
     *
     * @return abreviatura: abreviatura del Concepto de la Planilla de Personal.
     */
    @Column(name="ABREVIATURA", nullable = false, length = 10)
    public String getAbreviatura() {
        return abreviatura;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo abreviatura
     *
     * @param abreviatura
     */
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    /**
     * Getter.
     *
     * @return TipoConcepto: tipo de concepto de la Planilla de Personal.
     */
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_CONCEPTO", nullable = false)
    public TipoConcepto getTipoConcepto() {
        return tipoConcepto;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoConcepto
     *
     * @param tipoConcepto
     */
    public void setTipoConcepto(TipoConcepto tipoConcepto) {
        this.tipoConcepto = tipoConcepto;
    }
    /**
     * Getter.
     *
     * @return objetoGasto: Objeto de Gasto asociado al concepto de la Planilla de Personal.
     */
     @ManyToOne
    public ObjetoGasto getObjetoGasto() {
        return objetoGasto;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo objetoGasto
     *
     * @param objetoGasto
     */
    public void setObjetoGasto(ObjetoGasto objetoGasto) {
        this.objetoGasto = objetoGasto;
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
        if (!(object instanceof ConceptoPlanillaPersonal)) {
            return false;
        }
        ConceptoPlanillaPersonal other = (ConceptoPlanillaPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.ConceptoPlanillaPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad ConceptoPlanillaPersonal
     */
    public ConceptoPlanillaPersonal() {
    }
    
}
