package z_enums.catalogo;

public enum TipoCalculoEmbargoEnum {
    VALOR_PORCENTUAL  ("1"),
    VALOR_FIJO   ("0");
	
	private final String TipoCalculoEmbargo;
	
	private TipoCalculoEmbargoEnum (String TipoCalculoEmbargo) {
		this.TipoCalculoEmbargo = TipoCalculoEmbargo;
	}

	public String getTipoCalculoEmbargo() {
		return TipoCalculoEmbargo;
	}
    
}
