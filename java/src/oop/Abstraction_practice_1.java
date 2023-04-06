package oop;

abstract class Shape{

   double dim1,dim2;
   Shape(double d1,double d2){  //constructor
       dim1=d1;
       dim2=d2;
   }
    abstract void area();   //abstract method
}

class Rectangel extends Shape{
    Rectangel(double d1,double d2){     // Rectangel constructor
        super(d1,d2);
    }

    @Override            //override shape class method
    void area() {
        double result= dim1*dim2;
        System.out.println("Rectangle area:"+result);

    }
}
class Triangle extends Shape{
    Triangle(double d1,double d2){
        super(d1,d2);
    }

    @Override
    void area() {
        double result= 0.5*dim1*dim2;
        System.out.println("Triangle area:"+result);

    }
}
class Circle extends Shape{
    Circle(double r){
        super(r,r);
    }

    @Override
    void area() {
        double result= 3.14*dim1*dim2;
        System.out.println("Circle area:"+result);

    }
}


public class Abstraction_practice_1 {

    public static void main(String[] args) {
        Shape sp;   //sp means shape class reference
        sp=new Rectangel(10,20);
        sp.area();
        sp=new Triangle(10,20);
        sp.area();
        sp=new Circle(10);
        sp.area();
    }
}
