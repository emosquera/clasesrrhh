/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z_enums.catalogo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public enum TipoMotivoRechazoEnum {
    RECHAZO		("enum.RECHAZO"),
    ANULACION		("enum.ANULACION");

    private final String muestraMotivo;

    private TipoMotivoRechazoEnum(String muestraMotivo) {
        this.muestraMotivo = muestraMotivo;
    }

    public String getMuestraMotivo() {
        return muestraMotivo;
    }

    public static List<TipoMotivoRechazoEnum> toList() {
        return Stream.of(values().clone()).collect(Collectors.toList());
    }
}