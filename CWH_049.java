class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class CWH_049 {
    public static void main(String[] args) {

        Phone obj = new SmartPhone(); // Yes it is allowed, called Upcasting
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.showTime();
        obj.on(); // Will display the method from smartphone class.
        // obj.music(); Not Allowed


    }
}
