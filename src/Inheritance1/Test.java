 
package Inheritance1;

 
public class Test {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher ();
        t1.name = "Fizz";
        t1.age = 23;
        t1.qualification = "Enter Pass";
        t1.display2();
        
        System.out.println("\n\n");
        
        Teacher t2 = new Teacher ();
        t2.name = "Mamnon";
        t2.age =32;
        t2.qualification="Eight Pass";
        t2.display2();
        
    }
    
}
