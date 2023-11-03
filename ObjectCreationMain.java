import java.util.*;

public class ObjectCreationMain {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Dog Informations:");

        System.out.print("Name: ");
        String name = input.nextLine();
        
        System.out.print("Color: ");
        String color = input.nextLine();

        System.out.print("Breed: ");
        String breed = input.nextLine();

        System.out.print("Sex: ");
        String sex = input.nextLine();

        System.out.print("Age: ");
        int age = input.nextInt();

        input.close();

        System.out.println("=================================================");

        Dog dog = new Dog(name, color, breed, sex, age);

    }
    
}
