package z_enums.catalogo;

public enum DiaSemanaEnum {
    LUNES       ("LU"),
    MARTES      ("MA"),
    MIERCOLES   ("MI"),
    JUEVES      ("JU"),
    VIERNES     ("VI"),
    SABADO      ("SA"),
    DOMINGO     ("DO");
    
        private final String diaSemana;
        
        private DiaSemanaEnum (String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getDiaSemana() {
		return diaSemana;
	}
    
}
