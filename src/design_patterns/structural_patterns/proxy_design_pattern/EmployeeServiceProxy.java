package design_patterns.structural_patterns.proxy_design_pattern;

public class EmployeeServiceProxy implements EmployeeService {
    EmployeeService employeeService;

    EmployeeServiceProxy() {
        employeeService = new EmployeeServiceImpl();
    }

    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client.equals("ADMIN")) {
            employeeService.create(client, obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")) {
            employeeService.delete(client, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")) {
            return employeeService.get(client, employeeId);
        }
        throw new Exception("Access Denied");
    }
}
