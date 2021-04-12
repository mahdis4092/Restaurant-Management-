package FOODMENU;
public class Stock extends FoodMenu
{
	private int unit;
	public void setUnit(int  unit)
	{
		this.unit = unit ;
	}
	public int  getUnit()
	{
		return unit;
	}
	public void ShowDetails()
	{
		super.ShowDetails();
		System.out.println("TOTAL STOCK  UNIT  :"+unit);
		
	}
}