package array_java;

import java.util.Scanner;


public class User_defined_array {
public User_defined_array() {
	int total=0;
	double average =0;
	Scanner scn =new Scanner(System.in);
	System.out.println(" Enter the size of array");
//define the size of array
   int Size =scn.nextInt();
   //declaration of array
   int number[] =new int[Size];
   String name[] = new String[Size];
   //input the values in the array
   for(int i=0;i< Size;i++) {
	   System.out.println("Numbers are " );
	   number[i]=scn.nextInt();
	   System.out.println("Enter the names :");
	   name[i]=scn.next();
	   
   }
   int min=number[0];
   for(int i=0;i<Size;i++)
   {
	   if(min>number[i])
	   {
		   min=number[i];
	   }
   }
   int max=number[0];
   //display total;of array
   for(int i=0;i<Size;i++) {
	   System.out.println("Numbers are : "+ number[i]);
	   System.out.println("Name is :"+ name[i]);
	   total += number[0];
	   average =(double)total/Size;
	   if(max<number[i]) {
		   max =number[i];
	   }
	   //find index position of the max value
	   if(max==number[i]) {
		   System.out.println("Max value is at index position:" + i);
		   
	   }
   }
	System.out.println(""+"Total number of the array value is:" + total); 
	System.out.println(""+"Average of the array value is : " +average);
	System.out.println("maximum value in array at index position:" +max);
	System.out.println("minimum value in array at index position:" +min);
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 	User_defined_array();

	}

}
