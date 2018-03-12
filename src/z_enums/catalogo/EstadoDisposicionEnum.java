package z_enums.catalogo;

public enum EstadoDisposicionEnum {
    PENDIENTE   ("PENDIENTE"),
    APROBADA    ("APROBADA"),
    RECHAZADA   ("RECHAZADA"),
    ELIMINADA   ("ELIMINADA");
	
	private final String estadoDisposicion;
	
	private EstadoDisposicionEnum (String estadoDisposicion) {
		this.estadoDisposicion = estadoDisposicion;
	}

	public String getEstadoDisposicion() {
		return estadoDisposicion;
	}
}
