
// class Test {
//   static String name;

//   public Test(String name){
//     this.name = name;
//   }

// }

public class class6 { //outside class cant be static 

    // class Test {
    //   String name;

    //   public Test(name){
    //     this.name = name;
    //   }

    // }

    static class Test { // statci jaha bhi hoga uske parent class ka object per depend nhi kerega lekin uska khud ka object ho skta h jese yaha per hua h Test ka do object h donno ka naam ka value alg alg h
       String name;

      public Test(String name){
        this.name = name;
      }
      
      @Override
      public String toString(){ //chuki har class ke pass tostring method hota h jo tb run kerta h jb uska kewal object ko print kerte h jikso hum yha override ker diye
        return name;
      }
    }

    public static void main(String[] args) {
      Test a = new Test("Ankit"); // chuki Test class jab static nhi lenge to uska object banana depnend kerega class6 ka object banane ke ooper 
      Test b = new Test("Aryan");

      // System.out.println(a.name); //Aryan 
      // System.out.println(b.name); //Aryan jb bahar mai class Test banaye
      System.out.println(a.name); //Ankit 
      System.out.println(b.name); //Aryan jb andar mai Test class ho

      System.out.println(a);
    }
}

/*
 chuki static stuff like variable method class ye sb object per nhi depend kerte h isliye ye compile time per reaolve ho jate h

 */