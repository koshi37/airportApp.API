package airportApp.API.springAirportApp.API.api;

import airportApp.API.springAirportApp.API.dao.entity.Article;
import airportApp.API.springAirportApp.API.manager.ArticleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/article")
public class ArticleApi {

    private ArticleManager articleManager;

    @Autowired
    public ArticleApi(ArticleManager articleManager) {
        this.articleManager = articleManager;
    }

    @GetMapping
    @RequestMapping("/all")
    public Iterable<Article> findAll()
    {
        return articleManager.findAll();
    }

    @GetMapping
    @RequestMapping("/{id}")
    public Optional<Article> getById(@PathVariable int id)
    {
        return articleManager.findById(id);
    }

    @PostMapping
    @RequestMapping("/add")
    public Article addArticle(@RequestBody Article article)
    {
        return articleManager.save(article);
    }

    @PutMapping
    public Article updateArticle(@RequestBody Article article)
    {
        return articleManager.save(article);
    }

    @DeleteMapping
    @RequestMapping("/del/{id}")
    public void deleteArticle(@PathVariable int id)
    {
        articleManager.deleteById(id);
    }
}
