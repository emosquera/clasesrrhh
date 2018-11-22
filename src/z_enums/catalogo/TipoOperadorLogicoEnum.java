/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z_enums.catalogo;

/**
 *
 * @author syslife02
 */
public enum TipoOperadorLogicoEnum {
    MENOR("<"),
    MENOR_O_IGUAL("<="),
    IGUAL("="),
    MAYOR(">"),
    MAYOR_O_IGUAL(">=");

    private final String tipoOperadorLogico;

    private TipoOperadorLogicoEnum(String tipoOperadorLogico) {
        this.tipoOperadorLogico = tipoOperadorLogico;
    }


}
