abstract class parent {

  // no abstract constructor in it
  // no abstract static in it
  // if atleast one methode is abstract class need to be declared as abstract 
  int age;
  abstract void  career();
  abstract void partner(); // ager hum jante ki methods ko subclass mai override kerna hi h to use abstarct bana do

  public parent(int age){
    this.age=age;
    System.out.println("Hello from prenet ka constructor");
  }
 
  static void hello(){  // ye ker skte h 
    System.out.println("hello from abstract class");
  }
  //  abstract static void greeting(){  // ye nhi ker skte h 
  //   System.out.println("hello from abstract class");
  // }

  // abstract parent(); // error means hum abstract class ka abstaract constructor nhi bana skte

  void normal(){
    System.out.println("Hello i am normal function");
  }
}

class son extends parent{

  public son(int age){
    super(age);
  }

  @Override
  void career(){
    System.out.println("My name is Ankit");
  }
  @Override
  void partner(){
    System.out.println("I love my mummy");
  }
}
class daughter extends parent{

  public daughter(int age){
    super(age);
  }

  @Override
  void career(){
    System.out.println("My name is Ritika");
  }
  @Override
  void partner(){
    System.out.println("I love papa");
  }
}

public class class16 {
  public static void main(String[] args) {
    son s = new son(23); // Hello from prenet ka constructor
    s.career();

    daughter d = new daughter(34); // Hello from prenet ka constructor
    d.career();

    parent.hello(); // hello from abstract class

    // parent p =new parent(12); // error

    //hum bhale hi abstract class ko object nhi bana skte lekin hum abstract class ka name ko reference variable ke jesa use ker skte h
     
    parent d2 = new daughter(56); // Hello from prenet ka constructor
    d2.career(); // My name is Ritika
  }
}

/*
  kai bar aisa hota ki parent class bataata h what to do but not how to do 
  means parent mai kewal methode ka declaaration hoga body nhi hoga
  inko abstract mathode kahenege
  ager parent ke pass body nhi h to child classs body dega
  hum chahenge ki child class sbi neceessary methode ko override kere
  yadi class mai ek bhi abstractmethode ho to class abstract declare kerna hoga

  hum abstract class ka constructor bana skte h lekin hum abstraxt class object nhi bana skte h

  hum abstract class ka object isliye nhi bana skte kyuki yadi 
  bana liye to carreer methode ko kese call kernege jbki uska body hi nhi h

  static methode overriden nhi ho skta isliye hum abstract static methode nhi bana skte abstract class mai 

  lekin hum abstarct class mai static methode bana skte h

  chuki class ke pahele final likne per class inherite nhiker skte h isliye final abstract class nhi bana skte

  abstract class doesnot support multiple inheritance 
 */
