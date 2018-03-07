//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import b_legajo_personal.Disposicion;
import b_legajo_personal.ExperienciaLaboralPersona;
import entity.externos.EstructuraPresupuestariaBase;
import entity.externos.FuenteFinanciamiento;
import entity.externos.ObjetoGasto;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase Puesto extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Puesto
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="PUESTO")
public class Puesto extends EntityBase<Long> {
    /**
     * codigo de registro del Puesto
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * nombre del Puesto
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * cargo al cual esta asociado el Puesto
     *
     * @see #getCargo()
     */
    private Cargo cargo;
    /**
     * detalle de Anexo de Personal al cual esta asociado el Puesto
     *
     * @see #getDetalleAnexoPersonal()
     */
    private DetalleAnexoPersonal detalleAnexoPersonal;
    /**
     * Listado de Experiencia Laboral Asociadas al Puesto
     *
     * @see #getexperienciasLaboralesPersona()
     */
    private List<ExperienciaLaboralPersona> experienciasLaboralesPersona;
    /**
     * Disposicion asociada al Puesto
     *
     * @see #getexperienciasLaboralesPersona()
     */
    private Disposicion disposicion;
    /**
     * Estructura Presupuestaria Base del Puesto
     *
     * @see #getEstructuraPresupuestaria()
     */
    private EstructuraPresupuestariaBase estructuraPresupuestaria;
    /**
     * Objeto de Gasto del Puesto
     *
     * @see #getObjetoGasto()
     */
    private ObjetoGasto objetoGasto;
    /**
     * Fuente de Financiamiento del Puesto
     *
     * @see #getFuenteFinanciamiento()
     */
    private FuenteFinanciamiento fuenteFinanciamiento;
    /**
     * Getter.
     *
     * @return codigo: codigo de registro del puesto.
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
     * @return nombre: nombre del puesto.
     */
    @Column(name="NOMBRE", nullable = false, length = 200)
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter.
     *
     * @return cargo: cargo asociado al puesto.
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
     * @return detalle de Anexo de Personal al cual esta asociado el Puesto.
     */
    @OneToOne
    @JoinColumn(name="DETALLE_ANEXO_PERSONAL_ID")
    public DetalleAnexoPersonal getDetalleAnexoPersonal() {
        return detalleAnexoPersonal;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo detalleAnexoPersonal
     *
     * @param detalleAnexoPersonal
     */
    public void setDetalleAnexoPersonal(DetalleAnexoPersonal detalleAnexoPersonal) {
        this.detalleAnexoPersonal = detalleAnexoPersonal;
    }
    /**
     * Getter.
     *
     * @return experienciasLaboralesPersona: Listado de Experiencia Laboral asociadas al puesto.
     */
    @OneToMany(mappedBy = "puesto")
    public List<ExperienciaLaboralPersona> getExperienciasLaboralesPersona() {
        return experienciasLaboralesPersona;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo experienciasLaboralesPersona
     *
     * @param experienciasLaboralesPersona
     */
    public void setExperienciasLaboralesPersona(List<ExperienciaLaboralPersona> experienciasLaboralesPersona) {
        this.experienciasLaboralesPersona = experienciasLaboralesPersona;
    }
    /**
     * Getter.
     *
     * @return disposicion: disposicion asociada al Puesto.
     */
    @OneToOne
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
     * @return estructuraPresupuestaria: Estructura Presupuestaria Base del Puesto.
     */
    @ManyToOne
    @JoinColumn(name="ESTRUCTURA_PRESUPUESTARIA_ID")
    public EstructuraPresupuestariaBase getEstructuraPresupuestaria() {
        return estructuraPresupuestaria;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estructuraPresupuestaria
     *
     * @param estructuraPresupuestaria
     */
    public void setEstructuraPresupuestaria(EstructuraPresupuestariaBase estructuraPresupuestaria) {
        this.estructuraPresupuestaria = estructuraPresupuestaria;
    }
    /**
     * Getter.
     *
     * @return objetoGasto: Objeto de Gasto del Puesto.
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
     * @return fuenteFinanciamiento: Fuente de financiamiento del Puesto.
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
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puesto)) {
            return false;
        }
        Puesto other = (Puesto) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "a_programacion_presupuestaria.Puesto[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Puesto
     */
    public Puesto() {
    }

}
