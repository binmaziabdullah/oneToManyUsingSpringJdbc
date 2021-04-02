package OneToManyRelationship.UsingSpringJdbc;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Employee {

    @Id
    private Long id;
    private Long companyId;
    private String studentName;
    private Integer age;


}
