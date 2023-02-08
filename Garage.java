package com.interface1.p1;

public class Garage {
     static Bike b1=new Bike();
     static Car c1=new Car();
     static Cycle c2=new Cycle();
     
     Vehicle getvehicle(int vtype) {
    	Vehicle  v1=null;
    	 if(vtype==1) {
    		 v1=b1;
    	 }
    	 else if(vtype==2) {
    		 v1=c1;
    	 }
    	 else if(vtype==3) {
    		 v1=c2;
    	 }
    	 return v1;
     }
}
