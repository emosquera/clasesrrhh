//QSGEN This file will be ignored in future code generations if it's changed
package g_gestion_tablas_catalogos;

import y_entity.base.EntityBase;
import javax.persistence.*;
/**
 * Clase Idioma extiende de {@link EntityBase}
 *
 * Contiene la información relacionada al Idioma
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="IDIOMA")
public class Idioma extends EntityBase<Long> {
    /**
     * codigo del Idioma
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * nombre del Idioma
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * abreviatura del Idioma
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * Getter.
     *
     * @return codigo: codigo del Idioma
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
     * @return nombre: nombre del Idioma
     */
    @Column(name="NOMBRE", nullable = false, length = 50)
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
     * @return abreviatura: abreviatura del Idioma
     */
    @Column(name="ABREVIATURA", nullable = false, length = 10)
    public String getAbreviatura() {
        return abreviatura;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo abreviatura
     *
     * @param abreviatura
     */
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
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
        if (!(object instanceof Idioma)) {
            return false;
        }
        Idioma other = (Idioma) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "g_gestion_tablas_catalogos.Idioma[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Idioma
     */
    public Idioma() {
    }
    
}
