package z_enums.catalogo;

public enum SexoEnum {
    MASCULINO  ("MASCULINO"),
    FEMENINO   ("FEMENINO");
	
	private final String sexo;
	
	private SexoEnum (String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}
}
