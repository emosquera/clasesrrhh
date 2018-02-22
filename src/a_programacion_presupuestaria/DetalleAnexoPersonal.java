//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import entity.externos.EstructuraPresupuestariaBase;
import entity.externos.FuenteFinanciamiento;
import entity.externos.ObjetoGasto;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase DetalleAnexoPersonal extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Detalle del Anexo de Personal
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="DETALLE_ANEXO_PERSONAL")
public class DetalleAnexoPersonal extends EntityBase<Long> {
    /**
     * Puesto asociado al detalle del anexo de personal
     *
     * @see #getPuesto()
     */
    private Puesto puesto;
    /**
     * Estructura Presupuestaria Base a la cual esta asociada el Detalle del Anexo de Personal
     *
     * @see #getEstructuraPresupuestariaBase()
     */
    private EstructuraPresupuestariaBase tituloPresupuestario;
    /**
     * Objeto de Gasto a la cual esta asociada el Detalle del Anexo de Personal
     *
     * @see #getObjetoGasto()
     */
    private ObjetoGasto objetoGasto;
    /**
     * Fuente de Financiamiento a la cual esta asociada el Detalle del Anexo de Personal
     *
     * @see #getFuenteFinanciamiento()
     */
    private FuenteFinanciamiento distribucionGastoFuenteFinanciamiento;
    /**
     * Cantidad de Puestos asociados al Detalle del Anexo de Personal
     *
     * @see #getCantidadPuestos()
     */
    private int cantidadPuestos;
    /**
     * Anexo Personal al cual pertenece el Detalle
     *
     * @see #getAnexoPersonal()
     */
    private AnexoPersonal anexoPersonal;
    /**
     * Getter.
     *
     * @return tituloPresupuestario: Estructura Presupuestaria Base al cual pertenece el Detalle del Anexo de Personal.
     */
    @ManyToOne
    @JoinColumn(name="TITULO_PRESUPUESTARIO_ID")
    public EstructuraPresupuestariaBase getTituloPresupuestario() {
        return tituloPresupuestario;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tituloPresupuestario
     *
     * @param tituloPresupuestario
     */
    public void setTituloPresupuestario(EstructuraPresupuestariaBase tituloPresupuestario) {
        this.tituloPresupuestario = tituloPresupuestario;
    }
    /**
     * Getter.
     *
     * @return objetoGasto: Objeto de Gasto al cual pertenece el Detalle del Anexo de Personal.
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
     * @return distribucionGastoFuenteFinanciamiento: Fuente de Financiamiento al cual pertenece el Detalle del Anexo de Personal.
     */
    @ManyToOne
    @JoinColumn(name="DISTRIBUCION_FUENTE_FINANCIAMIENTO_ID")
    public FuenteFinanciamiento getDistribucionGastoFuenteFinanciamiento() {
        return distribucionGastoFuenteFinanciamiento;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo distribucionGastoFuenteFinanciamiento
     *
     * @param distribucionGastoFuenteFinanciamiento
     */
    public void setDistribucionGastoFuenteFinanciamiento(FuenteFinanciamiento distribucionGastoFuenteFinanciamiento) {
        this.distribucionGastoFuenteFinanciamiento = distribucionGastoFuenteFinanciamiento;
    }
    /**
     * Getter.
     *
     * @return cantidadPuestos: cantidad de puestos asociados al Detalle del Anexo de Personal.
     */
    @Column(name="CANTIDAD_PUESTOS", nullable = false)
    public int getCantidadPuestos() {
        return cantidadPuestos;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo cantidadPuestos
     *
     * @param cantidadPuestos
     */
    public void setCantidadPuestos(int cantidadPuestos) {
        this.cantidadPuestos = cantidadPuestos;
    }
    /**
     * Getter.
     *
     * @return anexoPersonal: Anexo de Personal al cual pertenece el Detalle.
     */
    @ManyToOne
    @JoinColumn(name="ANEXO_PERSONAL_ID")
    public AnexoPersonal getAnexoPersonal() {
        return anexoPersonal;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo anexoPersonal
     *
     * @param anexoPersonal
     */
    public void setAnexoPersonal(AnexoPersonal anexoPersonal) {
        this.anexoPersonal = anexoPersonal;
    }
    /**
     * Getter.
     *
     * @return puesto: puesto  asociado al Detalle.
     */
    @OneToOne(mappedBy = "detalleAnexoPersonal")
    public Puesto getPuesto() {
        return puesto;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo puesto
     *
     * @param puesto
     */
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
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
        if (!(object instanceof DetalleAnexoPersonal)) {
            return false;
        }
        DetalleAnexoPersonal other = (DetalleAnexoPersonal) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.DetalleAnexoPersonal[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad DetalleAnexoPersonal
     */
    public DetalleAnexoPersonal() {
    }
    
}
