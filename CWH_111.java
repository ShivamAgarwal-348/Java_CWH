import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_111 {
    public static void main(String[] args) {
    
        File myFile = new File("test.txt");
        try {
            myFile.createNewFile();
            System.out.println("File Created Succesfully");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("Abra\nKa\nDabra");
            fileWriter.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }

        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
