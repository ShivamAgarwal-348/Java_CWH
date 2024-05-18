import java.util.Scanner;
import java.util.Random;

class Game{

    int randomNo;
    int noofGuesses;

    Game(int n){
        Random rand = new Random();
        randomNo = rand.nextInt(10);
        noofGuesses = n;
        takeUserInput();
    }

    public void takeUserInput(){
        if (noofGuesses <= 0){
            System.out.println("You Lose");
            
            return;
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(isCorrectAnswer(n)){
            System.out.println("You Win");
            sc.close();
            return;
        }
        else{
            noofGuesses--;
            takeUserInput();
        }
        sc.close();
        
    }

    private boolean isCorrectAnswer(int n){
        if(n == randomNo){
            return true;
        }
        else{
            return false;
        }
    }
}
public class CWH_043 {
    
    public static void main(String[] args) {
        Game g = new Game(5);
        
    }
}
