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
public class B extends A{
    int k;
    public B(int a, int b, int c) {
        super(a, b);
        k=c;
    }
    @Override
    void show(){
        super.show(); //calling method show() in A
        System.out.println("k: "+k);
    }
    
}
