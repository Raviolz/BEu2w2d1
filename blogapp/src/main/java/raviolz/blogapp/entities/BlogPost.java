package raviolz.blogapp.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class BlogPost {
    private long id;
    private Category category;
    private String title;
    private String cover;
    private String content;
    private int readingTime;
    //  private Author author;

    public BlogPost(Category category, String title, String content, int readingTime) {
        this.category = category;
        this.title = title;
        this.content = content;
        this.readingTime = readingTime;
    }

}

