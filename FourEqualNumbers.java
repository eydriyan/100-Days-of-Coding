import java.util.Scanner;

public class FourEqualNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        float firstNumber = input.nextFloat();

        System.out.print("Input second number: ");
        float secondNumber = input.nextFloat();

        System.out.print("Input third number: ");
        float thirdNumber = input.nextFloat();

        System.out.print("Input fourth number: ");
        float fourthNumber = input.nextFloat();

        input.close();

        if (firstNumber == secondNumber && secondNumber == thirdNumber && thirdNumber == fourthNumber) {
            System.out.println("Numbers are equal!");
        }else{
            System.out.println("Numbers are not equal");
        }

    }
}
