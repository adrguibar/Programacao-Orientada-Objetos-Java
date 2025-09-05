package br.com.caelum.contas.employees;
import br.com.caelum.payable.Payable;

public abstract class Employee implements Payable{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private Date birthDate;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthDate = birthDate;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public int getBirthMonth() {
		return this.birthDate.getMonth();
	}
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public void setLastName(String name) {
		this.lastName = name;
	}
	
	public void setSocialSecurityNumber(String number) {
		this.socialSecurityNumber = number;
	}
	
	@Override
	public String toString() {
		return String.format("First name: %s %nLast name: %s %nSocial security number: %s",
				getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
}
