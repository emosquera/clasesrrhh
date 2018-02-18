package enums.catalogo;

public enum EstadoCivil {
    SOLTERO     ("SOLTERO"),
    CASADO      ("CASADO"),
    VIUDO       ("VIUDO"),
    DIVORCIADO  ("DIVORCIADO");
	
	private final String estadoCivil;
	
	private EstadoCivil (String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}
}
