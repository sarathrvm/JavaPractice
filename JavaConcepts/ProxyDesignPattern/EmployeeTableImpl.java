package ProxyDesignPattern;

public class EmployeeTableImpl implements EmployeeTable{

    EmployeeDao obj;
    @Override
    public void create(String client, EmployeeDao employeeDao) throws Exception {
        obj.setAge(employeeDao.getAge());
        obj.setCity(employeeDao.getCity());
        obj.setName(employeeDao.getName());
    }

    @Override
    public void delete(String client, String id) throws Exception {
        System.out.println("deleting the id from Employee db");

    }

    @Override
    public EmployeeDao get(String client, String id) throws Exception {
        System.out.println("returning employeedao object");
        return null;
    }
}
