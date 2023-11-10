import java.util.ArrayList;
import java.util.Scanner;

public class ImprovedStudentRegistrationSimulation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Student1> students = new ArrayList<Student1>();

        int counter = 1;
        char choice;

        do{
        
            String fName, lName;
            String course, section;
            int year;

            System.out.println("\nEnter Information for Student " + counter);

            System.out.print("\nEnter First Name: ");
            fName = scan.nextLine();

            System.out.print("Enter Last Name: ");
            lName = scan.nextLine();

            System.out.print("Enter Course: ");
            course = scan.nextLine();

            System.out.print("Enter Section: ");
            section = scan.nextLine();

            System.out.print("Enter Year: ");
            year = scan.nextInt();
            scan.nextLine();

            students.add(new Student1(fName, lName, course, section, year));
            
            counter++;

            do{

                System.out.print("Add another student? (Y/n) : ");
                choice = scan.next().charAt(0);
                choice = Character.toLowerCase(choice);

                if (choice == 'y' || choice == 'n') {
                    break;
                }else{
                    System.out.println("Invalid Choice!");
                }

            }while(true);

            scan.nextLine();

            
        }while(choice == 'y');

        scan.close();

        System.out.println("\n==========Student Informations==========");

        for(int i = 0; i < students.size(); i++) {

            System.out.println("\nInformation for Student " + (i+1) + "\n");
            students.get(i).introduce();
        }

    }
    
}
