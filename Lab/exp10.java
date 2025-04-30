import java.io.*;
import java.util.Scanner;

public class exp10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Course");
            System.out.println("2. Search by Course ID");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    addCourse(scanner);
                    break;
                case 2:
                    searchCourse(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void addCourse(Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("courses.txt", true))) {
            System.out.print("Enter Course ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Course Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Course Duration: ");
            String duration = scanner.nextLine();

            String record = id + "," + name + "," + duration;
            writer.write(record);
            writer.newLine();
            System.out.println("Course added successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    static void searchCourse(Scanner scanner) {
        System.out.print("Enter Course ID to search: ");
        String searchId = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader("courses.txt"))) {
            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(searchId)) {
                    System.out.println("Course Found:");
                    System.out.println("ID: " + parts[0]);
                    System.out.println("Name: " + parts[1]);
                    System.out.println("Duration: " + parts[2]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Course not found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

