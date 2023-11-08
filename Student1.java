public class Student1 {
    private String fName, lName;
    private String course, section;
    private int year;

    public Student1(String fName, String lName, String course, String section, int year){
        this.fName = fName;
        this.lName = lName;
        this.course = course;
        this.section = section;
        this.year = year;
    }

    public void introduce() {
        System.out.println("First Name: " + fName);

        System.out.println("Last Name: " + lName);

        System.out.println("Course: " + course);

        System.out.println("Section: " + section);

        System.out.println("Year: " + year);
    }
}
