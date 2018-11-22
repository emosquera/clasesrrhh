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
public enum TipoConectorLogicoEnum {
    Y("AND"),
    O("OR");

    private final String tipoConectorLogico;

    private TipoConectorLogicoEnum(String tipoConectorLogico) {
        this.tipoConectorLogico = tipoConectorLogico;
    }
    
    
}
