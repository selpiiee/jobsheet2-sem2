
public class Student21 {

    String Name;
    String nim;
    String Class;
    double gpa;

    void displayInformation() {
        System.out.println("Name : " + Name);
        System.out.println("NIM : " + nim);
        System.out.println("Class : " + Class);
        System.out.println("GPA : " + gpa);
    }

    void changeClass(String newClass) {
        Class = newClass;
    }

    void changeGPA(double newGPA) {
        if (newGPA >= 0.0 && newGPA <= 4.0) {
            gpa = newGPA;
        } else {
            System.out.println("GPA is invalid. Must be between 0.0 and 4.0");
        }
    }

    String performanceValue(double gpa) {
        if (gpa >= 3.5) {
            return "Excellent performance";
        } else if (gpa >= 3.0) {
            return "Good performance";
        } else if (gpa >= 2.0) {
            return "Adequate performance";
        } else {
            return "Poor performance";
        }
    }
}
