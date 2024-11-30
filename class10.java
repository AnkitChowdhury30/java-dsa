class Shape{
  void area(){
    System.out.println("I am in shape");
  }
  // final void area(){ // error dega means ye final methode ko override hone nhi deta h // early binding
  //   System.out.println("I am in shape");
  // }
}

class Circle extends  Shape{


  @Override //this is annotation  --> it is used to check kya methode overriden h ya nhi yaadi methode overriden 
  //nhi hoga to red underline ho jayega
  void area(){  // this will run when object of circle is created hence it is overriding the parent mathode
    System.out.println("Area is 0.5 * r * r");
  }
}

class Square extends Shape{
   void area(){
    System.out.println("Area is a * a");
  }
}
class rectangle extends Shape{
  void area(){
    System.out.println("Area is a  * b");
  }
}

public class class10 {
  public static void main(String[] args) {
    Shape a= new Shape();
    Circle c=new Circle();
    // Square s =new Square();
    a.area(); //I am in shape
    c.area(); // Area is 0.5 * r * r
    // s.area(); // Area is a * a

    Shape s =new Square();
    s.area(); // Area is a * a
  }
}

/*
      polymorphism --> poly means many ways to represent

      types of polymorphism 

      1) compile time or static polymorphism achieved by methode overloading  ( same name methods having different type,arguments ,return typr etc) 

      because it will check on compile time which function to call

      ex --> multiple constructors

      A a = new A();
      A a2 = new A(1,"Ankit");

      2) runtime  or dynamic polymorphism acheived by methode overriding ( same namw ,parameter type ,return type but only body of function is different )
*/
