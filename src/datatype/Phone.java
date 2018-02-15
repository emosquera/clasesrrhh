package datatype;



import entity.base.PhoneLineType;
import java.io.Serializable;

import javax.persistence.*;


@Embeddable
@Access(AccessType.FIELD)
public class Phone implements Serializable{

	private static final long serialVersionUID = 4754153010794958687L;
	
	@Column(name="country", length=2)
	private String country;
	
	@Column(name="phoneNumber", length=20)
	private String phoneNumber ;
	
	@ManyToOne
	@JoinColumn (name="phone_type")
	private PhoneLineType phoneLineType;
	
	public Phone(){
		super();
	}
	
	public Phone(String country, String phoneNumber, PhoneLineType phoneType) {
		super();
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.phoneLineType = phoneType;
	}

	@Override
	public String toString(){
		return this.phoneNumber != null && !this.phoneNumber.isEmpty()
				? (this.phoneLineType != null ? this.phoneLineType.getType() : "" ) +
				(this.country != null && !this.country.isEmpty() ? ": (" + this.country + ")" : "") +
				this.phoneNumber : "";
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String conuntry) {
		this.country = conuntry;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PhoneLineType getPhoneLineType() {
		return phoneLineType;
	}

	public void setPhoneLineType(PhoneLineType phoneLineType) {
		this.phoneLineType = phoneLineType;
	}

}
