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
public enum FlujoClasificadoresEstandar {
    PENDIENTE("PENDIENTE"),
    ENVIADA("ENVIADA"),
    VERIFICADA("VERIFICADA"),
    APROBADA("APROBADA"),
    RECHAZADA("RECHAZADA");
    
    private final String estadoFlujoEstandar;

    public String getEstadoFlujoEstandar() {
        return estadoFlujoEstandar;
    }

    private FlujoClasificadoresEstandar(String estadoFlujoEstandar) {
        this.estadoFlujoEstandar = estadoFlujoEstandar;
    }
    
    
}
