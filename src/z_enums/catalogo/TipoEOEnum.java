package z_enums.catalogo;

public enum TipoEOEnum {
    UAF     ("1"),
    SUBUAF  ("2");
	
	private final String tipoEO;
	
	private TipoEOEnum (String tipoEO) {
		this.tipoEO = tipoEO;
	}

	public String getTipoEO() {
		return tipoEO;
	}
}
