package datatype;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
@Access(AccessType.FIELD)
public class Money implements Serializable, Comparable {

    private static final long serialVersionUID = -631643909820129631L;

    @Column(name="amount")
    private BigDecimal amount;

    @Column(name="currency", length=3)
    private String currency;

    public Money() {
        super();
	}
    
    public Money(BigDecimal amount, String currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

    @Override
	public String toString(){
		return "Money{currency:" +currency + ", amount:" + amount + "}";
	}

	public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    private BigDecimal initValue(Money money){
        BigDecimal value = new BigDecimal(0);
        if(money.getAmount() != null)
            value = money.getAmount();
        return value;

    }
    public Money add(Money money){
        if(this.getAmount() != null)
            return new Money(this.getAmount().add(initValue(money)),this.getCurrency());
        else
            return new Money(initValue(money),this.getCurrency());
    }
    public Money subtract(Money money){
        if(this.getAmount() != null)
            return new Money(this.getAmount().subtract(initValue(money)),this.getCurrency());
        else
            return new Money(initValue(money).negate(),this.getCurrency());
    }

    public Money divide(Money money){
        if(this.getAmount() != null )
            return new Money(this.getAmount().divide(initValue(money)),this.getCurrency());
        else
            return new Money(BigDecimal.ZERO,this.getCurrency());
    }

    public Money multiply(Money money){
        if(this.getAmount() != null )
            return new Money(this.getAmount().multiply(initValue(money)),this.getCurrency());
        else
            return new Money(BigDecimal.ZERO,this.getCurrency());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Money money = (Money) o;
        return Objects.equals(amount, money.amount) &&
                Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }

    @Override
    public int compareTo(Object o) {
        if(o == null)
            return 1;
        Money money = (Money) o;
        if(amount == null && money.getAmount() == null)
            return 0;

        if(money.getAmount() == null)
            return 1;

        if(amount == null)
            return -1;

        return amount.compareTo(money.getAmount());
    }
}
