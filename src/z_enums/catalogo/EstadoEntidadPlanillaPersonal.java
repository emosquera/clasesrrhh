package z_enums.catalogo;

public enum EstadoEntidadPlanillaPersonal {
    ACTIVA      ("ACTIVA"),
    INACTIVA    ("INACTIVA");	
    
	private final String estadoEntidadPlanillaPersonal;
	
	private EstadoEntidadPlanillaPersonal (String estadoEntidadPlanillaPersonal) {
		this.estadoEntidadPlanillaPersonal = estadoEntidadPlanillaPersonal;
	}

	public String getestadoEntidadPlanillaPersonal() {
		return estadoEntidadPlanillaPersonal;
	}
}
