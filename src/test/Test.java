/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author test
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter email");
        String s1=sc.next();
        char[] c1=s1.toCharArray();
        int state=0;
        for(int i=0;i<c1.length;i++)
        {
        //    switch(state){
          //      case 0:
                if(c1[i]=='@')
            System.out.println("@ found");
         
            
            //}
            }
        /*
        while(!sc.hasNext("@"))
        {
        System.out.println("not found");
        sc.next();
        }
        String s=sc.next();
        System.out.println("@ found");
    */
                }
    
}
