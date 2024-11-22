package com.aspiresys;

import java.util.*;

//import java.util.Scanner; 

public class Main {
public static void main(String[] args){
	ArrayList<CreateAccount> Newacc= new ArrayList <CreateAccount>(); 
	boolean b=true;
	while(b)
		{
		int num;
		System.out.println("To Create an account press --> 1\nTo Login press --> 2\nTo EXIT press --> 3");
		 Scanner scanner = new Scanner(System.in);
			num=scanner.nextInt();
			scanner.nextLine();
			switch(num)
			{
			case 1:
			String name;
			String pass;
			System.out.println("Enter user name:");
			name=scanner.nextLine();
			System.out.println("Enter Pw:");
			pass=scanner.nextLine();
			Newacc.add(new CreateAccount(name,pass));
			break;
			case 2:
			Login login = new Login();
			System.out.println("");
			login.isvalid(Newacc);
			break;
			case 3:
			b=false;
			break;
			}
		
		
		
	  }
   }
}

