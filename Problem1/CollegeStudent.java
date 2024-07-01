package Problem1;
public class CollegeStudent extends Student {
    private String major; // Major of the college student
    private int year;     // Year of the college student (1=FROSH, 2=SOPH, etc.)

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        // use the super class’ constructor
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getter and Setter methods
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // toString method
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
