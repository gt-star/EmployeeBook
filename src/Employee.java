import java.util.Objects;

public class Employee {

    private String lastName;
    private String firstName;
    private String mediumName;
    private int department;
    private double salary;
    private int id;
    public static int count = 0;
    public Employee(String lastName, String firstName, String mediumName, int department, double salary) {
        this.firstName = firstName;
        this.mediumName = mediumName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        count++;
        id = count;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMediumName() {
        return mediumName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Сотрудники:\n" +
                "ID = '" + id + '\'' +
                " Фамилия ='" + lastName + '\'' +
                ",Имя ='" + firstName + '\'' +
                ",Отчество='" + mediumName + '\'' +
                ",Отдел=" + department +
                ",зарплата =" + salary;
    }
}
