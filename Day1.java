// collection is object that reperesents  a group of objects known as its element

//collection framework is a group of interfaces and classes that help to manage group of objects

//iterable ek main interface h jisko sbhi implements kerte h isko implement kerne per us chij per hum for each loop lga payenge

import java.util.*;

class Day1{
  public static void main(String[] args) {
      
    // list ka use tb kero jb duplicate chij order mai rkne ho

    //list ko implement ArrayList , vector, stack,linkedlist kerta h

    // key features of list is

    // order preservation
    // index based accessing 
    // duplicated value allowed

    // array mai dikkat tha jb hume pata na ho user kitna size ka input dega
    // ye arraylist ko initialise kerne per size nhi dena hota and ye dinamically size badata h

    // ArrayList<Integer> a = new ArrayList<Integer>(); //java 7 ke baad niche wala use ker slte h
    ArrayList<Integer> a = new ArrayList<>();

    a.add(4);
    a.add(42);
    a.add(45);
    a.add(47);

    System.out.println(a.get(3)); //47
    System.out.println(a.size()); //4

    for(int i=0;i<a.size();i++){
      System.out.print(a.get(i) + " "); // 4 42 45 47 
    }

    //for each loop
    System.out.println(" ");
    for(int ele : a){
      System.out.print(ele + " "); // 4 42 45 47 
    }

    System.out.println(a.contains(42)); // ismai wo element do jisko check kerna h ki list mai exist kerta h ki nhi
    
    System.out.println(a.remove(2)); //ismai wo index do jis index per ka value remove kerna h 
    // ye return kerta wo value jo remove ho rha

    System.out.println(" ");
    for(int ele : a){
      System.out.print(ele + " "); // 4 42 47 
    }

     a.add(1,50);
     //ye kuch return nhi kerta // ye wo index lega jismai value dalana h baki right shift kerke

     System.out.println("");
     
     for(int ele : a){
      System.out.print(ele + " "); // 4 50 42 47 
    }

    a.set(2,53); //ab ye lekin wo index lega jaha value ko dalna h replace kerna h means ye baki element ko right shift nhi kerega

    System.out.print(a); // ye is tarah print kerega [4, 50, 53, 47] chuki ye iterable ko implement kiya h isliye ismai to string methode  chalega
    
    // ArrayList ka initial capacity 10 hota h default 
    // lekin yadi humko apne se dena h to

    ArrayList<Integer> a2 = new ArrayList<>( 100);

    a2.trimToSize(); //internal array mai jb element delete kerege to uska size apne se gatata nhi isliye hume trimtosize kerna hoga

    List<String> a3 = new ArrayList<>();
    System.out.println(a3.getClass().getName()); // java.util.ArrayList

    List<String> a4  = Arrays.asList("Ankit","Gourav","Aryan");
    System.out.println(a4.getClass().getName()); // java.util.Arrays$ArrayList // ye normal list nhi h nested static private class h // add remove nhi ker skte

    a4.set(2,"Saktiman"); 
    System.out.println(a4); //[Ankit, Gourav, Saktiman]

    //lekin hum isko modifyable bana skte h

    List<String> a10 = new ArrayList<>(a4);
    System.out.println("idher h hum "+a10); // [Ankit, Gourav, Saktiman]
    a10.add("Billgates");
    System.out.println(a10); // [Ankit, Gourav, Saktiman, Billgates]
    a10.remove(2);
    System.out.println(a10); // [Ankit, Gourav, Billgates]

    String[] a5 = {"alok","abhisek","aman"};
    List<String> a6 = Arrays.asList(a5);
    System.out.println(a6.getClass().getName()); // java.util.Arrays$ArrayList

    // ye java 9 mai aaya tha
    List<Integer> a7 = List.of(1,2,3,4,5); // ye pichle wale se karab h chuki ismai to modify hi nhi ker skte h
    System.out.println(a7); // [1, 2, 3, 4, 5]

    ArrayList<Integer> a11 = new ArrayList<>();
    a11.add(1);
    a11.add(2);
    a11.add(3);
    a11.add(4);
    System.out.println(a11); // [1, 2, 3, 4]
    ArrayList<Integer> a12 = new ArrayList<>();
    a12.add(6);
    a12.add(7);

    System.out.println(a12); // [6, 7]

    a12.addAll(a11); // issai ek array list mai dusra arraylist daal skte h

    System.out.println(a12); // [6, 7, 1, 2, 3, 4]

    List<String> a13 = new ArrayList<>();
    a13.add("apun");
    a13.add("apun");
    a13.add("sikega ");
    a13.add("java");

    System.out.println(a13); // [apun, apun, sikega , java]

    a13.remove("apun"); //ye object le rha h means 1st apun hatega

    System.out.println(a13); // [apun, sikega , java]

    ArrayList<Integer> a14 = new ArrayList<>();
    a14.add(1);
    a14.add(2);
    a14.add(3);

    System.out.println(a14); // [1, 2, 3]

    a14.remove(1); //yaha index waala remove ker rha 

    System.out.println(a14); // [1, 3]

    //lekin humko kese pta chelga ki kb index and kb object wla call ilsiye hum apna diya gya chij object 
    //mai badal dege
    
    a14.remove(Integer.valueOf(1)); 

    System.out.println(a14); // [3]

    List<Integer> a15 = new ArrayList<>();
    a15.add(1);
    a15.add(2);
    a15.add(3);

    //list to array convert kerna 
    System.out.println(a15); // [1, 2, 3]

    Integer[] array = a15.toArray(new Integer[0]);

    for(Integer a91 : array){
      System.out.print(a91); // 123
    }

    List<Integer> a16 = new ArrayList<>();
    a16.add(8);
    a16.add(5);
    a16.add(9);
    
    Collections.sort(a16);

    System.out.println(a16); // [5, 8, 9]

    a16.add(13);
    a16.add(117);
    a16.add(10);
    
    System.out.println(a16); // [5, 8, 9, 13, 117, 10]

    a16.sort(null); // for sorting list yaha null ek comparator h

    System.out.println(a16); // [5, 8, 9, 10, 13, 117]

    // time complexity of list 

    // 0(1) for accessing byindex
    // 0(n) for adding kyuki worst case mai sbko right shift kerna ho skta h
    // 0(n) for removing kyuki worst case mai sbko left shift kerna ho skta h
    // 0(n) for traversal kyuki pura traverse kerna h
  }
}

