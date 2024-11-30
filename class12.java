class A{
  static void greet(){
    System.out.println("from class a");
  }
}

class B extends A{
  // @Override
  static void greet(){                       //static methode cant be oveeriden chuki static to object per depend nhi kerta 
   //wo to super class  per depend kerega isliye yaha per ye methode nhi likne per super class A ka greeet call hoga
    System.out.println("from class B");          
  }
}

public class class12 {
  public static void main(String[] args) {
    A a= new B();
    a.greet(); // from class a // hona to B ka chiaye tha lekin chuki static object per depend nhi kerta h ilsiye wo parent ka call ho jayega
  }
}

//***********************  static methode can be inheritated but cant be overriden */

//overriding depend on object static dont depend on object hence static methode cant be overriden
