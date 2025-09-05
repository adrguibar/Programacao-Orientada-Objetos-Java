package br.com.caelum.contas.employees;
import br.com.caelum.payable.Payable;

public class CommissionEmployee extends Employee implements Payable{
    private double grossSales; // vendas brutas semanais
    private double commissionRate; // percentual da comissão

    // construtor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate,
                               double grossSales, double commissionRate) {
    	
    	super(firstName, lastName, socialSecurityNumber, birthDate);
    	
        // validações
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

	    // setters e getters
	    public void setGrossSales(double grossSales) {
	        if (grossSales < 0.0) {
	            throw new IllegalArgumentException("Gross sales must be >= 0.0");
	        }
	        this.grossSales = grossSales;
	    }
	
	    public double getGrossSales() {
	        return grossSales;
	    }
	
	    public void setCommissionRate(double commissionRate) {
	        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
	            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
	        }
	        this.commissionRate = commissionRate;
	    }
	
	    public double getCommissionRate() {
	        return commissionRate;
	    }
	
	    // calcula os lucros
	    public double getPaymentAmount() {
	        return getCommissionRate() * getGrossSales();
	    }
	
	    // representação String do objeto
	    @Override
	    public String toString() {
	        return String.format(
	                "%s"  +
	                "%ngross sales: %.2f" +
	                "%ncommission rate: %.2f",
	                super.toString(),getGrossSales(), 
	                getCommissionRate());
	    }
}

