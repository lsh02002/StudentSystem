package studentsystem;

abstract class ElderGroupCollegeStudent extends CollegeStudent {

    public ElderGroupCollegeStudent(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    abstract String getName();
    @Override
    abstract String getClassName();
    @Override
    abstract double getGpa();
}
