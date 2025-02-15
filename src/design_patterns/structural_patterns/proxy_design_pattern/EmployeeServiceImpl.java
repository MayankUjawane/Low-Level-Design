package design_patterns.structural_patterns.proxy_design_pattern;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void create(String client, Employee obj) {
        System.out.println("Employee Created");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("Employee Deleted");
    }

    @Override
    public Employee get(String client, int employeeId) {
        System.out.println("Employee Found");
        return new Employee();
    }
}
