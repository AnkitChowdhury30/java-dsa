import java.util.Scanner;

public class ArrayAndArrayList_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= new int[5];
        arr[0]=13;
        arr[1]=45;
        arr[2]=90;
        arr[3]=12;
        arr[4]=43;
        System.out.println(arr[0]);

        //input using array 
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter "+i+" element");
            arr[i]=in.nextInt();
        }
        System.out.println("Array elements are coming: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
