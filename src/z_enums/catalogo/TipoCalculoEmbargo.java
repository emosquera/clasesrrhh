package z_enums.catalogo;

public enum TipoCalculoEmbargo {
    VALOR_PORCENTUAL  ("1"),
    VALOR_FIJO   ("0");
	
	private final String TipoCalculoEmbargo;
	
	private TipoCalculoEmbargo (String TipoCalculoEmbargo) {
		this.TipoCalculoEmbargo = TipoCalculoEmbargo;
	}

	public String getTipoCalculoEmbargo() {
		return TipoCalculoEmbargo;
	}
    
}
