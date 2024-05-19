import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "InvalidInputException";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "MaxInputException";
    }
}
class MaxMultiplierReacedException extends Exception{
    @Override
    public String toString(){
        return "MaxMultiplierReacedException";
    }
}

class Calculator{

    int a;
    int b;

    public void input() throws InvalidInputException, MaxInputException{
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();
            b = sc.nextInt();
        }
        catch(Exception e){
            throw new InvalidInputException();
        }
        if(a > 10000 || b > 10000){
            throw new MaxInputException();
        }
    }

    public int add(){
        try {
            input();
        } catch (Exception e) {
            System.out.println(e);
        }
        return a+b;
    }
    public int sub(){
        try {
            input();
        } catch (Exception e) {
            System.out.println(e);
        }
        return a-b;
    }
    public int multiply() throws MaxMultiplierReacedException{
        try {
            input();
            if(a > 7000 || b>7000){
                throw new MaxMultiplierReacedException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return a*b;
    }
    
}
public class CWH_087 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        
    }
}
