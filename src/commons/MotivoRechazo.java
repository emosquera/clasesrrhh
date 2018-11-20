package commons;

import datatype.LocalDateTimeConverter;
import java.time.LocalDateTime;

import javax.persistence.*;
import org.eclipse.persistence.annotations.Mutable;
import y_entity.base.EntityBase;
import z_enums.catalogo.TipoMotivoRechazoEnum;

/**
 * Requerimientos Cubiertos: RF-BN-010109-01DatosMotivosDeRechazo
 * <p>
 * Documento diseño detallado: Descripción: Clase MotivoRechazo extiende de
 * {@link EntityBase}, Table que contiene la información de persistencia de la
 * entidad motivo de rechazo.
 *
 * @author Quarksoft-CIDESA 
 * Fecha Creación: 2017/12/12
 * @version 1.0
 * @See py.gov.siare.eis.efiniciones.eis.entity.BaseMotivoRechazoEntity
 */
@Entity
@Table(name = "MRZ_CL_MOTRECHZO")
@NamedQueries({
        @NamedQuery(name = "MotivoRechazo.findByTipoMotivoRechazo", query = "Select m From MotivoRechazo m where m.tipoMotivo = :tipoMotivo and m.estado = true")
})
public class MotivoRechazo extends EntityBase<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MOTIVO_RECHAZO")
    @SequenceGenerator(name = "SEQ_MOTIVO_RECHAZO", sequenceName = "SEQ_MRZCL_ID", allocationSize = 1)
    private Long id;

    /**
     * Código del motivo de rechazo
     *
     * @see #getCodigo()
     */
    @Column(name = "CODIGO", nullable = false)
    private Long codigo;

    /**
     * Descripción del motivo de rechazo
     *
     * @see #getDescripcion()
     */
    @Column(name = "DESCRIPCION", nullable = false, length = 255)
    private String descripcion;

    /**
     * Estado que indica si el registro esta activo o inactivo
     *
     * @see #getEstado()
     */    
    @Column(name="ESTADO" )
    private Boolean estado;

    
    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_MOTIVO", nullable = false )
    private TipoMotivoRechazoEnum tipoMotivo; 
    
    /**
     * Fecha de creación del motivo de rechazo
     *
     * @see #getCreatedOn()
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "CREATED_ON")
    private LocalDateTime createdOn;

    /**
     * Usuario que modificó el motivo de rechazo
     *
     * @see #getUserChange()
     */
    @Mutable
    @Column(name = "USER_CHANGE")
    private String userChange;

    /**
     * Fecha de modificación del motivo de rechazo
     *
     * @see #getModifiedOn()
     */
    @Mutable
    @Temporal(TemporalType.TIMESTAMP)
    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "MODIFIED_ON")
    private LocalDateTime modifiedOn;

//getters
    /**
     * Getter.
     *
     * @return createdOn: Fecha de creación del motivo de rechazo.
     */
    public LocalDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Getter.
     *
     * @return userChange: Usuario que modificó el motivo de rechazo.
     */
    public String getUserChange() {
        return this.userChange;
    }

    /**
     * Getter.
     *
     * @return modifiedOn: Fecha de modificación del motivo de rechazo.
     */
    public LocalDateTime getModifiedOn() {
        return this.modifiedOn;
    }

    /**
     * Getter.
     *
     * @return codigo: Código del motivo de rechazo.
     */
    public Long getCodigo() {
        return this.codigo;
    }
    
    /**
     * Método que retorna el código rellenado con ceros a la izquierda. 
     * @return codigoMasc: Código formateado.
     */
    public String getCodigoMasc() {
            return String.format("%03d", this.getCodigo());
    }
    /**
     * Getter.
     *
     * @return descripcion: Descripción del motivo de rechazo.
     */
    public String getDescripcion() {
        if (this.descripcion != null)
            return this.descripcion.toUpperCase().trim();
        else
            return this.descripcion;
    }
    /**
     * Getter.
     *
     * @return estado: True=Activo, False=Inactivo.
     */    
    public Boolean getEstado(){
        return this.estado;
    } 
    
    /**
     * Getter.
     *
     * @return tipoMotivo: Enumerado Rechazo / Anulación
     */
    public TipoMotivoRechazoEnum getTipoMotivo() {
        return tipoMotivo;
    }


    
//setters

    /**
     * Setter. Asigna lo que recibe por parámetro al atributo codigo
     *
     * @param _codigo
     */
    public void setCodigo(Long _codigo) {
        this.codigo = _codigo;
    }

    /**
     * Setter. Asigna lo que recibe por parámetro al atributo modifiedOn
     *
     * @param _modifiedOn
     */
    public void setModifiedOn(LocalDateTime _modifiedOn) {
        this.modifiedOn = _modifiedOn;
    }

    /**
     * Setter. Asigna lo que recibe por parámetro al atributo descripcion
     *
     * @param _descripcion
     */
    public void setDescripcion(String _descripcion) {
         this.descripcion = _descripcion.toUpperCase().trim();
    }
    
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo estado
     *
     * @param _estado
     */    
    public void setEstado(Boolean _estado){
        this.estado = _estado;
    }
    
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo tipoMotivo
     *
     * @param tipoMotivo
     */    
    public void setTipoMotivo(TipoMotivoRechazoEnum tipoMotivo) {
        this.tipoMotivo = tipoMotivo;
    }
    
    
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo userChange
     *
     * @param _userChange
     */
    public void setUserChange(String _userChange) {
        this.userChange = _userChange;
    }

    /**
     * Setter. Asigna lo que recibe por parámetro al atributo createdOn
     *
     * @param _createdOn
     */
    public void setCreatedOn(LocalDateTime _createdOn) {
        this.createdOn = _createdOn;
    }

//methods
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * {@inheritDoc}
     */
    @Transient
    public String asText() {
        final StringBuffer sb = new StringBuffer();
        sb.append(this.codigo).append(" ");
        sb.append(this.descripcion);
        return sb.toString();
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
