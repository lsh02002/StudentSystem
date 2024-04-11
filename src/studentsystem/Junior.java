package studentsystem;

public class Junior extends ElderGroupCollegeStudent{
    protected String className="Junior";
    public Junior(String studentNumber, String name, double gpa) {
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
