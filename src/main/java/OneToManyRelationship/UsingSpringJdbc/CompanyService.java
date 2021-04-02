package OneToManyRelationship.UsingSpringJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public String addAndUpdateCompany(Company company){
        if (company.getId()!=null){
            Optional<Company> optionalCompany = companyRepository.findById(company.getId());
            if(!optionalCompany.isPresent())
                return "id not available";
        }
        Company com = companyRepository.save(company);

        return "Completed";
    }
}
