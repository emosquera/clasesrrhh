package y_entity.base;
import y_entity.base.EntityBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;




@Entity
@Table(name="phone_line_type")
public class PhoneLineType extends EntityBase <Long> {
	private static final long serialVersionUID = -3507156375837902734L;

	@Column (name="type", length=20)
	private String type;

	@Column(nullable = false)
	private String propertyBundleName;


	public PhoneLineType (){
		super();
	}

	public PhoneLineType(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPropertyBundleName() {
		return propertyBundleName;
	}

	public void setPropertyBundleName(String propertyBundleName) {
		this.propertyBundleName = propertyBundleName;
	}

	@Override
	@Transient
	public String getAsText() {
		final StringBuffer sb = new StringBuffer();
		sb.append(type);
		return sb.toString();
	}
}
