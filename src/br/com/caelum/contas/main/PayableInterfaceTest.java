package br.com.caelum.contas.main;
import br.com.caelum.payable.*;
import br.com.caelum.contas.employees.*;

public class PayableInterfaceTest {

	public static void main(String[] args) {
		Payable[] payableObjects = new Payable[6];
		
		payableObjects[0] = new CommissionEmployee("Ayrton", "Andrade", "123994",
				new Date(01,10,1995), 1200.4, 0.5);
		payableObjects[1] = new BasePlusCommissionEmployee("Felipe", "Muller", "122233",
				new Date(01,10,1995), 2000.00, 0.4, 1200.00);
		payableObjects[2] = new HourlyEmployee("Adriano", "Guimaraes", "222333", new Date(01,10,1995), 30, 160);
		payableObjects[3] = new SalariedEmployee("Felipe", "Paiva", "3344455", new Date(03, 31, 1995), 400);
		payableObjects[4] = new Invoice("03", "bieleta", 4, 26);
		payableObjects[5] = new Invoice("04", "bujao", 2, 10);
		
		
		for (Payable payableObject : payableObjects) {
			System.out.printf("%n%n%s",payableObject.getClass().getSimpleName());
			System.out.printf("%n%s", payableObject.toString());
			
			if (payableObject instanceof BasePlusCommissionEmployee) {
				
				BasePlusCommissionEmployee basePlusCommissionEmployee = (BasePlusCommissionEmployee) payableObject;
				
				double employeeOldSalary = basePlusCommissionEmployee.getBaseSalary();
				
				double employeeNewSalary = employeeOldSalary * 1.1;
				
				basePlusCommissionEmployee.setBaseSalary(employeeNewSalary);
				
				System.out.printf("%n%nEmployee new salary: %,.2f", basePlusCommissionEmployee.getBaseSalary());
			}
			
			System.out.printf("%nPagamento: %,.2f", payableObject.getPaymentAmount());
			System.out.printf("%n-------------------------------");
		}
		
	}

}
