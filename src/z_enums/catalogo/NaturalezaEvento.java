package z_enums.catalogo;

public enum NaturalezaEvento {
    POSITIVO    ("POSITIVO"),
    NEGATIVO    ("NEGATIVO");
    
     private final String naturalezaEvento;
        
        private NaturalezaEvento (String naturalezaEvento) {
		this.naturalezaEvento = naturalezaEvento;
	}

	public String getNaturalezaEvento() {
		return naturalezaEvento;
	}
    
}
