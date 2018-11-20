package entity.externos;

import commons.MotivoRechazo;
import datatype.LocalDateConverter;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import y_entity.base.EntityBase;

@MappedSuperclass
public abstract class RechazoBase<T extends EntityBase,K extends Serializable>  extends EntityBase<K> {

	@Column(name="FECHA", nullable = false)
	@Convert(converter = LocalDateConverter.class)
	private LocalDate fecha;

	@Column(name="OBSERVACIONES", nullable = false )
	private String observaciones;

	@Column(name="USUARIO", nullable = false )
	private String usuario;
				
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MOTIVO_ID")
	private MotivoRechazo motivo;

	public String asText() {
		return observaciones;
	}


	public abstract  T getEntidadRechazada();

	public abstract void setEntidadRechazada(T entidadRechazada);

	//getters
	public LocalDate getFecha(){
	    return this.fecha;
	}
	public String getObservaciones(){
	    return this.observaciones;
	}
	public MotivoRechazo getMotivo(){
	    return this.motivo;
	}
	public String getUsuario(){
	    return this.usuario;
	}
	//setters
	public void setUsuario(String _usuario){
	    this.usuario = _usuario;
	}
	public void setFecha(LocalDate _fecha){
	    this.fecha = _fecha;
	}
	public void setObservaciones(String _observaciones){
	    this.observaciones = _observaciones;
	}
	public void setMotivo(MotivoRechazo _motivo){
	    this.motivo = _motivo;
	}

}
