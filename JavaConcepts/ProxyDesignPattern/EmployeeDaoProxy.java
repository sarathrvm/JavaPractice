package ProxyDesignPattern;

public class EmployeeDaoProxy implements EmployeeTable{

    EmployeeTable employeeObj;

    EmployeeDaoProxy(){
        employeeObj= new EmployeeTableImpl();
    }

    @Override
    public void create(String client, EmployeeDao employeeDao) throws Exception {

        if(client=="ADMIN"){
            employeeObj.create(client,employeeDao);
        }

    }

    @Override
    public void delete(String client, String id) throws Exception {

    }

    @Override
    public EmployeeDao get(String client, String id) throws Exception {
        return null;
    }
}
