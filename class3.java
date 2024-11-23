

public class class3 {
  int age;
	String name;
	static int population;

  static void message(){
    System.out.println("Hello bro 123");
    // System.out.println(this.name); cant use this keyword in static stuff
  }
	
	class3(String name , int age){
		this.name=name;
		this.age=age;
	}
}
