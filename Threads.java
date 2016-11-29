
package threads;

/**
 *
 * @author jeriabegglen
 */
public class Threads {
    public static void main(String[] args) {
        (new Thread (new HelloRunnable())).start();
        (new HelloThread()).start();
        Runnable r1= new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Hello from " + 
                        Thread.currentThread().getName() + " NOT USING LAMBDA");
            }
        };
        Runnable r2 = () -> System.out.println("Hello from " + 
                Thread.currentThread().getName() + " USING LAMBDA" + " notation");
        Thread t1 = new Thread(r1, "Thread t1");
        t1.start();
        
        Thread t2 = new Thread(r2);
        
        t2.start();
        
    }
    
}
