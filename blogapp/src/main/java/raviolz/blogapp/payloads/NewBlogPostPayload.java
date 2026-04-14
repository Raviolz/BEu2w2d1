package raviolz.blogapp.payloads;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import raviolz.blogapp.entities.Category;


@Setter
@Getter
@ToString
public class NewBlogPostPayload {
    private Category category;
    private String title;
    private String content;
    private int readingTime;
}
