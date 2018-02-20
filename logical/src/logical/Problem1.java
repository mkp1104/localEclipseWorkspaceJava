package logical;

public class Problem1 {

}
public class Solution {
    public static void main(String[] args){
        Adder adder = new Adder();
        System.out.print("I implemented: ");	
        implementedInterfaceNames(adder);
        System.out.println(adder.add(60, 50) + " " + adder.subtract(60, 10));
    }
    
    /*
    *  Takes an Object and prints the name of the interfaces it implements.
    */
    static void implementedInterfaceNames(Object o) {
        Class c = o.getClass();
        Class[] theInterfaces = c.getInterfaces();                 
        System.out.println(theInterfaces[0].getName() 
            + " and " + theInterfaces[1].getName());
    }
}
