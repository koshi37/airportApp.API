package airportApp.API.springAirportApp.API.dao;

import airportApp.API.springAirportApp.API.dao.entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends CrudRepository<Article, Integer> {
}
