@FunctionalInterface
interface functionalInterface{
    public void meth1(int a);
}
public class CWH_109 {

    public static void main(String[] args) {
        // Anonymous Class
        functionalInterface obj1 = new functionalInterface() {
            public void meth1(int a){
                System.out.println(a);
            }
        };
        obj1.meth1(5);

        // Lambda Expression
        functionalInterface obj2 = (a)->{
            System.out.println(a);
        };
        obj2.meth1(4);
    }
}