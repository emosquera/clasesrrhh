package z_enums.catalogo;

public enum EstadoJubilacionRetiro {
    EN_PROCESO    ("EN PROCESO"),
    APROBADA      ("APROBADA"),
    RECHAZADA     ("RECHAZADA");
	
	private final String estadoJubilacionRetiro;
	
	private EstadoJubilacionRetiro (String estadoJubilacionRetiro) {
		this.estadoJubilacionRetiro = estadoJubilacionRetiro;
	}

	public String getEstadoJubilacionRetiro() {
		return estadoJubilacionRetiro;
	}
}
