package studentsystem;
abstract class CollegeStudent {
    protected String studentNumber;
    protected String name;
    protected double gpa;

    public CollegeStudent(String studentNumber, String name, double gpa) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.gpa = gpa;
    }

    abstract String getStudentNumber();
    abstract String getName();
    abstract String getClassName();
    abstract double getGpa();
}