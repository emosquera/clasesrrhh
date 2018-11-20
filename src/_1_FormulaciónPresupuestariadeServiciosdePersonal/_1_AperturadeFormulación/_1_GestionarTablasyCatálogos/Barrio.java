//QSGEN This file will be ignored in future code generations if it's changed
package _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._1_DefinirEstructuraOrganizacional._2_GestionarEstructuraOrganizacional.EstructuraOrganizacional;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._1_GestionarDatosdePersona.Persona;
import y_entity.base.EntityBase;
import java.util.List;
import javax.persistence.*;
/**
 * Clase Barrio extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al barrio
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="BAR_CL_BARRIO")
public class Barrio extends EntityBase<Long>{
    /**
     * codigo de registro del Barrio
     *
     * @see #getCodigo()
     */
    private String codigo;
    
    /**
     * abreviatura para identificar al Barrio
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    
    /**
     * nombre del Barrio
     *
     * @see #getNombre()
     */
    private String nombre;
    
    /**
     * Ciudad a la que pertenece el Barrio
     *
     * @see #getCiudad()
     */
    @ManyToOne
    @JoinColumn(name = "CIUDAD_ID")
    private Ciudad ciudad;
    
    /**
     * Instituciones de Embargos que estan en el Barrio
     */
    @OneToMany(mappedBy = "barrio")
    private List<InstitucionEmbargo> institucionEmbargos;
    
    /**
     * Estructuras Organizacionales que estan en el Barrio
     */
    @OneToMany(mappedBy = "barrio")
    private List<EstructuraOrganizacional> estructuraOrganizacionales;
    
    /**
     * Listado de Personas que residen en el Barrio
     */
    @OneToMany(mappedBy = "barrio")
    private List<Persona> personas;
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barrio)) {
            return false;
        }
        Barrio other = (Barrio) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Barrio[ id=" + id + " ]";
    }

    /**
     *
     * @return
     */
    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Barrio
     */
    public Barrio() {
    }
    
}
