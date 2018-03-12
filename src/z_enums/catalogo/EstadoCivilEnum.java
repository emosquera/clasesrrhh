package z_enums.catalogo;

public enum EstadoCivilEnum {
    SOLTERO     ("SOLTERO"),
    CASADO      ("CASADO"),
    VIUDO       ("VIUDO"),
    DIVORCIADO  ("DIVORCIADO");
	
	private final String estadoCivil;
	
	private EstadoCivilEnum (String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}
}
