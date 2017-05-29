/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverridinginheritance;

/**
 *
 * @author tiago.lucas
 */
public class MethodOverridingInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        B subOb = new B(1,2,3);
        subOb.show(); // this calls show() in B
        //super.show(); //error cause this class does not have nobody Super Class
    }
    
}
