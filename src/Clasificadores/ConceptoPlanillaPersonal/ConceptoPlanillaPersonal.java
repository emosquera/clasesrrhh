//QSGEN This file will be ignored in future code generations if it's changed
package Clasificadores.ConceptoPlanillaPersonal;

import Clasificadores.TablaCategoria.ConceptoCategoriaTablaCategoria;
import IncorporacionRecursosHumanos.Disposicion.ConceptoDisposicion;
import GestionRetributiva.GrupoConceptosPlanillaPersonal.GrupoConceptoPlanillaPersonal;
import GestionRetributiva.FormulacionConceptos.FormulacionConceptoPlanillaPersonal;
import GestionRetributiva.FormulacionConceptos.FuncionFormulacion;
import java.util.List;
import y_entity.base.EntityBase;
import z_enums.catalogo.TipoConceptoEnum;
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
@Table(name="COP_CL_CONCEPTOPL")
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
    @Enumerated(EnumType.STRING)
    private TipoConceptoEnum tipoConcepto;
    
    /**
     * Listado de ConceptoCategoriaTablaCategoria donde se encuentra el Concepto
     */
    @OneToMany(mappedBy = "concepto")
    private List<ConceptoCategoriaTablaCategoria> conceptoCategoriaTablaCategorias;
    
    
    @OneToMany(mappedBy = "concepto")
    private List<ConceptoDisposicion> conceptoDisposiciones;
    
    @OneToMany(mappedBy = "concepto")
    private List<FormulacionConceptoPlanillaPersonal> formulacionesConceptoPlanillaPersonal;
    
    @ManyToMany(mappedBy = "conceptos")
    private List<GrupoConceptoPlanillaPersonal> gruposConceptos;
    
    @ManyToMany(mappedBy = "conceptos")
    private List<FuncionFormulacion> funciones;
    
    
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
        return "ConceptoPlanillaPersonal[ id=" + id + " ]";
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