class Thread1 extends Thread{

    @Override
    public void run() {
        
        while (true) {
            System.out.println("Good Morning");
        }
    }
    
}

class Thread2 extends Thread{

    @Override
    public void run() {

        try {
            Thread.sleep(200);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        while (true) {
            System.out.println("Welcome");
        }
    }
    
}
public class CWH_076 {
    public static void main(String[] args) {
        
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        // t1.start();
        // t2.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getState());
               
        
    }
}
