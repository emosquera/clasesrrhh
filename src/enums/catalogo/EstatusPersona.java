package enums.catalogo;

public enum EstatusPersona {
    ACTIVO               ("ACTIVO"),
    INACTIVO             ("INACTIVO"),
    DATOS_INCOMPLETOS    ("DATOS_INCOMPLETOS"),
    DATOS_INCONSISTENTES ("DATOS_INCONSISTENTES");
	
	private final String EstatusPersona;
	
	private EstatusPersona (String EstatusPersona) {
		this.EstatusPersona = EstatusPersona;
	}

	public String getEstatusPersona() {
		return EstatusPersona;
	}
}
