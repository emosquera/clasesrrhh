package z_enums.catalogo;

public enum TipoConcepto {
    ASGINACION  ("ASGINACION"),
    DEDUCCION   ("DEDUCCION"),
    APORTE      ("APORTE");
    
        private final String tipoConcepto;
        
        private TipoConcepto (String tipoConcepto) {
		this.tipoConcepto = tipoConcepto;
	}

	public String getTipoConcepto() {
		return tipoConcepto;
	}
}