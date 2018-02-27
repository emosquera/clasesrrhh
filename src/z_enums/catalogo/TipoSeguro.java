package z_enums.catalogo;

public enum TipoSeguro {
    VIDA            ("VIDA"),
    MEDICO          ("MEDICO COBERTURA AMPLIA"),
    GASTO_MAYORES   ("GASTOS MAYORES");
    
        private final String tipoSeguro;
        
        private TipoSeguro (String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}

	public String getTipoSeguro() {
		return tipoSeguro;
	}
}
