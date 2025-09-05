package br.com.caelum.contas.employees;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, birthDate);
		
		if (wage < 0.0) {
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}
		
		if ((hours < 0.0) || (hours > 168.0)) {
			throw new IllegalArgumentException("hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.setWage(wage);
		this.setHours(hours);
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) {
			throw new IllegalArgumentException("hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0.0) {
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		}
		
		this.wage = wage;
	}
	
	@Override
	public double getPaymentAmount() {
		if (getHours() <= 40) {
			return getWage() * 40;
		} 
		else {
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}
	
	@Override
	public String toString() {
		return String.format("Hourly employee: %s%n%s: $%,.2f; %n%s: %,.2f",
				super.toString(), "hourly wage", getWage(),
				"hours worked", getHours());
	}

}
