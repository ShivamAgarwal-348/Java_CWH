class Circle{

    int radius;
    Circle(){
        System.out.println("Base Circle Constructor");
    }
    Circle(int r){
        this.radius = r;
        System.out.println("Base Circle Parameterized Constructor");
    }
    public double area(){
        return 3.14*this.radius*this.radius;
    }
}

class Cylinder extends Circle{

    int height;
    Cylinder(){
        System.out.println("Base Cylinder Constructor");
    }
    Cylinder(int r, int h){
        super(r);
        this.height = h;
        System.out.println("Base Cylinder Parameterized Constructor");
    }
    public double volume(){
        return super.area()*this.height;
    }

}

public class CWH_052 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(7, 10);
        System.out.println(c.area());
        System.out.println(c.volume());
        
    }
}
