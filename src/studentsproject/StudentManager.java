package studentsproject;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    // Constructor - fresh start, no saved data
    public StudentManager() {
        students = new ArrayList<>(); // Empty list every time
    }

    // Add Student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!\n");
    }

    // View All Students
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found!\n");
            return;
        }

        System.out.println("===== All Students =====");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    // Search Student by Roll No
    public Student searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                return s;
            }
        }
        return null;
    }

    // Delete Student
    public boolean deleteStudent(int rollNo) {
        Student s = searchStudent(rollNo);
        if (s != null) {
            students.remove(s);
            System.out.println("Student deleted successfully!\n");
            return true;
        }
        return false;
    }

    // Update Student
    public boolean updateStudent(int rollNo, String name, int age, String course, double marks) {
        Student s = searchStudent(rollNo);
        if (s != null) {
            s.setName(name);
            s.setAge(age);
            s.setCourse(course);
            s.setMarks(marks);
            System.out.println("Student updated successfully!\n");
            return true;
        }
        return false;
    }
}