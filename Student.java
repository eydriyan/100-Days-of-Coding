public class Student {

    String firstName, lastName, year, course, section;
    float midtermGrade, finalGrade;

    public Student(String firstName, String lastName, String year, String course, String section, float midtermGrade, float finalGrade){

        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
        
    }

    void introduceSelf(){

        System.out.println("First Name  : " + firstName);
        System.out.println("Last Name   : " + lastName);
        System.out.println("Year        : " + year);
        System.out.println("Course      : " + course);
        System.out.println("Section     : " + section);
        
    }

    void evaluateGrade(){

        float average = (midtermGrade + finalGrade)/2;
        String remark;

        if(average > 100) {
            remark = "Invalid Grade";
        }else if(average >= 98){
            remark = "With Highest Honors";
        }else if(average >= 95){
            remark = "With High Honors";
        }else if(average >= 90){
            remark = "With Honors";
        }else if(average >= 75){
            remark = "Passed";
        }else{
            remark = "Failed";
        }

        System.out.println("Your Grades");
        System.out.println("Average     :" + average);
        System.out.println("Remarks     :" + remark);
    }
}
