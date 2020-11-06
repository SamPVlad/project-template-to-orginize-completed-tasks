package inheritance.people;

public class Stuff extends Person  {
    private String departmentName;
    private String position;
    private static int stuffTotal;
    int stuffListNumber;

    public Stuff() {
        super();
        stuffListNumber = stuffCounter();
    }

    public Stuff(String name) {
        super(name);
        stuffListNumber = stuffCounter();
    }

    public Stuff(String name, String address, String departmentName, String position) {
        super(name, address);
        this.departmentName = departmentName;
        this.position = position;
        stuffListNumber = stuffCounter();
    }

    public void work() {
        System.out.println("Stuff works");
    }

    static int stuffCounter() {
        return stuffTotal++;
    }

    public static void getAllStuffCount() {
        System.out.println("All workers" + stuffTotal);
    }

    public String getDepartmentName() { return departmentName; }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPosition() { return position; }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return " Stuff{ " +
            "address ='" + super.getAddress() + '\'' +
            ", department name ='" + departmentName + '\'' +
            ", position ='" + position + '\'' +
            super.getName() + '\'' +
            '}';
    }
}
