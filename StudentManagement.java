import java.util.Scanner;
import java.util.ArrayList;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice(1-5): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name : ");
                    String name = sc.nextLine();
                    System.out.println("Enter marks");
                    double marks = sc.nextDouble();
                    studentList.add(new Student(id, name, marks));
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    if (studentList.isEmpty()) {
                        System.out.println(" No students to display.");
                    } else {
                        System.out.println("Student Records:");
                        for (Student s : studentList) {
                            s.display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    boolean found = false;
                    for (Student s : studentList) {
                        if (s.id == updateId) {
                            sc.nextLine(); // consume newline
                            System.out.print("Enter new name: ");
                            s.name = sc.nextLine();
                            System.out.print("Enter new marks: ");
                            s.marks = sc.nextDouble();
                            System.out.println("Student updated.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with ID " + updateId + " not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    Student toDelete = null;
                    for (Student s : studentList) {
                        if (s.id == deleteId) {
                            toDelete = s;
                            break;
                        }
                    }
                    if (toDelete != null) {
                        studentList.remove(toDelete);
                        System.out.println(" Student deleted.");
                    } else {
                        System.out.println(" Student not found.");
                    }
                    break;

                case 5:
                    System.out.println(" Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid choice. Please enter 1-5.");
            }
        } while (choice != 5);

        sc.close();
    }

}
