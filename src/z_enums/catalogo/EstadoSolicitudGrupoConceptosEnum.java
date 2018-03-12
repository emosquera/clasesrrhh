package z_enums.catalogo;

public enum EstadoSolicitudGrupoConceptosEnum {
    POR_APROBAR ("POR APROBAR"),
    APROBADO    ("APROBADO"),
    RECHAZADO   ("RECHAZADO");
	
	private final String estadoSolicitudGrupoConceptos;
	
	private EstadoSolicitudGrupoConceptosEnum (String estadoSolicitudGrupoConceptos) {
		this.estadoSolicitudGrupoConceptos = estadoSolicitudGrupoConceptos;
	}

	public String getEstadoSolicitudGrupoConceptos() {
		return estadoSolicitudGrupoConceptos;
	}
}
