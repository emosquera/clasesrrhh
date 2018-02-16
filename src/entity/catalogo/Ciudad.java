//QSGEN This file will be ignored in future code generations if it's changed
package entity.catalogo;

import entity.base.EntityBase;
import java.util.List;
import javax.persistence.*;
/**
 * Clase Ciudad extiende de {@link EntityBase}
 *
 * Contiene la información relacionada a la Ciudad
 *
 * @author Quarksoft-CIDESA
 * @version 1.0
 */
@Entity
@Table(name="CIUDAD")
public class Ciudad  extends EntityBase<Long>{
    /**
     * codigo de registro de la Ciudad
     *
     * @see #getCodigo()
     */
    private String codigo;
    /**
     * abreviatura para identificar a la Ciudad
     *
     * @see #getAbreviatura()
     */
    private String abreviatura;
    /**
     * nombre de la Ciudad
     *
     * @see #getNombre()
     */
    private String nombre;
    /**
     * pais al cual pertenece la Ciudad
     *
     * @see #getPais()
     */
    private Pais pais;
    /**
     * Lista de DepartamentoTerritorial que pertenecen a la Ciudad
     *
     * @see #getDepartamentosTerritoriales()
     */
    private List<DepartamentoTerritorial> departamentosTerritoriales;
    /**
     * Getter.
     *
     * @return codigo: codigo de la Ciudad.
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
     * @return abreviatura: abreviatura de la Ciudad.
     */
    @Column(name="ABREVIATURA", nullable = false, length = 6)
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
    /**
     * Getter.
     *
     * @return nombre: nombre de la Ciudad.
     */
    @Column(name="NOMBRE", nullable = false, length = 100)
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
     * @return pais: Pais al cual pertenece la Ciudad.
     */
    @ManyToOne
    @Column(name="PAIS", nullable = false)
    public Pais getPais() {
        return pais;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo pais
     *
     * @param pais
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    /**
     * Getter.
     *
     * @return departamentoTerritorials: listado de DepartamentoTerritorial que pertenecen a la Ciudad
     */
    @OneToMany(mappedBy = "CIUDAD")
    public List<DepartamentoTerritorial> getDepartamentosTerritoriales() {
        return departamentosTerritoriales;
    }
    /**
     * Setter. Asigna lo que recibe por parámetro al atributo departamentoTerritorials
     *
     * @param departamentosTerritoriales
     */
    public void setDepartamentoTerritorials(List<DepartamentoTerritorial> departamentosTerritoriales) {
        this.departamentosTerritoriales = departamentosTerritoriales;
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
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.Ciudad[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad Ciudad
     */
    public Ciudad() {
    }
    
}
