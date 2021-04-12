package FOODMENU;
public class FoodMenu
{
	private String foodname;
	private double unitfoodprice;
	private String foodtype;
	
	public void setFoodName(String foodname)
	{
		this.foodname = foodname ;
	}
	public void setUnitFoodPrice(double unitfoodprice)
	{
		this.unitfoodprice = unitfoodprice;
	}
	public void setFoodType(String foodtype)
	{
		this.foodtype = foodtype;
	}
	public String getFoodName()
	{
		return foodname;
	}
	public double getUnitFoodPrice()
	{
		return unitfoodprice;
	}
	public String getFoodType()
	{
		return foodtype;
	}
	
	public void ShowDetails()
	{
		System.out.println("FOOD NAME :"+foodname);
		System.out.println("UNIT FOOD PRICE  :"+unitfoodprice);
		System.out.println("FOOD TYPE :"+foodtype);
		
	}
}
	
	
	
	
	
	
	
	
	