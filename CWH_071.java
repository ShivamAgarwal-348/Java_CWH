class Thread3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 40000; i++) {
            System.out.printf("Thread3 %d", i);
        }
    }    
}
class Thread4 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 40000; i++) {
            System.out.printf("Thread4 %d", i);
        }
    }    
}
public class CWH_071 {
    public static void main(String[] args) {
        Thread3 obj1 = new Thread3();
        Thread4 obj2 = new Thread4();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
