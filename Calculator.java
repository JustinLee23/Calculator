import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a sign +, -, *, /: ");
        String sign = userInput.next();
        System.out.print("Enter your first number: ");
        int num1 = userInput.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = userInput.nextInt();

        if (sign.equals("+")) {
            int ans = num1 + num2;
            System.out.println("Your answer is " + ans);
        } else if (sign.equals("-")) {
            int ans = num1 - num2;
            System.out.println("Your answer is " + ans);
        } else if (sign.equals("*")) {
            int ans = num1 * num2;
            System.out.println("Your answer is " + ans);
        } else if (sign.equals("/")) {
            int ans = num1/num2;
            System.out.println("Your answer is " + ans);
        } else

            System.out.println("Your sign has an error, please type it correctly.");
    }
}

