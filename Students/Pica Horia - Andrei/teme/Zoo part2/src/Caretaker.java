import java.math.BigDecimal;

public class Caretaker extends Employee {
private double workingHours;
public Caretaker(String name, BigDecimal salary) {
	super(name, salary);
}
public double getWorkingHours() {
	return workingHours;
}
public void setWorkingHours(double workingHours) {
	this.workingHours = workingHours;
}

public String takeCareOf(Animal animal) {
	
	if(animal.kill() ) {
		return Constants.Employees.Caretakers.TCO_KILLED;
	}
	if(this.workingHours < animal.getMaintenanceCost()){
		return Constants.Employees.Caretakers.TCO_NO_TIME;
	}
	animal.setTakenCareOf(true);
	workingHours-=animal.getMaintenanceCost();
	return Constants.Employees.Caretakers.TCO_SUCCES;
	
	}
}
