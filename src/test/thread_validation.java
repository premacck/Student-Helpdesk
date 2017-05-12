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
public class thread_validation {
    
    //String s1[];
   // String s2[];
    
    
    public int val()
    {
    String delimiter =",";  
            String q=thread_exp.jTextField2.getText();
            String w=thread_exp.jTextField3.getText();
            String temp[]=q.split(delimiter);
            String temp1[]=w.split(delimiter);
            
            if(temp.length==temp1.length)
            {
                int n=temp.length;
            thread_exp.jLabel6.setText("no. of parameters matched,now you can click send bitcoin button");
            thread_exp.jButton1.setVisible(true);
            thread_exp.jButton3.setVisible(false);
            return n;
            
            }
            else
                thread_exp.jLabel6.setText("no. of parameters do not match please check again");
    return 0;        
    }
    
}
