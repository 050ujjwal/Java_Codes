import java.util.*;
import Bank;

class shapes{
    public void area(){
        System.out.println("displaying area");
    }
}

class Triangle extends shapes{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class Inheritance {
    public static void main(String arsgs[]){
        Triangle t1=new Triangle();
        
    }
}
