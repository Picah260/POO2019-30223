public class CaretakerFactory extends EmployeeAbstractFactory {

	@Override
	public Employee getEmployee(String type) throws Exception {
		
		if (Constants.Employees.Caretaker.equals(type)) {
			return new Caretaker();}
		
		 else 
			throw new Exception("Invalid employee exception!");
		
	}

}