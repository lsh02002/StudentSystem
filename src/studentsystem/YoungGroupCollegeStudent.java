package studentsystem;

abstract class YoungGroupCollegeStudent extends CollegeStudent{
    public YoungGroupCollegeStudent(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    abstract String getName();
    @Override
    abstract String getClassName();
    @Override
    abstract double getGpa();
}
