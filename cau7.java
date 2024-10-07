 import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class cau7 {
   
class Student {
    private String studentID;
    private String name;
    private double gpa;

    public Student(String studentID, String name, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class StudentManagement {
    private List<Student> studentList;

    public StudentManagement() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(String studentID) {
        studentList.removeIf(student -> student.getStudentID().equals(studentID));
    }

    public Student findStudentByID(String studentID) {
        for (Student student : studentList) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }

    public void sortStudentsByGPA() {
        Collections.sort(studentList, Comparator.comparing(Student::getGpa).reversed());
    }

    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();

        // Thêm sinh viên
        management.addStudent(new Student("001", "Alice", 3.8));
        management.addStudent(new Student("002", "Bob", 3.5));
        management.addStudent(new Student("003", "Charlie", 3.2));

        // Xóa sinh viên
        management.removeStudent("002");

        // Tìm kiếm sinh viên theo mã
        String searchID = "001";
        Student foundStudent = management.findStudentByID(searchID);
        if (foundStudent != null) {
            System.out.println("Sinh viên được tìm thấy: " + foundStudent);
        } else {
            System.out.println("Không tìm thấy sinh viên với mã " + searchID);
        }

        // Sắp xếp sinh viên theo điểm trung bình
        management.sortStudentsByGPA();

        // In danh sách sinh viên sau khi sắp xếp
        for (Student student : management.studentList) {
            System.out.println(student);
        }
    }
}
}
