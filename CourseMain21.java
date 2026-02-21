public class CourseMain21 {
    String kodeCourse;
    String name;
    int credits;
    int numberOfHours;

    public CourseMain21 () {
        
    }

    public CourseMain21(String kode, String nm, int sks, int hour) {
        kodeCourse = kode;
        name = nm;
        credits = sks;
        numberOfHours = hour;
    }

    void showInformation() {
        System.out.println("Course Code: " + kodeCourse);
        System.out.println("Name       : " + name);
        System.out.println("Credits    : " + credits);
        System.out.println("Hours      : " + numberOfHours);
    }

    void reduceHours(int hours) {
        if (numberOfHours >= hours) {
            numberOfHours -= hours;
            System.out.println("Hours reduced. New total: " + numberOfHours);
        } else {
            System.out.println("Reduction failed! Insufficient hours."); // [cite: 247]
        }
    }

    public static void main(String[] args) {
        Course21 course1 = new Course21("ALSD", "Algorithms and Data Structures", 3, 6);
        
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