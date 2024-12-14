
interface A {

  //static interface methode should always have body

  static void greeting(){
    System.out.println("hey i am static methode in interface");
  }
    void start();
}

interface B extends A {

    void stop();
}

class C implements B {

    @Override
    public void start() {
        System.out.println("starting");
    }

    @Override
    public void stop() {
        System.out.println("stopping");
    }

}

public class class18 {
  public static void main(String[] args) {
    A.greeting(); // hey i am static methode in interface
  }
}
/*
  access modifier of overriden methods should be same or better 
  yadi parent mai protectd h to child mai public ya ussai kam restritced hona chiaye
 */
