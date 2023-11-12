public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kortney", "Rosalee", "HR Manager");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName());
	    Employee employee2 = new Employee("Junior", "Philipa", "Software Manager");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName());
    }
}