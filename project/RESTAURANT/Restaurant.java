package RESTAURANT;
import WORKERSINFORMATION.*;

public class Restaurant
{
	private String restaurantname;
	private String restaurantaddress;
	WorkersInformation wi[];
	
	public Restaurant()
	{
		
	}
	public Restaurant(String restaurantname,String restaurantaddress,int sizeOfArray)
	{
		this.restaurantname =  restaurantname;
		this.restaurantaddress =  restaurantaddress;
		wi = new WorkersInformation[sizeOfArray];
	}
	
	public void setRestaurantName(String restaurantname)
	{
		this.restaurantname = restaurantname;
	}
	public void setRestaurantAddress(String  restaurantaddress)
	{
		this. restaurantaddress =  restaurantaddress;
	}
	
	public String getRestaurantName()
	{
		return restaurantname;
	}
	public String getRestaurantAddress()
	{
		return restaurantaddress;
	}
	public void ShowInfo()
	{
		System.out.println("RESTAURANT NAME         : " +getRestaurantName());		
		System.out.println(" RESTAURANT ADDRESS      :"+getRestaurantAddress());
	}
	
	
	public void Showallinformation()
	{
		for(int i=0; i<wi.length; i++)
		{
			if(wi[i] != null)
			{
				System.out.println("------"+(i+1)+"--------");
				wi[i].ShowInformation();
				System.out.println();
			}
		}
	}
	
	public void insertWorkersInformation(WorkersInformation w)
	{
		int flag = 0;
		for(int i=0; i<wi.length; i++)
		{
			if(wi[i] == null)
			{
				
				wi[i] = w;
				System.out.println(wi[i].getId());
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("----Inserted----");}
		else {System.out.println("----CanNot Insert----");}
	}
	
	
	public void removeWorkersInformation(WorkersInformation w)
	{
		int flag = 0;
		for(int i=0; i<wi.length; i++)
		{
			if(wi[i] == w)
			{
				System.out.println(wi[i].getId());
				wi[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("----Removed----");}
		else {System.out.println("----CanNot Remove----");}
	}
	
	public void searchWorkersByWcid(int wcid)
	{
		int flag = 0;
		for(int i=0; i<wi.length; i++)
		{
			if(wi[i].getId() == wcid)
			{
				wi[i].ShowInformation();
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("----Found----");}
		else {System.out.println("----Not Found----");}
	}
	
	
}
