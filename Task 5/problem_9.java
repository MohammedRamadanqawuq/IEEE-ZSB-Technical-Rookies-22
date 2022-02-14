import java.util.Scanner;

public class nine {

    public static void main(String[] args) {
       Scanner s1 =new Scanner(System.in);
       int n =s1.nextInt();
       for(int g =0;g<=n;g++){
             String s =s1.next();
         String str = "hackerrank";
        if (s.length() < str.length()) {
            System.out.println("NO");
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                    j++;
            }
        }
        if(j==str.length())
            System.out.println("YES");
        else
            System.out.println("NO");
           
       }
     
    }
    
}
