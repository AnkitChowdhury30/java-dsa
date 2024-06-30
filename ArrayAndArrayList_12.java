import java.util.Arrays;
import java.util.Scanner;

public class ArrayAndArrayList_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Array of primitves

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
            //hello
        }

        System.out.println();

        //simple method of print array elements
        System.out.println(Arrays.toString(arr));

        System.out.println();

        // enhanced for loop
        System.out.println("Array elements are coming: by for each loop");
        for(int num : arr){
            System.out.print(num +" "); // num represents each element in array
        }

        //System.out.println(arr[5]); // index out of bound error
        

        // Array of non primitve type
        
        String[] str = new String[4];
        System.out.println("give array elements");
        for(int i=0;i<str.length;i++){
            System.out.print("give "+i+" elemnte");
            str[i]=in.next();
        }
        for (String string : str) {
            System.out.println(string);
        }
        in.close();
    }    
    
}
