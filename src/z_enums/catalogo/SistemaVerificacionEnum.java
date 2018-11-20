/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z_enums.catalogo;


public enum SistemaVerificacionEnum {
    REGISTRO_CIVIL ("Registro del Estado Civil"),
    IDENTIFICACIONES ("Identificaciones"),
    MIGRACION ("Migración");
    
    private final String sistemaVerificacion;

    private SistemaVerificacionEnum(String sistemaVerificacion) {
        this.sistemaVerificacion = sistemaVerificacion;
    }

    public String getSistemaVerificacion() {
        return sistemaVerificacion;
    }
    
    
}
