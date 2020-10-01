import java.util.Scanner;

public class sumofPowers {
    static int power(int number, int n){
        if(n==0){
            return 1;
        }
        else if(n%2 == 0){
            return power(number,n/2) * power(number,n/2);
        }
        else{
            return number * power(number,n/2) * power(number,n/2);
        }
    }

    static int checkRecursive( int X, int n, int curr_num, int curr_sum){
        int results=0;
        int p = power(curr_num,n);
        while(p + curr_sum < X){
            results += checkRecursive(X,n,curr_num+1,p+ curr_sum);
            curr_num++;
            p = power(curr_num, n);

        }
        if(p + curr_sum == X){
            results++;
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumofPowers obj = new sumofPowers();
        System.out.println("Enter the Integer: ");
        int X = sc.nextInt();
        System.out.println("Enter which power you want to compute: ");
        int n = sc.nextInt();
        int result = obj.checkRecursive(X,n,1,0);
        System.out.println("No. of ways it can be expressed: "+result);
    }
}
