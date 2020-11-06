package inheritance;
import inheritance.people.Student;

public class Group extends Student {
    private String groupNumber;
    private String courseName;

    public Group() {
        super();
    }

    public Group(String name) {
        super(name);
    }

    public Group(String groupNumber, String courseName) {
        super();
        this.groupNumber = groupNumber;
        this.courseName = courseName;
    }

    public Group(String name, String address, String universityName, String groupNumber, String courseName) {
        super(name, address, universityName);
        this.groupNumber = groupNumber;
        this.courseName = courseName;

    }
    
    public String getGroupNumber() { return groupNumber; }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
    
    public String getCourseName() { return courseName; }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    

    @Override
    public String toString() {
        return " Group{ " +
            " group number ='" + groupNumber + '\'' +
            ", course name ='" + courseName + '\'' +
            '}' +
        super.toString() + '\'';
    }
}
