/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.catalogo;

import entity.base.EntityBase;
import javax.persistence.*;

/**
 *
 * @author syslife01
 */
@Entity
@Table(name="ESPECIALIDAD_ACADEMICA")
public class EspecialidadAcademica extends EntityBase<Long> {

    private String codigo;
    private String nombre;

    @Column(name="CODIGO", nullable = false, length = 9)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Column(name="NOMBRE", nullable = false, length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        if (!(object instanceof EspecialidadAcademica)) {
            return false;
        }
        EspecialidadAcademica other = (EspecialidadAcademica) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "entity.catalogo.EspecialidadAcademica[ id=" + id + " ]";
    }

    @Override
    public String getAsText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Constructor por defecto de la entidad EspecialidadAcademica
     */
    public EspecialidadAcademica() {
    }
    
}
