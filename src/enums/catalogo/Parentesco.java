package enums.catalogo;

public enum Parentesco {
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
	
	private Parentesco (String parentesco) {
		this.parentesco = parentesco;
	}

	public String getParentesco() {
		return parentesco;
	}
}
