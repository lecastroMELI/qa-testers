package dh.meli.qatesters.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter @NoArgsConstructor
public class TestCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_case;

    private String description;

    private boolean tested;

    private boolean passed;

    private int number_of_tries;

    private Date last_update;
}
