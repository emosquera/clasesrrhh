package z_enums.catalogo;

public enum EstadoCategoria {
    PENDIENTE("PENDIENTE"),
    APROBADA("APROBADA"),
    RECHAZADA("RECHAZADA");
    
        private final String estadoCategoria;
        
        private EstadoCategoria (String estadoCategoria) {
		this.estadoCategoria = estadoCategoria;
	}

	public String getEstadoCategoria() {
		return estadoCategoria;
	}
    
}
