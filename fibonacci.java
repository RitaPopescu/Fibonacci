import java.util.Scanner;

/**
 *
 * @author Rita
 */
class Fibo
{
    public static int  fibo(int n)
    {
        if(n==0)
            return 0;
        else
            if(n==1)
                return 1;
            else 
                if(n>=2)
                {
                    return fibo(n-1)+fibo(n-2);
                }
        return 1;
    }
}
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibo f = new Fibo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dati numarul dorit:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print(f.fibo(i) + " ,");
        }
        System.out.println(f.fibo(n));
    }
    
}
