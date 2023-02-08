package com.interface1.p1;
import java.util.Scanner;
public class Mainclass {
   public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 Garage g1=new Garage();
	 Person p1=new Person();
	 System.out.println(" Enter\n1 ----> Bike\n2 ----> Car \n3 ----> Cycle");
	 int choice=s.nextInt();
	 Vehicle v1= g1.getvehicle(choice);
	 if(v1!=null) {
		 p1.travels(v1);
	 }
	 else {
		 System.out.println("vehicle is not found ");
	 }
	 s.close();
}
}
