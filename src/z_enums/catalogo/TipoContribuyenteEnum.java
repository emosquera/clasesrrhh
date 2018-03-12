package z_enums.catalogo;

public enum TipoContribuyenteEnum {
    PERSONA_NATURAL  ("NATURAL"),
    PERSONA_JURIDICA   ("JURIDICA");
	
	private final String tipoContribuyente;
	
	private TipoContribuyenteEnum (String tipoContribuyente) {
		this.tipoContribuyente = tipoContribuyente;
	}

	public String getTipoContribuyente() {
		return tipoContribuyente;
	}
}
