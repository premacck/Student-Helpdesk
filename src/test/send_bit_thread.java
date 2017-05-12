/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author test
 */
public class send_bit_thread extends Thread {
    Thread t;
    float value ;
    String name;
    
    public void starting_thread(float v,String n )
    {
        
        name=n;
    
    this.t.setName(name);
    this.value=v;
    this.t.start();
    }
    
    
    
}
