import java.util.*;

public class problemfour {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int size = s.nextInt();
        int d = s.nextInt();
        int arr[] =new int[size];
        int count =1;
        Arrays.sort(arr);
        for(int i =0;i<=size-2;i++){
           arr[i]=s.nextInt();
        }
         for(int i =0;i<=size-1;i++){
          for(int k =i+1;k<=size-1;k++){
           for(int z =k+1;z<=size-1;z++){
               if(arr[k]-arr[i]==d){
                   if(arr[z]-arr[k]==d)
                       count++;
               }
        }
        }
        } 
         System.out.println(count);
    }
}
