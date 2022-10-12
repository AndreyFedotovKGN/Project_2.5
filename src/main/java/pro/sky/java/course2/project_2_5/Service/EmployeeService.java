package pro.sky.java.course2.project_2_5.Service;

import pro.sky.java.course2.project_2_5.Employee.Employee;

import java.util.Collection;
import java.util.Collections;

public interface EmployeeService {
    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);


    Collection<Employee> allEmployee();
}
