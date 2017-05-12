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

/*--------------------------othThread class begins.----------------------*/
//this class basically tells child thread their purpose. 

class othThread implements Runnable {
Thread t1;
String thread_name;
float f;
int w;
int a;                                         //used to identify cases in switch case

othThread()
{}
othThread(String name)
    {
        f=0;
        w=0;
        a=0;
    thread_name=name;
          
    }
public void run()
   {
      
   System.out.println("running "+thread_name);
  
  switch(a)
  {
      case 1:                                             //print integer values;
       { try
             {
                 for(int q =w;q<13;q++)
                          {
                                System.out.println("thread "+thread_name+"-"+q+" exiting");
                           }
             }
         catch(Exception e)
                              {
                                 System.out.print(e);
                              }
      }break;
      
   
      case 2:                                           //print floating values;
      
      { try
                {
                   for(float q =f;q<13.0;q=(float) (q+0.5))
                            {
                                 System.out.println("thread "+thread_name+"-"+q+" exiting");
                            }
  
                }    
         catch(Exception e)
                {
                    System.out.print(e);
                }
      }break;
   
}
   }
    
    
    public void start1(int i)               //this function select the printing of integer values by calling run() 
                                            //with a=1(used for switch case).
    {
        a=1;
        w=i;
    System.out.println("Starting " +  thread_name );
      if (t1 == null)
      {
         t1= new Thread (this, thread_name);
         t1.start ();
      }
    }
    
    public void start2(int i)                //this function select the printing of floating point values by calling run() with a=2.
    {
        a=2;
        f=(float)i;
    System.out.println("Starting " +  thread_name );
      if (t1 == null)
      {
         t1= new Thread (this, thread_name);
         t1.start ();
      }
    }
} 
/*----------------othThread class ends.--------------------*/




/*----------------making child thread, mkThread class begins.----------------*/

class mkThread extends othThread implements Runnable 
{ int i=0;
    Thread t1;
   String thread_name;
    
   mkThread(String name)
    {
    thread_name=name;
    System.out.println("creating "+thread_name);
    }
    
   public void run()                                //tz1 calls start() which in turn calls this run().
   {
       
   System.out.println("running "+thread_name);
   try
   {
   for( i=0;i<10;i++)
   {
   System.out.println("thread "+thread_name+"-"+i); //main thread print values from 0 to 9. 
   }
   if(i==10)                                        //at i=10,
   {                                                //two child threads are created
   othThread th1=new othThread("OthThread-2");
   th1.start1(i);                                   //th1 calls start1() of othThread
   othThread th2=new othThread("OthThread-3");
   th2.start2(i);                                   //th2 calls start2() of othThread
   
   }
   }
   catch(Exception e)
   {
   System.out.print(e);
   }
   }
   
   public void start()                                //tz1 calls this start() 
   {
    System.out.println("Starting " +  thread_name );
      if (t1 == null)
      {
         t1= new Thread (this, thread_name);
         t1.start ();                                   
      }
    }
}

//make child thread,mkthread class ends.

//now the main class which test the therad function begins.

public class test_thread {
    
    public static void main(String args[])
    {
    mkThread tz1=new mkThread("thread-1");                  //creating instance of mkThread class
    tz1.start();                                            //main thread starts. 
    
    
    }
    
}
//main class ends.