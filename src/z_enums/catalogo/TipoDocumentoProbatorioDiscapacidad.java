package z_enums.catalogo;

public enum TipoDocumentoProbatorioDiscapacidad {
    CARNET("CARNET"),
    CERTIFICADO("CERTIFICADO");
    
        private final String tipoDocumentoProbatorioDiscapacidad;
        
        private TipoDocumentoProbatorioDiscapacidad (String tipoDocumentoProbatorioDiscapacidad) {
		this.tipoDocumentoProbatorioDiscapacidad = tipoDocumentoProbatorioDiscapacidad;
	}

	public String getTipoDocumentoProbatorioDiscapacidad() {
		return tipoDocumentoProbatorioDiscapacidad;
	}
    
}
