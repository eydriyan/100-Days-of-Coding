public class Employee extends Person{
    private String jobTitle;

    public Employee(String firstName, String lastName, String jobTitle){
        super(firstName, lastName);
        this.jobTitle = jobTitle;
    }

    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}