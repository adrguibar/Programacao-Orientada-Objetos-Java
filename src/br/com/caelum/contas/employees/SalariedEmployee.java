package br.com.caelum.contas.employees;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double weeklySalary){
		super(firstName, lastName, socialSecurityNumber, birthDate);
		
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}
		
		this.setWeeklySalary(weeklySalary);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}
	
	@Override
	public String toString() {
		return String.format("Salaried employee: %s%n%s: $%,.2f",
				super.toString(), "weekly salary: ", getWeeklySalary());
	}
}
