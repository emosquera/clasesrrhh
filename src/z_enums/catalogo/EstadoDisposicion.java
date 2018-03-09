package z_enums.catalogo;

public enum EstadoDisposicion {
    PENDIENTE   ("PENDIENTE"),
    APROBADA    ("APROBADA"),
    RECHAZADA   ("RECHAZADA"),
    ELIMINADA   ("ELIMINADA");
	
	private final String estadoDisposicion;
	
	private EstadoDisposicion (String estadoDisposicion) {
		this.estadoDisposicion = estadoDisposicion;
	}

	public String getEstadoDisposicion() {
		return estadoDisposicion;
	}
}
