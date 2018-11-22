//QSGEN This file will be ignored in future code generations if it's changed
package _2_EjecucióndeServiciosdePersonal._2_GestióndeRemuneraciones._5_GestiónRetributiva._2_PrepararCiclodePlanilla._2_GestionarEmbargos;

import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos.InstitucionEmbargo;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._1_GestionarTablasyCatálogos.TipoEmbargo;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._4_GestionarConceptosdeBeneficios._1_GestionarConceptosdePlanilladePersonal.ConceptoPlanillaPersonal;
import _1_FormulaciónPresupuestariadeServiciosdePersonal._1_AperturadeFormulación._2_GestióndeClasificadores._7_GestionarPersonas._1_GestionarDatosdePersona.Persona;
import java.util.Date;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.TipoCalculoEmbargoEnum;
/**
 * Clase Embargo extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Embargo
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="EBO_MA_EMBARGO")
public class Embargo extends EntityBase<Long> {
    /**
     * codigo de registro del Embargo
     *
     * @see #getCodigo()
     */
    private Integer codigo;
    
    /**
     * tipo de Embargo
     *
     * @see #getTipoEmbargo()
     */
    @ManyToOne
    @JoinColumn(name="TIPOEMBARGO_ID")
    private TipoEmbargo tipoEmbargo;
    
    /**
     * descripcion del Embargo
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    
    /**
     * Institucion que realiza el embargo
     *
     * @see #getInstitucionEmbargo()
     */
    @ManyToOne
    @JoinColumn(name="INSTEMBARGO_ID")
    private InstitucionEmbargo institucionEmbargo;
    
    /**
     * Funcionario al cual se le realiza el embargo
     *
     * @see #getFuncionario()
     */
    @ManyToOne
    @JoinColumn(name="PERSONA_ID")
    private Persona funcionario;
    
    /**
     * fecha de registro del embargo
     *
     * @see #getFechaRegistro()
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaRegistro;
    
    /**
     * fecha de sentencia del embargo
     *
     * @see #getFechaSentencia()
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaSentencia;
    
    /**
     * referencia del docummento de embargo
     *
     * @see #getReferenciaDocumento()
     */
    private String referenciaDocumento;
    
    /**
     * Concepto de descuento del Embargo
     *
     * @see #getConceptoAsociado()
     */
    @ManyToOne
    @JoinColumn(name="CONCEPTO_ID")
    private ConceptoPlanillaPersonal conceptoAsociado;
    
    /**
     * fecha de inicio del embargo
     *
     * @see #getFechaInicio()
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicio;
    
    /**
     * fecha de fin del embargo
     *
     * @see #getFechaFin()
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFin;
    
    /**
     * Concepto sobre el cual se realiza el Embargo
     *
     * @see #getConceptoBase()
     */
    
    @ManyToOne
    @JoinColumn(name="CONCEPTOBASE_ID")
    private ConceptoPlanillaPersonal conceptoBase;
    
    /**
     * tipo de calculo del embargo
     *
     * @see #getTipoCalculo()
     */
    @Enumerated(EnumType.STRING)
    private TipoCalculoEmbargoEnum tipoCalculo;
    
    /**
     * valor segun el tipo de calculo del embargo
     *
     * @see #getValor()
     */
    private double valor;    
        
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Embargo)) {
            return false;
        }
        Embargo other = (Embargo) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "Embargo[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Embargo
     */
    public Embargo() {
    }
    
}
