//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._6_GestionarPuestos._1_GestionarPuesto;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._1_DefinirEstructuraOrganizacional._2_GestionarEstructuraOrganizacional.EstructuraOrganizacional;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._5_GestionarTabladeCategorías._1_GestionarTabladeCategorías.CategoriaTablaCategoria;
import _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._3_IncorporacióndeRecursosHumanos._1_GestionarSolicituddeReclutamiento.SolicitudReclutamiento;
import _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._3_IncorporacióndeRecursosHumanos._2_HabilitarFuncionario._2_RegistrarDisposición.Disposicion;
import java.util.Date;
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
@Table(name="PUE_CL_PUESTO")
public class Puesto extends EntityBase<Long> {
    /**
     * Codigo de registro del Puesto
     *
     * @see #getCodigo()
     */
    private String codigo;
    
    /**
     * Nombre del Puesto
     *
     * @see #getNombre()
     */
    private String nombre;
    
    /**
     * Indica si el Puesto es Responsable de la Estructura Organizacional a la que esta asociada
     * @return 
     */
    private Boolean responsable;
    
    /**
     * Fecha de Inicio de Vigencia del Puesto
     * @return 
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    
    /**
     * Fecha Fin de Vigencia del Puesto
     * @return 
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    
    /**
     * Activo/Inactivo
     * @return 
     */
    private Boolean activo;
    
    /**
     * Número de la normativa legal que da sustento a la creación o modificación del Puesto.
     * @return 
     */
    private String normativaLegal;
    
    /**
     * Estructura Organizacional que esta asociada al Puesto.
     * @return 
     */
    @ManyToOne
    @JoinColumn(name="ESTORG_ID")
    private EstructuraOrganizacional estructuraOrganizacional;
    
    /**
     * Ubicación física del Puesto
     */
    @ManyToOne
    @JoinColumn(name="ESTORGUBIFIS_ID")
    private EstructuraOrganizacional ubicacionFisica;
    
    /**
     * Categoria - Cargo - TablaCategoria asociada al Puesto, a traves de {@link CategoriaTablaCategoria}
     * @return 
     */
    @ManyToOne
    @JoinColumn(name="CATTABCAT_ID")
    private CategoriaTablaCategoria categoriaTablaCategoria;
    
    
    @OneToMany(mappedBy = "puesto")
    private List<SolicitudReclutamiento> solicitudReclutamientos;
    
    
    @OneToMany(mappedBy = "puesto")
    private List<Disposicion> disposiciones;
    
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
