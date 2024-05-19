// package CWH._060;
abstract class Pen {

    abstract void write();
    abstract void refill();
        
}

class FountainPen extends Pen{

    public void changeNib(){
        System.out.println("Changing FountainPen Nib");
    }
    @Override
    public void write(){
        System.out.println("FountainPen Writes");
    }
    public void refill(){
        System.out.println("Refilling FountainPen");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

abstract class Monkey{
    abstract void jump();
    abstract void bite();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Human eats");
    }
    public void sleep(){
        System.out.println("Human sleeps");
    }
    public void jump(){
        System.out.println("Human jumps");
    }
    public void bite(){
        System.out.println("Human bites");
    }
}

public class CWH_060 {
    public static void main(String[] args) {
        
        Human h = new Human();
        h.bite();
        h.eat();
        h.jump();
        h.sleep();

        BasicAnimal b = new Human();
        b.eat();
        b.sleep();
        // b.bite();

        Monkey m = new Human();
        m.bite();
        m.jump();
        // m.eat();
        
    }
}

