import java.util.Vector;
public class Course {
    private Department dept;
    private String title; // title of the course (e.g. Intro to programming);
    private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
    private int number; // course number, e.g. 1200, 2710, 2800, etc.
    private  Vector <Student>classList; // contains all students registered in this course

    public Course(String code, int number, Department dept, String title) {
        // also initialize the classList;

        code = this.code;
        number = this.number;
        dept = this. dept;
        title = this.title;

        Vector <Student>classList = new Vector<Student>();

    }
    public Course() {

        // TODO Auto-generated constructor stub

    }
    public int getCode(){

        return number;

    }

    public Vector<Student> getClassList(){

        return classList;

    }
    public String toString() {

        // return a string representation of the course with the course code,
        // name, and number of people registered in the course in the following
        // format:
        // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260

        System.out.println(code + " " + number + " " + title + ", Enrollment = " + classList.size());

        return null;

    }

    public void addToClassList(Student stud){

        classList.add(stud);

    }

    public void addStudToRegister(Student stud){

        dept.addStudentToRegister(stud);

    }

}
