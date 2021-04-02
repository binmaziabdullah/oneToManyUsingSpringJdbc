package OneToManyRelationship.UsingSpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public String addAndUpdateEmployee(Employee employee){
        if (employee.getId()!=null){
            Optional<Employee> optionalEmployee = employeeRepository.findById(employee.getId());
            if(!optionalEmployee.isPresent())
                return "id not available";
        }
        Employee st = employeeRepository.save(employee);
        return "Completed";
    }
}
