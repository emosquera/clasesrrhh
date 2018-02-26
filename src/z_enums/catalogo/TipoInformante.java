package z_enums.catalogo;

public enum TipoInformante {
    INSPECTOR  ("INSPECTOR"),
    FAMILIAR   ("FAMILIAR"),
    OTRO       ("OTRO");
    
        private final String tipoInformante;
        
        private TipoInformante (String tipoInformante) {
		this.tipoInformante = tipoInformante;
	}

	public String getTipoInformante() {
		return tipoInformante;
	}
}
