public class class4 {
  public static void main(String[] args) {
	  class3 a1 = new  class3("Ankit",21);
	  class3 a2 = new  class3("Aryan",23);
	  class3 a3 = new  class3("Alok",22);
		
		System.out.print  (class3.population); //static variable ko hamesa class ka naam . kerke access kerna
    //main function is static because it has to run before any object is of class
		
		//static mathod mai static chodker kuch nhi rahgea
		// greet();

    class4 a19 = new class4();
    a19.fun2();
	}
	
	static void fun() {
		// greet(); //its cant used here because static chij instance per depend nhi kerta h or ye jo bana h wo instance per depend kerta h

    //we cant access non static stuff inside static stuff without referencing their instance
    class4 a1 = new class4();
    a1.greet();
	}

  void fun2(){ //yaha chuki ye fun2 ek non static function h isliye isko kerne ke liye object to banega isliye ismai greet ke liye refeence nhi dalna pada
    greet();
  }
	
	void greet() {
		System.out.print("hello namune");
	}

}