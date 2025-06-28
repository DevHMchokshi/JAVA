package array_java;
import java.util.Scanner;
public class multidim_array {
	public multidim_array()
	{
	
	/*
	int arr[][]= {{1,2,3},{4,5,6},{6,7,8};


	for(int i=0;i<3;i++) { for(int j=0;j<3;j++) {
		System.out.println(arr[i][j]);+" "); } System.out.printIn();
		
	*/
	Scanner scn =new Scanner(System.in);
    System.out.println("enter the numbers of  row");
    int rows = scn.nextInt();
    System.out.println("enter the number of column");
    int cols = scn.nextInt();
    int arr[][]=new int[rows][cols];
    System.out.println("enter the elements");
    for(int i=0;i<rows;i++) {
    	  for(int j=0;j<cols;j++) {
    		  arr[i][j]=scn.nextInt();
    	  }
    }
  System.out.println("output is");
    for(int i=0;i<rows;i++) {
    	  for(int j=0;j<cols;j++) {
    		  System.out.print(arr[i][j]+" ");
    	  }
    	  System.out.println();
    }
	}
	public static void main(String[] args) {
		new multidim_array();
	}
}
