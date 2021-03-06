package z_enums.catalogo;

public enum TipoRegistroConducirEnum {
    PARTICULAR     ("PARTICULAR"),
    PROFESIONAL_A  ("PROFESIONAL_A"),
    PROFESIONAL_B  ("PROFESIONAL_B"),
    PROFESIONAL_C  ("PROFESIONAL_C");
	
	private final String tipoRegistroConducir;
	
	private TipoRegistroConducirEnum (String tipoRegistroConducir) {
		this.tipoRegistroConducir = tipoRegistroConducir;
	}

	public String getTipoRegistroConducir() {
		return tipoRegistroConducir;
	}
}
