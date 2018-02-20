package z_enums.catalogo;

public enum EstadoEstructuraOrganizacional {
    PENDIENTE   ("PENDIENTE"),
    ENVIADA     ("ENVIADA"),
    APROBADA    ("APROBADA"),
    RECHAZADA   ("RECHAZADA");
	
	private final String estadoEstructuraOrganizacional;
	
	private EstadoEstructuraOrganizacional (String estadoEstructuraOrganizacional) {
		this.estadoEstructuraOrganizacional = estadoEstructuraOrganizacional;
	}

	public String getEstadoEstructuraOrganizacional() {
		return estadoEstructuraOrganizacional;
	}
}
