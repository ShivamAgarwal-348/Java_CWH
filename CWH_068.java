// package com.codewithharry.shape;
public class CWH_068 {
    
    public static void main(String[] args) {
        
    }
}

class Circle{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public double area(){
        return Math.PI*this.r*this.r;
    }
}

class Cylinder extends Circle{
    int h;

    public Cylinder(int r, int h) {
        super(r);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public double volume(){
        return this.area()*h;
    }
}
class Sphere extends Circle{

    
    public Sphere(int r) {
        super(r);
    }
    public double volume(){
        return this.area()*4/3*this.r;
    }
}