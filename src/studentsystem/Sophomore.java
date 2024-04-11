package studentsystem;

public class Sophomore extends YoungGroupCollegeStudent{
    protected String className="Sophomore";
    public Sophomore(String studentNumber, String studentName, double studentGrade) {
        super(studentNumber, studentName, studentGrade);
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
