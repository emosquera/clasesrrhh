//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import y_entity.base.EntityBase;
import entity.externos.EstructuraPresupuestariaBase;
import entity.externos.FuenteFinanciamiento;
import entity.externos.ObjetoGasto;
import javax.persistence.*;
/**
 * Clase DetalleTopeContratos extiende de {@link EntityBase}
 *
 * Contiene la información del detalle del Tope de Contratos
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="DETALLE_TOPE_CONTRATOS")
public class DetalleTopeContratos extends EntityBase<Long> {
    /**
     * Estructura Presupuestaria Base a la cual esta asociada el detalle de tope de contratos
     *
     * @see #getEstructuraPresupuestariaBase()
     */
    private EstructuraPresupuestariaBase estructuraPresupuestariaBase;
    /**
     * Objeto de Gasto al cual esta asociada el detalle de tope de contratos
     *
     * @see #getObjetoGasto()
     */
    private ObjetoGasto objetoGasto;
    /**
     * Fuente de Financiamiento al cual esta asociada el detalle de tope de contratos
     *
     * @see #getFuenteFinanciamiento()
     */
    private FuenteFinanciamiento fuenteFinanciamiento;
    /**
     * total de puestos asociados al tope de contratos
     *
     * @see #getPuestos()
     */
    private int puestos;
    /**
     * monto total de salarios asociados al tope de contratos
     *
     * @see #getMontoGlobal()
     */
    private Double montoGlobal;
    /**
     * tope de contratos al cual esta asociado el detalle
     *
     * @see #getTopeContratos()
     */
    private TopeContratos topeContratos;
    /**
     * Getter.
     *
     * @return estructuraPresupuestariaBase: Estructura Presupuestaria Base a la cual esta asociada el detalle de tope de contratos.
     */
    @ManyToOne
    @JoinColumn(name="ESTRUCTURA_PRESUPUESTARIA_BASE_ID")
    public EstructuraPresupuestariaBase getEstructuraPresupuestariaBase() {
        return estructuraPresupuestariaBase;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estructuraPresupuestariaBase
     *
     * @param estructuraPresupuestariaBase
     */
    public void setEstructuraPresupuestariaBase(EstructuraPresupuestariaBase estructuraPresupuestariaBase) {
        this.estructuraPresupuestariaBase = estructuraPresupuestariaBase;
    }
    /**
     * Getter.
     *
     * @return objetoGasto: Objeto de Gasto al cual esta asociada el detalle de tope de contratos.
     */
    @ManyToOne
    @JoinColumn(name="OBJETO_GASTO_ID")
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
    /**
     * Getter.
     *
     * @return fuenteFinanciamiento: Fuente de Financiamiento al cual esta asociada el detalle de tope de contratos.
     */
    @ManyToOne
    @JoinColumn(name="FUENTE_FINANCIAMIENTO_ID")
    public FuenteFinanciamiento getFuenteFinanciamiento() {
        return fuenteFinanciamiento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo fuenteFinanciamiento
     *
     * @param fuenteFinanciamiento
     */
    public void setFuenteFinanciamiento(FuenteFinanciamiento fuenteFinanciamiento) {
        this.fuenteFinanciamiento = fuenteFinanciamiento;
    }
    /**
     * Getter.
     *
     * @return puestos: total de puestos asociados al tope de contratos.
     */
    @Column(name="PUESTOS", nullable = false)
    public int getPuestos() {
        return puestos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo puestos
     *
     * @param puestos
     */
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
    /**
     * Getter.
     *
     * @return montoGlobal: monto total de salarios asociados al tope de contratos.
     */
    @Column(name="MONTO_GLOBAL", nullable = false)
    public Double getMontoGlobal() {
        return montoGlobal;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo montoGlobal
     *
     * @param montoGlobal
     */
    public void setMontoGlobal(Double montoGlobal) {
        this.montoGlobal = montoGlobal;
    }
    /**
     * Getter.
     *
     * @return topeContratos: tope de contratos al cual esta asociado el detalle.
     */
    @ManyToOne
    @JoinColumn(name="TOPE_CONTRATOS_ID")
    public TopeContratos getTopeContratos() {
        return topeContratos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo topeContratos
     *
     * @param topeContratos
     */
    public void setTopeContratos(TopeContratos topeContratos) {
        this.topeContratos = topeContratos;
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
        if (!(object instanceof DetalleTopeContratos)) {
            return false;
        }
        DetalleTopeContratos other = (DetalleTopeContratos) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.DetalleTopeContratos[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad DetalleTopeContratos
     */
    public DetalleTopeContratos() {
    }
    
}
