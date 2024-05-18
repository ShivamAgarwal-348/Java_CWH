import java.util.Scanner;
public class CWH_019 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Q2

        // int[] marks = new int[3];
        // int total = 0;
        // for (int i = 0; i < marks.length; i++) {
        //     marks[i] = sc.nextInt();
        //     total += marks[i];
        // }
        // if(total < 120){
        //     System.out.println("Fail");
        // }
        // else{
        //     if(marks[0] < 33 || marks[1] < 33 ||marks[2] < 33){
        //         System.out.println("fail");
        //     }
        //     else{
        //         System.out.println("Pass");
        //     }
        // }

        // Q6

        String url = sc.next();
        if(url.endsWith("org")){
            System.out.println("Organization");
        }
        else if(url.endsWith("in")){
            System.out.println("Indian");
        }
        else if(url.endsWith("com")){
            System.out.println("Commercial");
        }


    }
}
