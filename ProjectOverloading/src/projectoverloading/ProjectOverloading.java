/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoverloading;

/**
 *
 * @author user
 */
public class ProjectOverloading {

    /**
     * @param args the command line arguments
     */
    void myMethod() {
        System.out.println ("Hello");
    }
    
    void myMethod (int x) {
        System.out.println ("Holla");
    }
    
    void myMethod (double x) {
        System.out.println ("Hollo");
    }
    
    void myMethod (int x, double y) {
        System.out.println ("Hullo");
    }
    
    String myMethod (double x, int y){
        return "Hello";
    }
    
    void myMethod(int a, int b) {
        System.out.println ("Hollli");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyClass1 m = new MyClass1();
        m.myMethod();
        m.myMethod(1, 20);
        m.myMethod(2, 2.0);
    }
    
}
