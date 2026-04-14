package raviolz.blogapp.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class Author {

    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
    private String avatar;


    public Author(String name, String surname, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }
}
