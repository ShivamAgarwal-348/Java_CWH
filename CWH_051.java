import java.util.Scanner;

class Library{

    String[] availableBooks;
    String[] issuedBooks;

    Library(){
        availableBooks = new String[10];
        issuedBooks = new String[10];
        for (int i = 0; i < availableBooks.length; i++) {
            availableBooks[i] = "";
            issuedBooks[i] = "";
        }
    }

    public void issueBook(String s){
        for (int i = 0; i < availableBooks.length; i++) {
            if(availableBooks[i].equalsIgnoreCase(s)){
                availableBooks[i] = "";
                System.out.println("Book Issued");
                addIssueBook(s);
                break;
            }
        }
        System.out.println("Book not available");
    }
    public void returbBook(String s){
        for (int i = 0; i < issuedBooks.length; i++) {
            if(issuedBooks[i].equalsIgnoreCase(s)){
                issuedBooks[i] = "";
                System.out.println("Book returned");
                addBook(s);
                break;
            }
        }
        System.out.println("Book not issued");
    }
    
    public void addBook(String s){
        for (int i = 0; i < availableBooks.length; i++) {
            if(availableBooks[i].isEmpty()){
                System.out.println("Book added to available books");    
                availableBooks[i] = s;
                break;
            }
        }
    }   
    public void addIssueBook(String s){
        for (int i = 0; i < issuedBooks.length; i++) {
            if(issuedBooks[i].isEmpty()){
                System.out.println("Book added to Issued books");    
                issuedBooks[i] = s;
                break;
            }
        }
    } 
    public void showAvailableBooks(){
        for (String string : availableBooks) {
            System.out.println(string);
        }
    }

}

public class CWH_051 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        boolean flag = true;
        while (flag) {
            int userInput = sc.nextInt();

            switch (userInput) {
                case 0: 
                    String bookname = sc.next();
                    lib.addBook(bookname);
                    break;
                case 1:
                    String bookissuename = sc.next();
                    lib.issueBook(bookissuename);
                    break;
                case 2:
                    String bookreturnname = sc.next();
                    lib.returbBook(bookreturnname);
                    break;
                case 3:
                    lib.showAvailableBooks();
                    break;
                default:
                    flag = false;
                    break;
            }
        }
        sc.close();
    }
}
