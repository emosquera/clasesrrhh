package z_enums.catalogo;

public enum TipoContribuyente {
    PERSONA_NATURAL  ("NATURAL"),
    PERSONA_JURIDICA   ("JURIDICA");
	
	private final String tipoContribuyente;
	
	private TipoContribuyente (String tipoContribuyente) {
		this.tipoContribuyente = tipoContribuyente;
	}

	public String getTipoContribuyente() {
		return tipoContribuyente;
	}
}
