import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello world");
        System.out.println("Enter a number");
        int n = in.nextInt();
        System.out.println(n);
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.println(n1+n2);
        in.close();
    }
}
