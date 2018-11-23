//QSGEN This file will be ignored in future code generations if it's changed
package Clasificadores.EstructuraOrganizacional;

import TablasYCatalogos.Barrio;
import Clasificadores.Puesto.Puesto;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase EstructuraOrganizacional extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Estructura Organizacional
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="EOR_CL_ESTORG")
public class EstructuraOrganizacional extends EntityBase<Long> {
    
    /**
     * codigo de la Estructura Organizacional
     *
     * @see #getCodigo()
     */
    private String codigo;
    
    /**
     * abreviatura de la Estructura Organizacional
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    
    /**
     * Nombre de la Estructura Organizacional
     *
     * @see #getDescripcion()
     */
    private String nombre;
    
    /**
     * Cantidad de modificaciones de la Estructura Organizacional. Incrementa en 1 por cada modificación.
     */
    private Integer versionNumber;
    
    /**
     * Indica si la Estructura Organizacional es o pertenece a una Unidad Administradora
     */
    private Boolean unidadResponsable;
    
    
    /**
     * Barrio donde se encuentra ubicada la Estructura Organizacional
     */
    @ManyToOne
    @JoinColumn(name="BARRIO_ID", nullable = false)
    private Barrio barrio;
    
    /**
     * Direccion de la Estructura Organizacional
     */
    private String direccion;
    
    
    /**
     * codigo padre de la Estructura Organizacional
     *
     * @see #getCodigoPadre()
     */
    @ManyToOne
    @JoinColumn(name="PADRE_ID", nullable = false)
    private EstructuraOrganizacional codigoPadre;
    
    /**
     * Listado de nodos hijos
     */
    @OneToMany(mappedBy = "codigoPadre")
    private List<EstructuraOrganizacional> hijos;
            
    
    /**
     * Número de la normativa legal que da sustento a la creación o modificación de la Estructura Organizacional.
     * @return 
     */
    private String normativaLegal;
    
    /**
     * Puestos asociados a la Estructura Organizacional
     */
    @OneToMany(mappedBy = "estructuraOrganizacional")
    private List<Puesto> puestos;
    
    /**
     * Puestos ubicados fisicamente en la Estructura Oganizacional
     */
    @OneToMany(mappedBy = "ubicacionFisica")
    private List<Puesto> puestosUbicacionFisica;
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstructuraOrganizacional)) {
            return false;
        }
        EstructuraOrganizacional other = (EstructuraOrganizacional) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "EstructuraOrganizacional[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad EstructuraOrganizacional
     */
    public EstructuraOrganizacional() {
    }
    
}
