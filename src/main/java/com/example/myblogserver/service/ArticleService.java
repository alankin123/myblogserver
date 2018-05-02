package com.example.myblogserver.service;

import com.example.myblogserver.model.Article;
import com.example.myblogserver.model.TUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ArticleService {
    int addArticle(Article article);

    List<Article> getArticle(int pageNum, int pageSize);

    Object delArticle(int id);

    Object updateArticle(int id);

    Object findArticle(int id);

    Object subscribArticle(int id);
}
