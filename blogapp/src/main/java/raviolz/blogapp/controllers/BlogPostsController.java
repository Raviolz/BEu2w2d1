package raviolz.blogapp.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import raviolz.blogapp.entities.BlogPost;
import raviolz.blogapp.payloads.NewBlogPostPayload;
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


    @GetMapping("/{blogPostId}")
    public BlogPost findById(@PathVariable long blogPostId) {
        return this.bpService.findById(blogPostId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BlogPost CreateBlogPost(@RequestBody NewBlogPostPayload body) {
        return this.bpService.saveBlogPost(body);
    }

    @PutMapping("/{blogPostId}")
    public BlogPost getUserByIdAndUpdate(@PathVariable long blogPostId, @RequestBody NewBlogPostPayload body) {
        return this.bpService.findByIdAndUpdate(blogPostId, body);
    }


}
