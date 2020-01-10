package com.antra;

public class Table {

	synchronized void printTable(int n){//method not synchronized  lock becomes
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 } 
}
