import java.util.Scanner;

public class one_to_n {
    public static void fun(int num){
        if(num == 0){
            return;
        }
        fun(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        System.out.print("Enter n-value: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        fun(num);
    }
}
//Tail Recursion:
//public class one_to_n {
//    public static void fun(int num, int k){
//        if(num == 0){
//            return;
//        }
//        fun(num-1, k+1);
//        System.out.println(num);
//    }
//    public static void main(String[] args) {
//        System.out.print("Enter n-value: ");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int k;
//        fun(num, k);
//    }
//}

































