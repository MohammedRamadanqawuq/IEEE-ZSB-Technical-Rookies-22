import java.util.*;

public class Task_4_p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you letters : ");
        String L = input.next();
        int numOfRepeated = input.nextInt();
        String sum = "";
        int num_letter = 0;
        int num_First = 0;
        for(int i = 0;i<numOfRepeated;i++)
        {
         
            sum=sum+L;
            
        }
        for(int i = 0;i<numOfRepeated;i++)
        {
         
            if(sum.charAt(i)==L.charAt(0))
            {
            num_First ++;
            }
            
        }
        System.out.println(num_First);

    }

}
