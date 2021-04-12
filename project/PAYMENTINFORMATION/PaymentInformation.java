package PAYMENTINFORMATION;
public abstract class PaymentInformation
{
	public double salary ;
	public double bonus;
	public String grade;
	
	public PaymentInformation(double salary,double bonus,String  grade)
	{
		this.salary = salary ;
		this.bonus = bonus;
		this.grade = grade;
	}
	public void ShowDetails()
	{
		System.out.println("SALARY :"+salary);
		System.out.println("BONUS :"+bonus);
		System.out.println("GRADE :"+grade);
		
	}
}