public class testStudent {
    public static void main(String[] args) {
        student student1 = new student(12345, "Alice", 3.8);
        student student2 = new student(67890, "Bob", 3.5);
        student student3 = new student(54321, "Charlie", 3.9);
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
        System.out.println();
        student3.displayInfo();
        System.out.println(student1.getInfo());
    }
}
