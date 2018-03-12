package z_enums.catalogo;

public enum PeriodicidadPlanillaPersonalEnum {
    DIARIA      ("DIARIA"),
    SEMANAL     ("SEMANAL"),
    QUINCENAL   ("QUINCENAL"),
    MENSUAL     ("MENSUAL"),
    ANUAL       ("ANUAL");
	
	private final String periodicidadPlanillaPersonal;
	
	private PeriodicidadPlanillaPersonalEnum (String periodicidadPlanillaPersonal) {
		this.periodicidadPlanillaPersonal = periodicidadPlanillaPersonal;
	}

	public String getPeriodicidadPlanillaPersonal() {
		return periodicidadPlanillaPersonal;
	}
}
