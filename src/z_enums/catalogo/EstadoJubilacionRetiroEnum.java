package z_enums.catalogo;

public enum EstadoJubilacionRetiroEnum {
    EN_PROCESO    ("EN PROCESO"),
    APROBADA      ("APROBADA"),
    RECHAZADA     ("RECHAZADA");
	
	private final String estadoJubilacionRetiro;
	
	private EstadoJubilacionRetiroEnum (String estadoJubilacionRetiro) {
		this.estadoJubilacionRetiro = estadoJubilacionRetiro;
	}

	public String getEstadoJubilacionRetiro() {
		return estadoJubilacionRetiro;
	}
}
