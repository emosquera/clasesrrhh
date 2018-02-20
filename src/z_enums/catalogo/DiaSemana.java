package z_enums.catalogo;

public enum DiaSemana {
    LUNES       ("LU"),
    MARTES      ("MA"),
    MIERCOLES   ("MI"),
    JUEVES      ("JU"),
    VIERNES     ("VI"),
    SABADO      ("SA"),
    DOMINGO     ("DO");
    
        private final String diaSemana;
        
        private DiaSemana (String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getDiaSemana() {
		return diaSemana;
	}
    
}
