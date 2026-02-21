
public class Student21 {

    String Name;
    String nim;
    String Class;
    double gpa;

    public Student21 (String nm, String nim, double gpa, String cls) {
        Name = nm;
        this.nim = nim;
        this.gpa = gpa;
        Class = cls;
    }

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
        Student21 mhsSelvy = new Student21("Selvy Nur Khoffifa", "254107060169", 3.75, "SIB 1G");
        mhsSelvy.displayInformation();

        Student21 mhs2 = new Student21("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.changeGPA(3.30);
        mhs2.displayInformation();
    }
}
