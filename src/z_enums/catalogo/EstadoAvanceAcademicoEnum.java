package z_enums.catalogo;

public enum EstadoAvanceAcademicoEnum {
    CURSANDO("CURSANDO"),
    TRUNCADO("TRUNCADO"),
    CULMINADO("CULMINADO"),
    SUSPENDIDO("SUSPENDIDO");
    
        private final String estadoAvanceAcademico;
        
        private EstadoAvanceAcademicoEnum (String estadoAvanceAcademico) {
		this.estadoAvanceAcademico = estadoAvanceAcademico;
	}

	public String getEstadoAvanceAcademico() {
		return estadoAvanceAcademico;
	}
    
}
