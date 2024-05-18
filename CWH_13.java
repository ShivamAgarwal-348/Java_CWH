public class CWH_13 {
    

    public static void main(String[] args) {
        
        char[] ch = {'S', 'H', 'I', 'v', 'a', 'm'};
        String s = new String(ch);
        System.out.println(s);

        String s1 = "SHIvam";
        String s2 = new String("SHIvam");

        System.out.println(s == s1);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.printf("Hello %s", s);
    }
}
