package Variables;

public class InstanceVariable {
	

	 String name = "charlie";
     int age = 5;
     
     public void name() {
 		name="charlie";
 		System.out.println(name);
     }
     
     public void age() {
    	 
 		age= 5;
 		System.out.println(age);	 
     }
     
     
   public static void main(String[] args) {
	InstanceVariable obj = new InstanceVariable ();
	obj.name();
	obj.age();
	   
}
   
     
}
