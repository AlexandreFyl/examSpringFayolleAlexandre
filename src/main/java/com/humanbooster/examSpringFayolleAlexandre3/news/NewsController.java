package com.humanbooster.examSpringFayolleAlexandre3.news;

import com.humanbooster.examSpringFayolleAlexandre3.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping("/")
    public ModelAndView home() {
        List<News> listNews = newsService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listNews", listNews);
        return mav;
    }
}
