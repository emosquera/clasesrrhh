//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase CargosAprobadosResolucion extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a los cargos aprobados en resolucion de EEN
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CARGOS_APROBADOS_RESOLUCION")
public class CargosAprobadosResolucion extends EntityBase<Long> {
    /**
     * Cargo aprobado en resolucion
     *
     * @see #getCargo()
     */
    private Cargo cargo;
    /**
     * cantidad de puestos aprobados en resolucion
     *
     * @see #getPuestosAprobados()
     */
    private int puestosAprobados;
    /**
     * cantidad de puestos dispuestos de los aprobados en resolucion
     *
     * @see #getPuestosDispuestos()
     */
    private int puestosDispuestos;
    /**
     * cantidad de puestos disponibles de los aprobados en resolucion
     *
     * @see #getPuestosDisponibles()
     */
    private int puestosDisponibles;
    /**
     * Resolucion del EEN
     *
     * @see #getResolucionEEN()
     */
    private ResolucionEEN resolucionEEN;
    /**
     * Getter.
     *
     * @return cargo: cargo aprobado en resolucion
     */
    @ManyToOne
    @JoinColumn(name="CARGO_ID")
    public Cargo getCargo() {
        return cargo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo cargo
     *
     * @param cargo
     */
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    /**
     * Getter.
     *
     * @return puestosAprobados: cantidad de puestos aprobados en resolucion
     */
    @Column(name="PUESTOS_APROBADOS", nullable = false)
    public int getPuestosAprobados() {
        return puestosAprobados;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo puestosAprobados
     *
     * @param puestosAprobados
     */
    public void setPuestosAprobados(int puestosAprobados) {
        this.puestosAprobados = puestosAprobados;
    }
    /**
     * Getter.
     *
     * @return puestosDispuestos: cantidad de puestos dispuestos de los aprobados en resolucion
     */
    @Column(name="PUESTOS_DISPUESTOS", nullable = false)
    public int getPuestosDispuestos() {
        return puestosDispuestos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo puestosDispuestos
     *
     * @param puestosDispuestos
     */
    public void setPuestosDispuestos(int puestosDispuestos) {
        this.puestosDispuestos = puestosDispuestos;
    }
    /**
     * Getter.
     *
     * @return puestosDisponibles: cantidad de puestos disponibles de los aprobados en resolucion
     */
    @Column(name="PUESTOS_DISPONIBLES", nullable = false)
    public int getPuestosDisponibles() {
        return puestosDisponibles;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo puestosDisponibles
     *
     * @param puestosDisponibles
     */
    public void setPuestosDisponibles(int puestosDisponibles) {
        this.puestosDisponibles = puestosDisponibles;
    }
    /**
     * Getter.
     *
     * @return resolucionEEN: Resolucion del EEN
     */
    @ManyToOne
    @JoinColumn(name="RESOLUCION_EEN_ID")
    public ResolucionEEN getResolucionEEN() {
        return resolucionEEN;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo resolucionEEN
     *
     * @param resolucionEEN
     */
    public void setResolucionEEN(ResolucionEEN resolucionEEN) {
        this.resolucionEEN = resolucionEEN;
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
        if (!(object instanceof CargosAprobadosResolucion)) {
            return false;
        }
        CargosAprobadosResolucion other = (CargosAprobadosResolucion) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.CargosAprobadosResolucion[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad CargosAprobadosResolucion
     */
    public CargosAprobadosResolucion() {
    }
    
}
