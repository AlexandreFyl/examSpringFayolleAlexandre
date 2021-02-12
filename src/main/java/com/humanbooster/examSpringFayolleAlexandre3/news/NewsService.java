package com.humanbooster.examSpringFayolleAlexandre3.news;

import com.humanbooster.examSpringFayolleAlexandre3.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class NewsService {
    @Autowired
    NewsRepository repo;

    public void save(News news) {
        repo.save(news);
    }

    public List<News> listAll() {
        return (List<News>) repo.findAll();
    }

    public News get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
