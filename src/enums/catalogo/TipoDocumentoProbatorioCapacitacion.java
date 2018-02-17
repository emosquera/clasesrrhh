package enums.catalogo;

public enum TipoDocumentoProbatorioCapacitacion {
    DIPLOMA("DIPLOMA"),
    CEDULA("CEDULA"),
    CERTIFICADO("CERTIFICADO"),
    RECONOCIMIENTO("RECONOCIMIENTO"),
    TITULO("TITULO");
    
        private final String tipoDocumentoProbatorioCapacitacion;
        
        private TipoDocumentoProbatorioCapacitacion (String tipoDocumentoProbatorioCapacitacion) {
		this.tipoDocumentoProbatorioCapacitacion = tipoDocumentoProbatorioCapacitacion;
	}

	public String getTipoDocumentoProbatorioCapacitacion() {
		return tipoDocumentoProbatorioCapacitacion;
	}
    
}   
