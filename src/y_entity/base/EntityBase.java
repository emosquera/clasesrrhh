package y_entity.base;


import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class EntityBase <K extends Serializable> implements Labeled{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected K id;

	public EntityBase(){}

	public boolean isNew(){
		return getId() == null;
	}


	@Override
	public boolean equals(Object obj) {               
		if ( null == obj ) {
			return false;
		}
		if ( this == obj ) {
			return true;
		}
		if ( !getClass().equals(obj.getClass()) ) {
			return false;
		}
		EntityBase<?> that = (EntityBase<?>) obj;
		return null != this.getId() && this.getId().equals(that.getId());
	}


	@Override
	public int hashCode() {
		int hashCode = 17;
		hashCode += null == getId() ? 0 : getId().hashCode() * 31;
		return hashCode;
	}

	// -------------- Getters y Setters --------------------
	public K getId() {
		return id;
	}

	public void setId(K id) {
		this.id = id;
	}

	@Override
	public String toString() {
        return "EntityBase{" + "id=" + id +
                '}';
	}

}


