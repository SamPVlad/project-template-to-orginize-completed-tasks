package inheritance.people;

// Uncomment, fix and expand the class
public class Student extends Person {
    private String universityName;
    private int credits;
    private static int studentsTotal;
    int studentListNumber;

    public Student() {
        super();
        studentListNumber = studentCounter();
    }

    public Student(String name) {
        super(name);
        studentListNumber = studentCounter();
    }
    
    public Student(String name, String address, String universityName) {
        super(name, address);
        this.universityName = universityName;
        studentListNumber = studentCounter();
    }

    public void work() {
        System.out.println("Student doesn`t work");
    }
    
    static int studentCounter() {
         return studentsTotal++;
    }
    
    public static void getAllStudentsCount() {
        System.out.println("AllStudents" + studentsTotal);
    }

    public String getUniversityName() { return universityName; }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    
    public void study() {
        credits += 1;
    }
    
    @Override
    public String toString() {
        return " Student{ " +
            "universityName ='" + universityName + '\'' +
            ", credits ='" + credits + '\'' +
            '}' +
            super.toString() + '\'';
    }
    
}
