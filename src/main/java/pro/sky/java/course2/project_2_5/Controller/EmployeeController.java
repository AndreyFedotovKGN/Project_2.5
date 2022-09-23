package pro.sky.java.course2.project_2_5.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.project_2_5.Employee.Employee;
import pro.sky.java.course2.project_2_5.Service.EmployeeService;

import java.util.Collection;


@RequestMapping("/employee/")
@RestController
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }
    @GetMapping("add")
    public Employee addEmployee(@RequestParam (name = "firstName",required = false) String firstName,
                                @RequestParam (name = "lastName",required = false) String lastName) {
        return service.add(firstName, lastName);
    }

    @GetMapping("remove")
    public Employee removeEmployee(@RequestParam (name = "firstName",required = false) String firstName,
                                    @RequestParam (name = "lastName",required = false) String lastName) {
        return service.remove(firstName, lastName);
    }

    @GetMapping("find")
    public Employee findEmployee(@RequestParam (name = "firstName",required = false) String firstName,
                                 @RequestParam (name = "lastName",required = false) String lastName) {
        return service.find(firstName, lastName);
    }

    @GetMapping
    public Collection<Employee> allEmployees() {
        return service.allEmployee();
    }
}
