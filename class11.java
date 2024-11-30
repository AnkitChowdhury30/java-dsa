// compile time polymorphism method overloading

class Numbers {

    // int sum(int a, int b) {
    //     return a + b;

    // }
    double sum(double a,int b){ //yaha bhale hi hum main method mai int value pass ker rhai yaha implicitly 
      //int double mai compiler bana de rha h
      return a+b; 
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class class11 {

    public static void main(String[] args) {
        Numbers n = new Numbers();
        System.out.println(n.sum(3, 3));
    }
}

/*
    parent obj = new child();
                      ^
                      |
                      |
                      which methode will be called depends on this this is AKA upcasting

    ex ==> Shape s= new Circle();
           s.area(); kerne per circle ka area methode call ho rha tha kyuki Shape decide kerega ki kon methode ka permission h 
           lekin kon sa version run hoga ye decide hoga dynamic methode dispatch se ismai jb prgram run kerega tb object ke basis 
           per kon sa area ka version ccall hoga ye decide hga

           chuki dynamic methode dispatch program ke run hone peer chalgea isliye isse late binding kahenge

           or final keyword laga dene per early binding hone lagegea

    jese hi hum kisi class ko final kernege to uske methods automatically final ho jaynege
 */