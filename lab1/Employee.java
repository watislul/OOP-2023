public class Employee {

    public int employeeId;
    public String employeeName;
    public String socialSecurityNumber;
    public double salary;

    public Employee() {
        // Initialize fields if needed
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public static void main(String[] args) {

        Employee employee = new Employee();


        employee.setEmployeeId(101);
        employee.setEmployeeName("Jane Smith");
        employee.setSocialSecurityNumber("012-34-4567");
        employee.setSalary(120345.27);


        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Social Security Number: " + employee.getSocialSecurityNumber());
        System.out.println("Salary: $" + employee.getSalary());
    }
}
