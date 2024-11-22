package com.aspiresys;
import java.util.*;
public class Mobilephone {
String Brand;

int capacity;

int price;

Scanner sc = new Scanner(System.in);

Mobilephone(String brand,int capacity,int price)

{

this.Brand=brand;

this.capacity=capacity;

this.price=price;

//System.out.println(this.Brand); 

//System.out.println(this.capacity); 

//System.out.println(this.Brand); 

}

public void isdiplay()
{
System.out.println("Brand:-"+Brand + "\n" + "Remining No of Products:-"+capacity);
}
}
