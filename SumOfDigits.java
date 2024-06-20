import java.util.Scanner;

public class SumOfDigits {

    public static int fun(int n){
        if(n == 0){
            return 0;
        }
        return fun(n/10)+n%10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int n = scanner.nextInt();
        int result = fun(n);
        System.out.println("Sum = "+result);
    }
}
