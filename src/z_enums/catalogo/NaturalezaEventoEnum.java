package z_enums.catalogo;

public enum NaturalezaEventoEnum {
    POSITIVO    ("POSITIVO"),
    NEGATIVO    ("NEGATIVO");
    
     private final String naturalezaEvento;
        
        private NaturalezaEventoEnum (String naturalezaEvento) {
		this.naturalezaEvento = naturalezaEvento;
	}

	public String getNaturalezaEvento() {
		return naturalezaEvento;
	}
    
}
