import java.util.Scanner;

public class CWH_06 {

    public static void main(String[] args) {
        
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        float percentage = sum/5f;
        System.out.println(percentage);
        System.out.println(sum);
        sc.close();
        
    }
}