/*
 In Java, List and ArrayList are related but serve different purposes. Here's a detailed explanation:

1. List (Interface)
Definition: List is an interface in the Java Collections Framework, part of the java.util package.

Purpose: It defines a collection that maintains an ordered sequence
 of elements (like an array) and allows duplicate elements.

Key Features:

Supports operations like adding, removing, updating, and accessing elements by index.
Allows duplicate elements.
Methods like add(), remove(), get(), and set() are defined in this interface.
Cannot Be Instantiated: Since List is an interface, you cannot create an instance of it. 
Instead, you use one of its implementing classes.

Examples of Implementing Classes:

ArrayList
LinkedList
Vector
2. ArrayList (Class)
Definition: ArrayList is a concrete class that implements the List interface.
 It uses a dynamic array to store its elements.
Purpose: Provides a resizable array implementation of the List interface.
Key Features:
Automatically resizes when elements are added or removed.
Allows random access to elements (via index) because it uses an array internally.
Not synchronized (not thread-safe), but faster in a single-threaded environment compared to synchronized collections like Vector.
Key Differences
Feature	List (Interface)	ArrayList (Class)
Type	Interface	Concrete class
Instantiation	Cannot be instantiated directly	Can be instantiated using new ArrayList<>()
Implementation	Defines behaviors that classes must implement	Provides a specific implementation of List
Flexibility	Can refer to any implementation of List	Specifically uses dynamic arrays
Example	List<Integer> list = new ArrayList<>();	ArrayList<Integer> list = new ArrayList<>();
When to Use List vs ArrayList
Use List (Interface) when:

You want to code to an interface, making your code more flexible and allowing you to switch implementations (e.g., LinkedList or ArrayList) later.
Example:
java
Copy code
List<Integer> myList = new ArrayList<>();
Use ArrayList (Class) when:

You are sure you want to use the ArrayList implementation.
You don’t need to switch to another List implementation later.
Example
java
Copy code
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Using List interface
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List: " + list);

        // Using ArrayList directly
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dog");
        arrayList.add("Cat");

        System.out.println("ArrayList: " + arrayList);
    }
}
Why Prefer List Over ArrayList?
Using List as the reference type makes your code more adaptable. For example, if you decide to switch from ArrayList to LinkedList, you only need to change the instantiation, not the type declarations.

java
Copy code
// Easy to switch implementations
List<String> myList = new LinkedList<>();
On the other hand, if you declare ArrayList specifically, you'll need to refactor more code if you want to change the implementation.







*/