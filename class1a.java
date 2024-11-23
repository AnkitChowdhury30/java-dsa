public class class1a {
  public static void main(String[] args) {
      int a=10;
      int b=20;
      swap(a,b);
      System.out.println(a+" "+b); //10 20

      Integer a1=10;
      Integer a2=20;
      swap(a1,a2);
      System.out.println(a1+" "+a2); //10 20
      
      final int bonus=2;
      // bonus=4;
      System.out.println(bonus); //error: cannot assign a value to final variable bonus

      final A Ankit=new A("Ankit");
      Ankit.name = "Aryan";
      System.out.println(Ankit.name); //Aryan

      //when a non premitive is final we cant reassign to this

      // Ankit = new A("Gourav"); // ye nhi ker skte  //error: cannot assign a value to final variable Ankit

      A obj;
      for(int i=0;i<50;i++){
        obj = new A("random name");

      }

  }
   static  void swap(int a,int b){
    int temp=a;
    a=b;
    b=temp;
  } 
}

class A{
  final int num=10;
  String name;

  A(String name){
    this.name = name;
  }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objects is destroyed");
    }

  
}

/*

java mai hamesa premitive object nhi hota isliye isko swap kerne per pass by value hota h

lekin Integer to object hota isko pass kerne per pass by refernce hota h fir bhi value swap nhi hua kyuki Integer mai values final keyword se bante h aur Integer ek wrapper class h


final is a keyword which prevent your content to modify //always initailise when declaring
final ensures we cant change the value when its premitive datatype but when its object we can change the vlaue of its

we can decide manually  what do when object is destroyed 
but we cant destroy object manually
object jb bhi ktm hoga garbage collection ke saath finalize keyword call hoga
*/