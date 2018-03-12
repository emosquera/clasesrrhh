package z_enums.catalogo;

public enum TipoInformanteEnum {
    INSPECTOR  ("INSPECTOR"),
    FAMILIAR   ("FAMILIAR"),
    OTRO       ("OTRO");
    
        private final String tipoInformante;
        
        private TipoInformanteEnum (String tipoInformante) {
		this.tipoInformante = tipoInformante;
	}

	public String getTipoInformante() {
		return tipoInformante;
	}
}
