package studentsproject;

import java.util.Scanner;

public class StudentSystem {

    private StudentManager manager;
    private Scanner sc;

    public StudentSystem() {
        manager = new StudentManager();
        sc = new Scanner(System.in);
    }

    public void start() {

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    manager.viewAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void addStudent() {
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(rollNo, name, age, course, marks);
        manager.addStudent(s);

        System.out.println("Student Added Successfully!");
    }

    private void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int rollNo = sc.nextInt();

        Student s = manager.searchStudent(rollNo);

        if (s != null) {
            System.out.println("Student Found: ");
            System.out.println(s);
        } else {
            System.out.println("Student not found!");
        }
    }

    private void updateStudent() {
        System.out.print("Enter Roll No to update: ");
        int rollNo = sc.nextInt();

        Student s = manager.searchStudent(rollNo);

        if (s == null) {
            System.out.println("Student not found!");
            return;
        }

        sc.nextLine();
        System.out.print("Enter New Name: ");
        String name = sc.nextLine();

        System.out.print("Enter New Age: ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter New Course: ");
        String course = sc.nextLine();

        System.out.print("Enter New Marks: ");
        double marks = sc.nextDouble();

        if (manager.updateStudent(rollNo, name, age, course, marks)) {
            System.out.println("Student Updated Successfully!");
        } else {
            System.out.println("Update Failed!");
        }
    }

    private void deleteStudent() {
        System.out.print("Enter Roll No to delete: ");
        int rollNo = sc.nextInt();

        if (manager.deleteStudent(rollNo)) {
            System.out.println("Student Deleted Successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }
}