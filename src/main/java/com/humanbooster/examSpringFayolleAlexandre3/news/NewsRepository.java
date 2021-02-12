package com.humanbooster.examSpringFayolleAlexandre3.news;

import com.humanbooster.examSpringFayolleAlexandre3.model.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Long> {
}
