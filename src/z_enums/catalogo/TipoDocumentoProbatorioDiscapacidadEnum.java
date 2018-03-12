package z_enums.catalogo;

public enum TipoDocumentoProbatorioDiscapacidadEnum {
    CARNET("CARNET"),
    CERTIFICADO("CERTIFICADO");
    
        private final String tipoDocumentoProbatorioDiscapacidad;
        
        private TipoDocumentoProbatorioDiscapacidadEnum (String tipoDocumentoProbatorioDiscapacidad) {
		this.tipoDocumentoProbatorioDiscapacidad = tipoDocumentoProbatorioDiscapacidad;
	}

	public String getTipoDocumentoProbatorioDiscapacidad() {
		return tipoDocumentoProbatorioDiscapacidad;
	}
    
}
