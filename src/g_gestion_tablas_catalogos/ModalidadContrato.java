//QSGEN This file will be ignored in future code generations if it's changed
package g_gestion_tablas_catalogos;

import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase ModalidadContrato extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Modalidades de Contrato
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="MODALIDAD_CONTRATO")
public class ModalidadContrato extends EntityBase<Long> {
    /**
     * codigo de registro de la Modalidad de Contrato
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * nombre de la Modalidad de Contrato
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * sigla de la Modalidad de Contrato
     *
     * @see #getSigla()
     */
    private String sigla;
    /**
     * Getter.
     *
     * @return codigo: codigo de la Modalidad de Contrato
     */
    @Column(name="CODIGO", nullable = false, length = 9)
    public String getCodigo() {
        return codigo;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo codigo
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    /**
     * Getter.
     *
     * @return nombre: nombre de la Modalidad de Contrato
     */
    @Column(name="NOMBRE", nullable = false, length = 255)
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo nombre
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter.
     *
     * @return sigla: sigla de la Modalidad de Contrato
     */
    @Column(name="SIGLA", nullable = false, length = 10)
    public String getSigla() {
        return sigla;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo sigla
     *
     * @param sigla
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModalidadContrato)) {
            return false;
        }
        ModalidadContrato other = (ModalidadContrato) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "g_gestion_tablas_catalogos.ModalidadContrato[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad ModalidadContrato
     */
    public ModalidadContrato() {
    }
    
}
