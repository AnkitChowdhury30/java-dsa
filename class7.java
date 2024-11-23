//singlton class in java

//jiska kewal ek object bane means kewal ek baaar constructor call ho aur baki sbi reference variable ko ek hi object ka address de de
 class Singleton {

    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getinstance(){
      if(instance == null){
        instance = new Singleton();
      }
      return instance;
    }
}

public class class7 {

    public static void main(String[] args) {

      Singleton a1= Singleton.getinstance();
      Singleton a2= Singleton.getinstance();
      Singleton a3= Singleton.getinstance();

      // all three reference variable are pointing towards same object
    }
}
