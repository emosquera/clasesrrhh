package z_enums.catalogo;

public enum ParentescoEnum {
    CONYUGE ("CONYUGE"),
    HIJO    ("HIJO"),
    HIJA    ("HIJA"),
    MADRE   ("MADRE"),
    PADRE   ("PADRE"),
    ABUELO  ("ABUELO"),
    ABUELA  ("ABUELA"),
    NIETO   ("NIETO"),
    NIETA   ("NIETA");
	
	private final String parentesco;
	
	private ParentescoEnum (String parentesco) {
		this.parentesco = parentesco;
	}

	public String getParentesco() {
		return parentesco;
	}
}
