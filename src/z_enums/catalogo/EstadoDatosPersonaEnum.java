package z_enums.catalogo;

public enum EstadoDatosPersonaEnum {
    COMPLETOS      ("INACTIVO"),
    INCOMPLETOS    ("INCOMPLETOS"),
    INCONSISTENTES ("INCONSISTENTES");

	private final String estadoDatosPersona;
	
	private EstadoDatosPersonaEnum (String estadoDatosPersona) {
		this.estadoDatosPersona = estadoDatosPersona;
	}

	public String getEstadoDatosPersona() {
		return estadoDatosPersona;
	}
}
