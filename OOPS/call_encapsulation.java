package OOPS;


public class call_encapsulation {
public static void main(String[] args) {
     Encapsulation e=new Encapsulation();
     e.setId(100);
     e.setName("Dev");
     e.setEmailID("devcho3508@gmail");
	 
	 
     System.out.println(e.getId()+" "+e.getName()+" "+e.getEmailID());
     System.out.println(e.toString());

	}

}
