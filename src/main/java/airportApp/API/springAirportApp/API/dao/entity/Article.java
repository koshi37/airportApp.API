package airportApp.API.springAirportApp.API.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="article")
public class Article {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer article_id;
    private String author;
    private String title;
    private String description;
    private String content;


    public Article(Integer article_id, String author, String title, String description, String content) {
        this.article_id = article_id;
        this.author = author;
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public Article() {
    }

    public String getContent() {
        return content;
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }
}
