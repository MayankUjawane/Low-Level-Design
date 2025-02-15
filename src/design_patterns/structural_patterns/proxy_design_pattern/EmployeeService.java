package design_patterns.structural_patterns.proxy_design_pattern;

public interface EmployeeService {
    public void create(String client, Employee obj) throws Exception;
    public void delete(String client, int employeeId) throws Exception;
    public Employee get(String client, int employeeId) throws Exception;
}
