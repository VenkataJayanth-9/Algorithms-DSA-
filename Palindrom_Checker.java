import java.util.Scanner;

public class Palindrom_Checker {

    public static boolean fun(String input, int size, int start, int end){
        if(size<=1){
            return true;
        }
        return(input.charAt(start) == input.charAt(end)) && fun(input, size-2, start+1, end-1);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a input string: ");
        String input = scanner.nextLine();
        int size = input.length();
        int start = 0;
        int end = size-1;
        boolean result = fun(input, size, start, end);
        if(result == true){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not a Palindrom");
        }
    }
}
