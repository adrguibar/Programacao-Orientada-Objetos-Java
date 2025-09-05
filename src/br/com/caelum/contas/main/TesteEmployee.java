package br.com.caelum.contas.main;
import br.com.caelum.contas.employees.Date;
import br.com.caelum.contas.employees.Employee;
import br.com.caelum.contas.employees.SalariedEmployee;
import br.com.caelum.contas.employees.HourlyEmployee;

import java.time.LocalDate;

public class TesteEmployee {
	public static void main (String args []) {
		SalariedEmployee e1 = new SalariedEmployee("adriano", "barbosa", "123457", new Date(01,10,1995), 123.0);
		HourlyEmployee e2 = new HourlyEmployee("lucas", "guimaraes", "1376", new Date(8,7,1997), 123.0, 40);
		
		Employee employees[] = new Employee[2];
		employees[0] = e1;
		employees[1] = e2;
		
		for (Employee employee : employees) {
			int currentMonth = LocalDate.now().getMonth().getValue();
			int employeeBirthMonth = employee.getBirthMonth();
			
			if (employeeBirthMonth == currentMonth) {
				System.out.printf("%nAdicionando $100 de bonus ao employee: %s %s", employee.getFirstName(), employee.getLastName());
				System.out.printf("%nNovo earnings: %,.2f%n", employee.getPaymentAmount() + 100);
			}
			else {
				System.out.printf("%nEmployee: %s%nearnings: %s%n", employee, employee.getPaymentAmount());
			}
			
		}
	}
}
