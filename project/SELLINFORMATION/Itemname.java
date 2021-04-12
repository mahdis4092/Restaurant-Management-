package SELLINFORMATION;
import SELLINFORMATION.FileReadWrite;
public class Itemname
{
	private String itemname;
	private int    amount;
	private Date dob;
	
	public Itemname(String itemname, int amount,Date dob)
	{
		this.itemname = itemname;
		this.amount = amount;
		this.dob = dob;
		FileReadWrite file = new FileReadWrite();
		file.writeInFile(itemname+";"+amount+";"+dob.getDate(),"Itemname.txt");
	}
	public void setDob(Date dob)
	{
		this.dob=dob;
	}
	public void showsells()
	{
		System.out.println(itemname);
		System.out.println(amount);
		dob.showDate();
	}
}