import java.util.Scanner;

public class StudentRegistrationSimulation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input the number of students to be registered: ");
        int size = scan.nextInt();
        scan.nextLine();

        Student1 students[] = new Student1[size];

        for(int i = 0; i < students.length; i++) {

            String fName, lName;
            String course, section;
            int year;

            System.out.println("\nEnter Information for Student " + (i+1));

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

            students[i] = new Student1(fName, lName, course, section, year);
        }
    
        scan.close();

        System.out.println("\n==========Student Informations==========");

        for(int i = 0; i < students.length; i++) {
            System.out.println("\nInformation for Student " + (i+1) + "\n");
            students[i].introduce();
        }
    }
}
