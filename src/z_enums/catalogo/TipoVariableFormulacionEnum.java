/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z_enums.catalogo;

public enum TipoVariableFormulacionEnum {
    FUNCION("FUNCION"),
    MONTO_CONCEPTO("MONTO DE CONCEPTO"),
    CANTIDAD_CONCEPTO("CANTIDAD DE CONCEPTO"),
    VALOR_FIJO("VALOR FIJO"),
    RESULTADO_CONCEPTO("RESULTADO DE CONCEPTO ANTERIOR");
    
    private final String tipoVariableFormulacion;

    private TipoVariableFormulacionEnum(String tipoVariableFormulacion) {
        this.tipoVariableFormulacion = tipoVariableFormulacion;
    }
    
    
}
