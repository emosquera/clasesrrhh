package z_enums.catalogo;

public enum EstadoCategoriaEnum {
    PENDIENTE("PENDIENTE"),
    APROBADA("APROBADA"),
    RECHAZADA("RECHAZADA");
    
        private final String estadoCategoria;
        
        private EstadoCategoriaEnum (String estadoCategoria) {
		this.estadoCategoria = estadoCategoria;
	}

	public String getEstadoCategoria() {
		return estadoCategoria;
	}
    
}
