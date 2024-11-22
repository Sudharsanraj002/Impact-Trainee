package com.aspiresys;

import java.util.*;
public class Login {
String UserId ;
String Password ;
Login(){
System.out.println("Enter user id :");
Scanner scanner = new Scanner(System.in);
	UserId=scanner.nextLine();
	//sc.nextLine(); 
	System.out.println("Enter user PW :");
	Password=scanner.nextLine();
	
}


 public void isvalid(ArrayList<CreateAccount> details)
 {
int num=0;
for(CreateAccount uname:details)
{
if(uname.getName().equals(UserId) && uname.getPw().equals(Password))
{
//System.out.println("valid user"); 
num=1;
ArrayList<Mobilephone> phones= new ArrayList<Mobilephone>();
phones.add(new Mobilephone("vivo",2,15000));
phones.add(new Mobilephone("redmi",15,15000));
phones.add(new Mobilephone("oppo",12,15000));
phones.add(new Mobilephone("oneplus",15,15000));
for(Mobilephone del:phones)
{
del.isdiplay();
}
Order order = new Order();
order.orderpage(phones);
break;
}
}
if (num==0)
{
System.out.println("invalid user Try Again");
}

}
}