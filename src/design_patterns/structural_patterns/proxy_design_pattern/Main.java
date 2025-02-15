package design_patterns.structural_patterns.proxy_design_pattern;

public class Main {
    public static void main(String[] args) {
        String userClient = "USER", adminClient = "ADMIN";
        Employee employee = new Employee();
        try {
            EmployeeService employeeService = new EmployeeServiceProxy();
            employeeService.get(adminClient, 1);
            employeeService.delete(adminClient, 1);
            employeeService.create(adminClient, new Employee());

            employeeService.get(userClient, 1);
            employeeService.delete(userClient, 1);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
