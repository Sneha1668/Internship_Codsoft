import java.util.*;

class Codsoft_task3{
    private String name;
    private int id;
    private double gpa;

    public Codsoft_task3(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGPA() {
        return gpa;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", GPA: " + gpa;
    }
}

