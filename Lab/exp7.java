class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " years");
    }
}

class UGCourse extends Course {
    public UGCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    public void displayDetails() {
        System.out.println("Undergraduate Course:");
        super.displayDetails();
    }
}

class PGCourse extends Course {
    public PGCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    public void displayDetails() {
        System.out.println("Postgraduate Course:");
        super.displayDetails();
    }
}

class DiplomaCourse extends Course {
    public DiplomaCourse(String courseName, int duration) {
        super(courseName, duration);
    }

    @Override
    public void displayDetails() {
        System.out.println("Diploma Course:");
        super.displayDetails();
    }
}

public class exp7 {
    public static void main(String[] args) {
        Course ug = new UGCourse("B.Sc Computer Science", 3);
        Course pg = new PGCourse("M.Sc Artificial Intelligence", 2);
        Course diploma = new DiplomaCourse("Diploma in Data Science", 1);

        ug.displayDetails();
        System.out.println();

        pg.displayDetails();
        System.out.println();

        diploma.displayDetails();  
        System.out.println();
    }
}


