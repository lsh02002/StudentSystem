package studentsystem;

public class Freshman extends YoungGroupCollegeStudent{
    protected String className = "Freshman";
    public Freshman(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    double getGpa() {
        return gpa;
    }
}
