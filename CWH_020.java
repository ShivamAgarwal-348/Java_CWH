import java.util.Scanner;
import java.util.Random;
public class CWH_020 {
    
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        String[] choices = {"Rock", "Paper", "Scissors"};
        int compChoice = rand.nextInt(3);
        System.out.println(compChoice);
        String userChoice = sc.next();
        
        if(compChoice == 0){
            if(userChoice.equals(choices[1])){
                System.out.println("You Win");
            }
            else if(userChoice.equals(choices[2])){
                System.out.println("You Lose");
            }
            else{
                System.out.println("Draw");
            }
        }
        else if(compChoice == 1){
            if(userChoice.equals(choices[2])){
                System.out.println("You Win");
            }
            else if(userChoice.equals(choices[0])){
                System.out.println("You Lose");
            }
            else{
                System.out.println("Draw");
            }
        }
        else{
            if(userChoice.equals(choices[0])){
                System.out.println("You Win");
            }
            else if(userChoice.equals(choices[1])){
                System.out.println("You Lose");
            }
            else{
                System.out.println("Draw");
            }
        }
        sc.close();
    }
}
