package raviolz.blogapp.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import raviolz.blogapp.entities.Author;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AuthorsService {
    private List<Author> authorsDB = new ArrayList<>(); // questo perche' non ho un DB per tenerli al momento

    public List<Author> findAll() {
        return authorsDB;
    }


}
