package enums.catalogo;

public enum PeriodicidadPlanillaPersonal {
    DIARIA      ("DIARIA"),
    SEMANAL     ("SEMANAL"),
    QUINCENAL   ("QUINCENAL"),
    MENSUAL     ("MENSUAL"),
    ANUAL       ("ANUAL");
	
	private final String periodicidadPlanillaPersonal;
	
	private PeriodicidadPlanillaPersonal (String periodicidadPlanillaPersonal) {
		this.periodicidadPlanillaPersonal = periodicidadPlanillaPersonal;
	}

	public String getPeriodicidadPlanillaPersonal() {
		return periodicidadPlanillaPersonal;
	}
}
