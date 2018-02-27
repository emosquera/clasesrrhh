package z_enums.catalogo;

public enum EstadoSolicitudGrupoConceptos {
    POR_APROBAR ("POR APROBAR"),
    APROBADO    ("APROBADO"),
    RECHAZADO   ("RECHAZADO");
	
	private final String estadoSolicitudGrupoConceptos;
	
	private EstadoSolicitudGrupoConceptos (String estadoSolicitudGrupoConceptos) {
		this.estadoSolicitudGrupoConceptos = estadoSolicitudGrupoConceptos;
	}

	public String getEstadoSolicitudGrupoConceptos() {
		return estadoSolicitudGrupoConceptos;
	}
}
