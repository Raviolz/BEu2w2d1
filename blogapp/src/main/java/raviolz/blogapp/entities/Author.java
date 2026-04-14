package raviolz.blogapp.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

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
    private LocalDateTime createdAt;


    public Author(String name, String surname, String email, LocalDate dateOfBirth) {
        Random random = new Random();
        this.id = random.nextInt(1, 1000);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.avatar = this.avatar = "https://ui-avatars.com/api/?name=" + name + "+" + surname;
        this.createdAt = LocalDateTime.now();
    }
}
