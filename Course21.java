public class Course21 {
    String kodeCourse;
    String name;
    int credits;
    int numberOfHours;

    public Course21 () {
        
    }

    public Course21(String kode, String nm, int sks, int hour) {
        kodeCourse = kode;
        name = nm;
        credits = sks;
        numberOfHours = hour;
    }

    void showInformation() {
        System.out.println("Course Code\t: " + kodeCourse);
        System.out.println("Name\t\t: " + name);
        System.out.println("Credits\t\t: " + credits);
        System.out.println("Hours\t\t: " + numberOfHours);
    }

    void reduceHours(int hours) {
        if (numberOfHours >= hours) {
            numberOfHours -= hours;
            System.out.println("Hours reduced. New total: " + numberOfHours);
        } else {
            System.out.println("Reduction failed! Insufficient hours.");
        }
    }

    public static void main(String[] args) {
        CourseMain21 course1 = new CourseMain21("ALSD", "Algorithms and Data Structures", 3, 6);
        
        Course21 course2 = new Course21(); 
        course2.kodeCourse = "MATH";
        course2.name = "Discrete Mathematics";
        course2.credits = 2;
        course2.numberOfHours = 4;

        System.out.println("--- Course 1 Information ---");
        course1.showInformation();
        
        System.out.println("\n--- Testing Reduce Hours for Course 2 ---");
        course2.reduceHours(2);
        course2.reduceHours(10);
        course2.showInformation();
    }
}