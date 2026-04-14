package raviolz.blogapp.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import raviolz.blogapp.entities.Author;
import raviolz.blogapp.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AuthorsService {
    private List<Author> authorsDB = new ArrayList<>(); // questo perche' non ho un DB per tenerli al momento

    public List<Author> findAll() {
        return authorsDB;
    }

    public Author findById(long id) {
        for (Author author : authorsDB) {
            if (author.getId() == id) {
                return author;
            }
        }

        throw new NotFoundException("utente " + id + " non trovato");
    }
}
