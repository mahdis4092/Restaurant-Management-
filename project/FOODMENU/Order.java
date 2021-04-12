package FOODMENU;
public class Order extends Stock
{
	private int orderunit;
	public void setOrderUnit(int orderunit)
	{
		this.orderunit = orderunit ;
	}
	public int  getOrderUnit()
	{
		return orderunit;
	}
	public void ShowDetails()
	{
		super.ShowDetails();
		System.out.println("TOTAL ORDER  UNIT  :"+orderunit);
		
	}
}