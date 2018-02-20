package z_enums.catalogo;

public enum Sexo {
    MASCULINO  ("MASCULINO"),
    FEMENINO   ("FEMENINO");
	
	private final String sexo;
	
	private Sexo (String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}
}
