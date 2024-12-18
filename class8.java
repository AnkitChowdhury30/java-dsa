// principle of oops 

//inheritance

/*
 Inheritance:
Inheritance is a mechanism in Java where one class acquires the properties and behaviors (fields and methods) of another class. It allows for code reusability and establishes a parent-child relationship between classes. The extends keyword is used to implement inheritance.

Parent Class:
A parent class, also known as a superclass, is the class whose properties and methods are inherited by another class. It provides common functionality that can be reused or overridden by its child classes.

parent child ka chijo ko access nhi ker skte

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
    // super();  // super hamesa apne se ek ooper class ka constructor call kerta h per is class ke ooper tp koi class h nhi lekin ye Object class ko point kerega chuki java mai sbkuch Object class se nikal ker aata h
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
    //ager hum khud se ooper wala constructor na call kerte to automatically default constructor super class ka call ho jata 

    this.weight=weight;
    this.l = 2.3;
    super.l=2.4; //chuki yaaha dono use ker skte this and super keyword ko l ko access kerne ke liye chuki wo to parent se child mai aaya h lekin super ka fayda tb hoga jb parent and child dono mai same name ka variable weigth ho to parent ka refer kerne ke liye super.weight and child ka access kerne ke liye this.weight

    // super(l, w, h); //yaha per dene per error dega chuki super class ko chlld class kuch nhi pta h isliye wo apne kko baanayega lekin child hamesha super ko ooper rakgea
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

    // type of reference variable decide kerega na ki constructor ki kon sa members access ho payenge jaise
    Box a3 = new BoxWeight(3.3, 4.0, 4.5, 6.0);
    // System.out.println(a3.weight); // error: cannot find symbol

    // there are many variables in both parent and child classes
    // you are given access to variables that are in the ref type i.e. BoxWeight
    // hence, you should have access to weight variable
    // this also means, that the ones you are trying to access should be initialised
    // but here, when the obj itself is of type parent class, how will you call the constructor of child class
    // this is why error       
    BoxWeight a4 = new BoxWeight();
  }
}
