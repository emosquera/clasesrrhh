//QSGEN This file will be ignored in future code generations if it's changed
package MovilidaddeFuncionarios.SolicitudBajaPersona;

import TablasYCatalogos.MotivoFallecimiento;
import TablasYCatalogos.TipoBajaFuncionario;
import Clasificadores.EstructuraOrganizacional.EstructuraOrganizacional;
import Clasificadores.DatosPersona.Persona;
import IncorporacionRecursosHumanos.Disposicion.Disposicion;
import java.util.Date;
import java.util.List;
import y_entity.base.EntityBase;
import javax.persistence.*;
import z_enums.catalogo.MotivoInhabilitacionEnum;
import z_enums.catalogo.TipoDocumentoProbatorioBaja;
import z_enums.catalogo.TipoInformanteEnum;
/**
 * Clase BajaFuncionario extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Baja de Funcionario
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="BFU_MA_BAJAFUN")
public class BajaFuncionario extends EntityBase<Long> {
    /**
     * Disposicion del Funcionario a la cual se da de baja
     *
     * @see #getDisposicion()
     */
    @ManyToOne
    @JoinColumn(name="PERSONA_ID")
    private Persona persona;
    
    @ManyToOne
    @JoinColumn(name="ESTORG_ID")
    private EstructuraOrganizacional estructuraOrganizacionalDestino;
    
    private String numeroSolicitud;
    
    /**
     * Tipo de Baja del Funcionario
     *
     * @see #getTipoBaja()
     */
    @ManyToOne
    @JoinColumn(name="TIPOBAJA_ID")
    private TipoBajaFuncionario tipoBaja;
    
    /**
     * descripcion de la Baja del Funcionario
     *
     * @see #getDescripcion()
     */
    private String descripcion;
    
    private String expediente;
            
    @Enumerated(EnumType.STRING)
    private MotivoInhabilitacionEnum motivoInhabilitacion;
    
    @Enumerated(EnumType.STRING)
    private TipoInformanteEnum tipoInformante;
    
    
    private String nombreInformante;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInforme;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaDefuncion;
    
    @ManyToOne
    @JoinColumn(name="MOTIVOFALL_ID")
    private MotivoFallecimiento motivoFallecimiento;
    
    @Enumerated(EnumType.STRING)
    private TipoDocumentoProbatorioBaja tipoDocumentoProbatorioBaja;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaInicioBaja;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFinBaja;
    
    private String observacion;
    
    @OneToMany(mappedBy = "bajaFuncionario")
    private List<ResponsabilidadFuncionario> responsabilidadesFuncionario;
    
    @ManyToMany
    @JoinTable(name = "DBF_MA_DISPBAJA",
        joinColumns = @JoinColumn(name = "BAJAFUN_ID"),
        inverseJoinColumns = @JoinColumn(name = "DISPOSICION_ID")
    )
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
        if (!(object instanceof BajaFuncionario)) {
            return false;
        }
        BajaFuncionario other = (BajaFuncionario) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "b_legajo_personal.BajaFuncionario[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad BajaFuncionario
     */
    public BajaFuncionario() {
    }
    
}
