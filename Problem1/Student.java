package Problem1;
public class Student extends Person {
    protected String myIdNum;    // Student Id Number
    protected double myGPA;      // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        // use the super class’ constructor
        super(name, age, gender);
        // initialize what’s new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter and Setter methods
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString method
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
