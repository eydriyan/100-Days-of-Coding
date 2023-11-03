import java.util.*;

public class SummationOfNumbers {

    public static void main(String[] args) {
        System.out.println(summation(input()));
    }

    static int[] input() {
        Scanner input = new Scanner(System.in);

        System.out.println("How many number do you want to add?");
        int size = input.nextInt();
        

        int[] numArray = new int[size];

        System.out.println("Enter " + size + " Numbers:");

        for(int i = 0; i < size; i++) {
            numArray[i] = input.nextInt();
        }

        input.close();

        return numArray;       
    }

    static int summation(int nums[]) {
        
        int sum = 0;

        for(int num : nums) {
            sum += num;
        }
        
        return sum;

    }

}