import java.io.*;
import java.util.*;

class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
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

public class exp9 {

    public static void editStudent(int idToEdit, String newName, String newCourse) {
        File inputFile = new File("students.txt");
        File tempFile = new File("temp.txt");
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;

            while ((line = reader.readLine()) != null) {
                Student s = Student.fromFileString(line);
                if (s.id == idToEdit) {
                    s.name = newName;
                    s.course = newCourse;
                    found = true;
                }
                writer.write(s.toFileString());
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error while editing: " + e.getMessage());
            return;
        }

        if (inputFile.delete() && tempFile.renameTo(inputFile)) {
            if (found) System.out.println("Record updated.");
            else System.out.println("Student ID not found.");
        } else {
            System.out.println("Could not update file.");
        }
    }

    public static void deleteStudent(int idToDelete) {
        File inputFile = new File("students.txt");
        File tempFile = new File("temp.txt");
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;

            while ((line = reader.readLine()) != null) {
                Student s = Student.fromFileString(line);
                if (s.id != idToDelete) {
                    writer.write(s.toFileString());
                    writer.newLine();
                } else {
                    found = true;
                }
            }

        } catch (IOException e) {
            System.out.println("Error while deleting: " + e.getMessage());
            return;
        }

        if (inputFile.delete() && tempFile.renameTo(inputFile)) {
            if (found) System.out.println("Student deleted.");
            else System.out.println("Student ID not found.");
        } else {
            System.out.println("Could not update file.");
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
        System.out.println("1. Edit\n2. Delete\n3. Search");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter ID to edit: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new name: ");
            String name = sc.nextLine();
            System.out.print("Enter new course: ");
            String course = sc.nextLine();
            editStudent(id, name, course);
        } else if (choice == 2) {
            System.out.print("Enter ID to delete: ");
            int id = sc.nextInt();
            deleteStudent(id);
         }
          else if (choice == 3) {
            System.out.print("Enter ID to search: ");
            int id = sc.nextInt();
            searchStudentById(id);
        }
          else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}

