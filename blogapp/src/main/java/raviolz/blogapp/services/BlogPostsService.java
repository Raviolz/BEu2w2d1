package raviolz.blogapp.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import raviolz.blogapp.entities.BlogPost;
import raviolz.blogapp.exceptions.NotFoundException;
import raviolz.blogapp.payloads.NewBlogPostPayload;

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

    public BlogPost saveBlogPost(NewBlogPostPayload body) {
        BlogPost newBlogPost = new BlogPost(body.getCategory(), body.getTitle(), body.getContent(), body.getReadingTime());
        this.blogPostsDB.add(newBlogPost);
        return newBlogPost;
    }

    public BlogPost findByIdAndUpdate(long blogPostId, NewBlogPostPayload body) {
        BlogPost found = null;
        for (BlogPost bp : blogPostsDB) {
            if (bp.getId() == blogPostId) {
                found = bp;
                found.setCategory(body.getCategory());
                found.setTitle(body.getTitle());
                found.setContent(body.getContent());
                found.setReadingTime(body.getReadingTime());
            } // gli rimando quello aggiornato
        }
        if (found == null) throw new NotFoundException("Il posto con id: " + blogPostId + " non e' stato trovato");
        return found;

    }
}
