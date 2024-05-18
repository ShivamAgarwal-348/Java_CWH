import java.util.Scanner;
public class CWH_15 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // Q1

        String s1 = s.toLowerCase();
        System.out.println(s1);

        // Q2

        String s2 = s.replace(" ", "_");
        System.out.println(s2);

        // Q3
        String letter = "Dear <|name|>, Thanks a lot";
        String s3 = letter.replace("<|name|>", s);
        System.out.println(s3);

        
    }
}
