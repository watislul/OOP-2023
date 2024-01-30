public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmployeeId(101);
        emp.setEmployeeName("Jane Smith");
        emp.setSocialSecurityNumber("012-34-5678");
        emp.setSalary(120345.27);

        System.out.println("Employee id: " + emp.getEmployeeId());
        System.out.println("Employee name: " + emp.getEmployeeName());
        System.out.println("Employee Soc Sec #: " + emp.getSocialSecurityNumber());
        System.out.println("Employee salary: " + emp.getSalary());


        Employee emp2 = new Employee();
        emp2.setEmployeeId(102);
        emp2.setEmployeeName("John Doe");
        emp2.setSocialSecurityNumber("987-65-4321");
        emp2.setSalary(150000.75);

        System.out.println("\nDetails of Additional Employee:");
        System.out.println("Employee id: " + emp2.getEmployeeId());
        System.out.println("Employee name: " + emp2.getEmployeeName());
        System.out.println("Employee Soc Sec #: " + emp2.getSocialSecurityNumber());
        System.out.println("Employee salary: " + emp2.getSalary());
    }
}
