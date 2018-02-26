package z_enums.catalogo;

public enum EstatusDisposicion {
    PENDIENTE   ("PENDIENTE"),
    APROBADA    ("APROBADA"),
    RECHAZADA   ("RECHAZADA"),
    ELIMINADA   ("ELIMINADA");
	
	private final String estatusDisposicion;
	
	private EstatusDisposicion (String estatusDisposicion) {
		this.estatusDisposicion = estatusDisposicion;
	}

	public String getEstatusDisposicion() {
		return estatusDisposicion;
	}
}
