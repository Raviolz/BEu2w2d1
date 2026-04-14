package raviolz.blogapp.payloads;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class NewAuthorPayload { // schema che mi aspetto di ricevere dall utente non risposta che do, per quello non id ecc
    // e' il REQUEST body
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
}
