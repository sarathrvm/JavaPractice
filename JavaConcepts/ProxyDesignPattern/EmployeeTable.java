package ProxyDesignPattern;

public interface EmployeeTable {

    public void create(String client,EmployeeDao employeeDao) throws Exception;
    public void delete(String client,String id ) throws Exception;
    public EmployeeDao get(String client, String id) throws Exception;
}
