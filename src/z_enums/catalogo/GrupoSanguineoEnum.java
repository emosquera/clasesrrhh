package z_enums.catalogo;

public enum GrupoSanguineoEnum {
    O_NEGATIVO  ("O-"),
    O_POSITIVO  ("O+"),
    A_NEGATIVO  ("A-"),
    A_POSITIVO  ("A+"),
    B_NEGATIVO  ("B-"),
    B_POSITIVO  ("B+"),
    AB_NEGATIVO ("AB-"),
    AB_POSITIVO ("AB+");
	
	private final String grupoSanguineo;
	
	private GrupoSanguineoEnum (String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}
}
