//QSGEN This file will be ignored in future code generations if it's changed
package a_programacion_presupuestaria;

import b_legajo_personal.ExperienciaLaboralPersona;
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
    private List<ExperienciaLaboralPersona> experienciaLaboralPersonas;
    //estructura presupuestaria base: Estructura Presupuestaria Base
    //objeto de gasto: Objeto de Gasto
    //fuente de financiamiento: Fuente de Financiamiento
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

    @OneToMany(mappedBy = "puesto")
    public List<ExperienciaLaboralPersona> getExperienciaLaboralPersonas() {
        return experienciaLaboralPersonas;
    }

    public void setExperienciaLaboralPersonas(List<ExperienciaLaboralPersona> experienciaLaboralPersonas) {
        this.experienciaLaboralPersonas = experienciaLaboralPersonas;
    }
    
}
