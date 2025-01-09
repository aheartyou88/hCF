import java.util.Scanner;

public class Main {
    public static int findHCF(int num1, int num2) {
        int hcf = 1;
        int smaller = Math.min(num1, num2);

        for (int i = smaller; i>= 1; i--) {
            if(num1 % i == 0 && num2 % i == 0) {
            hcf = i;
            break;
        }
    }
    return hcf;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int hcf = findHCF(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

    }
}