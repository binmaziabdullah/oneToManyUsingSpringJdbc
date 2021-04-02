package OneToManyRelationship.UsingSpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService  employeeService;

    @PostMapping
    public String addUpdateEmployee(@RequestBody Employee employee){
        employeeService.addAndUpdateEmployee(employee);
        return "Data saved";
    }
}
