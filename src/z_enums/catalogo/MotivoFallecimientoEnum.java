package z_enums.catalogo;

public enum MotivoFallecimientoEnum {
    NATURAL     ("NATURAL"),
    ENFERMEDAD  ("ENFERMEDAD"),
    ACCIDENTE   ("ACCIDENTE");
    
        private final String MotivoFallecimiento;
	
	private MotivoFallecimientoEnum (String MotivoFallecimiento) {
		this.MotivoFallecimiento = MotivoFallecimiento;
	}

	public String getMotivoFallecimiento() {
		return MotivoFallecimiento;
	}
    
}
