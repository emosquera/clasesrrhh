package z_enums.catalogo;

public enum TipoConceptoEnum {
    ASIGNACION  ("ASIGNACION"),
    DEDUCCION   ("DEDUCCION"),
    APORTE      ("APORTE");
    
        private final String tipoConcepto;
        
        private TipoConceptoEnum (String tipoConcepto) {
		this.tipoConcepto = tipoConcepto;
	}

	public String getTipoConcepto() {
		return tipoConcepto;
	}
}
