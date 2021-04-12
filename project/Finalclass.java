import java.lang.*;
import java.util.Scanner;
import FOODMENU.*;
import  WORKERSINFORMATION.*;
import RESTAURANT.*;
import  PAYMENTINFORMATION.*;
//import  SELLINFORMATION.*;

public class Finalclass
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int digit;
		System.out.println("ENTER YOUR CHOICE");
		System.out.println("1.FOODMENU");
		System.out.println("2.WORKERS INFORMATION");
		System.out.println("3.PAYMENT INFORMATION");
		
		digit= input.nextInt();
		switch(digit)
		{ 
		case 1:
		
		System.out.println("-----------FOODMENU INFORMATION-------------");
		Order o = new Order();
		o.setFoodName ("Pizza");
		o.setUnitFoodPrice(500);
		o.setFoodType ("Italian");
		o.setUnit (50);
		o.setOrderUnit (17);
		o.ShowDetails();
		
		Order o1 = new Order();
		o1.setFoodName ("Burger");
		o1.setUnitFoodPrice(250);
		o1.setFoodType ("Smoky beef");
		o1.setUnit (80);
		o1.setOrderUnit (25);
		o1.ShowDetails();
		
		Order o2 = new Order();
		o2.setFoodName ("Pasta");
		o2.setUnitFoodPrice(200);
		o2.setFoodType ("italian");
		o2.setUnit (22);
		o2.setOrderUnit (12);
		o2.ShowDetails();
		
		
		
		break;
		
		
		
		
		case 2:
		System.out.println();
		System.out.println("-------------WORKERSINFORMATION-----------------");
		
		
		
		Restaurant r1 = new Restaurant("Cafe metro","dhaka",6);
		r1.ShowInfo();
		
        WorkersInformation a1 = new WorkersInformation();
		a1.setName("Rahim");
		a1.setId(015);
		a1.setAddress("Dhaka");
		a1.setPhoneNumber("015467");
		a1.setTitle("Manager");
		
		WorkersInformation a2 = new WorkersInformation();
		a2.setName("Jabbar");
		a2.setId(201);
		a2.setAddress("Khulna");
		a2.setPhoneNumber("233450");
		a2.setTitle("Chef");
		
		WorkersInformation a3 = new WorkersInformation();
		a3.setName("Karim");
		a3.setId(335);
		a3.setAddress("Rajshahi");
		a3.setPhoneNumber("285396");
		a3.setTitle("Accountant");
		
		WorkersInformation a4 = new WorkersInformation();
		a4.setName("Salman");
		a4.setId(202);
		a4.setAddress("Barishal");
		a4.setPhoneNumber("985675");
		a4.setTitle("Chef");
		
		WorkersInformation a5 = new WorkersInformation();
		a5.setName("Sadman");
		a5.setId(99);
		a5.setAddress("Sylhet");
		a5.setPhoneNumber("993567");
		a5.setTitle("Food Supplier");


		
		
		r1.insertWorkersInformation(a1);
		r1.insertWorkersInformation(a2);
		r1.insertWorkersInformation(a3);
		r1.insertWorkersInformation(a4);
		r1.insertWorkersInformation(a5);
		
		
			
		r1.Showallinformation();
		
		Scanner inp = new Scanner(System.in);
		int d;
		System.out.println("INSERT  REMOVE OR SEARCH WORKERS");
		System.out.println("1.INSERTED");
		System.out.println("2.REMOVE");
		System.out.println("3.SEARCH WORKERS");
		
		d = inp.nextInt();
		switch(d)
		{
			case 1:
		r1.insertWorkersInformation(a3);
		r1.Showallinformation();
		break;
		    case 2:
		r1.removeWorkersInformation(a2);
		r1.Showallinformation();
		break;
		
		    case 3:
		r1.searchWorkersByWcid(202);
		break;
		}
	
		break;
		case 3:
		System.out.println("-----------PAYMENT INFORMATION-------------");
		 Workers wo = new Workers(20000,5000,"A","RAHIM");
		 Workers w1 = new Workers(12000,4000,"B","KARIM");
		 Workers w2 = new Workers(10000,3000,"C","SALMAN");
		 Workers w3 = new Workers(10000,3000,"C","JABBAR");
		 Workers w4 = new Workers(5000,1000,"D","SADMAN");
		 wo.ShowDetails();
		 w1.ShowDetails();
		 w2.ShowDetails();
		 w3.ShowDetails();
		 w4.ShowDetails();
		 break;
		 
		/* Date dob = new Date(6,2,2020);
		Itemname i1 = new Itemname("faruk",20,dob);
		i1.showsells();*/
		
		}
		
		
	
	}
}