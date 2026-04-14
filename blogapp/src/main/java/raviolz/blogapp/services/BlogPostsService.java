package raviolz.blogapp.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import raviolz.blogapp.entities.BlogPost;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BlogPostsService {

    private List<BlogPost> blogPostsBD = new ArrayList<>();
    ;

    public List<BlogPost> findAll() {
        return blogPostsBD;
    }
}
