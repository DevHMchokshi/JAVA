package OOPS;

import java.util.Scanner;


public class encapsulation_with_scanner {
private static final String emailId = null;

public static void main(String[] args) {
Scanner scn=new Scanner(System.in);

System.out.println("enter id ");
int id= scn.nextInt();
System.out.println("enter name ");
String name =scn.next();
System.out.println("enter email id ");
String emailID =scn.next();
Encapsulation e= new Encapsulation(); 
e.setId(id);
e.setName(name);
e.setEmailID(emailId);

System.out.println(e.getId()+" "+e.getName()+" "+e.getEmailID());
System.out.println(e.toString());




	}

}
