 
package Method_Overriding;

 
public class Test {
    public static void main(String[] args) {
        
        Person p1 = new Person ();
        
        
        p1.name = "Fizz_Babu";
        p1.age= 23;
        p1.quaalification = "ssc";
        p1.displayinformation();
        
        System.out.println("\n\n");
         
       Overriding o1 = new Overriding ();
       o1.name = "Fizz_Babu";
       o1.age= 23;
       o1.displayinformation();
        
    }
    
}
