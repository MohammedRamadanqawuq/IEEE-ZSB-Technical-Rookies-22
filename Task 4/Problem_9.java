import java.util.Scanner;

public class Ctask49 {

    public static void main(String[] args) {
        
      
        
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int i,j,k;
    String[] g = new String[n];
   char res[][]=new char[10000][10000];

    for(i=0;i<n;i++){
        g[i] = in.next();
    }
    for(i=0;i<n;i++)
        {
            char[] ch=g[i].toCharArray();
            for(k=0;k<n;k++)
                {
                res[i][k]=ch[k];
            }
        }

    for(i=1;i<n-1;i++)
        {
        for(j=1;j<n-1;j++)
            {
            if(res[i][j]>res[i][j-1] && res[i][j]>res[i][j+1] && res[i][j]>res[i-1][j] && res[i][j]>res[i+1][j])
                {
                res[i][j]='X';
            }
        }
    }

    for(i=0;i<n;i++)
        {
         for(j=0;j<n;j++)
             {
             System.out.print(res[i][j]);
         }
        System.out.print("\n");
    }
}
    }
    
