package raviolz.blogapp.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

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
        Random random = new Random();
        this.id = random.nextInt(1, 1000);
        this.category = category;
        this.title = title;
        this.cover = this.cover = "https://ui-avatars.com/api/?name=";
        this.content = content;
        this.readingTime = readingTime;
    }

}

