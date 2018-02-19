package enums.catalogo;

public enum TipoEO {
    UAF     ("1"),
    SUBUAF  ("2");
	
	private final String tipoEO;
	
	private TipoEO (String tipoEO) {
		this.tipoEO = tipoEO;
	}

	public String getTipoEO() {
		return tipoEO;
	}
}
