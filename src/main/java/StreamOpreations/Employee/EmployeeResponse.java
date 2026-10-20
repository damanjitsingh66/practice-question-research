package StreamOpreations.Employee;

public class EmployeeResponse {

    private String department;
    private int salary;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public EmployeeResponse(String department,int salary) {
        this.department = department;
        this.salary = salary;
    }

}
