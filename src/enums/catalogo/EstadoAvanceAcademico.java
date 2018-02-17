package enums.catalogo;

public enum EstadoAvanceAcademico {
    CURSANDO("CURSANDO"),
    TRUNCADO("TRUNCADO"),
    CULMINADO("CULMINADO"),
    SUSPENDIDO("SUSPENDIDO");
    
        private final String estadoAvanceAcademico;
        
        private EstadoAvanceAcademico (String estadoAvanceAcademico) {
		this.estadoAvanceAcademico = estadoAvanceAcademico;
	}

	public String getEstadoAvanceAcademico() {
		return estadoAvanceAcademico;
	}
    
}
