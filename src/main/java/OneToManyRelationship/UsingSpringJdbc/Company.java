package OneToManyRelationship.UsingSpringJdbc;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Set;

@Data
public class Company {

    @Id
    private Long id;
    private  String companyName;
    private  String location;

    //@MappedCollection(keyColumn = "companyId",idColumn = "companyId")
    //private Set<Employee> employees;

}
