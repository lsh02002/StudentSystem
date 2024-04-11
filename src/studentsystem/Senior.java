package studentsystem;

public class Senior extends ElderGroupCollegeStudent{
    protected String className="Senior";
    public Senior(String studentNumber, String studentName, double studentGrade) {
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

