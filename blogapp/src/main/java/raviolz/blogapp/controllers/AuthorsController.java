package raviolz.blogapp.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import raviolz.blogapp.entities.Author;
import raviolz.blogapp.services.AuthorsService;

import java.util.List;

@RestController // gestisce richieste HTTP e restituisce risposte REST    .. collega http a java
@RequestMapping("/authors")
// partenza dell url (dopo base localhost ecc) .. metto classe di riferimento al plurale, per convenzione sensata
public class AuthorsController {

    private final AuthorsService auService; // per usare i metodi custom inietto il service corrispettivo
    // controller non contiene ne dati ne logica solo reindirizza le richieste ai metodi del service per risolverle.

    public AuthorsController(AuthorsService auService) {
        this.auService = auService;
    }

    @GetMapping
    // GET obv sa che parliamo di user non per il RequestMapping ma per il valore di ritorno dalla firma del metodo
    public List<Author> findAll() { // e'un altro metodo che ha dentro il metodo del service. Per get usa il metodo del service x
        return this.auService.findAll();
    }
}
