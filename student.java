public class student {
    private int studentID;
    private String name;
    private double GPA;
    public student(int studentID, String name, double GPA) {
        this.studentID = studentID;
        this.name = name;
        this.GPA = GPA;
    }  
    public void displayInfo() {
        System.out.println("--------Student Information---------");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + GPA);
    }
    public String getInfo() {
        return this.studentID + ", Name: " +this.name + ", GPA: " + this.GPA;
    }
}