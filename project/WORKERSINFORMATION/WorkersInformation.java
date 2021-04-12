package WORKERSINFORMATION;
public class WorkersInformation
{
	private String name;
	private int id;
	private String address;
	private String phonenumber;
	private String title;
	
	public void setName(String name)
	{
		this.name = name ;
	}
	public void setId(int id)
	{
		this.id = id ;
	}
	public void setAddress(String address)
	{
		this.address = address ;
	}
	public void setPhoneNumber(String phonenumber)
	{
		this.phonenumber = phonenumber ;
	}
	public void setTitle(String title)
	{
		this.title = title ;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public String getAddress()
	{
		return address;
	}
	public String getPhoneNumber()
	{
		return  phonenumber;
	}
	public String getTitle()
	{
		return title;
	}
	public void ShowInformation()
	{
		System.out.println("NAME         : " +getName());
		System.out.println("ID           : "  +getId());
		System.out.println("ADDRESS      :"+getAddress());
		System.out.println("PHONE NUMBER : "+getPhoneNumber());
		System.out.println("TITLE        : "+getTitle());
	}
}