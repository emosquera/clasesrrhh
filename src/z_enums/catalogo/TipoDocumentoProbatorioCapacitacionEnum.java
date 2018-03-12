package z_enums.catalogo;

public enum TipoDocumentoProbatorioCapacitacionEnum {
    DIPLOMA("DIPLOMA"),
    CEDULA("CEDULA"),
    CERTIFICADO("CERTIFICADO"),
    RECONOCIMIENTO("RECONOCIMIENTO"),
    TITULO("TITULO");
    
        private final String tipoDocumentoProbatorioCapacitacion;
        
        private TipoDocumentoProbatorioCapacitacionEnum (String tipoDocumentoProbatorioCapacitacion) {
		this.tipoDocumentoProbatorioCapacitacion = tipoDocumentoProbatorioCapacitacion;
	}

	public String getTipoDocumentoProbatorioCapacitacion() {
		return tipoDocumentoProbatorioCapacitacion;
	}
    
}   
