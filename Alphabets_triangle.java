import java.util.*;
public class Alphabets_triangle{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter number of rows: ");
        n=obj.nextInt();
        int y=0;
        for(i=1;i<=n;i++)
        {
            int x=65;
            for(j=1;j<=i;j++)
            {
                if(x==91){
                    y=1;
                    break;}
                System.out.print(((char)x)+" ");
                x++;

            }
            System.out.println();
        }
    }
}
