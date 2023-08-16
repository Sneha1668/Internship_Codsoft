
public class Codsoft1 {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        Codsoft_task3 student1 = new Codsoft_task("Codsoft", 101, 3.8);
        Codsoft_task3 student2 = new Codsoft_task("Codsoft", 102, 3.5);

        system.addStudent(student1);
        system.addStudent(student2);

        system.displayStudents();
    }
}