public class CWH_033 {

    static int add(int ...arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        System.out.println(add());
        System.out.println(add(1));
        System.out.println(add(2, 4));
    }
}
