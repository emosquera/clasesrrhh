package z_enums.catalogo;

public enum MotivoFallecimiento {
    NATURAL     ("NATURAL"),
    ENFERMEDAD  ("ENFERMEDAD"),
    ACCIDENTE   ("ACCIDENTE");
    
        private final String MotivoFallecimiento;
	
	private MotivoFallecimiento (String MotivoFallecimiento) {
		this.MotivoFallecimiento = MotivoFallecimiento;
	}

	public String getMotivoFallecimiento() {
		return MotivoFallecimiento;
	}
    
}
