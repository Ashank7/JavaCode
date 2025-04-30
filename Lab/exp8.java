import java.io.*;
import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String toFileString() {
        return id + "," + name + "," + course;
    }

    public static Student fromFileString(String line) {
        String[] parts = line.split(",");
        return new Student(Integer.parseInt(parts[0]), parts[1], parts[2]);
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Course: " + course);
    }
}

public class exp8 {
    public static void saveStudent(Student s) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt", true))) {
            writer.write(s.toFileString());
            writer.newLine();
            System.out.println("Student record saved.");
        } catch (IOException e) {
            System.out.println("Error saving student: " + e.getMessage());
        }
    }
    public static void searchStudentById(int searchId) {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                Student s = Student.fromFileString(line);
                if (s.id == searchId) {
                    s.display();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student with ID " + searchId + " not found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add Student\n2. Search Student by ID");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Course: ");
            String course = sc.nextLine();
            Student s = new Student(id, name, course);
            saveStudent(s);
        } else if (choice == 2) {
            System.out.print("Enter ID to search: ");
            int id = sc.nextInt();
            searchStudentById(id);
        } else {
            System.out.println("Invalid choice.");
        }
        sc.close();
    }
}

