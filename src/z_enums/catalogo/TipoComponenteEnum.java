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
public enum TipoComponenteEnum {
    VARIABLE("VARIABLE"),
    OPERADOR("OPERADOR"),
    MONTO_FIJO("MONTO FIJO");
    
    private final String tipoComponente;

    private TipoComponenteEnum(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public String getTipoComponente() {
        return tipoComponente;
    }        
    
}
