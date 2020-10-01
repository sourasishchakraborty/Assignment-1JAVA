
import java.io.*;
import java.util.*;

public class computeGCD {

    static int gcd(int a, int b)
    {
        if(b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        computeGCD obj = new computeGCD();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Number 2:");
        int n2 = sc.nextInt();
        int result = obj.gcd(n1,n2);
        System.out.println("GCD: "+result);


    }
}