package raviolz.blogapp.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import raviolz.blogapp.entities.Author;
import raviolz.blogapp.payloads.NewAuthorPayload;
import raviolz.blogapp.services.AuthorsService;

import java.util.List;

@RestController // gestisce richieste HTTP e restituisce risposte REST    .. collega http a java
@RequestMapping("/authors") // per avere un path comune a tutti i metodi
// partenza dell url (dopo base localhost ecc) .. metto classe di riferimento al plurale, per convenzione sensata
public class AuthorsController {

    private final AuthorsService auService; // per usare i metodi custom inietto il service corrispettivo
    // controller non contiene ne dati ne logica solo reindirizza le richieste ai metodi del service per risolverle.

    public AuthorsController(AuthorsService auService) {
        this.auService = auService;
    }


    @GetMapping //        /authors
    // GET obv sa che parliamo di user non per il RequestMapping ma per il valore di ritorno dalla firma del metodo
    public List<Author> findAll() { // e'un altro metodo che ha dentro il metodo del service. Per get usa il metodo del service x
        return this.auService.findAll();
    }


    @GetMapping("/{authorId}") //      /authors/124
    public Author findById(@PathVariable long authorId) {  // legge il pezzo dal url
        return this.auService.findById(authorId);
    }


    @ResponseStatus(HttpStatus.CREATED) // 201        /authors
    //  Collegamento tra ricevo e mando al service. Service riceve elabora e rimanda
    @PostMapping
    public Author createAuthor(@RequestBody NewAuthorPayload body) { // prende json in arrivo da richiesta e lo trasforma in oggetto NAutPayload
        return this.auService.saveAuthor(body);
    }


    @PutMapping("/{authorId}")
    public Author getAuthorByIdAndUpdate(@PathVariable long authorId, @RequestBody NewAuthorPayload body) {
        return this.auService.findByIdAndUpdate(authorId, body);
    }

    @DeleteMapping("/{authorId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAuthor(@PathVariable long authorId) {
        this.auService.findByIdAndDelete(authorId);
    }
}

// ricordo riguardo optional