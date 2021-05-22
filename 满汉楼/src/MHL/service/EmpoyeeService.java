package MHL.service;

import MHL.dao.EmployeeDao;
import MHL.domain.Employee;

public class EmpoyeeService {
    private EmployeeDao employeeDao = new EmployeeDao();
    public Employee getEmployeeIdAndPwd(String empId,String pwd){
       return employeeDao.querySingle("select * from employee where empid = ? and pwd = md5(?)",Employee.class,empId,pwd);
    }

}
