
public class StudentMain21 {

    String Name;
    String nim;
    String Class;
    double gpa;

    void displayInformation() {
        System.out.println("Name\t: " + Name);
        System.out.println("NIM\t: " + nim);
        System.out.println("Class\t: " + Class);
        System.out.println("GPA\t: " + gpa);
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

    public static void main(String[] args) {
        StudentMain21 mhs1 = new StudentMain21();
        mhs1.Name = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.Class = "SI 2J";
        mhs1.gpa = 3.55;

        mhs1.displayInformation();
        mhs1.changeClass("SI 2K");
        mhs1.changeGPA(3.60);
        mhs1.displayInformation();
    }
}
