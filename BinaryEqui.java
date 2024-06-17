import java.util.Scanner;

public class BinaryEqui {
    public static void bin(int number){
        if(number == 0){
            return;
        }
        bin(number/2);

        System.out.print(number%2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number [For number which you want to get binary number.]: ");
        int number = scanner.nextInt();
        bin(number);
    }
}
