package enums.catalogo;

public enum EstatusPersona {
    ACTIVO               ("ACTIVO"),
    INACTIVO             ("INACTIVO"),
    DATOS_INCOMPLETOS    ("DATOS_INCOMPLETOS"),
    DATOS_INCONSISTENTES ("DATOS_INCONSISTENTES");
	
	private final String estatusPersona;
	
	private EstatusPersona (String estatusPersona) {
		this.estatusPersona = estatusPersona;
	}

	public String getEstatusPersona() {
		return estatusPersona;
	}
}
