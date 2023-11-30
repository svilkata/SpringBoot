package bg.jug.academy.DataWithSpringJdbc.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeEntity {

    private String id;
    private String name;
    private Long salary;

    public EmployeeEntity() {
    }

}
