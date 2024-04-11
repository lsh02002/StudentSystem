package studentsystem;

import java.util.HashMap;
import java.util.Map;

public class ClassRoom<T extends CollegeStudent> {
    protected String course;
    protected Map<String, T> studentMap = new HashMap<>();

    public ClassRoom(String course){
        this.course = course;
    }

    public void addStudent(Sophomore sophomore1) {
        this.studentMap.put(sophomore1.getStudentNumber(), (T)sophomore1);
    }

    public void addStudent(Freshman freshman1) {
        this.studentMap.put(freshman1.getStudentNumber(), (T)freshman1);
    }

    public void addStudent(Junior junior2) {
        this.studentMap.put(junior2.getStudentNumber(), (T)junior2);
    }

    public void addStudent(Senior senior2) {
        this.studentMap.put(senior2.getStudentNumber(), (T)senior2);
    }

    public String getStudentByStudentNumber(String studentNumber){
        T student = (T)studentMap.get(studentNumber);
        if(student != null){
            return student.getClassName() + "{studentNumber='" + student.getStudentNumber() + "',name='" + student.getName() + "',gpa=" + student.getGpa() + "}";
        }

        return null;
    }

    public void printStudentNames(){
        StringBuilder result = new StringBuilder("이 클래스 룸("+ course +")은 학생들 [");
        int i=0;

        for(Map.Entry<String, T> student :studentMap.entrySet()){
            if(student.getValue().getName() != null) {
                result.append(student.getValue().getName());

                if(i < studentMap.size()-1) {
                    result.append(",");
                }
            }

            i++;
        }
        result.append("] 가 있습니다.");

        System.out.println(result);
    }
}
