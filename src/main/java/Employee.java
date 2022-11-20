import org.apache.commons.lang3.StringUtils;

public class Employee {

    private String surName;
    private String firstName;
    private String middleName;
    private int department;
    private int salary;
    private static int counter = 1;
    private Integer id;

    public Employee(String surName, String firstName, String middleName, int department, int salary) {
        this.surName = surName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public Integer getId() {
        return this.id;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Работник {" + "Id " + id + '\'' +
                " Фамилия '" + surName + '\'' +
                ", Имя '" + firstName + '\'' +
                ", Отчество '" + middleName + '\'' +
                ", Отдел " + department +
                ", Зарплата " + salary +
                '}';
    }
}
