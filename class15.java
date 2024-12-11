public class class15 {
  int num;
  float gpa;

  public class15(int num,float gpa){
    this.num = num;
    this.gpa = gpa;
  }

  @Override
  public String toString(){ //gives string representaion 
    return super.toString();
  }

  protected void finalize() throws Throwable{ //it runs when garbage collection heats
    super.finalize();
  }

  @Override
  public int hashCode(){ // gives unique number representation of objects by doing something internally
    return super.hashCode();
  }
  // @Override
  // public int hashCode(){ // gives unique number representation of objects
  //   return num;
  // }

  @Override
  public boolean equals(Object obj){
    return this.num == ((class15)obj).num;
  }

  public static void main(String[] args) {
    class15 a1 = new class15(34 , 45.1f);
    class15 a2 = new class15(34 , 47.1f);
    System.out.println(a1.hashCode()); // 798154996 //jb return num kiye haschcode overriden mai // 34

    if(a1 == a2){
      System.out.println("a1 is equal to a2"); // ye dono a1 and a2 same object ko point ker rhai h ya nhi check kerga
    }

    if(a1.equals(a2)){
      System.out.println("a1 is equal to a2"); // ye value check kerega // a1 is equal to a2
    }

    // how to check if anything is object or not in java

    System.out.println(a1 instanceof class15); // true
    System.out.println(a1 instanceof Object); // true

    System.out.println(a1.getClass().getName()); //class15
    System.out.println(a1.getClass()); // class class15
  }
}
