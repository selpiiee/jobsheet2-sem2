public class Lecturer21 {
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertise;

    public Lecturer21 () {

    }

    public Lecturer21(String id, String nm, boolean status, int year, String skill) {
        idLecturer = id;
        name = nm;
        activeStatus = status;
        yearOfEntry = year;
        expertise = skill;
    }

    void setStatusActive(boolean status) {
        activeStatus = status;
    }

    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    void changeSkill(String skill) {
        expertise = skill;
    }

    void displayInformation() {
        System.out.println("ID\t\t: " + idLecturer);
        System.out.println("Name\t\t: " + name);
        System.out.println("Status\t\t: " + (activeStatus ? "Active" : "Inactive"));
        System.out.println("Expertise\t: " + expertise);
    }
    public static void main(String[] args) {

        Lecturer21 lecturer1 = new Lecturer21("D001", "Dr. Norawit", true, 2015, "Occupational Safety and Health");
        
        Lecturer21 lecturer2 = new Lecturer21("D002", "Prof. Nattawat", false, 2010, "Business Law");

        System.out.println("--- Lecturer 1 Data ---");
        lecturer1.displayInformation();
        System.out.println("Work Period\t: " + lecturer1.calculateTimeWork(2025) + " years");

        System.out.println("\n--- Updating Lecturer 2 Skill ---");
        lecturer2.changeSkill("Digital Entrepreneurship");
        lecturer2.setStatusActive(true);
        lecturer2.displayInformation();
    }
}