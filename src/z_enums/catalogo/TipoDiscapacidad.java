package z_enums.catalogo;

public enum TipoDiscapacidad {
    PERMANETE  ("1"),
    TEMPORAL   ("0");
	
	private final String tipoDiscapacidad;
	
	private TipoDiscapacidad (String tipoDiscapacidad) {
		this.tipoDiscapacidad = tipoDiscapacidad;
	}

	public String getTipoDiscapacidad() {
		return tipoDiscapacidad;
	}

}
