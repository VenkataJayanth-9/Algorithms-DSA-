import java.util.Scanner;

public class Sum_of_n_naturalNumbers {
    public static int fun(int number){
        if(number == 0){
            return 0;
        }
        return number+fun(number-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number greater than 0: ");
        int num = scanner.nextInt();
        fun(num);
        int result = fun(num);
        System.out.println("Sum = "+result);
    }
}
