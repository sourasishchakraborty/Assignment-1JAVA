import java.util.Scanner;

public class superDigitRecursion {

    static int sumDigit(int n){
        if(n>9){
            int sum = n%10 + sumDigit(n/10);
            if(sum>9){
                return sumDigit(sum);

            }else{
                return sum;
            }
        }else{
            return n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        superDigitRecursion obj = new superDigitRecursion();
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        System.out.println("Enter the number of repetition you want: ");
        int n = sc.nextInt();
        String s = String.valueOf(x);
        String newString ="";
        for(int i=0;i<n;i++){
            newString += s;
            //System.out.println(newString);
        }
        int newNumber = Integer.parseInt(newString);
        System.out.println("Number after repetition:  "+newNumber);
        int sum = obj.sumDigit(newNumber);
        System.out.println("Sum: "+sum);
    }
}
