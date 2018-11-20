/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package z_enums.catalogo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum TipoFormulacionEnum {
    ANEXO_DE_PERSONAL		("ANEXO DE PERSONAL"),
    TOPE_DE_CONTRATOS		("TOPE DE CONTRATOS"),
    OTROS_GASTOS_PERSONAL       ("OTROS_GASTOS_DE_PERSONAL");

    private final String tipoFormulacion;

    private TipoFormulacionEnum(String tipoFormulacion) {
        this.tipoFormulacion = tipoFormulacion;
    }

    public String getTipoFormulacion() {
        return tipoFormulacion;
    }

    public static List<TipoFormulacionEnum> toList() {
        return Stream.of(values().clone()).collect(Collectors.toList());
    }
}
