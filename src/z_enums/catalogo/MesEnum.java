package z_enums.catalogo;

public enum MesEnum {
    ENERO       ("ENERO"),
    FEBRERO     ("FEBRERO"),
    MARZO       ("MARZO"),
    ABRIL       ("ABRIL"),
    MAYO        ("MAYO"),
    JUNIO       ("JUNIO"),
    JULIO       ("JULIO"),
    AGOSTO      ("AGOSTO"),
    SEPTIEMBRE  ("SEPTIEMBRE"),
    OCTUBRE     ("OCTUBRE"),
    NOVIEMBRE   ("NOVIEMBRE"),
    DICIEMBRE   ("DICIEMBRE");
	
    private final String mes;

    private MesEnum (String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }
}
