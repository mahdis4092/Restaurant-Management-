package PAYMENTINFORMATION;
public class Workers extends PaymentInformation
{
	public String workersname ;
	
	public  Workers(double salary,double bonus,String grade,String workersname)
	{
		super(salary, bonus, grade);
		this.workersname =  workersname;
	}
	public void ShowDetails()
	{
		super.ShowDetails();
		System.out.println("WORKERS NAME :"+workersname);
		
	}
}