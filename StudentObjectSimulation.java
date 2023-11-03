public class StudentObjectSimulation {
    public static void main(String[] args) {
        Student student = new Student("Stephen", "Curry", "3", "BSCS", "BM1", 95.5f, 97.75f);

        student.introduceSelf();
        student.evaluateGrade();
    }
}