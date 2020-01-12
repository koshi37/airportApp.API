package airportApp.API.springAirportApp.API.manager;

import airportApp.API.springAirportApp.API.dao.ArticleRepo;
import airportApp.API.springAirportApp.API.dao.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleManager {
    private ArticleRepo articleRepo;

    @Autowired
    public ArticleManager(ArticleRepo articleRepo)
    {
        this.articleRepo = articleRepo;
    }

    public Optional<Article> findById(Integer id)
    {
        return articleRepo.findById(id);
    }

    public Iterable<Article> findAll()
    {
        return articleRepo.findAll();
    }

    public Article save(Article connection)
    {
        return articleRepo.save(connection);
    }

    public void deleteById(Integer id)
    {
        articleRepo.deleteById(id);
    }
}
