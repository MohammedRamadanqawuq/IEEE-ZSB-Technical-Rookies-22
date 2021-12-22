import java.util.*;

public class remove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input .nextInt();
        int arr[] = new int [size];
        for(int i = 0; i<=size-1;i++)
        {
            arr[i]=input.nextInt();
        }
        int len = arr.length;
        //int temp[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
           
                if (arr[i] != arr[i+1]) {
                   // temp[j++] = arr[i];
                   arr[j++]=arr[i];
                }
            
        }
        //temp[j++] = arr[len - 1];
        arr[j++]=arr[len-1];
        for (int i = 0; i <j; i++) {
            System.out.println(arr[i]);
        }

    }
}
