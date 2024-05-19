import java.util.Scanner;

class MaxTriesUsed extends Exception{

    @Override
    public String getMessage() {
        return "Custom Getmessage";
    }

    @Override
    public String toString() {
        
        return "Custom ToString";
    }
    
}

public class CWH_086 {

    public static void loop() throws MaxTriesUsed{
        int i = 0;
        int j;
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while(i < 5 && !flag){
            try {
                j = sc.nextInt();    
                System.out.println(5/j);
                flag = true;
            } 
            catch (Exception e) {
                i++;
                System.out.println(e);
            }
        }
        if(!flag){
            throw new MaxTriesUsed();
        }
    }
    public static void main(String[] args) {

        try {
            System.out.println(3/0);
        } 
        catch (ArithmeticException e) {
            System.out.println("haha");
        }
        catch(IllegalArgumentException e){
            System.out.println("Hehe");
        }
        catch(Exception e){
            System.out.println(e);
        }

        try {
            loop();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
