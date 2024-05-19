class Thread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 40000; i++) {
            System.out.printf("Thread1 %d", i);    
        }
        
    }
}
class Thread2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 40000; i++) {
            System.out.printf("Thread2 %d", i);    
        }
        
    }
}

public class CWH_070 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();       
        
    }
}
