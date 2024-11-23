
import java.util.Arrays;

public class class1{
  public static void main(String[] args) {
    //store 5 roll numbers
    // int[] numbers = new int[5];

    //store 5 names
    // String[] names = new String[5];

    //every students have roll no name marks
    // int[] roll = new int[5];
    // String[] names  = new String[5];
    // float[] marks=new float[5];

    //class is grouped name of properties and function
    Student[] students=new Student[5];

    // declaring a reference variable
    Student student1;
    System.out.println(Arrays.toString(students));  //[null, null, null, null, null]

    //object jb initialize nhi hota h to uska value null hota
    // student1 = new Student(); // dynamically allocates memory and return a refernece variable to it

    Student Ankit = new Student();
    System.out.println(Ankit); //Student@28a418fc // random value
    System.out.println(Ankit.rollno); // 0
    System.out.println(Ankit.names); // null
    System.out.println(Ankit.marks); // 0.0

    Ankit.rollno =30;
    Ankit.names = "Ankit";
    Ankit.marks = 8.0225f;
    System.out.println(Ankit.rollno); // 30
    System.out.println(Ankit.names); // Ankit
    System.out.println(Ankit.marks); // 8.0225
    Ankit.greeting(); //Hello my name is Ankit
    Ankit.changeName("Ritika"); //Hello my name is Ritika
    Ankit.greeting();

    Student Gourav = new Student(03,"Gourav Pandey",8f);
    System.out.println(Gourav.rollno); //0
    System.out.println(Gourav.names); // null
    System.out.println(Gourav.marks); //0.0

    // after using consturctor with this keyword
    System.out.println(Gourav.rollno); //3
    System.out.println(Gourav.names); // Gourav pandey
    System.out.println(Gourav.marks); // 8.0

    Student Aryan = new Student(Gourav);
    System.out.println(Aryan.rollno); //3
    System.out.println(Aryan.names); // Gourav pandey
    System.out.println(Aryan.marks); // 8.0

    Student Alok = new Student();
    System.out.println(Alok.rollno); //388
    System.out.println(Alok.names); // Abhisek
    System.out.println(Alok.marks); // 7.9

    Student one = new Student();
    Student two=one;
    two.names= "Something something";
    System.out.println(one.names); //Something something
  }


}
  //create class
  class Student{
    int rollno;
    String names;
    float marks;

    // we need a way to access these variable for every objects
    
    // constructor
    Student(){

      //this is how you can call a constructor from a constructor

      this(388,"Abhisek",7.9f);

      // this.rollno =30;
      // this.names = "Ankit";
      // this.marks = 8.0225f;

      
    }

    void greeting(){
      // System.out.println("Hello my name is "+names);
      System.out.println("Hello my name is "+ this.names); //whenever we try to acccess any values of any objects we use this keyword ye this keyword apne present rhega ye this kewal this ke jagah us object ka reference variable rk dega
    }

    void changeName(String newName){
      names=newName;
    }
     // ek class mai 2 ya 2 se jayda constuctor banana constructor overloading

    // Student(int rollno,String names, float marks){
    //   rollno=rollno;  // means jb bhi hum same names se value access kerna chahe to 
    //   names=names;
    //   marks=marks; 
    // }
    Student(int rollno,String names, float marks){
      this.rollno=rollno; 
      this.names=names;
      this.marks=marks; 
    }

    Student(Student other){
      this.rollno=other.rollno;
      this.names=other.names;
      this.marks=other.marks;
    }
  }
/* 
 notes made by ankit
 
 class is template of objects
and objects is instance of a class

class is a logical construct 
object is a physical reality . its something that occupies space on memory 

objects is store in heap memory and reference variable is store in stack memory

instance vriable is inside the objects is called instance variable

A reference variable in Java is a variable that stores the memory address of an object, allowing you to access and change the object's data and behavior

Student student1; // ye compile time pe hoga
=new Student(); // ye runtime mai hoga

// Student() // constructor  = what happens when you create a object // it is a special type of functioin which is present in class which runs when you create a object and assigns some value to your objects //
constructor dont have return type

// in java premitives are not objects so that are stored in stack memory // this is done so that it can be accessd fastly

*/
  