package z_enums.catalogo;

public enum EstadoDatosPersona {
    COMPLETOS      ("INACTIVO"),
    INCOMPLETOS    ("INCOMPLETOS"),
    INCONSISTENTES ("INCONSISTENTES");

	private final String estadoDatosPersona;
	
	private EstadoDatosPersona (String estadoDatosPersona) {
		this.estadoDatosPersona = estadoDatosPersona;
	}

	public String getEstadoDatosPersona() {
		return estadoDatosPersona;
	}
}
