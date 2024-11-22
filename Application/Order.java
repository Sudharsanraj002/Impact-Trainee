package com.aspiresys;
import java.util.*;

public class Order {
	String brname;
	int quantity;
	Scanner scanner = new Scanner(System.in);
	public void orderpage(ArrayList<Mobilephone> del)
	{
	boolean t=true;
	while(t)
		{
		System.out.print("\n");
		System.out.println("To Order press--->1\nTo Exit order press--->2");
		int num;
		num=scanner.nextInt();
		scanner.nextLine();
		if(num==1)
		{
			System.out.println("Enter Brand Name :-");
			brname=scanner.nextLine();
			//sc.nextLine(); 
			System.out.println("Enter the number of product needed :-");
			quantity=scanner.nextInt();
			int n=0;
	for(Mobilephone ph:del)
		{
		if(ph.Brand.equals(brname) && ph.capacity>=quantity)
			{
			System.out.println("Order placed");
			ph.capacity=(ph.capacity)-quantity;
			n=1;
			break;
		}
}
if (n==0)
{
		System.out.println("Out of Stock");
}
}
else
{
	t=false;
}
		}
	}
}
