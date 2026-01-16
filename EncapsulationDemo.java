// Encapsulated Class
class Student {

    // private data members
    private int id;
    private String name;
    private double marks;

    // public setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // public getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}

// Main Class
public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s = new Student();

        // setting values using setters
        s.setId(101);
        s.setName("Rahul");
        s.setMarks(85.5);

        // getting values using getters
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}
