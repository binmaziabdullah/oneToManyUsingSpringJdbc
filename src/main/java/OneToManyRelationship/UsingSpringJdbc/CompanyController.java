package OneToManyRelationship.UsingSpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public String addUpdateCompany(@RequestBody Company company){
        companyService.addAndUpdateCompany(company);
        return "Data saved";
    }
}
