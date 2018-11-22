/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z_enums.catalogo;

public enum ParametroFuncioneEnum {
    SEXO(FuncionFormulacionEnum.DATOS_PERSONALES, "SEXO");
    
    private final FuncionFormulacionEnum funcion;
    
    private final String parametro;

    private ParametroFuncioneEnum(FuncionFormulacionEnum funcion, String parametro) {
        this.funcion = funcion;
        this.parametro = parametro;
    }

    public FuncionFormulacionEnum getFuncion() {
        return funcion;
    }
    
    public String getParametro() {
        return parametro;
    }        
    
}
