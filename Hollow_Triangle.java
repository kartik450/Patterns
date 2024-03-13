import java.util.*;
public class Hollow_Triangle {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n,i,j,k;
        System.out.print("Enter number of rows: ");
        n=ob.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=0;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                if(i==1 || i==2 || i==n || k==1 || k==i){
                System.out.print("* ");}
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
