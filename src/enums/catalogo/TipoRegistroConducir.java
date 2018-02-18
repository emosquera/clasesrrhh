package enums.catalogo;

public enum TipoRegistroConducir {
    PARTICULAR     ("PARTICULAR"),
    PROFESIONAL_A  ("PROFESIONAL_A"),
    PROFESIONAL_B  ("PROFESIONAL_B"),
    PROFESIONAL_C  ("PROFESIONAL_C");
	
	private final String tipoRegistroConducir;
	
	private TipoRegistroConducir (String tipoRegistroConducir) {
		this.tipoRegistroConducir = tipoRegistroConducir;
	}

	public String getTipoRegistroConducir() {
		return tipoRegistroConducir;
	}
}
