
class A1 {

    public interface NestedInterface { // nested interface can be public private or protected // but top level can public or defualt

        boolean isOdd(int num);
    }
}

class B2 implements A1.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}

public class class19 {

    public static void main(String[] args) {
        B2 obj = new B2();
        System.out.print(obj.isOdd(5)); // true
    }
}
