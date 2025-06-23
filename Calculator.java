import java.util.Scanner;

class Calculator {
    public static void main(String[] rgs) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Ener the first Number");
            double a = sc.nextInt();
            System.out.println("Ener the Second Number");
            double b = sc.nextInt();
            System.out.println("Choose Operartor : +, - , * , / ");
            char operator = sc.next().charAt(0);
            double result = 0;
            switch (operator) {
                case '+':
                    result = add(a, b);
                    break;
                case '-':
                    result = sub(a, b);
                    break;
                case '*':
                    result = mult(a, b);
                    break;
                case '/':
                    result = div(a, b);
                    break;
                default:
                    System.out.println("Invalid Operator");

            }
            System.out.println("Result: " + result);
            System.out.println("If you want to continue Enter Y/y");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        } else {
            return a / b;
        }
    }
}