package inheritance.people;

// Uncomment, fix and expand the class
public class Professor extends Person{
    private String universityName;
    private String degree;
    private String course;

    public Professor(String universityName, String degree) {
        super();
        this.universityName = universityName;
        this.degree = degree;
    }

    public Professor(String name, String address, String universityName, String degree) {
        super(name, address);
        this.universityName = universityName;
        this.degree = degree;
    }

    /**
     * Describes how a Professor is doing their work to earn money.
     */
    public void work() {
        System.out.println("Professor works");
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getDegree() {
        return degree;
    }

    public String getCourse() { return course; }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return " Profssor{ " +
            "name='" + super.getName() + '\'' +
            ", address='" + super.getAddress() + '\'' +
            ", universityName='" + universityName + '\'' +
            ", degree='" + degree + '\'' +
            ", course='" + course + '\'' +
            '}';
    }
}
