package z_enums.catalogo;

public enum TipoSeguroEnum {
    VIDA            ("VIDA"),
    MEDICO          ("MEDICO COBERTURA AMPLIA"),
    GASTO_MAYORES   ("GASTOS MAYORES");
    
        private final String tipoSeguro;
        
        private TipoSeguroEnum (String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}

	public String getTipoSeguro() {
		return tipoSeguro;
	}
}
