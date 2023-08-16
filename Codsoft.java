import java.util.ArrayList;

class Codsoft
{
    private ArrayList<Codsoft_task3> students;

    public Codsoft() {
        students = new ArrayList<Codsoft_task3>();
    }

    public void addStudent(Codsoft_task3 student) {
        students.add(student);
    }

    public void displayStudents() {
        for (Codsoft_task3 student : students) {
            System.out.println(student);
        }
    }
}