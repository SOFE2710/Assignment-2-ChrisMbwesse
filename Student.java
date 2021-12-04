import java.util.Vector;
public class Student extends Person{

    private String id;
    private String name;
    private Vector courses; // contains all courses the student is registered in


        public Student(String stdName, String stdId) {

        super(stdName);

        id = stdId;

        Vector<Course> courses = new Vector<Course>();

    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850

        System.out.println(id + " " + name);
        System.out.println("Registered courses: " + courses);

        return null;

    }
    public void registerFor(Course course){

        if (!(courses.contains(course))){

            courses.add(course);
            course.addToClassList(this);
            course.addStudToRegister(this);

        }

    }
    public Boolean isRegisteredInCourse(Course course){

        return courses.contains(course);//returns true if the course is found in student's courses vector

    }
}
