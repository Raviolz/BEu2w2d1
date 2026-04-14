package raviolz.blogapp.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import raviolz.blogapp.entities.BlogPost;
import raviolz.blogapp.services.BlogPostsService;

import java.util.List;

@RestController
@RequestMapping("/blogposts")
public class BlogPostsController {

    private final BlogPostsService bpService;

    public BlogPostsController(BlogPostsService bpService) {
        this.bpService = bpService;
    }

    @GetMapping
    public List<BlogPost> findAll() {
        return this.bpService.findAll();
    }
}
