package z_enums.catalogo;

public enum TipoDocumentoProbatorioBaja {
    ACTA_DEFUNCION("Acta de Defunción"),
    INFORME_MEDICO("Informe Médico"),
    INFORME_JUDICIAL("Informe Judicial"),
    OTRO("Otro");
    
        private final String tipoDocumentoProbatorioBaja;
        
        private TipoDocumentoProbatorioBaja (String tipoDocumentoProbatorioBaja) {
		this.tipoDocumentoProbatorioBaja = tipoDocumentoProbatorioBaja;
	}

	public String getTipoDocumentoProbatorioBaja() {
		return tipoDocumentoProbatorioBaja;
	}
    
}   
