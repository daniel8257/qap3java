package Problem1;
public class Teacher extends Person {
    private String subject; // Subject the teacher teaches
    private double salary;  // Teacher's annual salary

    public Teacher(String name, int age, String gender, String subject, double salary) {
        // use the super class’ constructor
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: $" + salary;
    }
}
