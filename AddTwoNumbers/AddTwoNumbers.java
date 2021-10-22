import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number one:");
        int numberOne = sc.nextInt();

        System.out.println("Enter number two:");
        int numberTwo = sc.nextInt();

        int answer = addTwoNumbers(numberOne, numberTwo);
        System.out.println(numberOne + " + " + numberTwo + " = " + answer);
    }

    private static int addTwoNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

}
