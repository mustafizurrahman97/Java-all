 
package InstanceOf;

 
public class Test {
    public static void main(String[] args) {
        
        Animal a = new Animal();
        Teacher t = new Teacher();
        Person p = new Person();
        
        
        System.out.println(a instanceof Animal);
        System.out.println(t instanceof Teacher);
        System.out.println(p instanceof Person);
        
        
    }
    
}
