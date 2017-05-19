/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsafesemaphore;

/**
 *
 * @author dylan
 */
import java.util.concurrent.locks.ReentrantLock;
public class ThreadSafeSemaphore implements Runnable{
private int count = 0;
private ReentrantLock lock;

public ThreadSafeSemaphore()
 {    
   lock = new ReentrantLock();  
 }
    
public void run()
    {
        try
        {
            lock.lock();
            for(int i = 0; i < 10; i++)
            {
                
                System.out.println("The lock is now in place");
                count++;
                System.out.println("The value of counter is:" + count + " .");
            }
        }
        finally
        {
            lock.unlock();
            System.out.println("Lock is unlocked");
        }  
    }   
}
