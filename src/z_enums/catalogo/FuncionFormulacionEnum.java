/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z_enums.catalogo;

public enum FuncionFormulacionEnum {
    DATOS_PERSONALES("DATOS PERSONALES"),
    ANTIGUEDAD("ANTIGUEDAD"),
    ANIVERSARIO("ANIVERSARIO"),
    SUMA_CONCEPTOS("SUMA DE CONCEPTOS");
    
    private final String funcion;

    private FuncionFormulacionEnum(String funcion) {
        this.funcion = funcion;
    }

    public String getFuncion() {
        return funcion;
    }        
}
