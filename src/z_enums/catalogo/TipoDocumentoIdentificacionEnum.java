package z_enums.catalogo;

public enum TipoDocumentoIdentificacionEnum {
    CEDULA_IDENTIDAD    ("CEDULA_IDENTIDAD"),
    PARTIDA_NACIMIENTO  ("PARTIDA_NACIMIENTO"),
    PASAPORTE           ("PASAPORTE"),
    ACTA_MATRIMONIO     ("ACTA_MATRIMONIO"),
    ENLACE_LEGAL        ("ENLACE_LEGAL");
	
	private final String tipoDocumentoIdentificacion;
	
	private TipoDocumentoIdentificacionEnum (String tipoDocumentoIdentificacion) {
		this.tipoDocumentoIdentificacion = tipoDocumentoIdentificacion;
	}

	public String getTipoDocumentoIdentificacion() {
		return tipoDocumentoIdentificacion;
	}
}
