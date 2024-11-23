// principle of oops 

//inheritance

/*
 Inheritance:
Inheritance is a mechanism in Java where one class acquires the properties and behaviors (fields and methods) of another class. It allows for code reusability and establishes a parent-child relationship between classes. The extends keyword is used to implement inheritance.

Parent Class:
A parent class, also known as a superclass, is the class whose properties and methods are inherited by another class. It provides common functionality that can be reused or overridden by its child classes.

Child Class:
A child class, also known as a subclass, is the class that inherits from another class. It can use the properties and methods of the parent class and can also define additional properties and methods or override parent class methods.
*/

//private keyword wala chij ko kewal usi file mai access ker skte h

class Box{
  double l;
  double w;
  double h;
  Box(){
    this.l=-1;
    this.h=-1;
    this.w=-1;
  }

  //cube
  Box(double side){
    this.l=side;
    this.h=side;
    this.w=side;
  }

  //Box
  Box(double l, double w, double h) {
    this.l = l;
    this.w = w;
    this.h = h;
  }

  Box(Box other){
    this.l=other.l;
    this.w=other.w;
    this.h=other.h;
  }
  public void information(){
    System.out.println("hello from box");
  }
}

class BoxWeight extends Box{
  double weight;
  public BoxWeight(){
    this.weight=-1;
  }

  public BoxWeight(double l,double w , double h , double weight){
    super(l, w, h); // calls super class constructor // used to initialize value present in parent class
    this.weight=weight;
  }
}

public class class8 {
  public static void main(String[] args) {
    Box a= new Box();
    System.out.println(a.l + " " + a.w + " " + a.h); //-1.0 -1.0 -1.0

    Box b= new Box(4);
    System.out.println(b.l + " " + b.w + " " + b.h); //4.0 4.0 4.0

    Box c= new Box(4.4,5.5,6.6);
    System.out.println(c.l + " " + c.w + " " + c.h); //4.4 5.5 6.6

    BoxWeight a1 = new BoxWeight();
    System.out.println(a1.h + " "+a1.weight); //-1.0 -1.0

    BoxWeight a2=new BoxWeight(1.2,2.3,3.4,4.5);
    System.out.println(a2.l +" "+a2.w+" "+a2.h + " "+a2.weight); //1.2 2.3 3.4 4.5
  }
}
