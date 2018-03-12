package z_enums.catalogo;

public enum MotivoInhabilitacionEnum {
    FALTA_ADMINISTRATIVA    ("FALTA_ADMINISTRATIVA"),
    FALTA_JUDICIAL          ("FALTA_JUDICIAL"),
    FRAUDE                  ("FRAUDE"),
    MALVERSACION_DE_FONDOS  ("MALVERSACION_DE_FONDOS"),
    OTROS                   ("OTROS");
	
	private final String motivoInhabilitacion;
	
	private MotivoInhabilitacionEnum (String motivoInhabilitacion) {
		this.motivoInhabilitacion = motivoInhabilitacion;
	}

	public String getMotivoInhabilitacion() {
		return motivoInhabilitacion;
	}
}
