package z_enums.catalogo;

public enum TipoDiscapacidadEnum {
    PERMANETE  ("1"),
    TEMPORAL   ("0");
	
	private final String tipoDiscapacidad;
	
	private TipoDiscapacidadEnum (String tipoDiscapacidad) {
		this.tipoDiscapacidad = tipoDiscapacidad;
	}

	public String getTipoDiscapacidad() {
		return tipoDiscapacidad;
	}

}
