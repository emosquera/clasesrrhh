package z_enums.catalogo;

public enum EstadoEstructuraOrganizacionalEnum {
    PENDIENTE   ("PENDIENTE"),
    ENVIADA     ("ENVIADA"),
    APROBADA    ("APROBADA"),
    RECHAZADA   ("RECHAZADA");
	
	private final String estadoEstructuraOrganizacional;
	
	private EstadoEstructuraOrganizacionalEnum (String estadoEstructuraOrganizacional) {
		this.estadoEstructuraOrganizacional = estadoEstructuraOrganizacional;
	}

	public String getEstadoEstructuraOrganizacional() {
		return estadoEstructuraOrganizacional;
	}
}
