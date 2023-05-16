public class Pracownik {
    private String firstName;
    private String lastName;
    private String position;
    private int employeeID;
    private int salary;
    private static int nextEmployeeID;

    public Pracownik(String firstName, String lastName, String position, int employeeID, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.employeeID = nextEmployeeID;
        this.salary = salary;
        nextEmployeeID++;
    }
}
