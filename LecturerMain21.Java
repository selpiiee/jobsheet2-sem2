public class LecturerMain21 {
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertise;

    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    void displayInformation() {
        System.out.println("ID: " + idLecturer + " | Name: " + name);
        System.out.println("Status: " + (activeStatus ? "Active" : "Inactive")); // [cite: 287]
        System.out.println("Expertise: " + expertise);
    }
    public static void main(String[] args) {

        Lecturer21 lecturer1 = new Lecturer21("D001", "Dr. Gemini", true, 2015, "Artificial Intelligence");
        
        Lecturer21 lecturer2 = new Lecturer21("D002", "Prof. Andi", false, 2010, "Data Science");

        System.out.println("--- Lecturer 1 Data ---");
        lecturer1.displayInformation();
        System.out.println("Work Period: " + lecturer1.calculateTimeWork(2025) + " years"); // [cite: 289]

        System.out.println("\n--- Updating Lecturer 2 Skill ---");
        lecturer2.changeSkill("Machine Learning");
        lecturer2.setStatusActive(true);
        lecturer2.displayInformation();
    }
}