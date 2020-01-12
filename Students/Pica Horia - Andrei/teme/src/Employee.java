import java.math.BigDecimal;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;

	public Employee(String name, BigDecimal salary) {
		this.name = name;
		this.id = (long) ((long) Math.random() * Math.pow(10.0, 13.0));
		this.salary = salary;
		this.isDead = false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public boolean getisDead() {
		return isDead;
	}

	public void setisDead(boolean isDead) {
		this.isDead = isDead;
	}

}
