package raviolz.blogapp.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import raviolz.blogapp.entities.BlogPost;
import raviolz.blogapp.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BlogPostsService {

    private List<BlogPost> blogPostsDB = new ArrayList<>();
    ;

    public List<BlogPost> findAll() {
        return blogPostsDB;
    }

    public BlogPost findById(long id) {
        for (BlogPost bp : blogPostsDB) {
            if (bp.getId() == id) {
                return bp;
            }
        }

        throw new NotFoundException("Post con id: " + id + " non trovato");
    }
}
